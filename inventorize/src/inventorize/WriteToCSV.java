package inventorizeApp.views;

import javax.swing.JOptionPane;
import java.io.*;


public class WriteToCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ID = "11";
		String name = "Janis Joplin";
		String title = "Pearl";
		String qty = "24";
		String price = "22.99";
		String filepath = "inventory.txt";
		
		saveRecord(ID, name, title, qty, price, filepath);
		
	}
	
	public static void saveRecord(String ID, String name, String title, String qty, String price, String filepath)
	{
		try
		{
			FileWriter fw = new FileWriter(filepath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(ID+","+name+","+title+","+qty+","+price);
			pw.flush();
			pw.close();
			
			JOptionPane.showMessageDialog(null, "Record saved");
		}
		catch(Exception E) 
		{
			JOptionPane.showMessageDialog(null, "Record not saved");
		}
	}

}
