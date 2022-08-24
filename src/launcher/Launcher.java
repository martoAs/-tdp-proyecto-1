package launcher;

import entities.Student;
import gui.SimplePresentationScreen;
//id lastname firstname mail githuturl path

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student marti = new Student(134214,"Asteasuain","Martina","martinaasteasuain22@gmail.com","https://github.com/martoAs/","/images/cat.png");
            	SimplePresentationScreen s = new SimplePresentationScreen(marti);
            }
        });
    }
}