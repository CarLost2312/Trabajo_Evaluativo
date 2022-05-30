package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class UsuarioController {
	@Autowired
	private IUsuarioService usuarioService;
	
	private static final Log LOGGER = LogFactory.getLog(UsuarioController.class);
	
	@GetMapping("/votar/{codigo}")
	public ModelAndView getVotarPage(@PathVariable(value="codigo")int codigo) {
		ModelAndView mav = new ModelAndView("votar");
		Candidato candidato = usuarioService.buscarCandidato(codigo);
		mav.addObject("candidato", candidato);
		return mav;
	}
	
	@PostMapping("/votar/{codigo}")
	public ModelAndView enviarVoto(@PathVariable(value="codigo")int codigo, @ModelAttribute("usuario") Usuario usuario ) {
		
		ModelAndView mav = new ModelAndView("redirect:/candidatos");
		usuarioService.votar(codigo, usuario.getNombre());
		LOGGER.info("Votacion exitosa!");
		return mav;
		
	}

}