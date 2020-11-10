import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class TextFieldDemo implements ActionListener { 
   JTextField field; 
   JButton button; 
   JLabel jlabPrompt, jlabContents; 

   TextFieldDemo() { 
      // Create a new JFrame container. 
      JFrame frame = new JFrame("Use a Text Field"); 
      // Specify FlowLayout for the layout manager. 
      frame.setLayout(new FlowLayout()); 
      // Give the frame an initial size. 
      frame.setSize(240, 120); 
      // Create a text field. 
      field = new JTextField(10); 
      // Set the action commands for the text field. 
      field.setActionCommand("myTF"); 
      // Create the Reverse button. 
      button = new JButton("Reverse"); 
      // Add action listeners. 
      field.addActionListener(this); 
      button.addActionListener(this); 
      // Create the labels. 
      jlabPrompt = new JLabel("Enter text: "); 
      jlabContents = new JLabel(""); 
      // Add the components to the content pane. 
      frame.add(jlabPrompt); 
      frame.add(field); 
      frame.add(button); 
      frame.add(jlabContents); 
      // Display the frame. 
      frame.setVisible(true); 
  } 
  // Handle action events. 
 public void actionPerformed(ActionEvent ae) { 
    if(ae.getActionCommand().equals("Reverse")) { 
        // The Reverse button was pressed. 
        String orgStr = field.getText(); 
        String resStr = ""; 
        jlabContents.setText("You entered: " + orgStr);
        // Reverse the string in the text field. 
        for(int i=orgStr.length()-1; i >=0; i--) 
           resStr += orgStr.charAt(i); 
        // Store the reversed string in the text field. 
        field.setText(resStr); 
     } else {
        // Enter was pressed while focus was in the 
        // text field. 
        jlabContents.setText("You pressed ENTER. Text is: " + 
        field.getText()); 
     }
  } 
}