package ar.edu.unju.fi.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.service.ICandidatoService;
import ar.edu.unju.fi.util.ListaCandidato;
@Service
public class CandidatoServiceImp implements ICandidatoService {
	@Autowired
	private ListaCandidato listaCandidato;
	@Override
	public Candidato buscarCandidato(int codigo) {
		for (Candidato candidato : listaCandidato.getListaCandidato()) {
	        if (candidato.getCodigo() == codigo) {
	            return candidato;
	        }
	    }
	    return null;
	}
	@Override
	public ListaCandidato getListaCandidato() {
		// TODO Auto-generated method stub
		return listaCandidato;
	}
	@Override
	public Candidato getCandidato() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean agregarCandidato(Candidato candidato) {
		listaCandidato.getListaCandidato().add(candidato);
		return true;
	}

}
