package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.ClientB2B;
import Model.Stock_ClientB2B;
import Model.Supplier_Stock;
import dto.Stock_ClientB2BDTO;

/**
 * Session Bean implementation class Stock_ClientB2BDAO
 */
@Stateless
public class Stock_ClientB2BDAO implements Stock_ClientB2BDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public Stock_ClientB2BDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(Stock_ClientB2BDTO t) {
		
		ClientB2B clientB2B = entityManager.find(ClientB2B.class, t.getId_clientB2B());
		Supplier_Stock supplierStock = entityManager.find(Supplier_Stock.class, t.getId_supplier_stock());
		
		Stock_ClientB2B stockClientB2B = new Stock_ClientB2B();
		stockClientB2B.setActive(t.getActive());
		stockClientB2B.setClientB2B(clientB2B);
		stockClientB2B.setLimit_quantity(t.getLimit_quantity());
		stockClientB2B.setPrice(t.getPrice());
		stockClientB2B.setQuantity(t.getQuantity());
		stockClientB2B.setRestock_quantity(t.getRestock_quantity());
		stockClientB2B.setSupplier_stock(supplierStock);
		
		entityManager.persist(stockClientB2B);
	}

	@Override
	public void update(Stock_ClientB2BDTO t) {
		
		ClientB2B clientB2B = entityManager.find(ClientB2B.class, t.getId_clientB2B());
		Supplier_Stock supplierStock = entityManager.find(Supplier_Stock.class, t.getId_supplier_stock());
		
		Stock_ClientB2B stockClientB2B = new Stock_ClientB2B();
		stockClientB2B.setActive(t.getActive());
		stockClientB2B.setClientB2B(clientB2B);
		stockClientB2B.setLimit_quantity(t.getLimit_quantity());
		stockClientB2B.setPrice(t.getPrice());
		stockClientB2B.setQuantity(t.getQuantity());
		stockClientB2B.setRestock_quantity(t.getRestock_quantity());
		stockClientB2B.setSupplier_stock(supplierStock);
		stockClientB2B.setId(t.getId());
		
		entityManager.merge(stockClientB2B);
		
	}

	@Override
	public void delete(Stock_ClientB2BDTO t) {
		int primaryKey = t.getId();
		Stock_ClientB2B stockClientB2B = entityManager.find(Stock_ClientB2B.class, primaryKey);
		entityManager.remove(stockClientB2B);
		
	}

	@Override
	public Stock_ClientB2BDTO findById(int id) {
		Stock_ClientB2B stockClientB2B = entityManager.find(Stock_ClientB2B.class, id);
		
		Stock_ClientB2BDTO stock_ClientB2BDTO = new Stock_ClientB2BDTO();
		stock_ClientB2BDTO.setActive(stockClientB2B.getActive());
		stock_ClientB2BDTO.setId(stockClientB2B.getId());
		stock_ClientB2BDTO.setId_clientB2B(stockClientB2B.getClientB2B().getId());
		stock_ClientB2BDTO.setId_supplier_stock(stockClientB2B.getSupplier_stock().getId());
		stock_ClientB2BDTO.setLimit_quantity(stockClientB2B.getLimit_quantity());
		stock_ClientB2BDTO.setPrice(stockClientB2B.getPrice());
		stock_ClientB2BDTO.setQuantity(stockClientB2B.getQuantity());
		stock_ClientB2BDTO.setRestock_quantity(stockClientB2B.getRestock_quantity());
		
		return stock_ClientB2BDTO;
	}

}
