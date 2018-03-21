package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Promo
 *
 */
@Entity

public class Promo implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int discount;
	
	@ManyToOne
	private Supplier_Stock supplier_stock;
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@Temporal(TemporalType.DATE)
	private Date end_date;
	private static final long serialVersionUID = 1L;

	public Promo() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getDiscount() {
		return this.discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}   
	
	public Supplier_Stock getSupplier_stock() {
		return supplier_stock;
	}
	public void setSupplier_stock(Supplier_Stock supplier_stock) {
		this.supplier_stock = supplier_stock;
	}
	public Date getStart_date() {
		return this.start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}   
	public Date getEnd_date() {
		return this.end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
   
}
