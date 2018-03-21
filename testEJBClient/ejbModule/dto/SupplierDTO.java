package dto;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;

public class SupplierDTO extends UserDTO implements Serializable {

	
	private String nameWinery;
	private Boolean visibility;
	private static final long serialVersionUID = 1L;

	public SupplierDTO() {
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
   
}
