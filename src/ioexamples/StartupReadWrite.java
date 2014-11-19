/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ioexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Owner
 */
public class StartupReadWrite {
    
    String line;
    File data = new File(File.separatorChar
                      + "ADV JAVA" + File.separatorChar 
                        + File.separatorChar
                    + "file.txt");
        
        File dataout = new File(File.separatorChar
                      + "ADV JAVA" + File.separatorChar 
                        + File.separatorChar
                    + "file.txt");
       
    public static void main(String[] args) {
	
     line = readin();
      
         
    public String readin(){
        String line;
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   line = in.readLine();
	   while(line != null){
	//	  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   return line;
           }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                System.out.println("could not close stream");
            }
        }
    }
        

        private void writeout() throws IOException{
            boolean append = true;
          PrintWriter out = new PrintWriter(
			new BufferedWriter(
		new FileWriter(dataout, append)));
	  
	 
//          out.println("First Name");
//	  out.print("Jeffiner O'neal");
//           out.println("Second Name");
//          out.println("Neal lane");
//            out.println("Cudahay, WI 51555");
//             out.println("First Name");
//            out.println("John Oshea");
//            out.println("Gregory Lane");
//            out.println("Osakee, WI 53094");

          
          
	  out.close();  // be sure you close your streams when done!!
	
	  System.out.println("Wrote file to: " + data.getAbsolutePath());
   }
}
    
    } // end main
} // end classd