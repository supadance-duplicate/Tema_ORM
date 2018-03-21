package dto;

import java.io.Serializable;
import java.lang.String;

public class UserDTO implements Serializable {

	private int id;
	private String username;
	private String password;
	private String email;
	private String address;
	private String DTYPE;
	private static final long serialVersionUID = 1L;

	public UserDTO() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
   
	public String getDTYPE() {
		return DTYPE;
	}
	public void setDTYPE(String dTYPE) {
		DTYPE = dTYPE;
	}
}
