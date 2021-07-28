package Demo.ViewModel;

import Demo.Model.Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeViewModel extends Employee {
    private String viewGender;
    private String viewBirth;

    public String getViewGender() {
        return viewGender;
    }

    public void setViewGender(Boolean viewGender) {
        System.out.println(viewGender ? "Nam" : "Nữ");
        this.viewGender = viewGender ? "Nam" : "Nữ";
    }

    public String getViewBirth() {
        return viewBirth;
    }

    public void setViewBirth(Date viewBirth) {
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(viewBirth));
        this.viewBirth = new SimpleDateFormat("dd/MM/yyyy").format(viewBirth);
    }
}
