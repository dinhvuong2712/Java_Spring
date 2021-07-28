package Demo.Service;

import Demo.Model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("CustomerService")
public class CustomerService extends BaseService implements ICustomer {
    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer getByID(String id) {
        return null;
    }

    @Override
    public List<Customer> getByKeyWord(String keyWord) {
        return null;
    }

    @Override
    public boolean add(Customer info) {
        return false;
    }

    @Override
    public boolean update(Customer info) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
