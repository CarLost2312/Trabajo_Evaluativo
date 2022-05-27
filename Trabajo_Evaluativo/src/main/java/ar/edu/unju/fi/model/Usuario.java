package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Usuario {

private String nombre;
private String email;
private LocalDate FechaNacimiento;

public Usuario(String nombre, String email, LocalDate fechaNacimiento) {
	super();
	this.nombre = nombre;
	this.email = email;
	FechaNacimiento = fechaNacimiento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getFechaNacimiento() {
	return FechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	FechaNacimiento = fechaNacimiento;
}

	



}
