package appSoft.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import appSoft.project.model.Customer;
import appSoft.project.model.service.VehicleService;

@Controller
public class MainController {
	@Autowired
	VehicleService vehicleService;
	@GetMapping("/")
	private String main(Model model) {
		return "login";
	}
	@GetMapping("/home")
	private String getHome(Model model) {
		model.addAttribute("vList",vehicleService.getAllVehicle());
		return "homepage";
	}

	

}
