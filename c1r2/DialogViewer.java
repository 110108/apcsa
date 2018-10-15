import javax.swing.JOptionPane;
public class DialogViewer
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println("Hello, "+name+"!");
      String op = JOptionPane.showInputDialog("What woluld you like me to do?");
   }
}