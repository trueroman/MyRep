package spr.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstContr {
	
	@RequestMapping ("/me")
	public String myFirst ()	{
		return "Hell";
	}
}
