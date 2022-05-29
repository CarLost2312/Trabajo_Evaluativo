package ar.edu.unju.fi.util;
import java.util.ArrayList;
import ar.edu.unju.fi.model.Usuario;

public class listaUsuario {
	private ArrayList<Usuario> listaUsuario; 	
	
	
	public listaUsuario() {
		listaUsuario= new ArrayList<Usuario>();
	}

	
	//Metodos accesores
	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
}
