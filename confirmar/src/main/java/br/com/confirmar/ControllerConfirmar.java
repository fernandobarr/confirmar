package br.com.confirmar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class ControllerConfirmar {

	/*@RequestMapping("/confirmar")
	private ModelAndView index() {
		ModelAndView mav = new ModelAndView("confirmar");
		return mav;
	}*/
	
	@RequestMapping("/")
	public String confirmar() {
		return "/confirmar";
	}
	
}
