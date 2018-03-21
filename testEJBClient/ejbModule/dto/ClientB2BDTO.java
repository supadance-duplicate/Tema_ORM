package dto;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;

public class ClientB2BDTO extends UserDTO implements Serializable {

	private int id;
	private String companyName;
	private String CUI;
	private Boolean visibility;
	private Boolean subscribed;
	private static final long serialVersionUID = 1L;

	public ClientB2BDTO() {
		super();
	}   
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}   
	public String getCUI() {
		return this.CUI;
	}

	public void setCUI(String CUI) {
		this.CUI = CUI;
	}   
	public Boolean getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Boolean visibility) {
		this.visibility = visibility;
	}   
	public Boolean getSubscribed() {
		return this.subscribed;
	}

	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
   
}
