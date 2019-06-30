package doublechar;

public class DoubleChar {

    public String doubleChar(String str) {

        String count = "";

        for(int i = 0; i < str.length(); i++){
            str.charAt(i);
            count = count + Character.toString(str.charAt(i));
            count = count + Character.toString(str.charAt(i));


        }
        return count;
    }


    public static void main(String[] args) {

        DoubleChar doubleChar = new DoubleChar();

        System.out.println(doubleChar.doubleChar("Adrian"));
    }
}
