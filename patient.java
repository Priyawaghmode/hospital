package hospitall;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class patient {
	@Id
	private int id;
	private String name;
	@OneToMany
	List<record> records;
	@OneToMany
	List<disease> disease;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<record> getRecords() {
		return records;
	}
	public void setRecords(List<record> records) {
		this.records = records;
	}
	public List<disease> getDisease() {
		return disease;
	}
	public void setDisease(List<disease> disease) {
		this.disease = disease;
	}
	

}
