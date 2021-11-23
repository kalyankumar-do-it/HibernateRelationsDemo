package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	private int pId;
	private String pName;
	@ManyToMany(mappedBy = "product")
	private List<Reviews> pReviews = new ArrayList();

	public int getPid() {
		return pId;
	}

	public void setPid(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pName;
	}

	public void setPname(String pName) {
		this.pName = pName;
	}

	public List<Reviews> getpReviews() {
		return pReviews;
	}

	public void setpReviews(List<Reviews> pReviews) {
		this.pReviews = pReviews;
	}

	

}
