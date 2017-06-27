package cn.fjlcx.office.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * Created by lcx on 2017/6/27.
 */
@RestController
class UserController {
	@RequestMapping(value = "user",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户列表", notes = "")
	@ResponseBody
	public void user(){
		System.out.print("hello world");
	}
}
