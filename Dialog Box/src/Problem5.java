import java.util.Scanner;
import javax.swing.*;
public class Problem5 {
    public static void main(String [] args){
String a=JOptionPane.showInputDialog(null,"Value of radios",
        "Input",JOptionPane.QUESTION_MESSAGE);
float radios=Float.parseFloat(a);

JOptionPane.showMessageDialog(null,"Perimeter="+(2*3.1416*radios),
        "Input",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Area is ="+(3.1416*radios*radios),
                "Input",JOptionPane.INFORMATION_MESSAGE);

    }
}
