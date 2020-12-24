package Collections.list_interface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExm {
    public static void main(String[] args) {
        String s = "HUESOS";
        List<Character>characterList = new LinkedList<>();
        for (char ch:s .toCharArray()
             ) {
            characterList.add(ch);
        }
        ListIterator<Character> iterator = characterList.listIterator();
        ListIterator<Character> ReverseIterator = characterList.listIterator(characterList.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && ReverseIterator.hasPrevious()){
            if(iterator.next() != ReverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }if(isPalindrome){
            System.out.println("Palindrome");
        }else
            System.out.println("NOT Palindrome");


    }
}
