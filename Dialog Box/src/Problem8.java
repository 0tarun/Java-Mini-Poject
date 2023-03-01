
import javax.swing.*;
public class Problem8 {
    public static void main(String[] args){
        String a=JOptionPane.showInputDialog(null,"Enter Celsius degree",

                "Input",JOptionPane.QUESTION_MESSAGE);
        Float Celsius=Float.parseFloat(a);

        JOptionPane.showMessageDialog(null,"Fahrenheit degree "+ (9/5*Celsius+32),
                "Output",JOptionPane.INFORMATION_MESSAGE);

    }
}
