import java.util.Scanner;
public class string1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		String  s1=sc.next();
		//String s2=sc.next();
	/*	if(isequal(s1,s2)) {
			System.out.print("Strings are equal");
		}
		else {
			System.out.print("Strings are not equal");
		}
		System.out.print("uppercase of a"+toupper(s1,""));
        System.out.print("no. of vowels in s1: "+cntv(s1));
        if(palindrome(s1)) {
        	 System.out.print("String is palindrome");
        }
        else {System.out.print("String is not palindrome");}*/
		System.out.print("first single occurence;"+firstoccur(s1));
	}
	public static boolean isequal(String a,String b) {
		if(a.length()!=b.length()) return false;
		int i=0;
		while(i<a.length()) {
			if(a.charAt(i)!=b.charAt(i)) return false;
			i++;
	}
		return true;

}
	public static String toupper(String a,String b) {
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>96) {
				char ch=a.charAt(i);
				ch-=32;
				b+=ch;
			}
			else {char ch=a.charAt(i);
				b+=ch;
		}
	}
		return b;
}
	public static int cntv(String b){
		int c=0;
		for(int i=0;i<b.length();i++) {
			char ch=b.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ) {
				c++;
			}
		}
		return c;
	}
	static boolean palindrome(String a) {
		int i=0;
		int j=a.length()-1;
		while(i<j) {
				char ch=a.charAt(i);
				char ch1=a.charAt(j);
				if(ch!=ch1)return false;
				i++;
				j--;
		}
		return true;
	}
	static char firstoccur(String a) {
		int i=0;
		while(i<a.length()) {
			int j=i+1;
			char ch=a.charAt(i);
			char ch1=a.charAt(j);
			if(ch!=ch1) {
				j++;
			}
			else {i++;
			
			}

		}
		char b=a.charAt(i);
		return b;
	}
}
