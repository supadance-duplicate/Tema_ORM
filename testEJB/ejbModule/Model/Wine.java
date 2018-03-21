package Model;

import enums.WineType;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Wine
 *
 */
@Entity

public class Wine implements Serializable {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private WineType wineType;
	
	private String variety;
	private int year;
	private String description;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "wine")
	private List<Supplier_Stock> supplier_stock;
	
	public Wine() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public WineType getWineType() {
		return this.wineType;
	}

	public void setWineType(WineType wineType) {
		this.wineType = wineType;
	}   
	public String getVariety() {
		return this.variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}   
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public List<Supplier_Stock> getSupplier_stock() {
		return supplier_stock;
	}
	public void setSupplier_stock(List<Supplier_Stock> supplier_stock) {
		this.supplier_stock = supplier_stock;
	}
   
}
