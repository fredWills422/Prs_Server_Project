package com.maxtrain.bootcamp.prs.user;

import javax.persistence.*;


@Entity
@Table(uniqueConstraints=@UniqueConstraint(name = "UIDX_userName", columnNames= {"userName"}))
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="userName")
	private String userName;
	@Column(name="Password")
	private String password;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column
	private String phone;
	@Column
	private String email;
	private boolean isReviewer;
	private boolean isAdmin;
	//@Column(name = "isActive")
	//private boolean active;
	public User() {}
	public User(String userName, String password, String firstName, String lastName, String phone, String email,
			boolean isReviewer, boolean isAdmin) {
		super();
		
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.isReviewer = isReviewer;
		this.isAdmin = isAdmin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isReviewer() {
		return isReviewer;
	}
	public void setReviewer(boolean isReviewer) {
		this.isReviewer = isReviewer;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	//public boolean isActive() {
	//	return active;
	//}
	//public void setActive(boolean active) {
	//	this.active = active;
	//}
	
	
}
