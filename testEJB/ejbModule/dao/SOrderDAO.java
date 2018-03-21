package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.ClientB2C;
import Model.SOrder;
import dto.SOrderDTO;

/**
 * Session Bean implementation class SOrderDAO
 */
@Stateless
public class SOrderDAO implements SOrderDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public SOrderDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(SOrderDTO t) {

		ClientB2C clientB2C = entityManager.find(ClientB2C.class, t.getClientB2C());

		SOrder order = new SOrder();
		order.setClientB2C(clientB2C);
		order.setDate(t.getDate());
		
		entityManager.persist(order);	
	}

	@Override
	public void update(SOrderDTO t) {
		
		ClientB2C clientB2C = entityManager.find(ClientB2C.class, t.getClientB2C());

		SOrder order = new SOrder();
		order.setClientB2C(clientB2C);
		order.setDate(t.getDate());
		order.setId(t.getId());
		
		entityManager.merge(order);
		
	}

	@Override
	public void delete(SOrderDTO t) {
		int primaryKey = t.getId();
		SOrder order = entityManager.find(SOrder.class, primaryKey);
		entityManager.remove(order);	
	}

	@Override
	public SOrderDTO findById(int id) {		
		SOrder order = entityManager.find(SOrder.class, id);
		
		SOrderDTO orderDTO = new SOrderDTO();
		orderDTO.setClientB2C(order.getClientB2C().getId());
		orderDTO.setDate(order.getDate());
		orderDTO.setId(order.getId());

		return orderDTO;
	}

}
