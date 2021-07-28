package Demo.Service;

import Demo.Model.Customer;

import java.util.List;

public interface ICustomer extends ICommonService<Customer>{
    @Override
    List<Customer> getAll();

    @Override
    Customer getByID(String id);

    @Override
    List<Customer> getByKeyWord(String keyWord);

    @Override
    boolean add(Customer info);

    @Override
    boolean update(Customer info);

    @Override
    boolean delete(String id);
}
