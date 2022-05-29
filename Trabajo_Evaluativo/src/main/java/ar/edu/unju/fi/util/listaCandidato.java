package ar.edu.unju.fi.util;
import java.util.ArrayList;
import ar.edu.unju.fi.model.Candidato;

public class listaCandidato {
	private ArrayList<Candidato> listaCandidato;
	
	public listaCandidato() {
		//se crea la lista de candidatos
		listaCandidato= new ArrayList<Candidato>();
		//se precarga el arrayList
		listaCandidato.add(new Candidato(1,"Abel Pintos","Folclore y Pop","Abel Pintos es un cantante, compositor y productor argentino de folclore y pop latino.",0));
		listaCandidato.add(new Candidato(2,"Andres Calamaro","Rock","Andres Calamaro Masel es un cantautor,musico,compositor y productor discografico argentino.Es considerado uno de los iconos del rock argentino por su actuacion con los abuelos de la nada.",0));
		listaCandidato.add(new Candidato(3,"Airbag","Rock","Es una banda argentina de rock formada en Bs.As en el año 2003. El grupo fue fundado por los hermanos Gaston Patricio y Guido.",0));		
		listaCandidato.add(new Candidato(4,"Cazzu","Trap,Hip Hop","Julieta Emilia Cazzuchelli es una rapera cantante, compositora y directora argentina(Jujuy)",0));
		listaCandidato.add(new Candidato(5,"Dread Mar I","Reggae-Pop","Dream Mar-I nombre artistico de Mariano Javier Castro es un cantante argentino, ampliamente conocido en latinoamerica",0));
		listaCandidato.add(new Candidato(6,"Enanitos Verdes","Rock","Enanitos Verdes es una banda de rock argentino formada en 1979 en Mendoza,Argentina",0));
		listaCandidato.add(new Candidato(7,"Los Autenticos Decadentes","Ska-Rock","Es una banda argentina formada en 1986 por Cucho Parisi,Nito Montecchia y Gaston Frances",0));
		listaCandidato.add(new Candidato(8,"Los Fabulosos Cadilacs","Rock","Los Fabulosos Cadilacs es una banda de ska proveniente de Buenos Aires y fundada en 1984.Considerada una de las mejores banda en su genero en Latinoamerica",0));
		listaCandidato.add(new Candidato(9,"Paulo Londra","Trap-Pop Latino","Paulo Londra es un rapero , cantante y compositor argentino. Paulo surgio de las competenias de freestyle de plaza que se celebraban de forma amateur,como el Quinto Escalon",0));
		listaCandidato.add(new Candidato(10,"Soda Stereo","Rock","Soda Stereo es una banda Argentina de rock alternativo formada en Belgrano,Bs.As en 1982 por Gustavo Cerati, Hector Bosio y CArlos Ficicchia",0));
	
	}
	

	//Metodos accesores
	public ArrayList<Candidato> getListaCandidato() {
		return listaCandidato;
	}
	public void setListaCandidato(ArrayList<Candidato> listaCandidato) {
		this.listaCandidato = listaCandidato;
	}
	
}
