package emailId;

    import java .util .Scanner;
	import java.util.regex.*;    
	import java.util.*;    
	public class Emailid2{  
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        
	        Scanner scn1=new Scanner(System.in);
	           
	        System.out.println("Enter tha Email Id  is :");
	        
	        String emailid = scn1.next();
	        
	        System.out.println("email id is:");
	        Pattern pattern = Pattern.compile(emailid);  
	        
	        Matcher matcher = pattern.matcher(emailid);  
	        
	        System.out.println(emailid+":"+matcher.matches()+"\n");
	      
	     
	        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
	      
	        for(String email : emails){  
	           
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  

}
