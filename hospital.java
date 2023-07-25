package hospitall;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class hospital {
	@Id
	private int id;
	private String hname;
	@OneToMany
	List<branch> b;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public List<branch> getB() {
		return b;
	}
	public void setB(List<branch> b) {
		this.b = b;
	}
	

}
