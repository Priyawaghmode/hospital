package hospitall;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class branch {
@Id
private int id;
private String bname;
@OneToMany
address a;
@OneToMany
List<record> r;
@ManyToOne
hospital h;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public address getA() {
	return a;
}
public void setA(address a) {
	this.a = a;
}
public List<record> getR() {
	return r;
}
public void setR(List<record> r) {
	this.r = r;
}
public hospital getH() {
	return h;
}
public void setH(hospital h) {
	this.h = h;
}

}
