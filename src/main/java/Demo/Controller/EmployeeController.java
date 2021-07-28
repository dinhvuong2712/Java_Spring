package Demo.Controller;

import Demo.Model.Employee;
import Demo.Service.EmployeeService;
import Demo.Service.IEmployee;
import Demo.ViewModel.EmployeeViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Produces;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static java.lang.Boolean.parseBoolean;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
    String dir = "employee/";
//    @Autowired
//    IEmployee iEmployee;
    private IEmployee iEmployee;

    public EmployeeController() {
        iEmployee = new EmployeeService();
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView(dir + "index");

        return modelAndView;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<EmployeeViewModel> getAll() {
        return iEmployee.getAll();
    }

    @RequestMapping(value = "/infor", method = RequestMethod.GET)
    public ModelAndView infor(@RequestParam String id) {
        getById(id);
        ModelAndView modelAndView = new ModelAndView(dir + "detailEmp");

        return modelAndView;
    }

    @RequestMapping(value = "/getInfor", method = RequestMethod.GET)
    @ResponseBody
    public EmployeeViewModel getById(String id) {
        return iEmployee.getByID(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView(dir + "create");

        return modelAndView;
    }

    @RequestMapping(value = "/addConfirmed", method = RequestMethod.POST)
    @Produces("application/json")
    @ResponseBody
    public ModelAndView addConfirm(HttpServletRequest request) {
        if (!iEmployee.add(initEmployee(request))) {
            return new ModelAndView("redirect:/employee/add");
        }
        return new ModelAndView("redirect:/employee/index");
    }

    @Produces("application/json")
    private Employee initEmployee(HttpServletRequest request) {
        Employee emp = new Employee();

        emp.setName(request.getParameter("Name"));
        emp.setGender(Boolean.parseBoolean(request.getParameter("Gender")));
        try {
            emp.setBirth(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("Birth")));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        emp.setAddress(request.getParameter("Address"));
        emp.setPhoneNumber(request.getParameter("PhoneNumber"));
        emp.setEmail(request.getParameter("Email"));
        emp.setStatus(true);
        emp.setCreated_date(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
        emp.setUpdated_date(emp.getCreated_date());

        return emp;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView addConfirm(@RequestParam String id) {
        if (!iEmployee.delete(id)) {
            return new ModelAndView("redirect:/" +dir + "create");
        }
        return new ModelAndView("redirect:/" +dir + "index");
    }
}
