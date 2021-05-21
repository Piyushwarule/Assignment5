import java.util.Scanner;
public class task01 {

	
	public static void count_vowels(String str) 
	{
		int count=0;
		int count1=0;
		int l=str.length();
		
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;
		}
		
		System.out.print("Number of  Vowels in the string: " + count+"\n");
		
		for(int i = 0; i < str.length(); i++) 
		{    
	        if(str.charAt(i) != ' ')    
	        count1++;    
	    }    
	            
	           
	        System.out.println("Total number of characters in a string: " + count1);   
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str =sc.nextLine();
		
		
		count_vowels(str);

	}

}
