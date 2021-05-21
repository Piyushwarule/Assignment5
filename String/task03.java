import java.util.Scanner;

public class task03 {
	
	public static void isornot(String str)
	{
		String str1="";
		
		for(int i=str.length()-1 ; i>=0 ; i-- )
		{
			str1 = str1 + str.charAt(i);
		}
		
		if(str1.equals(str))
		{
			System.out.println("String is palindrome");
		}else
		{
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		
		isornot(str);

	}

}
