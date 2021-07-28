package Demo.Model;

import java.util.Date;

public class Employee {
    private int Id_emp;
    private String Name;
    private boolean Gender;
    private String Address;
    private String PhoneNumber;
    private Date Birth;
    private String Email;
    private boolean Status;
    private String Created_date;
    private String Updated_date;


    public int getId_emp() {
        return Id_emp;
    }

    public void setId_emp(int id_emp) {
        Id_emp = id_emp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean getGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date birth) {
        Birth = birth;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getCreated_date() {
        return Created_date;
    }

    public void setCreated_date(String created_date) {
        Created_date = created_date;
    }

    public String getUpdated_date() {
        return Updated_date;
    }

    public void setUpdated_date(String updated_date) {
        Updated_date = updated_date;
    }
}
