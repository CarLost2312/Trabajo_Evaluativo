package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.util.ListaUsuario;

public interface IUsuarioService {
	public Usuario buscarUsuario(String nombre);
	public ListaUsuario getListaUsuario();
	public boolean agregarUsuario(Usuario usuario);
	public void votar(int codigo, String nombre);
	public Candidato buscarCandidato(int codigo);
}
