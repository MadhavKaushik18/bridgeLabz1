import java.util.Scanner;
public class Level1str1 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str1=sc.next();
	    String str2=sc.next();
	    if(sol(str1,str2)){
	        System.out.println("Strings is equal");}
	    else{
	        System.out.println("Strings is not equal");}
	    }
	    public static boolean sol(String str1,String str2){
	        if(str1.length()!=str2.length()){
	            return false;
	        }
	        for(int i=0;i<str1.length();i++){
	            if(str1.charAt(i)!=str2.charAt(i)){
	                return false;
	            }
	        }
	        return true;
	    }
	}
