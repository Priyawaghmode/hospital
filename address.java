package hospitall;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class address {
	@Id
	private int id;
	private String address;
	@OneToOne
	branch b;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public branch getB() {
		return b;
	}
	public void setB(branch b) {
		this.b = b;
	}
	
	

}
