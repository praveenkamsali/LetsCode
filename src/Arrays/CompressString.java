package Arrays;

public class CompressString {

    public static void main(String[] args){
        System.out.print(compressString("AAABBCDDDPPS"));
    }

    private static String compressString(String str) {

        String shortString = "";
        int count = 0;
        for(int i= 0 ; i < str.length();i++){

            count++;

            /*The second condtion throws array out of bound exception but it has been neglected by the other condition
             being true*/
            //TODO: Improve code

            if(i + 1 >= str.length() || str.charAt(i)!= str.charAt(i+1)){
                shortString += "" + str.charAt(i)+count;
                count = 0;
            }

        }
        return shortString;
    }
}

