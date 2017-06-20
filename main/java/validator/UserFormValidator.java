package validator;

import com.system.form.UserForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserFormValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return UserForm.class.equals(clazz);
	}

	public void validate(Object o, Errors errors) {
		UserForm tmp = (UserForm) o;
		if (tmp.getName() == null || tmp.getName().trim().compareTo("") == 0) {
			errors.rejectValue("name", "user_name", "campo no vacio");
		}

	}

}
