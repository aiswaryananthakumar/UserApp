package com.skilljobbie.usersapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.skilljobbie.usersapp.model.User;

@Controller
public class UserController {
	
List<User> list = new ArrayList<>();
	
	@GetMapping("/")
	public String create(Model model) {
		model.addAttribute("user", new User());
		return "createform";
	}

	@PostMapping("/createform")
	public String create(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("user", user);
		list.add(user);
		return "success";
	}

}
