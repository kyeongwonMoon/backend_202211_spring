package com.kw.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kw.board.dto.response.ResponseDto;
import com.kw.board.dto.user.GetUserResponseDto;
import com.kw.board.dto.user.PatchUserDto;
import com.kw.board.dto.user.PostUserDto;
import com.kw.board.dto.user.ResultResponseDto;
import com.kw.board.service.UserService;

@RestController
@RequestMapping("api/user/")
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping("{email}")
	public ResponseDto<GetUserResponseDto> getUser(@PathVariable("email") String email) {
		return userService.getUser(email);
	}

	@PostMapping("")
	public ResponseDto<ResultResponseDto> postUser(@RequestBody PostUserDto requestBody) {
		return userService.postUser(requestBody);
	}
	
	@PatchMapping("")
	public ResponseDto<GetUserResponseDto> patchUser(@RequestBody PatchUserDto requestBody) {
		return userService.patchUser(requestBody);
	}
	
	@DeleteMapping("{email}")
	public ResponseDto<ResultResponseDto> deleteUser(@PathVariable("email") String email) {
		return userService.deleteUser(email);
	}
}