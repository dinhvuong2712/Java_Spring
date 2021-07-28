package Demo.Service;

import java.util.List;

public interface ICommonService<T> {
    public List<T> getAll();

    public T getByID(String id);

    public List<T> getByKeyWord(String keyWord);

    public boolean add(T info);

    public boolean update(T info);

    public boolean delete(String id);
}
