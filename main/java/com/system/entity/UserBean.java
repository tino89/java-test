package com.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.system.form.UserForm;

@Entity
@Table(name = "user")
public class UserBean {

	@Id
	@GeneratedValue
	@Column(name = "iduser")
	private Long idUser;

	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "dni")
	private Long dni;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}
	
	public UserForm toForm(){
		UserForm tmp =  new UserForm();
		tmp.setDni(dni.toString());
		tmp.setName(name.toString());
		tmp.setLastName(lastName.toString());
		tmp.setIdUser(idUser.toString());
		return tmp;
	}

}
