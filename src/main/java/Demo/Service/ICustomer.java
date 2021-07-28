package Demo.Service;

import Demo.Model.Customer;
import Demo.ViewModel.EmployeeViewModel;

import java.util.List;

public interface ICustomer extends ICommonService<Customer, EmployeeViewModel>{
    @Override
    List<EmployeeViewModel> getAll();

    @Override
    EmployeeViewModel getByID(String id);

    @Override
    List<EmployeeViewModel> getByKeyWord(String keyWord);

    @Override
    boolean add(Customer info);

    @Override
    boolean update(Customer info);

    @Override
    boolean delete(String id);
}
