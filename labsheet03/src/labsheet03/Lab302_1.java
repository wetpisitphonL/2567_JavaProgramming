
import javax.swing.JOptionPane;
public class Lab302_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		
		boolean validateEmail = false;
		
		validateEmail = inputEmail.startsWith("2")||inputEmail.contains("");
		
		while(inputEmail.startsWith("@")||inputEmail.contains(" "));{
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again: ");
		}
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail")) {
			JOptionPane.showMessageDialog(null,"Your e-mail is"+ inputEmail);
		}else {
			JOptionPane.showMessageDialog(null,"your e-mail is not hotmail or gmail dot");
			
		}
	}

}

