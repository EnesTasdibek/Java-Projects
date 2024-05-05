import java.util.Scanner;
import java.util.ArrayList;

public class ERPatient {
    // Attributes
    private String name;
    private String day;
    private String time;
    private String dischargeTime;
    private ArrayList<String> testsPerformed;
    private ArrayList<String> testsResults;
    private ArrayList<String> medicinesGiven;

    // Constructor
    public ERPatient(String name, String day, String time, String dischargeTime, ArrayList<String> testsPerformed, ArrayList<String> testsResults, ArrayList<String> medicinesGiven) {
        this.name = name;
        this.day = day;
        this.time = time;
        this.dischargeTime = dischargeTime;
        this.testsPerformed = testsPerformed;
        this.testsResults = testsResults;
        this.medicinesGiven = medicinesGiven;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getDischargeTime() {
        return dischargeTime;
    }

    public ArrayList<String> getTestsPerformed() {
        return testsPerformed;
    }

    public ArrayList<String> getTestsResults() {
        return testsResults;
    }

    public ArrayList<String> getMedicinesGiven() {
        return medicinesGiven;
    }

    // Utility functions
    public void test(String test) {
        testsPerformed.add(test);
    }

    public void testResult(String testResult) {
        testsResults.add(testResult);
    }

    public void medicine(String medicine) {
        medicinesGiven.add(medicine);
    }

public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

                        System.out.println("Enter the patient's name:");
        String name = keyboard.nextLine();
                        System.out.println("Enter the day admitted:");
        String day = keyboard.nextLine();
                        System.out.println("Enter the time admitted:");
        String time = keyboard.nextLine();
                        System.out.println("Enter the discharge time:");
        String dischargeTime = keyboard.nextLine();

        ArrayList<String> testsPerformed = new ArrayList<>(20);
        ArrayList<String> testsResults = new ArrayList<>(20);
        ArrayList<String> medicinesGiven = new ArrayList<>(20);
        
        //Patient object attributes
        ERPatient patient = new ERPatient(name, day, time, dischargeTime, testsPerformed, testsResults, medicinesGiven);
        
        System.out.println("Enter the test(s) performed:");
        patient.test(keyboard.nextLine());

        System.out.println("Enter test result(s):");
        patient.testResult(keyboard.nextLine());

        System.out.println("Enter the medicine(s) given:");
        patient.medicine(keyboard.nextLine());

        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Admission Time: " + patient.getTime());
        System.out.println("Test(s) Performed: " + patient.getTestsPerformed());
        System.out.println("Test Result(s): " + patient.getTestsResults());
        System.out.println("Medicine(s) Given: " + patient.getMedicinesGiven());
        System.out.println("Discharge Time: " + patient.getDischargeTime());
        System.out.println("Admission Day: " + patient.getDay());
    }
}
