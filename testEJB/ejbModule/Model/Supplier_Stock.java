package Model;

import java.io.Serializable;
import java.lang.Double;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Supplier_Stock
 *
 */
@Entity

public class Supplier_Stock implements Serializable {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Supplier supplier;
	
	@ManyToOne
	private Wine wine;
	
	private int quantity;
	private Double price;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "supplier_stock")
	private List<Promo> promo;
	
	@OneToMany(mappedBy = "supplier_stock")
	private List<Stock_ClientB2B> stock_clientB2B;
	
	
	
	public Supplier_Stock() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Wine getWine() {
		return wine;
	}
	public void setWine(Wine wine) {
		this.wine = wine;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Promo> getPromo() {
		return promo;
	}
	public void setPromo(List<Promo> promo) {
		this.promo = promo;
	}
	public List<Stock_ClientB2B> getStock_clientB2B() {
		return stock_clientB2B;
	}
	public void setStock_clientB2B(List<Stock_ClientB2B> stock_clientB2B) {
		this.stock_clientB2B = stock_clientB2B;
	}
   
}
