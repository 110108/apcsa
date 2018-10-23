import javax.swing.JOptionPane;
public class e17
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      JOptionPane.showInputDialog("Hello, "+name+"!");
      String op = JOptionPane.showInputDialog("What woluld you like me to do?");
      System.out.println("I'm sorry "+name+", but I can't do that.");
   }
}