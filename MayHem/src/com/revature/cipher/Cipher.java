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
		
		char at;
		for(int i=0; i < pt.length();i++) 
        {
             // Shift one character at a time
            at = pt.charAt(i);
            
			// if alphabet lies between a and z 
            if(at >= 'a' && at <= 'z') 
            {
             	// shift alphabet
             	at = (char) (at + sp);
             	// if shift alphabet greater than 'z'
             	if(at > 'z') {
                	// reshift to starting position 
                	at = (char) (at+'a'-'z'-1);
             	}else if (at < 'a') {
                	// reshift to starting position 
                	at = (char) (at-'a'+'z'+1);
             	}
            }
            // if alphabet lies between A and A 
            else if(at >= 'A' && at <= 'Z') 
            {
             	// shift alphabet
             	at = (char) (at + sp);
             	// if shift alphabet greater than 'z'
             	if(at > 'Z') {
                	// reshift to starting position 
                	at = (char) (at+'A'-'Z'-1);
             	}else if (at < 'A') {
                	// reshift to starting position 
                	at = (char) (at-'A'+'Z'+1);
             	}
            }
//			else {
//				at = (char) (at + sp);
//			}
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
            
			// if alphabet lies between a and z 
            if(at >= 'a' && at <= 'z') 
            {
             	// shift alphabet
             	at = (char) (at - sp);
             	// if shift alphabet greater than 'z'
             	if(at > 'z') {
                	// reshift to starting position 
                	at = (char) (at+'a'-'z'-1);
             	}else if (at < 'a') {
                	// reshift to starting position 
                	at = (char) (at-'a'+'z'+1);
             	}
            }
            // if alphabet lies between A and A 
            else if(at >= 'A' && at <= 'Z') 
            {
             	// shift alphabet
             	at = (char) (at - sp);
             	// if shift alphabet greater than 'z'
             	if(at > 'Z') {
                	// reshift to starting position 
                	at = (char) (at+'A'-'Z'-1);
             	}else if (at < 'A') {
                	// reshift to starting position 
                	at = (char) (at-'A'+'Z'+1);
             	}
            }
//			else {
//				at = (char) (at - sp);
//			}
            pt = pt + at;   
        
        }
		return pt;
	}
}
	