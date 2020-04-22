package com.revature.cipher;

public class Cipher 
{
	
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
            
			// if character lies between a and z 
            if(at >= 'a' && at <= 'z') 
            {
             	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than 'z'
             	if(at > 'z') {
                	// re-shift to starting position 
                	at = (char) (at+'a'-'z'-1);
             	}else if (at < 'a') {
                	// re-shift to starting position 
                	at = (char) (at-'a'+'z'+1);
             	}
            }
            // if character lies between A and Z 
            else if(at >= 'A' && at <= 'Z') 
            {
             	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than 'z'
             	if(at > 'Z') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'A'-'Z'-1);
             	}else if (at < 'A') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'A'+'Z'+1);
             	}
            }
            // if character lies between 0 and 9 
            else if(at >= '0' && at <= '9')
            {
            	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than '9'
             	if(at > '9') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'0'-'9'-1);
             	}
             	else if (at < '0') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'0'+'9'+1);
             	}
            }
			// if character lies between ! and / 
            else if(at >= '!' && at <= '/')
            {
            	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than '/'
             	if(at > '/') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'!'-'/'-1);
             	}
             	else if (at < '!') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'!'+'/'+1);
             	}
            }
            // if character lies between : and @ 
            else if(at >= ':' && at <= '@')
            {
            	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than '@'
             	if(at > '@') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+':'-'@'-1);
             	}
             	else if (at < ':') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-':'+'@'+1);
             	}
            }
            // if character lies between [ and ` 
            else if(at >= '[' && at <= '`')
            {
            	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than '`'
             	if(at > '`') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'['-'`'-1);
             	}
             	else if (at < '[') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'['+'`'+1);
             	}
            }
            // if character lies between { and } 
            else if(at >= '{' && at <= '}')
            {
            	// shift character
             	at = (char) (at + sp);
             	// if shift character greater than '}'
             	if(at > '}') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'{'-'}'-1);
             	}
             	else if (at < '{') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'{'+'}'+1);
             	}
            }
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
            
			// if character lies between a and z 
            if(at >= 'a' && at <= 'z') 
            {
             	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than 'z'
             	if(at > 'z') {
                	// re-shift to starting position 
                	at = (char) (at+'a'-'z'-1);
             	}else if (at < 'a') {
                	// re-shift to starting position 
                	at = (char) (at-'a'+'z'+1);
             	}
            }
            // if character lies between A and Z
            else if(at >= 'A' && at <= 'Z') 
            {
             	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than 'z'
             	if(at > 'Z') {
                	// re-shift to starting position 
                	at = (char) (at+'A'-'Z'-1);
             	}else if (at < 'A') {
                	// re-shift to starting position 
                	at = (char) (at-'A'+'Z'+1);
             	}
            } 
            // if character lies between 0 and 9 
            else if(at >= '0' && at <= '9')
            {
            	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than '9'
             	if(at > '9') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'0'-'9'-1);
             	}else if (at < '0') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'0'+'9'+1);
             	}
            }
            // if character lies between ! and / 
            else if(at >= '!' && at <= '/')
            {
            	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than '/'
             	if(at > '/') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'!'-'/'-1);
             	}else if (at < '!') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'!'+'/'+1);
             	}
            }
            // if character lies between : and @ 
            else if(at >= ':' && at <= '@')
            {
            	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than '@'
             	if(at > '@') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+':'-'@'-1);
             	}else if (at < ':') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-':'+'@'+1);
             	}
            }
            // if character lies between [ and ` 
            else if(at >= '[' && at <= '`')
            {
            	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than '`'
             	if(at > '`') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'['-'`'-1);
             	}else if (at < '[') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'['+'`'+1);
             	}
            }
            // if character lies between { and } 
            else if(at >= '{' && at <= '}')
            {
            	// shift character
             	at = (char) (at - sp);
             	// if shift character greater than '}'
             	if(at > '}') 
             	{
                	// re-shift to starting position 
                	at = (char) (at+'{'-'}'-1);
             	}else if (at < '{') 
             	{
                	// re-shift to starting position 
                	at = (char) (at-'{'+'}'+1);
             	}
            }
            pt = pt + at;   
        
        }
		return pt;
	}
}
	