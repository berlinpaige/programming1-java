public class IfStatements {

  public static void main(String[] args) {

    int score;

    score = 73;

    if (score >= 90)
        System.out.println("The grade is A");
    else if (score >= 80)
        System.out.println("The grade is B");
    else if (score >= 70)
        System.out.println("The grade is C");
    else if (score >= 60)
        System.out.println("The grade is D");
    else
        System.out.println("The grade is F");

    //prints out "The grade is C"


    if (score >= 70)
        if (score >= 85)
            System.out.println("Your grade is in the top half of \"passing\"");
        else
            System.out.println("Your grade is in the bottom half of \"passing\"");
    else
            System.out.println("You have failed this course");

    //prints out Your grade is in the bottom half of "passing"
  }
}

/* 
    Notes on if statements:
    
*/