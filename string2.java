import java.util.Scanner;
public class string2 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		//System.out.print("new string after change: to _  "+change(s1,""));
		
		
	}
	static String change(String a,String d) {
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(b!=' ') {
				d+=b;
				
			}
			else {
				char c='_';
				d+=c;
		}
		
	}
		return d;

}
	static String revwords(String a,"")
	}
}