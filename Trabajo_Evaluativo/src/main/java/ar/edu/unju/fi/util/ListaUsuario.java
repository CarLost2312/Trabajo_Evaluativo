package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Usuario;
@Component
public class ListaUsuario {
	
	private ArrayList<Usuario> listaUsuario;
	
	public ListaUsuario() {
		listaUsuario = new ArrayList<Usuario>();
		
		listaUsuario.add(new Usuario("meii","meii@mail.com", LocalDate.of(1988, 07, 14)));
		listaUsuario.add(new Usuario("ema","ema@mail.com", LocalDate.of(1988, 07, 13)));
		listaUsuario.add(new Usuario("carlos","carlos@mail.com", LocalDate.of(1988, 07, 12)));
	}

	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
}
