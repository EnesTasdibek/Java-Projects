import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.*;

public class SortFile {

private static ArrayList<Integer> secondColumn = new ArrayList<>();
private static ArrayList<Integer> thirdColumn = new ArrayList<>();
private static ArrayList<Integer> firstColumn = new ArrayList<>();
private static SortFile file = new SortFile("sortedFile.txt");



public SortFile() {}


public Integer[] sort(Integer[] COLUMN1){

return qsort(COLUMN1, 0, COLUMN1.length -1);

}


private Integer[] qsort(Integer[] COLUMN1, int low, int high) {
    
    if(low<high){
    int p = partition(COLUMN1, low, high);
    qsort(COLUMN1, low, p - 1);
    qsort(COLUMN1, p, high);  
    
    }
    return COLUMN1;
}


////////////////////////////////////////////////////////////





public Integer[] selectSort(Integer[] ALLCOLUMNS) {

Integer[] sorted = new Integer[ALLCOLUMNS.length];
int currentMin;
int indexMin;

for (int i=0; i < ALLCOLUMNS.length ; i++) {
currentMin = ALLCOLUMNS[i];
indexMin = i;

for (int j=i+1; j<ALLCOLUMNS.length; j++) {

if (ALLCOLUMNS[j] < currentMin) {
currentMin = ALLCOLUMNS[j];
indexMin = j;
}
} // end for j

int swap = ALLCOLUMNS[i];
    
ALLCOLUMNS[i] = ALLCOLUMNS[indexMin];
    
ALLCOLUMNS[indexMin] = swap; //swap with smallest


} // end for i
return sorted;

}








//////////////////////////////////////////////////////////


public SortFile(String sortedFile) {

    
  try {

        
        
        File file = new File("sortedFile.txt");
        FileWriter writer = new FileWriter(file);
        
        writer.write("24 9 11 8 16 -2 13 -9 0");              
        
        writer.close();

        }
        catch (Exception e) {
        System.out.println("File not found");
    }
    
File file = new File(sortedFile);




try {
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine()) {
String i = scanner.nextLine();
String[] values = i.split(" ");




// I tried for loop but it saved one value at each loop

firstColumn.add(Integer.parseInt(values[0]));
    firstColumn.add(Integer.parseInt(values[3]));
        firstColumn.add(Integer.parseInt(values[6]));
    
        System.out.println("Raw First Column: " + firstColumn);

    
    

secondColumn.add(Integer.parseInt(values[1]));
    secondColumn.add(Integer.parseInt(values[4]));
        secondColumn.add(Integer.parseInt(values[7]));
    
        System.out.println("Raw Second Column: " + secondColumn);




thirdColumn.add(Integer.parseInt(values[2]));
    thirdColumn.add(Integer.parseInt(values[5]));
        thirdColumn.add(Integer.parseInt(values[8]));
    
        System.out.println("Raw Third Column: " + thirdColumn);
scanner.close();
    }
}
        
        catch (Exception e) {
            System.out.println("An error occured, try again");
            
        }
        
    

    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



static int partition(Integer[] COLUMN1, int low, int high) {
    int pivot = COLUMN1[(high + low) / 2]; //midpoint
    
    while (low <= high) {
        
        //--------------------------------//
        //change two while conditions for descending order
        while (COLUMN1[low] > pivot)
            low++;
        
        while (COLUMN1[high] < pivot)
            high--;
        //--------------------------------//

            //swap
        if (low <= high) {
            
            int swap = COLUMN1[low];
            COLUMN1[low] = COLUMN1[high];
            COLUMN1[high] = swap;
            
            low++;
            high--;
        }
    }
    
    return low;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void main(String[] args) {


 
SortFile j = new SortFile();
    


//to array
Integer[] COLUMN1 = new Integer[firstColumn.size()];

firstColumn.toArray(COLUMN1);

Integer[] COLUMN2 = new Integer[secondColumn.size()];

secondColumn.toArray(COLUMN2);

Integer[] COLUMN3 = new Integer[thirdColumn.size()];

thirdColumn.toArray(COLUMN3);


//j.Sort(COLUMN2);


j.sort(COLUMN1);


System.out.println("\nUpdated first column(Descending Order): " + Arrays.asList(COLUMN1));
    


//System.out.println("\nUpdated third column: " + Arrays.asList(COLUMN3));



 //merge
firstColumn.addAll(secondColumn);

firstColumn.addAll(thirdColumn);



Integer[] ALLCOLUMNS = new Integer[firstColumn.size()];
firstColumn.toArray(ALLCOLUMNS);

//works well with quicksort
j.selectSort(ALLCOLUMNS);




System.out.println("\nUpdated All columns: " + Arrays.asList(ALLCOLUMNS));




System.out.println("\nI referred the pseudocodes in your lesson notes for algorithms (powerpoint slides, pp. 13-21) ");

}

}










































