package epam.shatau.task1.coordinates;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class CoordinateLineValidator {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(CoordinateLineValidator.class.getName());
	

	public boolean checkresult(String[] coordinat) {
		
		boolean result = false;	
		try {
			
			for(int i = 0; i < coordinat.length; i++) {
				
				 Integer.parseInt(coordinat[i]);	    
			}
			
			result = coordinat.length == 8;
			
        } catch (Throwable t) {
			logger.error("checkresult(String[])" + String[].class.toString() , t); //$NON-NLS-1$
        	
        	
        	//rise error or/and add log record 
        	result = false;
        }
		
		return result;
		
	}	
}
