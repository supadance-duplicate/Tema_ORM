package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.ClientB2B;
import dto.ClientB2BDTO;

/**
 * Session Bean implementation class ClientB2BDAO
 */
@Stateless
public class ClientB2BDAO implements ClientB2BDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public ClientB2BDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(ClientB2BDTO t) {
		
		ClientB2B clientB2B = new ClientB2B();
		clientB2B.setUsername(t.getUsername());
		clientB2B.setAddress(t.getAddress());
		clientB2B.setCompanyName(t.getCompanyName());
		clientB2B.setCUI(t.getCUI());
		clientB2B.setEmail(t.getEmail());
		clientB2B.setPassword(t.getPassword());
		clientB2B.setSubscribed(t.getSubscribed());
		clientB2B.setVisibility(t.getVisibility());
	    
		entityManager.persist(clientB2B);
	}

	
	@Override
	public void update(ClientB2BDTO t) {
		
		ClientB2B clientB2B = new ClientB2B();
		clientB2B.setId(t.getId());
		clientB2B.setUsername(t.getUsername());
		clientB2B.setAddress(t.getAddress());
		clientB2B.setCompanyName(t.getCompanyName());
		clientB2B.setCUI(t.getCUI());
		clientB2B.setEmail(t.getEmail());
		clientB2B.setPassword(t.getPassword());
		clientB2B.setSubscribed(t.getSubscribed());
		clientB2B.setVisibility(t.getVisibility());
	    
		entityManager.merge(clientB2B);	
	}

	@Override
	public void delete(ClientB2BDTO t) {
		int primaryKey = t.getId();
		ClientB2B clientB2B = entityManager.find(ClientB2B.class, primaryKey);
		entityManager.remove(clientB2B);
	}

 	public ClientB2BDTO findById(int id) {
 		
 		ClientB2B clientB2B = entityManager.find(ClientB2B.class, id);
 		
 		ClientB2BDTO clientB2BDTO = new ClientB2BDTO();
 		clientB2BDTO.setId(clientB2B.getId());
 		clientB2BDTO.setUsername(clientB2B.getUsername());
 		clientB2BDTO.setAddress(clientB2B.getAddress());
 		clientB2BDTO.setCompanyName(clientB2B.getCompanyName());
 		clientB2BDTO.setCUI(clientB2B.getCUI());
 		clientB2BDTO.setEmail(clientB2B.getEmail());
 		clientB2BDTO.setPassword(clientB2B.getPassword());
 		clientB2BDTO.setSubscribed(clientB2B.getSubscribed());
 		clientB2BDTO.setVisibility(clientB2B.getVisibility());
 		clientB2BDTO.setDTYPE(clientB2B.getClass().getSimpleName());
 		
		return clientB2BDTO;
	}

}
