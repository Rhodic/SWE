package SWE_MVP;

import javax.swing.SwingUtilities;
import View;

public class Start {
    
    public static void main(String[] args) {
		
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new View();
            }
        }); 
	}
}
