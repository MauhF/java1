import javax.swing.JOptionPane;

public class AulaSwCs {

	public static void main(String[] args) {
		String y;
		y =JOptionPane.showInputDialog("Digite um N�mero");
		
		int x;
	
		x= Integer.parseInt(y);
		
		switch (x) {
		case 0:
		
			JOptionPane.showMessageDialog(null, "X � 0");
			break;
		case 1:
		
			JOptionPane.showMessageDialog(null, "X � 1");
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "X tem um valor diferente de 0 e 1");
			break;
		}

	}

}
