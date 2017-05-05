package org.controller;

import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javafx.scene.chart.PieChart.Data;

@Controller
public class Controll {
	@InitBinder//Edycja wybranych pol
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[]{"studentMobile"});//nie pokazuj tego pola
		binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
	}

	@RequestMapping(value ="/getSubmitForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmission() {
		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;

	}

	@RequestMapping(value="/submitForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmission(@Valid @ModelAttribute("student1") StudentDAO student,BindingResult result) {
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		ModelAndView model = new ModelAndView("AdmissionSuccess");

		return model;

	}

	@ModelAttribute // Adding common value for both control method
	public void addingCommonObjects(Model model) {
		 model.addAttribute("headMessage", "Politechnika Swietokrzyska w Kielcach");
	}
}
