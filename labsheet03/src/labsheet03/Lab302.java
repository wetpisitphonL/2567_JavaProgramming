import javax.swing.JOptionPane;
public class Lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputEmail;
		
		boolean chkEmail = false;
		
		while(true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
			while(inputEmail.startsWith("@")||inputEmail.contains(" "));{
				inputEmail = JOptionPane.showInputDialog("Input your e-mail,again: ");
				//End of while
				if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail")) {
					JOptionPane.showMessageDialog(null,"Your e-mail is"+ inputEmail);
					break;
				}else {
					JOptionPane.showMessageDialog(null,"your e-mail is not hotmail or gmail dot");
					continue;
					
		}
		
		
	      }
			
	   }
		
	}
}
