package ioexamples;

import java.io.*;
import java.util.*;

/**
 * TextWriterApp.java	1.00 Nov 25, 2003
 *
 * A class that writes data to a text file, with buffering.
 */
public class TextWriterLab1{
	
   public static void main(String[] args) throws IOException{
   	  boolean append = true;   // you can change this

	  // This references the file in the working directory
	//  File data = new File("src/test.out");
          File data = new File("C:" + File.separatorChar
                          + "temp" + File.separatorChar 
                          + "lab1" + File.separatorChar
                                        + "file.txt");
	  		
      // This is where we setup our streams (append = false means overwrite)
      // new FileWriter() creates the file if doesn't exit
	  PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(data, append)));
	  
	  // print statements do actual work of writing data
	  // note that print statements work similar to Sytem.out.println,
	  // where data is converted to strings
          out.println("First Name");
	  out.print("Jeffiner O'neal");
           out.println("Second Name");
          out.println("Neal lane");
            out.println("Cudahay, WI 51555");
             out.println("First Name");
            out.println("John Oshea");
            out.println("Gregory Lane");
            out.println("Osakee, WI 53094");

          
          
	  out.close();  // be sure you close your streams when done!!
	
	  System.out.println("Wrote file to: " + data.getAbsolutePath());
   }
}
