package Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Address {
	 @Id
	    private int id;
	    private String permanentadd;
	    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		

	public String getPermanentadd() {
		return permanentadd;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", permanentadd=" + permanentadd + "]";
	}

	public void setPermanentadd(String permanentadd) {
		this.permanentadd = permanentadd;
	}

}
