package dto;

import java.io.Serializable;
import java.lang.String;

public class WineDTO implements Serializable {

	private int id;
	private String name;
	private String wineType;
	private String variety;
	private int year;
	private String description;
	private static final long serialVersionUID = 1L;

	public WineDTO() {
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
	public String getWineType() {
		return this.wineType;
	}

	public void setWineType(String wineType) {
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
   
}
