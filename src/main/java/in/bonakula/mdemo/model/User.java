package in.bonakula.mdemo.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class User implements Serializable  {

	private static final long serialVersionUID = 1L;
	@javax.persistence.Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long Id;
	@Column
	public String name;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
