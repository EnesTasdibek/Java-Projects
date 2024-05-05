import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.Border;

public class MyWorld_Chpt12 {
  static JFrame mainFrame;
  static JPanel contents;
  
  public MyWorld_Chpt12() {
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
    
    //menu bar
    JMenuBar menu = new JMenuBar();
    JMenu file = new JMenu("File");
    file.setMnemonic(KeyEvent.VK_F);
    JMenu edit = new JMenu("Edit");
    edit.setMnemonic(KeyEvent.VK_E);
    
    JMenuItem fileNew = new JMenuItem("New", KeyEvent.VK_N);
    JMenuItem fileOpen = new JMenuItem("Open", KeyEvent.VK_O);
    JMenuItem fileSave = new JMenuItem("Save", KeyEvent.VK_S);
    JMenuItem fileSaveAs = new JMenuItem("Save As", KeyEvent.VK_A);
    JMenuItem fileClose = new JMenuItem("Close", KeyEvent.VK_C);
    
    file.add(fileNew);
    file.add(fileOpen);
    file.add(fileSave);
    file.add(fileSaveAs);
    file.add(fileClose);
    
    JMenuItem editCut = new JMenuItem("Cut");
    editCut.setMnemonic(KeyEvent.VK_T);
    KeyStroke ctrlX = KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK);
    editCut.setAccelerator(ctrlX);
    
    JMenuItem editCopy = new JMenuItem("Copy");
    editCopy.setMnemonic(KeyEvent.VK_C);
    KeyStroke ctrlC = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
    editCopy.setAccelerator(ctrlC);
    
    JMenuItem editPaste = new JMenuItem("Paste");
    editPaste.setMnemonic(KeyEvent.VK_P);
    KeyStroke ctrlV = KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK);
    editPaste.setAccelerator(ctrlV);
    
    JMenuItem editFind = new JMenuItem("Find/Replace");
    editFind.setMnemonic(KeyEvent.VK_F);
    KeyStroke ctrlH = KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK);
    editFind.setAccelerator(ctrlH);
    
    JMenuItem editUndo = new JMenuItem("Undo");
    editUndo.setMnemonic(KeyEvent.VK_U);
    KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK);
    editUndo.setAccelerator(ctrlZ);
    
    edit.add(editCut);
    edit.add(editCopy);
    edit.add(editPaste);
    edit.add(editFind);
    edit.add(editUndo);

    menu.add(file);
    menu.add(edit);
    mainFrame.setJMenuBar(menu);
    
    mainFrame.add(contents);
    mainFrame.show();
  }
  
}