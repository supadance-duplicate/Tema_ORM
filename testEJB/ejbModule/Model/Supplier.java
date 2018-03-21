package Model;

import Model.User;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Supplier
 *
 */
@Entity

public class Supplier extends User implements Serializable {

	
	private String nameWinery;
	private Boolean visibility;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "supplier")
	private List<Supplier_Stock> supplier_stock;
	
	
	public Supplier() {
		super();
	}   
	public String getNameWinery() {
		return this.nameWinery;
	}

	public void setNameWinery(String nameWinery) {
		this.nameWinery = nameWinery;
	}   
	public Boolean getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Boolean visibility) {
		this.visibility = visibility;
	}
	public List<Supplier_Stock> getSupplier_stock() {
		return supplier_stock;
	}
	public void setSupplier_stock(List<Supplier_Stock> supplier_stock) {
		this.supplier_stock = supplier_stock;
	}
   
}
