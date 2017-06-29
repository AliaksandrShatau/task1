package epam.shatau.task1.coordinates;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoordinateFileReader {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(CoordinateFileReader.class.getName());

	public String[] readArray(String file) {
		
		ArrayList<String> lines = new ArrayList<String>();
		String[] arrayLines = null;
		
		Scanner sc;
		try {
			sc = new Scanner(new File(file));
			
			while (sc.hasNextLine()) {
				lines.add(sc.nextLine());
			}

		arrayLines = lines.toArray(new String[0]);

		} catch (FileNotFoundException e) {
			logger.error("readArray(String)", e); //$NON-NLS-1$
		}

		return arrayLines;
		
	}

    
    	    

   
	

}
