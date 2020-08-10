package empl.data.runner;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import empl.data.utils.EmployeData;

class Runner { 
		
		 public static String readString(String msg) {
				System.out.println(msg);
				Scanner input = new Scanner(System.in);
				return input.nextLine();
			}
 public static void main(String[] args) {
	ArrayList<EmployeData> employe = new ArrayList<EmployeData>();
	int i = 0;
			while (i<2){
				employe.add(new EmployeData(readString("Please enter the name"),
						Integer.parseInt(readString("Please Age")),
						readString("Please enter you Contact"),
						readString("Plaese entert you gender")
						));
				i++;
			}
			for (EmployeData employes : employe) {
				System.out.println(employes);
			}
 }	
}

