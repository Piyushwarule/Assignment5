public class task07 {

    public static void main(String args[])
    {
        String abc = "  	Piyush  ";
        
        String left = ltrim(abc);
        String right = rtrim(abc);

        System.out.println("lefttrim:"+left+".");
        System.out.println("righttrim:"+right+".");
    }

    public static String rtrim(String s) {
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);
    }

    public static String ltrim(String s) {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            
            i++;
        }
        return s.substring(i);
    }
}