package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.Promo;
import Model.Supplier_Stock;
import dto.PromoDTO;

/**
 * Session Bean implementation class PromoDAO
 */
@Stateless
public class PromoDAO implements PromoDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public PromoDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(PromoDTO t) {
		
		Supplier_Stock supplier_stock = entityManager.find(Supplier_Stock.class, t.getId_supplier_stock());
		
		Promo promo = new Promo();
		promo.setDiscount(t.getDiscount());
		promo.setEnd_date(t.getEnd_date());
		promo.setStart_date(t.getStart_date());
		promo.setSupplier_stock(supplier_stock);
		
		entityManager.persist(promo);
	}

	@Override
	public void update(PromoDTO t) {
		
		Supplier_Stock supplier_stock = entityManager.find(Supplier_Stock.class, t.getId_supplier_stock());
		
		Promo promo = new Promo();
		promo.setDiscount(t.getDiscount());
		promo.setEnd_date(t.getEnd_date());
		promo.setStart_date(t.getStart_date());
		promo.setSupplier_stock(supplier_stock);
		promo.setId(t.getId());
		
		entityManager.merge(promo);
	}

	@Override
	public void delete(PromoDTO t) {
		int primaryKey = t.getId();
		Promo promo = entityManager.find(Promo.class, primaryKey);
		entityManager.remove(promo);
	}

	@Override
	public PromoDTO findById(int id) {
		Promo promo = entityManager.find(Promo.class, id);
		
		PromoDTO promoDTO = new PromoDTO();
		promoDTO.setDiscount(promo.getDiscount());
		promoDTO.setEnd_date(promo.getEnd_date());
		promoDTO.setId(promo.getId());
		promoDTO.setId_supplier_stock(promo.getSupplier_stock().getId());
		promoDTO.setStart_date(promo.getStart_date());
		
		return promoDTO;
	}

}
