package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.util;







public class EstadoTipoRelacionInstitucionDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private 
	
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText);
		setDescripcion(UtilText.EMPTY);
	}
	
	
	UtilUUID.DEFAULT_UUID
	public EstadoTipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
		return this;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	
	

}
