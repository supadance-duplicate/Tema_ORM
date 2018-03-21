package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.ClientB2C;
import dto.ClientB2CDTO;

/**
 * Session Bean implementation class ClientB2CDAO
 */
@Stateless
public class ClientB2CDAO implements ClientB2CDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public ClientB2CDAO() {
    	    	
    }

	@Override
	public void insert(ClientB2CDTO t) {
		ClientB2C clientB2C = new ClientB2C();
		clientB2C.setAddress(t.getAddress());
		clientB2C.setDate_register(t.getDate_register());
		clientB2C.setEmail(t.getEmail());
		clientB2C.setNume(t.getNume());
		clientB2C.setPrenume(t.getPrenume());
		clientB2C.setPassword(t.getPassword());
		clientB2C.setUsername(t.getUsername());
		
		entityManager.persist(clientB2C);		
	}

	@Override
	public void update(ClientB2CDTO t) {
		
		ClientB2C clientB2C = new ClientB2C();
		clientB2C.setAddress(t.getAddress());
		clientB2C.setDate_register(t.getDate_register());
		clientB2C.setEmail(t.getEmail());
		clientB2C.setNume(t.getNume());
		clientB2C.setPrenume(t.getPrenume());
		clientB2C.setPassword(t.getPassword());
		clientB2C.setUsername(t.getUsername());
		clientB2C.setId(t.getId());
		
		entityManager.merge(clientB2C);				
	}

	@Override
	public void delete(ClientB2CDTO t) {
		int primaryKey = t.getId();
		ClientB2C clientB2C = entityManager.find(ClientB2C.class, primaryKey);
		entityManager.remove(clientB2C);
	}

	@Override
	public ClientB2CDTO findById(int id) {
		ClientB2C clientB2C = entityManager.find(ClientB2C.class, id);
		
		ClientB2CDTO clientB2CDTO = new ClientB2CDTO();
		clientB2CDTO.setAddress(clientB2C.getAddress());
		clientB2CDTO.setDate_register(clientB2C.getDate_register());
		clientB2CDTO.setEmail(clientB2C.getEmail());
		clientB2CDTO.setNume(clientB2C.getNume());
		clientB2CDTO.setPrenume(clientB2C.getPrenume());
		clientB2CDTO.setPassword(clientB2C.getPassword());
		clientB2CDTO.setUsername(clientB2C.getUsername());
		clientB2CDTO.setId(clientB2C.getId());
		clientB2CDTO.setDTYPE(clientB2C.getClass().getSimpleName());
		
		return clientB2CDTO;	
	}

}
