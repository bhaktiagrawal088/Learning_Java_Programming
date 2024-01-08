import javax.swing.JOptionPane;

public class GUIInto {
    public static void main(String args[]) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height bro"));
        System.out.println("Hello " + name);
        JOptionPane.showMessageDialog(null, "Hello " + name);
        JOptionPane.showMessageDialog(null, "You are " + age + " year old");
        JOptionPane.showMessageDialog(null, "Your Height is " + height + "cm.");

    }
}
