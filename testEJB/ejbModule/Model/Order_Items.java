package Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Order_Items
 *
 */
@Entity

public class Order_Items implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Stock_ClientB2B stock_clientB2B;
	@ManyToOne
	private SOrder order;
	private int quantity;
	private double price_per_product;
	private static final long serialVersionUID = 1L;

	public Order_Items() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}    
	public Stock_ClientB2B getStock_clientB2B() {
		return stock_clientB2B;
	}
	public void setStock_clientB2B(Stock_ClientB2B stock_clientB2B) {
		this.stock_clientB2B = stock_clientB2B;
	}
	
	public SOrder getOrder() {
		return order;
	}
	public void setOrder(SOrder order) {
		this.order = order;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public double getPrice_per_product() {
		return this.price_per_product;
	}

	public void setPrice_per_product(double price_per_product) {
		this.price_per_product = price_per_product;
	}
   
}
