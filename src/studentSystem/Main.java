package studentSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		try {
			Student s=new Student("1455", "dsdsf", 10);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("güle güle");
		
		
	}

}
