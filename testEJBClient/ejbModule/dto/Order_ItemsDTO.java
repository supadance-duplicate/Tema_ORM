package dto;

import java.io.Serializable;

public class Order_ItemsDTO implements Serializable {

	private int id;
	private int id_stock_clientB2B;
	private int id_order;
	private int quantity;
	private double price_per_product;
	private static final long serialVersionUID = 1L;

	public Order_ItemsDTO() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getId_stock_clientB2B() {
		return this.id_stock_clientB2B;
	}

	public void setId_stock_clientB2B(int id_stock_clientB2B) {
		this.id_stock_clientB2B = id_stock_clientB2B;
	}   
	public int getId_order() {
		return this.id_order;
	}

	public void setId_order(int id_order) {
		this.id_order = id_order;
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
