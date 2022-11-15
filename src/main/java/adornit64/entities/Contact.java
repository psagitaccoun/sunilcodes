package adornit64.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name",nullable=false,length=20)
	private String firstName;
	
	@Column(name="last_name",nullable=false,length=20)
	private String lastName;
	
	@Column(name="source",nullable=false)
	private String source;
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	@Column(name="mobile",nullable=false,unique=true,length=10)
	private long mobile;

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSource() {
		return source;
	}

	public String getEmail() {
		return email;
	}

	public long getMobile() {
		return mobile;
	}
	
}
