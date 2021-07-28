package Demo.Service;

import Demo.Model.Employee;
import Demo.ViewModel.EmployeeViewModel;

import java.sql.ResultSet;

public class InitInfor {
    EmployeeViewModel initEmployee(ResultSet resultSet){
        EmployeeViewModel emp = new EmployeeViewModel();

        try {
            emp.setId_emp(resultSet.getInt("Id_emp"));
            emp.setName(resultSet.getString("Name"));
            emp.setAddress(resultSet.getString("_Address"));
            emp.setPhoneNumber(resultSet.getString("Phone_num"));
            emp.setEmail(resultSet.getString("Email"));
            emp.setStatus(resultSet.getBoolean("_Status"));
            emp.setCreated_date(resultSet.getString("Created_date"));
            emp.setUpdated_date(resultSet.getString("Updated_date"));

            emp.setViewGender(resultSet.getBoolean("Gender"));
            emp.setViewBirth(resultSet.getDate("Birth"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return emp;
    }


}
