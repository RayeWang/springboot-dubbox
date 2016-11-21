package wang.raye.dubbo.Consumer.sources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wang.raye.dubbo.interfaces.DubboInterface;


@Controller
public class DubboControll {
	
	@Autowired
	private DubboInterface interface1;
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(String name){
		return interface1.hello(name);
	}

	
	
}
