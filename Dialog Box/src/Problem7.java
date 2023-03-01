import java.util.Scanner;
import javax.swing.*;

public class Problem7 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog (null,"Enter today's exchange rate",
                "Exchange rate",JOptionPane.QUESTION_MESSAGE);
        float exchangeRate = Float.parseFloat(a);
        a = JOptionPane.showInputDialog (null,"Enter option(0 for USD to BDT, 1 for BDT to USD)",
                "Option",JOptionPane.QUESTION_MESSAGE);
        int option = Integer.parseInt(a);

        if(option == 0){
            a = JOptionPane.showInputDialog (null,"Enter the amount in USD",
                    "Amount in USD",JOptionPane.QUESTION_MESSAGE);
            float amount = Float.parseFloat(a);
            JOptionPane.showMessageDialog(null,
                    "The amount in BDT is: " + amount*exchangeRate,
                    "Converted to BDT", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(option == 1){
            a = JOptionPane.showInputDialog (null,"Enter the amount in BDT",
                    "Amount in BDT",JOptionPane.QUESTION_MESSAGE);
            float amount = Float.parseFloat(a);
            JOptionPane.showMessageDialog(null,
                    "The amount in USD is: " + amount/exchangeRate,
                    "Converted to USD", JOptionPane.INFORMATION_MESSAGE);
        }
        //System.out.println(name);
        //JOptionPane.showMessageDialog(null, "Your name is " + name, 
        //        "Display name", JOptionPane.INFORMATION_MESSAGE);

    }
}