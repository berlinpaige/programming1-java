public class StringMethods {
  public static void main(String[] args) {

    String sentence;
    String str1;
    String str2;
    String str3;
    int index;

    sentence = "Now is the time for the birthday party";

    System.out.println("sentence = \"" + sentence + "\"");
    //prints out sentence = "Now is the time for the birthday party"

    System.out.println("The length of the sentence is " + sentence.length());
    //prints out The length of the sentence is 38

    System.out.println("The character at index 16 is " + sentence.charAt(16));
    //prints out The character at index 16 is f

    System.out.println("The index of the first t in the sentence is " + sentence.indexOf('t'));
    //prints out The index of the first t in the sentence is 7

    System.out.println("The index of for in the sentence is " + sentence.indexOf("for"));
    //prints out The index of for in the sentence is 16

    System.out.println("sentence.substring(0, 6) = \"" + sentence.substring(0, 6) + "\"");
    //prints out sentence.substring(0, 6) = "Now is"

    System.out.println("sentence.substring(7, 12) = \"" + sentence.substring(7, 12) + "\"");
    //prints out sentence.substring(7, 12) = "the t"
    
    System.out.println("sentence.substring(7, 22) = \"" + sentence.substring(7, 22) + "\"");
    //prints out sentence.substring(7, 22) = "the time for th"
    
    System.out.println("sentence.substring(4, 10) = \"" + sentence.substring(4, 10) + "\"");
    //prints out sentence.substring(4, 10) = "is the"

    str1 = sentence.substring(0, 8);
    System.out.println("str1 = \"" + str1 + "\"");
    //prints out str1 = "Now is t"
    
    str2 = sentence.substring(2, 12);
    System.out.println("str2 = \"" + str2 + "\"");
    //prints out str2 = "w is the t"
    
    System.out.println("sentence in uppercase = \"" + sentence.toUpperCase() + "\"");
    //prints out sentence in uppercase = "NOW IS THE TIME FOR THE BIRTHDAY PARTY"

    index = sentence.indexOf("birthday");
    str1 = sentence.substring(index, index + 14);

    System.out.println("str1 = \"" + str1 + "\"");
    //prints out str1 = "birthday party"
    
    System.out.println("sentence.replace('t', 'T') = \"" + sentence.replace('t', 'T') + "\"");
    //prints out sentence.replace('t', 'T') = "Now is The Time for The birThday parTy"

  }
}

/* 
    Notes on String methods:
*/