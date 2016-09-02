package py.edu.uaa.poo.actividad2;

import java.util.Date;

public class Ediccion {
	private String isbn;
	private Date fechapublicacion;
	private Libro libro;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getFechapublicacion() {
		return fechapublicacion;
	}
	public void setFechapublicacion(Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
}
