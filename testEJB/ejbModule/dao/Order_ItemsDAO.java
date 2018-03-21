package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.Order_Items;
import Model.SOrder;
import Model.Stock_ClientB2B;
import dto.Order_ItemsDTO;

/**
 * Session Bean implementation class Order_ItemsDAO
 */
@Stateless
public class Order_ItemsDAO implements Order_ItemsDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public Order_ItemsDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(Order_ItemsDTO t) {
		
		SOrder order = entityManager.find(SOrder.class, t.getId_order());
		Stock_ClientB2B stockClientB2B = entityManager.find(Stock_ClientB2B.class, t.getId_stock_clientB2B());
		
		Order_Items orderItems = new Order_Items();
		orderItems.setOrder(order);
		orderItems.setPrice_per_product(t.getPrice_per_product());
		orderItems.setQuantity(t.getQuantity());
		orderItems.setStock_clientB2B(stockClientB2B);
		
		entityManager.persist(orderItems);
	}

	@Override
	public void update(Order_ItemsDTO t) {
		
		SOrder order = entityManager.find(SOrder.class, t.getId_order());
		Stock_ClientB2B stockClientB2B = entityManager.find(Stock_ClientB2B.class, t.getId_stock_clientB2B());
		
		Order_Items orderItems = new Order_Items();
		orderItems.setOrder(order);
		orderItems.setPrice_per_product(t.getPrice_per_product());
		orderItems.setQuantity(t.getQuantity());
		orderItems.setStock_clientB2B(stockClientB2B);
		orderItems.setId(t.getId());
		
		entityManager.merge(orderItems);
		
	}

	@Override
	public void delete(Order_ItemsDTO t) {
		int primaryKey = t.getId();
		Order_Items orderItems = entityManager.find(Order_Items.class, primaryKey);
		entityManager.remove(orderItems);	
	}

	@Override
	public Order_ItemsDTO findById(int id) {
		Order_Items orderItems = entityManager.find(Order_Items.class, id);
		
		Order_ItemsDTO orderItemsDTO = new Order_ItemsDTO();
		orderItemsDTO.setId(orderItems.getId());
		orderItemsDTO.setId_order(orderItems.getOrder().getId());
		orderItemsDTO.setId_stock_clientB2B(orderItems.getStock_clientB2B().getId());
		orderItemsDTO.setPrice_per_product(orderItems.getPrice_per_product());
		orderItemsDTO.setQuantity(orderItems.getQuantity());
		
		return orderItemsDTO;		
	}

}
