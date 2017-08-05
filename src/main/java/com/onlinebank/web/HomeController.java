package com.onlinebank.web;

import com.onlinebank.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signup", method = GET)
    public String signup(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

    @RequestMapping(value = "/signup", method = POST)
    public void signupPost(@ModelAttribute("user") User user, Model model) {
        /*if (userService.checkUserExists(user.getUsername(), user.getEmail())) {
            if (userService.checkEmailExists(user.getEmail())) {
                model.addAttribute("emailExists", true);
            }
            if (userService.checkUsernameExists(user.getUsername())) {
                model.addAttribute("usernameExists", true);
            }
            return "signup";
        } else {
            Set<UserRole> userRoles = new HashSet<>();
            userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));
            userService.createUser(user, userRoles);
            return "redirect:/";
        }*/
    }
}