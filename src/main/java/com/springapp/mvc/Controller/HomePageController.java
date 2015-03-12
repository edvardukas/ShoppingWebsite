package com.springapp.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView homePageView () {

		HashMap<String, Object> model = new HashMap<String, Object>();

		model.put("welcomeMessage", "Hello_everybody!");

		return new ModelAndView("HomePage", model);
	}
}