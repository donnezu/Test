package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entiti.Music;
import com.example.demo.form.MusicForm;
import com.example.demo.service.MusicService;
@Controller
public class MusicController {
	@Autowired
	MusicService service;
	
@GetMapping("index")
public String indexView() {
	return "index";
}
//@PostMapping("dbselect")
@PostMapping(value="menu",params="select")
public String listView(Model model) {
	Iterable<Music> list=service.findAll();
	model.addAttribute("list",list);
	return "list";
}
@PostMapping(value="menu",params="insert")
public String musicInputView() {
	return "music-input";
}
@PostMapping("insert")
public String musicConfirmView(MusicForm m) {
	Music music=new Music(m.getSong_id(),
			m.getSong_name(),m.getSinger());
	service.insertMusic(music);
	return "music-complete";
}
}
