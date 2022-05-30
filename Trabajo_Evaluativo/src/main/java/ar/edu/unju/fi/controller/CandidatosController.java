package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.service.ICandidatoService;

@Controller
public class CandidatosController {
	@Autowired
	private ICandidatoService candidatoService;
	
	@GetMapping("/candidatos")
	public String getListaCandidatos(Model model) {
		model.addAttribute("candidatos", candidatoService.getListaCandidato().getListaCandidato());
		return "candidatos";
	}
	
	@GetMapping("/nuevo")
	public String getFormCandidatoPage(Model model) {
		
		model.addAttribute("candidato", candidatoService.getCandidato());
		
		return "nuevo_candidato";
	}
	
	@PostMapping("/guardar")
	public ModelAndView redirectCandidatosPage(@ModelAttribute("candidato")Candidato candidato) {
		
		ModelAndView mav = new ModelAndView("redirect:/candidatos");
		candidatoService.agregarCandidato(candidato);
		return mav;
	}
}
