package wang.raye.dubbo.Provider2;

import org.springframework.stereotype.Service;

import wang.raye.dubbo.interfaces.DubboInterface;

@Service
public class DubboImpl implements DubboInterface {

	public String hello(String name) {
		return "hello "+name+"  this is dubbodemo2";
	}

}
