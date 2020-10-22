package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {	
		String answer = JOptionPane.showInputDialog("Do you know how to code?");	
if (answer.equalsIgnoreCase("yes")) {	JOptionPane.showMessageDialog(null, "You Will Rule The Planet!!!");}
else JOptionPane.showMessageDialog(null, "Sign up for classes at the league!!!");
	}
}

