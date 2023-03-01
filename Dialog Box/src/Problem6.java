
import javax.swing.*;
public class Problem6 {

    public static void main(String [] args){
        String a=JOptionPane.showInputDialog(null,"Input kilometer","Input",JOptionPane.QUESTION_MESSAGE);
        float kilometer=Float.parseFloat(a);
        String b=JOptionPane.showInputDialog(null,"Input minute","Input",JOptionPane.QUESTION_MESSAGE);
        float minute=Float.parseFloat(b);
        String c=JOptionPane.showInputDialog(null,"Input second","Input",JOptionPane.QUESTION_MESSAGE);
        float second=Float.parseFloat(b);
        JOptionPane.showMessageDialog(null,"The average speed is "+((kilometer/1.6)/(minute/60)+(second/160)),"output",JOptionPane.INFORMATION_MESSAGE);
    }
}