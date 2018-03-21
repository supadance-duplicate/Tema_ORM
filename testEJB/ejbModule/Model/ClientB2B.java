package Model;

import Model.User;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClientB2B
 *
 */
@Entity

public class ClientB2B extends User implements Serializable {

	private String companyName;
	private String CUI;
	private Boolean visibility;
	private Boolean subscribed;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "clientB2B")
	private List<Stock_ClientB2B> stock_clientB2B;
	
	
	public List<Stock_ClientB2B> getStock_clientB2B() {
		return stock_clientB2B;
	}
	public void setStock_clientB2B(List<Stock_ClientB2B> stock_clientB2B) {
		this.stock_clientB2B = stock_clientB2B;
	}
	public ClientB2B() {
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
   
}
