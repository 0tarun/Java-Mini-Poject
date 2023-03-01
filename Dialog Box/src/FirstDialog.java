import javax.swing.*;
public class FirstDialog{
    public static void main(String [] args){
       String name=JOptionPane.showInputDialog(
               null,"Enter your name",
               "Input name",JOptionPane.QUESTION_MESSAGE) ;

       JOptionPane.showMessageDialog(
               null,"My Name is "+name,
               "Display information",JOptionPane.INFORMATION_MESSAGE);


    }

}
