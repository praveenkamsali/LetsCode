package Arrays;

public class OneAwayCharacter {
    public static void main(String[] args){
        System.out.print(checkOneAway("pale","palee"));
    }

    private static boolean checkOneAway(String str1, String str2) {
        if(str1.length() == str2.length()){
           return checkForReplacement(str1,str2);
        }
        if ((str1.length() == str2.length() + 1)|| (str2.length() == str1.length() + 1)){
           return checkForOneEdit(str1,str2);
        }

        return false;
    }
    //Todo : Redundant find a better solution.
    private static boolean checkForOneEdit(String str1, String str2) {

        int[] countChars_str1 = new int[128];
        char[] str1_array = str1.toCharArray();
        for(char c : str1_array){
            countChars_str1[c]++;
        }

        int[] countChars_str2 = new int[128];
        char[] str2_array = str2.toCharArray();
        for(char c : str2_array){
            countChars_str2[c]++;
        }

        int count = 0;
        int[] finalChar = new int[128];

        for(int i = 0 ; i < countChars_str1.length; i++){
            finalChar[i] = countChars_str1[i] - countChars_str2[i];
            if(finalChar[i] != 0)
           count++;
        }

        if(count == 1) {
            return true;
        }
        return false;
    }

    private static boolean checkForReplacement(String str1, String str2) {

        boolean differenceFound = false;
        for(int i = 0;i< str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(differenceFound) {
                    return false;
                }
                differenceFound = true;
            }
        }
        return true;

    }
}
