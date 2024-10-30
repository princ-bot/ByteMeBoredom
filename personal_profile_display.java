import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class personal_profile_display {
	public static void main(String[] args) {
		String name = "Prince Edward L. Romano";
		int age = 20;
		double gpa = 3.0;
		char bloodtype = 'O';

		String output = "<html><div style=\\\"text-align:left;\\\">"
				+ "Hi my name is <b>" + name + "</b><br>"
				+ "I'am <b>" + age + " </b>Years Old<br>"
				+ "My GPA is <b>" + gpa + "</b><br>"
				+ "My blood type is <b>" + bloodtype + "</b></div><html>";
		JLabel label = new JLabel(output);
		label.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
		JOptionPane.showMessageDialog(null, label);

	}
}