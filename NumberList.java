import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class NumberList {
    
//Collins, pp. 147 -150    
private static List<Integer> myList = new LinkedList<Integer>();




public int add(int number){



myList.add(number);

return number;

}


public int remove(int removedNumber){


myList.remove(removedNumber);

return removedNumber;

}





public double median(){

double med = (double) sum() / myList.size();



return med;


}




//Robert Ekblaw, Using LinkedList (https://www.youtube.com/watch?v=Eswl_U2oUKA&ab_channel=RobertEkblaw)

//Collins, page 147   

public int sum(){

int sum=0;

Iterator<Integer> itr = myList.iterator();

while (itr.hasNext()){

Integer item = itr.next();

 sum += item;

}


return sum;

}



public static void main (String[ ] args){

NumberList hi = new NumberList();

//Inserting numbers manually; I would use an input file but no instructions stated about it on assignment.


Scanner kb = new Scanner(System.in);


System.out.println("Enter 6 integers: ");

//add
hi.add(kb.nextInt());
hi.add(kb.nextInt());
hi.add(kb.nextInt());
hi.add(kb.nextInt());
hi.add(kb.nextInt());
hi.add(kb.nextInt());


//sort
Collections.sort(myList);

//duplicates denied; used for a non-duplicate list
//Collins, page 238 (used for a non-duplicate list)

TreeSet t = new TreeSet(myList);


System.out.println("The list you entered is sorted: \n" + myList);


//remove
System.out.println("Enter the index-based number you want to remove: ");

hi.remove(kb.nextInt());


System.out.println("The list after removing process: " + myList);


//median value
System.out.println("The median of updated list: "+hi.median());


//sum
System.out.println("The sum of list: "+hi.sum());

//final
System.out.println("The list you entered is cleared from duplicates: \n"+ t);


}























}
