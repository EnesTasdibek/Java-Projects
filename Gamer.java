import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gamer implements ActionListener {
    
private String firstName;
private String lastName;
private String avatarName;
private String emailAddress;
private String userSigninID;
private String password;
//other
private String currentAchievementLevel;
private int rewardPoints;
private int bonusesAwarded;
private long uniqueID;//long



JTextField firstNameField;
JTextField lastNameField;
JTextField avatarNameField;
JTextField emailField;
JTextField signinIDField;
JTextField passwordField;



JLabel firstnameLabel;
JLabel lastnameLabel;
JLabel avatarnameLabel;
JLabel emailnameLabel;
JLabel signintnameLabel;
JLabel passwdLabel;

JPanel panel;

public Gamer() {
    
JFrame mainFrame = new JFrame("Gamer Class");
mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

JPanel panel = new JPanel();


//fields
//////////////////////////
 
firstnameLabel= new JLabel("First Name:");
panel.add(firstnameLabel);
firstNameField = new JTextField();
panel.add(firstNameField);

lastnameLabel= new JLabel("Last Name");
panel.add(lastnameLabel);
lastNameField = new JTextField();
panel.add(lastNameField);

avatarnameLabel= new JLabel("Avatar Name:");
panel.add(avatarnameLabel);
avatarNameField = new JTextField();
panel.add(avatarNameField);


emailnameLabel= new JLabel("Email:");
panel.add(emailnameLabel);
emailField = new JTextField();
panel.add(emailField);

signintnameLabel= new JLabel("Sign-in ID:");
panel.add(signintnameLabel);
signinIDField = new JTextField();
panel.add(signinIDField);


passwdLabel= new JLabel("Password:");
panel.add(passwdLabel);
passwordField = new JPasswordField();
panel.add(passwordField);




//BUTTON
JButton button = new JButton("SAVE");
panel.add(button);

mainFrame.add(panel);


button.addActionListener(this);


panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
mainFrame.setSize(300, 300);
mainFrame.setVisible(true);
}


//ACCESSORS
//full name emerged
public String getName(){

return firstName+" "+lastName;
 }

public String getEmail(){
return emailAddress;
 }

public String getLevel(){
return currentAchievementLevel;
}

public int getPoints(){
return rewardPoints;
     }

public int getBonuses(){
return bonusesAwarded;
 }

// Modifier
public void setEmail(String email){
        emailAddress = email;
 }

    


//  Other methods contained in the Gamer class
public void changePwd(String password) {
        
if (!password.equals(password)) {
System.out.println("password is incorrect.");

System.out.println("Enter new Password");

JTextField newPass = new JTextField();

panel.add(newPass);

System.out.println("Verify");


JTextField newPass2 = new JTextField();


if (!newPass.equals(newPass2)){

    System.out.println("error");
}

if (newPass.equals(newPass2)){

    System.out.println("Password changed");
}


}





}



public void login(){


System.out.println("Enter User ID:");


JTextField id = new JTextField();

panel.add(id);

if(id.equals(uniqueID)){

System.out.println("Approved");



}



System.out.println("Enter Password:");
    JTextField pasword = new JTextField();

panel.add(pasword);

if(password.equals(pasword)){

System.out.println("Approved");



}
}


//adding attribute
public void addBonus() {
    bonusesAwarded+=1;
}






public void addPoints(int numValue) {
    rewardPoints += numValue;

}



@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
    
firstName = firstNameField.getText();

lastName = lastNameField.getText();

avatarName = avatarNameField.getText();

emailAddress = emailField.getText();

userSigninID = signinIDField.getText();

password = passwordField.getText();

uniqueID = 1326467;

                
}
public static void main(String[] args) {

Gamer game = new Gamer();

}

}