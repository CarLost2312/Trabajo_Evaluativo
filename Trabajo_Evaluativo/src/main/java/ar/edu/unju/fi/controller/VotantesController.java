package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.service.IUsuarioService;

@Controller
public class VotantesController {
	@Autowired
	private IUsuarioService usuarioService;
@GetMapping ("/votantes")	
public String getEstadisticaPage (Model model) {
	model.addAttribute("listausuario", usuarioService.getListaUsuario().getListaUsuario());

return "votantes";

}
}
