package dto;

import java.io.Serializable;
import java.lang.Double;

public class Supplier_StockDTO implements Serializable {

	private int id;
	private int id_supplier;
	private int id_wine;
	private int quantity;
	private Double price;
	private static final long serialVersionUID = 1L;

	public Supplier_StockDTO() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getId_supplier() {
		return this.id_supplier;
	}

	public void setId_supplier(int id_supplier) {
		this.id_supplier = id_supplier;
	}   
	public int getId_wine() {
		return this.id_wine;
	}

	public void setId_wine(int id_wine) {
		this.id_wine = id_wine;
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
   
}
