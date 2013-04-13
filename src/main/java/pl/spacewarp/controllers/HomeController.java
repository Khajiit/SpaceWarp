package pl.spacewarp.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller of the frontpage
 *
 * Created with IntelliJ IDEA.
 * User: Khajiit
 * Date: 13.04.13
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {
    private static Logger log = Logger.getLogger(HomeController.class);

    private static final String HOME_VIEW = "home";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showHomePage() {
        return new ModelAndView(HOME_VIEW);
    }
}
