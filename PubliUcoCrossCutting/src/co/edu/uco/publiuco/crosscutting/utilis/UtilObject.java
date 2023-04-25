package co.edu.uco.publiuco.crosscutting.utilis;

public  interface UtilObject {

	
	
	static <O> boolean isNull(final O object ) {
		return object == null;
		
	}
}
