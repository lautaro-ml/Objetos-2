package unq;

import java.time.LocalDate;

public abstract class Usuario {
	private String nombreCompleto;
	private String correoElectronico;
	private Integer numeroDeTelefono;
	private LocalDate fechaDeRegistro;
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public Integer getNumeroDeTelefono() {
		return numeroDeTelefono;
	}
	public LocalDate getFechaDeRegistro() {
		return fechaDeRegistro;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public void setNumeroDeTelefono(Integer numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}
	public void setFechaDeRegistro(LocalDate fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

}
