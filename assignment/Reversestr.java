package assignment;

public class Reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1= " investinu bro ";
    
    String temp="";
    
   for(int i=s1.length()-1;i>=0;i--) {
  
    temp=temp+ s1.charAt(i);
  
   System.out.println(temp);
	}
System.out.println(s1.trim());
}
}