package Demo.Service;

import Demo.Model.Employee;

import java.sql.ResultSet;

public class InitInfor {
    Employee initEmployee(ResultSet resultSet){
        Employee emp = new Employee();

        try {
            emp.setId_emp(resultSet.getInt("Id_emp"));
            emp.setName(resultSet.getString("Name"));
            emp.setGender(resultSet.getBoolean("Gender"));
            emp.setAddress(resultSet.getString("_Address"));
            emp.setPhoneNumber(resultSet.getString("Phone_num"));
            emp.setBirth(resultSet.getDate("Birth"));
            emp.setEmail(resultSet.getString("Email"));
            emp.setStatus(resultSet.getBoolean("_Status"));
            emp.setCreated_date(resultSet.getString("Created_date"));
            emp.setUpdated_date(resultSet.getString("Updated_date"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return emp;
    }


}
