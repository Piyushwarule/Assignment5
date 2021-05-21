public class task05{
        public static void main(String[] args){
        	
        	String str="PIYUSH";
            toLowerCase(str);
        }

        public static void toLowerCase(String a){

        	String newStr = "";

            for (int i = 0; i< a.length(); i++){

                char aChar = a.charAt(i);
                if (65 <= aChar && aChar<=90){
                    aChar = (char)( (aChar + 32) ); 
                }
                newStr = newStr + aChar;    
            }
            System.out.println(newStr);
        }
}
