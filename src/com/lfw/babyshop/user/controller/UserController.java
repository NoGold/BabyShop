package com.lfw.babyshop.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lfw.babyshop.user.entity.User;
import com.lfw.babyshop.user.pojo.RegisterPOJO;
import com.lfw.babyshop.user.service.UserService;
@SessionAttributes(value={"user"})//, types={String.class}
@RequestMapping("/user")//支持通配符，？表示一个，*表示任意，**匹配多层路径
@Controller
public class UserController {

	@Autowired
	private UserService userService;

/*	@RequestMapping("/demo/{id}")
	public String demo(@PathVariable(value="id") Integer id) {
		return "user/loginSuccess";
	}*/
	@RequestMapping("/")
	public String index() {
		return "index";

	}
	@RequestMapping("/home")
	public String home() {
		return "user/home";

	}
	//(value="/loginCheck", method=RequestMethod.GET,
	//params={"userName","userPassword"},headers={"Accept-language=zh-CN,zh;q=0.8"})
	@RequestMapping(value="/login")
	public ModelAndView login(@RequestParam(value="userId") String userId,
			@RequestParam(value="userPassword") String userPassword) {//,required=false,defaultValue="0"
		ModelAndView modelAndView;
		User user = userService.loginCheck(userId, userPassword);
		if(user != null) {
			modelAndView = new ModelAndView("user/loginSuccess");
			modelAndView.addObject("user", user);
		} else {
			modelAndView = new ModelAndView("user/home");
			modelAndView.addObject("loginResult", "登录失败");
		}
		return modelAndView;
	}
	@RequestMapping(value="/register")
	public ModelAndView register(RegisterPOJO register) { 
		ModelAndView modelAndView;
		String regiResult = userService.register(register);
		if(regiResult.equals("注册成功")) {
			modelAndView = new ModelAndView("user/registerSuccess");
		} else {
			modelAndView = new ModelAndView("user/registerFail");
		}
		modelAndView.addObject("regiResult", regiResult);
		return modelAndView;
	}
	/**
	 * Rest 风格的 URL. 以 CRUD 为例: 
	 * 新增: /order POST 
	 * 修改: /order/1 PUT update?id=1
	 * 获取: /order/1 GET get?id=1
	 * 删除: /order/1 DELETE delete?id=1
	 * 如何发送 PUT 请求和 DELETE 请求呢 ? 
	 * 1. 需要配置 HiddenHttpMethodFilter 
	 * 2. 需要发送 POST 请求
	 * 3. 需要在发送 POST 请求时携带一个 name="_method" 的隐藏域, 值为 DELETE 或 PUT
	 * 
	 * 在 SpringMVC 的目标方法中如何得到 id 呢? 使用 @PathVariable 注解
	 * 
	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id) {
		System.out.println("testRest Put: " + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id) {
		System.out.println("testRest Delete: " + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest", method = RequestMethod.POST)
	public String testRest() {
		System.out.println("testRest POST");
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
	public String testRest(@PathVariable Integer id) {
		System.out.println("testRest GET: " + id);
		return SUCCESS;
	}
	 */
}
