import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;

        
        public class Sales {
    
        private ArrayList<Integer> branch = new ArrayList<Integer>();
        private ArrayList<Double> totalSales = new ArrayList<Double>();
        
        
        public Sales() {
        branch = new ArrayList<>();
        totalSales = new ArrayList<>();
        
        }
        
        public void read(String filename){  
        String file = filename;
        String line = "";
        try{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        while ((line = reader.readLine()) != null) {
        String[] values = line.split(" ");
        
        
        int branchNumber = Integer.parseInt(values[0]);
        Double sales = Double.parseDouble(values[2]);
        
       
        int index = branch.indexOf(branchNumber);
        if (index != -1) {
            double currentSales = totalSales.get(index);
            totalSales.set(index, currentSales + sales);
        } else {
            branch.add(branchNumber);
            totalSales.add(sales);
        }
        System.out.println("Branch: " + values[0] + ", Date: " + values[1] + ", Total Sales: " + values[2]);
        }
        reader.close();
        }    
        catch (IOException e) {
        e.printStackTrace();
        }
        }

        
        
        public void writer(String filename){
        try{
        FileWriter writer = new FileWriter("Sales.txt");
        writer.write("1 Sunday $1000.1\n");
        writer.write("2 Monday $1000.3\n");
        writer.write("3 Tuesday $1000.5");
        writer.close();
        }
        catch (IOException e) {
        e.printStackTrace();
        }
        }


        public double getSales(int branch){        
        int index = totalSales.indexOf(branch);
        if (index != -1) {
        return totalSales.get(index);
        
        }
        else{
        return 0.0;
        }
        }


        
        public ArrayList<Integer> getBranch() {
        return branch;
        }
        public ArrayList<Double> getTotalSales() {
        return totalSales;
        }

        
        public static void main(String args[]){
        
        Sales sales = new Sales();
        String filename = "Sales.txt";
        sales.read(filename);
            
        ArrayList<Integer> branch = sales.getBranch();
        ArrayList<Double> totalSales = sales.getTotalSales();
        
        for (int i = 0; i < branch.size(); i++) {
        System.out.println("Branch: " + branch.get(i) + ", Total Sales: $" + totalSales.get(i));

        }
        }
        }