package py.edu.uaa.poo.actividad2;

import java.util.Date;


public class Persona {
	

	
	//atributos
		private String nombre;
		private String apellido;
		private Date fechanan;
//constructor vacio
	public Persona(){
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechanan() {
		return fechanan;
	}
	public void setFechanan(Date fechanan) {
		this.fechanan = fechanan;
	}
	



}