package day_31_array_part_4;

public class J04_LongestPalindrome {

    /*
    Task 4 :  For Each - Nested For

            Longest Palindrome

             Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic", "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                    Output: No palindrome
     */

    public static void main(String[] args) {


        String[] input = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String maxPalindrome = "";

        for (String each : input) {

            if (isPalindrome(each) && each.length() > maxPalindrome.length()) {
                maxPalindrome = each;

            }

        }

        if (maxPalindrome == "") {

            System.out.println("No Palindrome");
        } else {
            System.out.println(maxPalindrome);
        }


    }

    private static boolean isPalindrome(String each) {
        StringBuilder stringBuilder = new StringBuilder(each);

        return each.equals(stringBuilder.reverse().toString()); //true yada false
    }
}
