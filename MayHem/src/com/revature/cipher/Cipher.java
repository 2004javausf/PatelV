package com.revature.cipher;

public class Cipher {
	
	private String pt;
	private String ct;
	private int sp;
	char np;

	public String  Encrypt(String pt, int sp)
	{
		this.ct = "";
		this.pt = pt;
		this.sp = sp;
		
		if(sp < 0) {
            np ='n';
        }

		char at;
        for(int i=0; i < pt.length();i++) 
        {
             // Shift one character at a time
            at = pt.charAt(i);
            at = (char) (at + this.sp);
            
             ct = ct + at;   
        
        }
   
		return ct;
	}
	
	public String  Decrypt(String et, int sp)
	{
		this.ct = et;
		this.pt = "";
		this.sp = sp;
		
		char at;
        for(int i=0; i < ct.length();i++) 
        {
             // Shift one character at a time
            at = ct.charAt(i);
            at = (char) (at - this.sp);
         
            pt = pt + at;            
            
        }
   
		return pt;
	}
}
	