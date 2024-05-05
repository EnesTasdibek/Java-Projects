import java.io.*;
import java.util.*;


public class Heap {


//Attributes
private PriorityQueue<Integer> heap = new PriorityQueue<>();
private static ArrayList<Integer> fileValues = new ArrayList<>();

public Heap(String fileDir) throws FileNotFoundException {
       
try {
    File file = new File(fileDir);
    Scanner read = new Scanner(file);

 while (read.hasNextInt()) {
        String line = read.nextLine();
    String[] values = line.split(" ");
for (String s : values) {
    fileValues.add(Integer.parseInt(s));
}
}

}   
catch (Exception e) {
System.out.println("an error occurred, please try again");
}

//(Ekblaw, "Java routine to read files," youtube video) 

//(Collins, pp. 143-148(iterators))
}

//Implementation

public void add(Integer[] values) {
for (int value : values) {
heap.add(value);
}
}

private int[] getRoot(int[] a, PriorityQueue<Integer> q, int i) {
int value = q.remove();
a[i] = value;
i++;
if (q.size() > 0) {
getRoot(a, q, i);
}
return a;
}

public int[] toArray() {
int[] nums = new int[heap.size()];
nums = getRoot(nums, heap, 0);
return nums;
}

 

public int exists(Integer[] list, int value) {
int index = -1; //value to return if not found
for (int i=0; i < list.length; i++)
if (list[i] == value) {
index = i;

System.out.println("Value found: " + value);


break; //stop looping
}
return index;
}



//(powerpoint slides, lesson module 4, page 24)
//(powerpoint slides, lesson module 6, page 20)
//(Ekblaw, "Creating Heapsort code," youtube video) 
//(Collins, page 555)
public static void main(String[] args) throws FileNotFoundException {
        
    Scanner keyboard = new Scanner(System.in);
    
    
    System.out.println("Enter file directory");
    String fileDir = keyboard.nextLine();

    Heap h = new Heap(fileDir);

    //Convertion
    Integer[] values = new Integer[fileValues.size()];
    fileValues.toArray(values);

    //add
    h.add(values);
    //print
    System.out.println("Array sorted: \n" + (Arrays.toString(h.toArray())));

    System.out.println("Enter the number you want to check in order to learn if specified number exists in the Heap");
    
    int valuesGiven = keyboard.nextInt();

    
    h.exists(values, valuesGiven);
    
    
    
    System.out.println("\nI referred to 'Java routine to read from a file' video on YouTube and chapters 13.1 AND 13.4 from 'Data-Structures-and-the-Java-Collections-Framework' book. Additional references are commented.\n");
    

}
}
