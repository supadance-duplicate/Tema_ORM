package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SOrder
 *
 */
@Entity

public class SOrder implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private ClientB2C clientB2C;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToMany(mappedBy = "order")
	private List<Order_Items> order_items;
	
	private static final long serialVersionUID = 1L;

	public SOrder() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public ClientB2C getClientB2C() {
		return clientB2C;
	}
	public void setClientB2C(ClientB2C clientB2C) {
		this.clientB2C = clientB2C;
	}
	public List<Order_Items> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(List<Order_Items> order_items) {
		this.order_items = order_items;
	}
   
}
