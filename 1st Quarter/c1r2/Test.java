import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
            "http://slavicstyle.com/wp-content/uploads/2015/03/13911588143753.jpg");
      JOptionPane.showMessageDialog(null, "U BRING CIGARET", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}
