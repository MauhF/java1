import javax.swing.JOptionPane;

public class Aulaif {

	public static void main(String[] args) {
		
		
		int x;
		x = 5;
	
		
		if (x < 10) {
			JOptionPane.showMessageDialog(null, "x é menor que 10");
			
			//JOptionPane.showInputDialog(null, "X é menor que 10")
			
		} else {
			JOptionPane.showInternalMessageDialog(null,"X é maior ou igual a 10");			
			
			
		}

	}

}
