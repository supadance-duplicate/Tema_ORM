package dao;

public interface DAOGenericInterface<T> {

	void insert(T t);
	
	void update(T t);
	
	void delete (T t);
	
	T findById(int id);	
}
