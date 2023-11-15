import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class HelloBtn implements ActionListener{
 
    int count = 0;// store number of clicks

    HelloBtn() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Hello");
        button.addActionListener(this);

        button.setBounds(150, 200, 220, 50);

        frame.add(button); // adding button in JFrame
        frame.setSize(500, 600); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); 
        //    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        //    frame.add(button1);
        //    frame.getRootPane().setDefaultButton(button1); // sets default button
        //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    frame.setSize(450,450);
        //    frame.setLocationRelativeTo(null);
        //    frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        count++;
        System.out.println("Hello world");
    }
        
    public static void main(String args[]){
       HelloBtn hello = new HelloBtn();
    }
}