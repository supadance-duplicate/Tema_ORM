package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.Wine;
import dto.WineDTO;
import enums.WineType;

/**
 * Session Bean implementation class WineDAO
 */
@Stateless
public class WineDAO implements WineDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public WineDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(WineDTO t) {
		
		Wine wine = new Wine();
	    wine.setName(t.getName());
		wine.setVariety(t.getVariety());
		wine.setWineType(WineType.valueOf(t.getWineType()));
		wine.setDescription(t.getDescription());
		wine.setYear(t.getYear());
		
		entityManager.persist(wine);
	}

	@Override
	public void update(WineDTO t) {
		
	    Wine wine = new Wine();
		
	    wine.setId(t.getId());
	    wine.setName(t.getName());
	    wine.setVariety(t.getVariety());
	    wine.setWineType(WineType.valueOf(t.getWineType()));
	    wine.setDescription(t.getDescription());
	    wine.setYear(t.getYear());		
		
	    entityManager.merge(wine);
	}

	@Override
	public void delete(WineDTO t) {
		int primaryKey = t.getId();
		Wine wineOrder = entityManager.find(Wine.class, primaryKey);
		entityManager.remove(wineOrder);		
	}

	@Override
	public WineDTO findById(int id) {
		
		Wine wine = entityManager.find(Wine.class, id);
		
		WineDTO wineDTO = new WineDTO();
		wineDTO.setId(wine.getId());
		wineDTO.setName(wine.getName());
		wineDTO.setVariety(wine.getVariety());
		wineDTO.setWineType(wine.getWineType().toString());
		wineDTO.setDescription(wine.getDescription());
		wineDTO.setYear(wine.getYear());
		
		return wineDTO;
	}

}
