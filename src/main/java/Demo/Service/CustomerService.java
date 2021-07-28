package Demo.Service;

import Demo.Model.Customer;
import Demo.ViewModel.EmployeeViewModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("CustomerService")
public class CustomerService extends BaseService implements ICustomer {
    @Override
    public List<EmployeeViewModel> getAll() {
        return null;
    }

    @Override
    public EmployeeViewModel getByID(String id) {
        return null;
    }

    @Override
    public List<EmployeeViewModel> getByKeyWord(String keyWord) {
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
