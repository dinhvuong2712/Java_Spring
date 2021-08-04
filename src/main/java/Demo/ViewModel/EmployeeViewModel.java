package Demo.ViewModel;

import Demo.Model.Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeViewModel extends Employee {
    private String viewBirth;

    public String getViewBirth() {
        return viewBirth;
    }

    public void setViewBirth(Date viewBirth) {
        this.viewBirth = new SimpleDateFormat("dd/MM/yyyy").format(viewBirth);
    }
}
