package Arrays;


public class CheckUniqueCharacters {

    public static void main(String[] args){
        System.out.print(checkForUniqueness("praveen"));
    }

    public static boolean checkForUniqueness(String str){
        if (str.length() > 128){ // There is no way that you can have over 128 unique chareacters
            return false;
        }
        boolean[] chars = new boolean[128]; // enter all the charaters in this empty boolean and turn the flag to true

        for(int i = 0; i < str.length();i++){
            int value = str.charAt(i); // we get value of character - ascii value
            if(chars[value]){ // check if that character is already been turned true
                return false;
            }
            chars[value] = true; // insert true to that chars if this is the first hit of that char
        }
        return true;
    }
}

/*The time complexity for this code is O( n), where n is the length ofthe string. T
he space complexity is O( 1). (You could also argue the time complexity is O( 1),
 since the for loop will never iterate through more than 128 characters.}
 If you didn't want to assume the character set is fixed, you could express the complexity as o(c)space and 0(min(c, n))or
 0(c)time,where c is the size of the character set.*/
