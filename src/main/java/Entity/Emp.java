package Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {
@Id
private int eid;
private String name;
@ManyToMany
private List<Project> projects;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", name=" + name + ", projects=" + projects + "]";
}
public Emp(int eid, String name, List<Project> projects) {
	super();
	this.eid = eid;
	this.name = name;
	this.projects = projects;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
}
