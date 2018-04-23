public class SwitchStatements {

  public static void main(String[] args) {

    char grade;

    grade = 'B';

    switch (grade) 
    {
    case 'A':
        System.out.println("The grade is A");
        break;
    case 'B':
        System.out.println("The grade is B");
        break;
    case 'C':
        System.out.println("The grade is C");
        break;
    case 'D':
        System.out.println("The grade is D");
        break;
    case 'F':
        System.out.println("The grade is F");
        break;
    default:
        System.out.println("The grade is invalid");
        break;
    }

    //prints out "The grade is B"
  }
}

/* 
    Notes on switch statements:
    
*/