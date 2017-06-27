package cn.fjlcx.office.controller;

import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.fjlcx.office.bean.User;
import cn.fjlcx.office.service.UserService;
import cn.fjlcx.office.utils.ResponseJsonUtils;
import io.swagger.annotations.ApiOperation;

/**
 * Created by lcx on 2017/6/27.
 */
@RestController
class UserController {
	@Autowired
	UserService mUserService;
	Gson gson = new Gson();

	@RequestMapping(value = "getAllUser",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户列表", notes = "")
	@ResponseBody
	public void user(HttpServletRequest request, HttpServletResponse response){
		User list = mUserService.selectUserById(1);
		ResponseJsonUtils.json(response,list);
	}
}
