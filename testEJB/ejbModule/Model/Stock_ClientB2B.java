package Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stock_ClientB2B
 *
 */
@Entity

public class Stock_ClientB2B implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private ClientB2B clientB2B;
	
	@ManyToOne
	private Supplier_Stock supplier_stock;
	
	private int quantity;
	private double price;
	private boolean active;
	private int limit_quantity;
	private int restock_quantity;
	
	@OneToMany(mappedBy = "stock_clientB2B")
	private List<Order_Items> order_items;


	private static final long serialVersionUID = 1L;

	public Stock_ClientB2B() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public ClientB2B getClientB2B() {
		return clientB2B;
	}
	public void setClientB2B(ClientB2B clientB2B) {
		this.clientB2B = clientB2B;
	}	
	public Supplier_Stock getSupplier_stock() {
		return supplier_stock;
	}
	public void setSupplier_stock(Supplier_Stock supplier_stock) {
		this.supplier_stock = supplier_stock;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}   
	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}   
	public int getLimit_quantity() {
		return this.limit_quantity;
	}

	public void setLimit_quantity(int limit_quantity) {
		this.limit_quantity = limit_quantity;
	}   
	public int getRestock_quantity() {
		return this.restock_quantity;
	}

	public void setRestock_quantity(int restock_quantity) {
		this.restock_quantity = restock_quantity;
	}
	public List<Order_Items> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(List<Order_Items> order_items) {
		this.order_items = order_items;
	}
   
}
