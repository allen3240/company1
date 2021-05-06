package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/A")
public class Hello {
	
	@RequestMapping("/Abc")
	public String hello() throws Exception
	{
		return "hello boot";
	}

}
