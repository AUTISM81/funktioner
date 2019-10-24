
import javax.swing.*;

public class polynom {
    public static void main(String [] args){
        String a = JOptionPane.showInputDialog(null, "we are going to calculate ax + b = 0" + "\nplease enter variable a");
                double a1 = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog(null, "please enter your second variable");
                double b1 = Integer.parseInt(b);
        double x = (b1*-1) / a1;
        JOptionPane.showMessageDialog(null, "your x vairable is " + x + " in your " + a + "x" + " + " + b);
    }
}

public class polynom2 {
    public static void main(String [] args){
        
    }
}