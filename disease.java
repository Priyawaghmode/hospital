package hospitall;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class disease {
	@Id
	private int id;
	private String dname;
	@ManyToMany
	List<patient> p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<patient> getP() {
		return p;
	}
	public void setP(List<patient> p) {
		this.p = p;
	}
	

}
