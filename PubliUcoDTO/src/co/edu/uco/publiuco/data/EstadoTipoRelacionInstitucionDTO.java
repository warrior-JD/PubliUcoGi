package co.edu.uco.publiuco.data;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utilis.UtilText;



public class EstadoTipoRelacionInstitucionDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText(.getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	
	
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
		this.identificador = identificador;
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
