import javax.swing.*;

public class Initials {
  public static void main(String[] args) {
    String f;
    String m;
    String l;
    
    f = JOptionPane.showInputDialog("Enter your first name's initial:");
    char fI = f.charAt(0);
    char fIni = Character.toUpperCase(fI);
    
    m = JOptionPane.showInputDialog("Enter your middle name's initial:");
    char mI = m.charAt(0);
    char mIni = Character.toUpperCase(mI);
    
    l = JOptionPane.showInputDialog("Enter your last name's initial:");
    char lI = l.charAt(0);
    char lIni = Character.toUpperCase(lI);
    JOptionPane.showMessageDialog(null,fIni+"."+mIni+"."+lIni+".");

    
  }
}
