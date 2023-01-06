package com.kw.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kw.board.dto.auth.AuthPostDto;
import com.kw.board.dto.auth.LoginDto;
import com.kw.board.dto.response.ResponseDto;
import com.kw.board.service.AuthService;

@RestController
@RequestMapping("api/auth/")
public class AuthController {

	// @Autowired : 해당하는 클래스 인스턴스를 자동으로 생성(주입) 해줌 
	@Autowired AuthService authService;
	
	@PostMapping("")
	public ResponseDto<LoginDto> login(@RequestBody AuthPostDto requestBody) {
		return authService.login(requestBody);
	}
}
