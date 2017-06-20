package com.system.web;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.system.dao.UserImpl;
import com.system.entity.UserBean;
import com.system.form.UserForm;

import validator.UserFormValidator;

@Controller
@SessionAttributes("user_session")
public class UserController extends BaseController {

	@Autowired
	private UserImpl user;

	@InitBinder("userForm")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new UserFormValidator());
	}

	@RequestMapping("/user-add")
	public String addUser(Model model, @ModelAttribute("userForm") @Valid UserForm user, BindingResult result,
			HttpServletRequest request) {

		model.addAttribute("type", this.MODE_NEW);
		if (request.getMethod().compareTo("GET") == 0) {
			model.addAttribute("userForm", new UserForm());
		} else {
			if (!result.hasErrors()) {
				this.user.save(user.toEntity());
			}
		}
		return "user/useradd";
	}

	@RequestMapping("/user-list")
	public String listUser(Model model) {
		model.addAttribute("listUser", user.findAll());
		model.addAttribute("size", user.findAll().size());
		return "user/userlist";
	}

	@RequestMapping("/user-edit/{id}")
	public String EditUser(Model model, @PathVariable(value = "id") Long id) {
		UserBean a = user.findById(id);
		model.addAttribute("userForm", a.toForm());
		model.addAttribute("type", this.MODE_EDIT);
		return "user/useradd";
	}

	@RequestMapping("/user-edit-save")
	public String UserEditSave(@ModelAttribute("userForm") UserForm user) {
		this.user.update(user.toEntity());
		return "user/useradd";
	}

}
