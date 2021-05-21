import java.util.Scanner;
class task04{
	 static void methodOne(){
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter a string");
		java.lang.String x= scr.nextLine();
		char[] ch = x.toCharArray();
		char[] rs= new char[ch.length];
		for(int i = 0, j=0; i<ch.length; i++){
			if(ch[i]!=32){
				rs[j]=ch[i];
				j++;
			}
		}
		StringBuilder builder = new StringBuilder();
		for (char value : rs) {
		    builder.append(value);
		}
		String text = builder.toString();
		System.out.println(text);

		
}
	 
	 public static void main(String[] args) {
	    	
	    	methodOne();
	    }
}