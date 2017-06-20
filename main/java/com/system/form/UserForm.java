package com.system.form;

import com.system.entity.UserBean;

public class UserForm {
	private String name;
	private String lastName;
	private String dni;
	private String idUser;

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public UserBean toEntity() {
		UserBean tmp = new UserBean();
		tmp.setName(this.getName());
		tmp.setLastName(this.getLastName());
		tmp.setDni(Long.valueOf(this.getDni()));
		if (this.getIdUser() != null && this.getIdUser().trim().compareTo("") != 0) {
			tmp.setIdUser(Long.valueOf(this.getIdUser()));
		}
		return tmp;
	}

}
