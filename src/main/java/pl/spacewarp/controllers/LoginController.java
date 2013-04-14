package pl.spacewarp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller responsible for security requests like logging or registering a new user.
 *
 * Created with IntelliJ IDEA.
 * User: Khajiit
 * Date: 14.04.13
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginController {

    private static final String LOGIN_VIEW = "login";

    @RequestMapping("/login/form")
    public ModelAndView login() {
        return new ModelAndView(LOGIN_VIEW);
    }

}
