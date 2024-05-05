public class TasdibekFunWithStrings {

public static void main(String[] args)
{

    String school = "Hudson Valley Community College";




    System.out.println(school.length());

int Helloclass= school.length();


char ch1 = school.charAt(7);
System.out.println("The argument sent to the method should return the capital letter "+ ch1);

System.out.println(school.toLowerCase());
System.out.println(school.toUpperCase());


String course = "CISS 110";
int indexOfSpace = course.indexOf(' ');

String deptCode = course.substring(0, indexOfSpace);
int bIndex2 = indexOfSpace + 1;
int endIndex2 = course.length();

String courseNumber = course.substring(indexOfSpace+1, endIndex2);

System.out.println("My department code is " +deptCode );
System.out.println("My course number is " +courseNumber );




}



}
