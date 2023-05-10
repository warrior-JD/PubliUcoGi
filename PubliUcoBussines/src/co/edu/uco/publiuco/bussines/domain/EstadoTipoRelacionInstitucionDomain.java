package co.edu.uco.publiuco.bussines.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utilis.UtilText;




public class EstadoTipoRelacionInstitucionDomain {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public EstadoTipoRelacionInstitucionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText(.getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	
	
	public EstadoTipoRelacionInstitucionDomain(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	private final EstadoTipoRelacionInstitucionDomain setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private final EstadoTipoRelacionInstitucionDomain setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
		return this;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	private final EstadoTipoRelacionInstitucionDomain setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	
	

}
