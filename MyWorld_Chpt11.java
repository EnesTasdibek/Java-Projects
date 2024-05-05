import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MyWorld_Chpt11 {
  static JFrame mainFrame;
  static JPanel contents;
  
  public MyWorld_Chpt11() {
    mainFrame = new JFrame("My World");
  }
  
  public static void main(String[] args) {
    mainFrame = new JFrame("My World");
    mainFrame.setSize(500,500);
    
    Border defBorder = BorderFactory.createLineBorder(Color.black);
    
    contents = new JPanel(new FlowLayout());
    contents.setBorder(defBorder);
    //Add a list box
    DefaultListModel<String> names = new DefaultListModel<String>();
    names.addElement("Anwar Ahmed");
    names.addElement("Matthew Baxter");
    names.addElement("Joseph DelGrosso");
    names.addElement("Rex Ellis");
    names.addElement("Jizhou Huang");
    //etc
    JList namelist = new JList(names);
    namelist.setBorder(defBorder);
    contents.add(namelist);
    
    //Create radio buttons
    JRadioButton rb1 = new JRadioButton("Lesson 1");
    JRadioButton rb2 = new JRadioButton("Lesson 2");
    JRadioButton rb3 = new JRadioButton("Lesson 3");
    JRadioButton rb4 = new JRadioButton("Lesson 4");
    JRadioButton rb5 = new JRadioButton("Lesson 5");
    JRadioButton rb6 = new JRadioButton("Lesson 6");
    JRadioButton rb7 = new JRadioButton("Lesson 7");
    JRadioButton rb8 = new JRadioButton("Lesson 8");
    JRadioButton rb9 = new JRadioButton("Lesson 9");
    JRadioButton rb10 = new JRadioButton("Lesson 10");
    JRadioButton rb11 = new JRadioButton("Lesson 11");
    JRadioButton rb12 = new JRadioButton("Lesson 12");
    JRadioButton rb13 = new JRadioButton("Lesson 13");
    JRadioButton rb14 = new JRadioButton("Lesson 14");
    //create button group
    ButtonGroup lessons = new ButtonGroup();
    lessons.add(rb1);
    lessons.add(rb2);
    lessons.add(rb3);
    lessons.add(rb4);
    lessons.add(rb5);
    lessons.add(rb6);
    lessons.add(rb7);
    lessons.add(rb8);
    lessons.add(rb9);
    lessons.add(rb10);
    lessons.add(rb11);
    lessons.add(rb12);
    lessons.add(rb13);
    lessons.add(rb14);
    //add buttons - note that you cannot add the group to the panel
    // for looks, doing this in a separate Panel
    JPanel buttons = new JPanel(new GridLayout(0,4));
    buttons.setSize(250,250);
    buttons.add(rb1);
    buttons.add(rb2);
    buttons.add(rb3);
    buttons.add(rb4);
    buttons.add(rb5);
    buttons.add(rb6);
    buttons.add(rb7);
    buttons.add(rb8);
    buttons.add(rb9);
    buttons.add(rb10);
    buttons.add(rb11);
    buttons.add(rb12);
    buttons.add(rb13);
    buttons.add(rb14);
    contents.add(buttons);
    
    //grade box
    JLabel gradeLabel = new JLabel("Grade:");
    JTextField grade = new JTextField(5);
    contents.add(gradeLabel);
    contents.add(grade);
    
    JButton save = new JButton("SAVE");
    contents.add(save);
    
    mainFrame.add(contents);
    mainFrame.show();
  }
  
}