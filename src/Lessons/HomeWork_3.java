package Lessons;

public class HomeWork_3 {
    public static void main(String[] args) {

        //1. Given a string firstName equals to "Den" and lastName equals to "Brown".
        // Print to the console the full name in the following format: "-FirstName=LastName-"
        String FirstName = "Den";
        String LastName = "Brown";
        System.out.println("-"+FirstName+"="+LastName+"-");

//        2. Given a string. Write a code that will create a new string made of the first two characters of the initial string.
//        If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
//
//                For example:
//        "AE_1381" -> "AE"
//        "A" -> "A"
//        "" -> ""
        String given ="  ";
        int length = given.length();

        if (length<1){
            System.out.println("emty");}
             if(length==1){
                System.out.println(given.charAt(0));
        }
          else
        {System.out.println(given.substring(0,2));}
//        3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text.
//        In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
//      Given a tag and a word string, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
        String tag = "i"; // Given HTML tag
        String word = "Hello"; // Given word

        // Create the HTML string with tags around the word
        String htmlString = "<" + tag + ">" + word + "</" + tag + ">";

        // Print the HTML string
        System.out.println("HTML String: " + htmlString);

//        Given two strings. Check if they start with "The".
//
//   Task: word1 = "The End", word2="End The";
        String word1 = "The End";
        String word2="End The";
        String the = "The";


        System.out.println(word1.startsWith(the));
//        Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.
        String string5 ="ABCDEFGHIJK";
String lowercase = string5.toLowerCase();
String novowels = lowercase.replaceAll("[a,e,i]","");
        System.out.println(novowels);
//Given 2 strings, a and b. Create a string c of the form short+long+short,
// with the shorter string on the outside and the longer string on the inside.
        String a = "wo";
        String b = "h1123we";
        String shorterString;
        String longerString;
        // Determine the shorter and longer strings
    if (a.length() <= b.length()) {
            shorterString = a;
        } else {
            shorterString = b;
        };
        if (a.length() >= b.length()) {
            longerString = a;
        } else {
            longerString = b;
        };

        // Construct the string following the pattern short + long + short
        String c = shorterString + longerString + shorterString;

        // Print the resulting string
        System.out.println("Resulting String: " + c);



    }
}
