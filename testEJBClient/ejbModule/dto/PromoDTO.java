package dto;

import java.io.Serializable;
import java.util.Date;

public class PromoDTO implements Serializable {

	private int id;
	private int discount;
	private int id_supplier_stock;
	private Date start_date;
	private Date end_date;
	private static final long serialVersionUID = 1L;

	public PromoDTO() {
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
	public int getId_supplier_stock() {
		return this.id_supplier_stock;
	}

	public void setId_supplier_stock(int id_supplier_stock) {
		this.id_supplier_stock = id_supplier_stock;
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
