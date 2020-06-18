package com.example.tracker.springboottracker.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tracker.springboottracker.modal.Track;

@Controller
public class TrackController {

	@GetMapping("/track")
	public String TrackForm(Model model) {
		model.addAttribute("track", new Track());
		return "track";
	}

	@PostMapping("/track")
	public String greetingSubmit(@ModelAttribute Track track) {
		return "trackresult";
	}
}
