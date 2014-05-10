package com.highrise.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.highrise.model.User;
import com.highrise.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
	public String createUser(User user) {
		user.setUserName("test1");
		user.setUserType("Engineer");
		userService.save(user);		
		return "home";
		
	}
	
	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	public String updateUser(User user) {
		user.setUserName("test1");
		user.setUserType("Testing");
		userService.update(user);	
		return null;
		
	}

	
	@RequestMapping(value = "/delete/{userName}", method = RequestMethod.GET)
    public String deleteUser(Model model, @PathVariable String userName) {
		User user = new User();
		user.setUserName(userName);
        userService.delete(user);
        model.addAttribute("deleted", "success");
        model.addAttribute("user", new User());
        return "index";
    }
	
	@RequestMapping(value = "/deleteById/{userID}", method = RequestMethod.GET)
    public String deleteUserByID(Model model, @PathVariable int userID) {
		 
        userService.deleteUserById(userID);
        model.addAttribute("deleted", "success");
        model.addAttribute("user", new User());
        return "index";
    }

}
