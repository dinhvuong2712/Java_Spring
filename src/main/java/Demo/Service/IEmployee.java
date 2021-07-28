package Demo.Service;

import Demo.Model.Employee;
import Demo.ViewModel.EmployeeViewModel;

import java.util.List;

public interface IEmployee extends ICommonService<Employee, EmployeeViewModel>{
    @Override
    List<EmployeeViewModel> getAll();

    @Override
    EmployeeViewModel getByID(String id);

    @Override
    List<EmployeeViewModel> getByKeyWord(String keyWord);

    @Override
    boolean add(Employee info);

    @Override
    boolean update(Employee info);

    @Override
    boolean delete(String id);
}
