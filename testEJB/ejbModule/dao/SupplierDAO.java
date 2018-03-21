package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.Supplier;
import dto.SupplierDTO;

/**
 * Session Bean implementation class SupplierDAO
 */
@Stateless
public class SupplierDAO implements SupplierDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public SupplierDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(SupplierDTO t) {
		
		Supplier supplier = new Supplier();
		supplier.setAddress(t.getAddress());
		supplier.setEmail(t.getEmail());
		supplier.setNameWinery(t.getNameWinery());
		supplier.setPassword(t.getPassword());
		supplier.setUsername(t.getUsername());
		supplier.setVisibility(t.getVisibility());
		
		entityManager.persist(supplier);		
	}

	@Override
	public void update(SupplierDTO t) {
		
		Supplier supplier = new Supplier();
		supplier.setAddress(t.getAddress());
		supplier.setEmail(t.getEmail());
		supplier.setNameWinery(t.getNameWinery());
		supplier.setPassword(t.getPassword());
		supplier.setUsername(t.getUsername());
		supplier.setVisibility(t.getVisibility());
		supplier.setId(supplier.getId());
		
		entityManager.merge(supplier);	
	}

	@Override
	public void delete(SupplierDTO t) {
		int primaryKey = t.getId();
		Supplier supplier = entityManager.find(Supplier.class, primaryKey);
		entityManager.remove(supplier);
	}

	@Override
	public SupplierDTO findById(int id) {
		Supplier supplier = entityManager.find(Supplier.class, id);
		
		SupplierDTO supplierDTO = new SupplierDTO();
		supplierDTO.setAddress(supplier.getAddress());
		supplierDTO.setEmail(supplier.getEmail());
		supplierDTO.setId(supplier.getId());
		supplierDTO.setNameWinery(supplier.getNameWinery());
		supplierDTO.setPassword(supplier.getPassword());
		supplierDTO.setUsername(supplier.getUsername());
		supplierDTO.setVisibility(supplier.getVisibility());
		supplierDTO.setDTYPE(supplier.getClass().getSimpleName());
		
		return supplierDTO;		
	}

}
