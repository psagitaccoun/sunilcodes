package adornit64.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",nullable=false,length=45)
	private String firstName;
	
	@Column(name="last_name",nullable=false,length=45)
	private String lastName;
	
	@Column(name="source",nullable=false)
	private String source;
	
	@Column(name="email",nullable=false,length=128,unique=true)
	private String email;
	
	@Column(name="mobile",nullable=false,length=10,unique=true)
	private long mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
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
