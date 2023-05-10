package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utilis.UtilText;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

public class EstadoTipoRelacionInstitucionEntity {

	private UUID identificador;
	private String nombre;
	private String descripcion;
	private 
	

	
	
	
	public EstadoTipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	private final setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private final  setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	private final  setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}
	
}
