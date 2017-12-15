package com.tactfactory.capfakeskillspring.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

@Entity
@Table(
    name = "user",
    uniqueConstraints=@UniqueConstraint(columnNames="email")
)
public class User extends BaseEntity {

	private String lastname;

	private String firstname;

	private String email;

	private String password;

	@ManyToOne
	private User carrer_manager;

	public User getCarrer_manager() {
		return carrer_manager;
	}

	public void setId_carrer_manager(User carrer_manager) {
		this.carrer_manager = carrer_manager;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return this.firstname + "." + this.lastname;
	}

	@Override
	public String toString() {
		return "User [lastname=" + lastname + ", firstname=" + firstname
				+ ", email=" + email + ", password=" + password + ", getId()="
				+ getId() + "]";
	}
}
