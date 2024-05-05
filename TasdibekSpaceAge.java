import java.util.Scanner;
public class TasdibekSpaceAge {
    

public static void main(String[] args){


Scanner keyboard = new Scanner(System.in);
System.out.println("How old are you, Earthling?");
double age = keyboard.nextDouble();

MercuryAge(age);
VenusAge(age);
MarsAge(age);
JupiterAge(age);
SaturnAge(age);
UranusAge(age);
NeptuneAge(age);
PlutoAge(age);

keyboard.close();
}

public static void MercuryAge(double age){

    double MercuryAge = (age * 365 / 88);
    System.out.printf("You are %.2f Mercurian years old\n", MercuryAge);
}

public static void VenusAge(double age){

    double VenusAge = (age * 365 / 224.7);
    System.out.printf("You are %.2f Venusian years old\n", VenusAge);
}

public static void MarsAge(double age){

    double MarsAge = (age * 365 / 687);
    System.out.printf("You are %.2f Martian years old\n", MarsAge);
}

public static void JupiterAge(double age){

    double JupiterAge = (age * 365 / (11.86 * 365));
    System.out.printf("You are %.2f Jovian years old\n", JupiterAge);
}
public static void SaturnAge(double age){

    double SaturnAge = (age * 365 / (29.46 * 365));
    System.out.printf("You are %.2f Saturnian years old\n", SaturnAge);
}

public static void UranusAge(double age){

    double UranusAge = (age * 365 / (84 * 365));
    System.out.printf("You are %.2f Uranian years old\n", UranusAge);
}

public static void NeptuneAge(double age){

    double NeptuneAge = (age * 365 / (164.8 * 365));
    System.out.printf("You are %.2f Neptunian years old\n", NeptuneAge);
}

public static void PlutoAge(double age){

    double PlutoAge = (age * 365 / (248 * 365));
    System.out.printf("You are %.2f Plutonian years old\n", PlutoAge);
}




}



