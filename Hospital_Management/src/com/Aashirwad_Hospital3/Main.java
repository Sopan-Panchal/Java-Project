package com.Aashirwad_Hospital3;
import com.Aashirwad_Hospital1.Hospital;
import com.Aashirwad_Hospital2.Hospital_Test;
public class Main {
	
	public static void main(String[] args) {
		Hospital_Test dd=new Hospital_Test();
		Hospital ss=dd.hospital();
		ss.display();
		System.out.println();
		Hospital s1=dd.hospital2();
	
		s1.display();
		
	}

}
