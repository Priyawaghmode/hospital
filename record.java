package hospitall;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class record {
	@Id
	private int id;
	private String pname;
	private int time;
	private String sysmtoms;
	@ManyToOne
	branch b;
	@ManyToOne
	patient p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getSysmtoms() {
		return sysmtoms;
	}
	public void setSysmtoms(String sysmtoms) {
		this.sysmtoms = sysmtoms;
	}
	public branch getB() {
		return b;
	}
	public void setB(branch b) {
		this.b = b;
	}
	public patient getP() {
		return p;
	}
	public void setP(patient p) {
		this.p = p;
	}
	
	

}
