import javax.swing.*;

public class Problem9 {
    public static void main(String[] args){
        String a=JOptionPane.showInputDialog(null,"Enter a number ",
                "Input",JOptionPane.QUESTION_MESSAGE);
        double Number=Double.parseDouble(a);
        if(Number%2==0||Number%3==0)
        {
          JOptionPane.showMessageDialog(null,"True",
                  "Output",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"False",
                    "Output",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
