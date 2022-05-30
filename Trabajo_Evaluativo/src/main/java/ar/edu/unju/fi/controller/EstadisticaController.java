package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstadisticaController {
	
@GetMapping("/estadistica")	
public String getEstadisticaPage () {
return "estadistica";	
	
}


}
