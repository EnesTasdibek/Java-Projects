import java.awt.*;
import javax.swing.*;

public class MySite2 {
static JFrame mainFrame;
JPanel contents;

public MySite2() {
    mainFrame = new JFrame("Enes Tasdibek");
    contents = new JPanel();
        


JButton button = new JButton("ITEM");



//Lesson notes, module 10, page 24
contents.setBorder(BorderFactory.createEmptyBorder(1,2,1,2));




//Lesson notes, module 10, page 17
contents.setLayout(new GridLayout(0,1));



//though it is centered, works also with non-indexed.
//Lesson notes, module 10, page 18
contents.add(button,0,0);



//centered and rowed layout
//referred from: https://introcs.cs.princeton.edu/java/15inout/GUI.java.html
//https://docs.oracle.com/javase/7/docs/api/java/awt/BorderLayout.html
mainFrame.add(contents, BorderLayout.CENTER);


mainFrame.setSize(500, 500);
        
mainFrame.setVisible(true);

}

  
   

public static void main(String[] args) {
       
    //Display
    new MySite2();



 }
}
