package com.system.dao;

import java.util.List;

import com.system.entity.UserBean;

public interface UserInterface {

	public UserBean findById(Long id);

	public UserBean save(UserBean user);

	public List<UserBean> findAll();

	public UserBean update(UserBean user);


}
