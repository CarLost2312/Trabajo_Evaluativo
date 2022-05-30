package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.util.ListaCandidato;

public interface ICandidatoService {
	public ListaCandidato getListaCandidato();
	public Candidato buscarCandidato(int codigo);
	public Candidato getCandidato();
	public boolean agregarCandidato(Candidato candidato);
	public int contarVotos();
}
