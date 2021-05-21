import java.util.Scanner;
class task06{
	static int countFreq(String pat, String txt) {       
        int M = pat.length();       
        int N = txt.length();       
        int res = 0;
 
        for (int i = 0; i <= N - M; i++) {
            
            int j;           
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
 
            if (j == M) {               
                res++;               
                j = 0;               
            }           
        }       
        return res;       
    }
 
    static  void methodOne() {
    Scanner scr= new Scanner(System.in);
	System.out.println("enter the 1st string");
	java.lang.String txt= scr.nextLine(); 
	System.out.println("enter the 2st string");
	java.lang.String pat= scr.nextLine();
        System.out.println(countFreq(pat, txt));       
    }
    
    public static void main(String[] args) {
    	
    	methodOne();
    }
    
}