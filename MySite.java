import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.*;


public class MySite implements ActionListener{

static JFrame mainFrame;
static JPanel contents;
static JButton button;


public MySite() {

//also referred MyWorld java class on lesson module 10 and 11
mainFrame = new JFrame("Enes Tasdibek");
contents = new JPanel();


//MENU
///////////////////////////////////////


JMenuBar menuBar = new JMenuBar();

//menus
JMenu studentMenu = new JMenu("Student");
JMenu schoolMenu = new JMenu("School");   
JMenu facultyMenu = new JMenu("Faculty");

//items
JMenuItem studentAdd = new JMenuItem("Add",KeyEvent.VK_A);
JMenuItem studentSearch = new JMenuItem("Search",KeyEvent.VK_S);


JMenuItem schoolList = new JMenuItem("List",KeyEvent.VK_L);
JMenuItem schoolAdd = new JMenuItem("Add", KeyEvent.VK_A);
JMenuItem schoolSearch = new JMenuItem("Search",KeyEvent.VK_S);
JMenuItem schoolStatus = new JMenuItem("Status",KeyEvent.VK_T);


JMenuItem facultyList = new JMenuItem("List",KeyEvent.VK_L);
JMenuItem facultyAdd = new JMenuItem("Add", KeyEvent.VK_A);
JMenuItem facultySearch = new JMenuItem("Search",KeyEvent.VK_S);
JMenuItem facultytitles = new JMenuItem("Titles",KeyEvent.VK_T);



//mnemonics for menus
studentMenu.setMnemonic(KeyEvent.VK_T);
schoolMenu.setMnemonic(KeyEvent.VK_H);
facultyMenu.setMnemonic(KeyEvent.VK_F);




//adding student items
studentMenu.add(studentAdd);
studentMenu.add(studentSearch);

//adding school items
schoolMenu.add(schoolAdd);
schoolMenu.add(schoolSearch);
schoolMenu.add(schoolList);
schoolMenu.add(schoolStatus);

//adding faculty items
facultyMenu.add(facultyAdd);
facultyMenu.add(facultySearch);
facultyMenu.add(facultyList);
facultyMenu.add(facultytitles);


//add to menu
menuBar.add(studentMenu);
menuBar.add(schoolMenu);
menuBar.add(facultyMenu);

//add to frame
//Module 12 powerpoint slides, page 8-10
//also referred chapter12 java class
mainFrame.setJMenuBar(menuBar);




//extra points
//slider
//https://docs.oracle.com/javase/7/docs/api/javax/swing/JSlider.html#setOrientation(int)
JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 10, 100, 20);



slider.setPaintTicks(true);
slider.setMinorTickSpacing(10);
contents.add(slider);


//I referred:
//creating hashtable and general layout:
//http://www.java2s.com/Tutorials/Java/Swing_How_to/JSlider/Set_custom_label_for_JSlider.htm
//for adding values to hashtable:
//https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html

JLabel studentLabel = new JLabel("Students");
JLabel schoolLabel = new JLabel("School");
JLabel facultyLabel = new JLabel("Faculty");

//powerpoint slides, page 26
slider.createStandardLabels(10); 

Hashtable table = new Hashtable<>();

table.put(20, studentLabel);
table.put(30, schoolLabel);
table.put(40, facultyLabel);


//only accepts hashtable 
slider.setLabelTable(table);

slider.setPaintLabels(true);


//added to bottom of frame as asked in assigment
mainFrame.add(slider, BorderLayout.SOUTH);




/////////////////////////////

//note: previous assigment's redundant items removed upon your feedback in Bright Space.


//Lesson notes, module 10, page 24
contents.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));



//page 4, powerpoint slides
//textbox school with label
JLabel school = new JLabel("School:");
contents.add(school);

JTextField schoolName = new JTextField("Hudson Valley Community College");
contents.add(schoolName);


//page 5, powerpoint slides
//textbox grade level with label
JLabel grade = new JLabel("Grade:");
contents.add(grade);

JTextField gradeLevel = new JTextField("Continuing Education: Freshman");
contents.add(gradeLevel);

//textbox certificate of study
JTextField Study = new JTextField("Computer Information Systems, AS");
contents.add(Study);

//page 26, powerpoint slides
//label tv shows, followed by a list box
JLabel showsLabel = new JLabel("Favorite TV shows:");
contents.add(showsLabel);


String[] tvShows = {"Star Wars", "Doctor Who", "Superman", "Spiderman"};
JList listShow = new JList(tvShows);
contents.add(listShow);


//page 33, powerpoint slides
//combobox with courses being taken, WITH CISS 111 SELECTED
String[] courses = {"CISS 111", "ARTS 100"};
JComboBox box = new JComboBox(courses);
contents.add(box);



//module 11, powerpoint slides, page 20
//ACTION BUTTON WITH LABEL FINISH
button = new JButton("FINISH");
contents.add(button);

//referred to:
//https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html
button.addActionListener(this);



//centered and rowed layout
//referred from: Lesson notes, module 10, page 13
//FlowLayout: Selected specifically for a rowed layout asked in previous assignment
contents.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));


mainFrame.add(contents);
//mainFrame.setSize(2000,200);
mainFrame.pack();

}

  
public void display() {

mainFrame.setVisible(true);

}


//action listener
public void actionPerformed(ActionEvent e) {
  
  
button.setText("That's me!");



}



public static void main(String[] args) {
       
//Displayed on the main method which was asked in the previous assignment.
MySite mySite = new MySite();


mySite.display();




 }


}