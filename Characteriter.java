import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;

public class Characteriter {
    public static void main(String[] args) {
        String s = "dussert";

        CharacterIterator it = new StringCharacterIterator(s);
        char[] str = new char[s.length()];
        int count = 0;
        while(it.current() != CharacterIterator.DONE){
            System.out.println(it.current());
            str[s.length()-1-count] = it.current();
            count += 1;
            it.next();
//            System.out.println(str);

//        }
//        System.out.println(Arrays.toString(str));
////        String reverse = S
//        if(reverse == str){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

    }
}}
