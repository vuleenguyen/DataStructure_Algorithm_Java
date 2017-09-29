package ds.stack;

import javax.sound.midi.Soundbank;

/**
 * Created by Do My Duyen on 9/21/2017.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString2("Hello"));
    }

    public static String reverseString(String word) {
        Stack stack = new Stack(word.length());
        for(int i = 0 ; i < word.length() ; i++) {
            stack.push(word.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }


    public static String reverseString2(String word) {
        String[] wordCharacter = word.split("");
        StringBuilder result = new StringBuilder();
        for(int i = wordCharacter.length - 1; i >=0 ; i--) {
            result.append(wordCharacter[i]);
        }
        return result.toString();
    }
}
