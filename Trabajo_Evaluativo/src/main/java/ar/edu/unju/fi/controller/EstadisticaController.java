package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.service.ICandidatoService;

@Controller
public class EstadisticaController {
	@Autowired
	private ICandidatoService candidatoService;

@GetMapping("/estadistica")	
public String getEstadisticaPage (Model model) {
	model.addAttribute("estadistica", candidatoService.getListaCandidato().getListaCandidato());
	model.addAttribute("total", candidatoService.contarVotos());

return "estadistica";

	
}


}
