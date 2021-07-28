package Demo.Service;

import Demo.Model.Employee;

import java.util.List;

public interface IEmployee extends ICommonService<Employee>{
    @Override
    List<Employee> getAll();

    @Override
    Employee getByID(String id);

    @Override
    List<Employee> getByKeyWord(String keyWord);

    @Override
    boolean add(Employee info);

    @Override
    boolean update(Employee info);

    @Override
    boolean delete(String id);
}
