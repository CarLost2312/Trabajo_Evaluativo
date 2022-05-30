package ar.edu.unju.fi.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;
import ar.edu.unju.fi.util.ListaCandidato;
import ar.edu.unju.fi.util.ListaUsuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	private ListaCandidato listaCandidato;
	@Autowired
	private ListaUsuario listaUsuario;
	
	private static final Log LOGGER = LogFactory.getLog(UsuarioServiceImp.class);
	
	@Override
	public Usuario buscarUsuario(String nombre) {
		for (Usuario usuario : listaUsuario.getListaUsuario()) {
	        if (usuario.getNombre().equals(nombre)) {
	            return usuario;
	        }
	    }
	    return null;
	}

	@Override
	public ListaUsuario getListaUsuario() {
		// TODO Auto-generated method stub
		return listaUsuario;
	}

	@Override
	public boolean agregarUsuario(Usuario usuario) {
		listaUsuario.getListaUsuario().add(usuario);
		return true;
	}

	@Override
	public void votar(int codigo, String nombre) {
		try {
			for (Candidato candidato : listaCandidato.getListaCandidato()) {
				if (candidato.getCodigo() == codigo) {
					candidato.setCantidadVotos(candidato.getCantidadVotos() + 1);
					//TODO restar chance de votar al usuario
					break;
				}
			}			
			
		} catch (Exception e) {
			LOGGER.info(listaUsuario.getListaUsuario());
		}
	}

	@Override
	public Candidato buscarCandidato(int codigo) {
		for (Candidato candidato : listaCandidato.getListaCandidato()) {
	        if (candidato.getCodigo() == codigo) {
	            return candidato;
	        }
	    }
	    return null;
	}

}
