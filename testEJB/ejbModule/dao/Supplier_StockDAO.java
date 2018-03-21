package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.Supplier;
import Model.Supplier_Stock;
import Model.Wine;
import dto.Supplier_StockDTO;

/**
 * Session Bean implementation class Supplier_StockDAO
 */
@Stateless
public class Supplier_StockDAO implements Supplier_StockDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public Supplier_StockDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(Supplier_StockDTO t) {
		
		Supplier supplier = entityManager.find(Supplier.class, t.getId_supplier());
		Wine wine = entityManager.find(Wine.class, t.getId_wine());
		
		Supplier_Stock supplierStock = new Supplier_Stock();
		supplierStock.setPrice(t.getPrice());
		supplierStock.setQuantity(t.getQuantity());
		supplierStock.setSupplier(supplier);
		supplierStock.setWine(wine);
		
		entityManager.persist(supplierStock);		
	}

	@Override
	public void update(Supplier_StockDTO t) {
		
		Supplier supplier = entityManager.find(Supplier.class, t.getId_supplier());
		Wine wine = entityManager.find(Wine.class, t.getId_wine());
		
		Supplier_Stock supplierStock = new Supplier_Stock();
		supplierStock.setPrice(t.getPrice());
		supplierStock.setQuantity(t.getQuantity());
		supplierStock.setSupplier(supplier);
		supplierStock.setWine(wine);
		supplierStock.setId(t.getId());
		
		entityManager.merge(supplierStock);	
	}

	@Override
	public void delete(Supplier_StockDTO t) {
		int primaryKey = t.getId();
		Supplier_Stock supplierStock = entityManager.find(Supplier_Stock.class, primaryKey);
		entityManager.remove(supplierStock);
	}

	@Override
	public Supplier_StockDTO findById(int id) {
		
		Supplier_Stock supplierStock = entityManager.find(Supplier_Stock.class, id);
		
		Supplier_StockDTO supplierStockDTO = new Supplier_StockDTO();
		supplierStockDTO.setId(supplierStock.getId());
		supplierStockDTO.setId_supplier(supplierStock.getSupplier().getId());
		supplierStockDTO.setId_wine(supplierStock.getWine().getId());
		supplierStockDTO.setPrice(supplierStock.getPrice());
		supplierStockDTO.setQuantity(supplierStock.getQuantity());
		
		return supplierStockDTO;
	}

}
