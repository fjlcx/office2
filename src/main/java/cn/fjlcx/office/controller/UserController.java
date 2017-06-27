package cn.fjlcx.office.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lcx on 2017/6/27.
 */
@Controller
class UserController {
	@RequestMapping("user")
	public void user(){
		System.out.print("hello world");
	}

}
