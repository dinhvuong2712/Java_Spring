package Demo.Service;

import Demo.Model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
@Component("EmployeeService")
public class EmployeeService extends BaseService implements IEmployee{

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();

        query = "execute SP_Employee_Select_All";

        try {
            ResultSet resultSet = db.getTable(query, parameters);

            InitInfor infor = new InitInfor();

            while (resultSet.next()) {
                employees.add(infor.initEmployee(resultSet));
            }
        }catch (Exception ex){
            System.out.println("Do not conncet");

            ex.printStackTrace();
        }

        db.closeConnection();

        return employees;
    }

    @Override
    public Employee getByID(String id) {
        Employee employee = new Employee();
        InitInfor infor = new InitInfor();

        query = "execute SP_Employee_Select_SingeById " + id;

        try {
            ResultSet resultSet = db.getTable(query, parameters);

            while (resultSet.next()) {
                employee = infor.initEmployee(resultSet);
            }
        }catch (Exception ex){
            System.out.println("Do not conncet");

            ex.printStackTrace();
        }

        db.closeConnection();

        return employee;
    }

    @Override
    public List<Employee> getByKeyWord(String keyWord) {
        return null;
    }

    @Override
    public boolean add(Employee info) {
        parameters = new ArrayList<>();

        query = "execute SP_Employee_Insert ?, ?, ?, ?, ?, ?, ?, ?, ?";

        parameters.add(info.getName());
        parameters.add(info.getGender() ? "true" : "false");
        parameters.add(info.getAddress());
        parameters.add(info.getPhoneNumber());
        parameters.add(new SimpleDateFormat("yyyy-MM-dd").format(info.getBirth()));
        parameters.add(info.getEmail());
        parameters.add(info.getStatus() ? "true" : "false");
        parameters.add(info.getCreated_date());
        parameters.add(info.getUpdated_date());

        boolean result = db.executeNoneQuery(query,parameters);
        db.closeConnection();

        return result;
    }

    @Override
    public boolean update(Employee info) {
        db.closeConnection();
        return false;
    }

    @Override
    public boolean delete(String id) {
        parameters = new ArrayList<>();

        query = "exec SP_Employee_Delete ?";
        parameters.add(id);

        boolean result = db.executeNoneQuery(query,parameters);
        db.closeConnection();

        return result;
    }
}
