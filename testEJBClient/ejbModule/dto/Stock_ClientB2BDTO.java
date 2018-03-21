package dto;

import java.io.Serializable;

public class Stock_ClientB2BDTO implements Serializable {

	private int id;
	private int id_clientB2B;
	private int id_supplier_stock;
	private int quantity;
	private double price;
	private boolean active;
	private int limit_quantity;
	private int restock_quantity;
	private static final long serialVersionUID = 1L;

	public Stock_ClientB2BDTO() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getId_clientB2B() {
		return this.id_clientB2B;
	}

	public void setId_clientB2B(int id_clientB2B) {
		this.id_clientB2B = id_clientB2B;
	}   
	public int getId_supplier_stock() {
		return this.id_supplier_stock;
	}

	public void setId_supplier_stock(int id_supplier_stock) {
		this.id_supplier_stock = id_supplier_stock;
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
   
}
