package com.revature.cipher;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pt; 		// Plain Text
		String et; 		// Encrypted/Cipher Text
		String dt; 		// Decrypted Text
		String shift;	// String for shift position
		int sp;			// Shift Position
		
		Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        pt = sc.nextLine();
        System.out.println(" For left shift enter negative number.");
        System.out.println(" For right shift enter positive number.");
        System.out.println(" Enter the value by which character gets shifted : ");
        shift = sc.next();
        sp = Integer.parseInt(shift);
        et = "";
        
        Cipher c = new Cipher ();
        et = c.Encrypt(pt, sp);
        
        System.out.println("Encrypted Text : " + et);
        
        dt = c.Decrypt(et, sp);
        
        System.out.println("Decrypted Text : " + dt);
        
	}

}
