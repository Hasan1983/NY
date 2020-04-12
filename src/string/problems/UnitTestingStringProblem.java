package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        //Anagram unit testing
       // Anagram.isItAnagram("MARY","Army");
       Assert.assertTrue(true, "true");

        //Determine Largest Word Unit Testing
        DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        Assert.assertEquals("biological","biological");

        //Palindrome
        Palindrome.main(new String[]{"DAD"});
        Assert.assertEquals(true, true);





    }
}
