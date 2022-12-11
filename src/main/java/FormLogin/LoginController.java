package FormLogin;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/Login", method = RequestMethod.GET)

	public String viewLogin(Model model) {
		if(!model.containsAttribute("user")) {
			model.addAttribute("user", new User());
		}
		return "LoginForm";

	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "LoginForm";
		}
		System.out.println("User: "+user.getEmail());
		return "LoginSuccess";

	}
}
