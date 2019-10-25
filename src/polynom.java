
import javax.swing.*;

/*public class polynom {
    public static void main(String [] args){
        String a = JOptionPane.showInputDialog(null, "we are going to calculate ax + b = 0" + "\nplease enter variable a");
                double a1 = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog(null, "please enter your second variable");
                double b1 = Integer.parseInt(b);
        double x = (b1*-1) / a1;
        JOptionPane.showMessageDialog(null, "your x vairable is " + x + " in your " + a + "x" + " + " + b);
    }
}
*/
public class polynom {
    public static void main(String [] args){
        String a = JOptionPane.showInputDialog(null, "we are going to calculate ax*x + bx + c = 0" + "\nplease enter variable a");
            double a1 = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog(null, "please enter variable b");
            double b1 = Integer.parseInt(b);
        String c = JOptionPane.showInputDialog(null, "please enter variable c");
            double c1 = Integer.parseInt(c);
                    //koden
        double sqrt = Math.sqrt((b1*b1) - (4*a1*c1));
        double x1 = ((-1*b1) + sqrt)/2*a1;
        double x2 = ((-1*b1) - sqrt)/2*a1;
        if (double.isNaN(x1))

        JOptionPane.showMessageDialog(null, "your x vairable is " + x1 + " or " + x2 + " when " + a1 + "x*x" + " + " + b1 + "x + " + c + " = 0");

    }
}