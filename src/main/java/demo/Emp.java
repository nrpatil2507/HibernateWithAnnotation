package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	int id;
	EmpName name;
	String cmpname;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public EmpName getName() {
		return name;
	}


	public void setName(EmpName name) {
		this.name = name;
	}


	public String getCmpname() {
		return cmpname;
	}


	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", cmpname=" + cmpname + "]";
	}


}
