import java.util.Scanner;

public class task02 {
	
	public static void count_vowels(String str) 
	{
		
		
		int l=str.length();
		
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.print(c)	;
		}
		
	 
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str =sc.nextLine();
		
		
		count_vowels(str);

	}

}
