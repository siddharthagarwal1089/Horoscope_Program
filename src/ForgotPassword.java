import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ForgotPassword extends JFrame {

	private JPanel contentPane;
	private JTextField tfUserName;
	private JTextField tfAnswer;

	public ForgotPassword() {
		setTitle("Forgot Password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForgetPassword = new JLabel("Forgot Password");
		lblForgetPassword.setBounds(300, 58, 332, 58);
		lblForgetPassword.setFont(new Font("Times New Roman", Font.BOLD, 45));
		contentPane.add(lblForgetPassword);
		
		JLabel lblEncryptPass = new JLabel("");
		lblEncryptPass.setBounds(354, 449, 300, 36);
		lblEncryptPass.setForeground(Color.BLACK);
		lblEncryptPass.setFont(new Font("Times", Font.BOLD, 25));
		contentPane.add(lblEncryptPass);
		
		JLabel lblUserName = new JLabel("Username:");
		lblUserName.setBounds(232, 149, 152, 36);
		lblUserName.setFont(new Font("Times", Font.BOLD, 30));
		contentPane.add(lblUserName);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(423, 149, 252, 36);
		tfUserName.setFont(new Font("Times", Font.PLAIN, 22));
		tfUserName.setColumns(10);
		contentPane.add(tfUserName);
		
		JLabel lblSecQueMsg = new JLabel("Answer your security question (EXACT):");
		lblSecQueMsg.setBounds(66, 228, 313, 36);
		lblSecQueMsg.setFont(new Font("Times", Font.BOLD, 17));
		contentPane.add(lblSecQueMsg);
		
		JLabel lblSecQueAns = new JLabel("Answer:");
		lblSecQueAns.setBounds(310, 306, 74, 41);
		lblSecQueAns.setForeground(Color.RED);
		lblSecQueAns.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		contentPane.add(lblSecQueAns);
		
		JLabel lblSecQue = new JLabel("What is the name of your pet?");
		lblSecQue.setBounds(300, 273, 354, 28);
		contentPane.add(lblSecQue);
		lblSecQue.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblSecQue.setForeground(Color.RED);
		
		tfAnswer = new JTextField();
		tfAnswer.setBounds(396, 307, 252, 42);
		tfAnswer.setForeground(Color.BLACK);
		tfAnswer.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		contentPane.add(tfAnswer);
		tfAnswer.setColumns(10);
		
		JButton btnRetPass = new JButton("Retrieve Password");
		btnRetPass.setBounds(433, 360, 188, 36);
		btnRetPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = tfUserName.getText();
				String ans = tfAnswer.getText();
				if(un.equals("admin") && ans.equals("bruno")) 
				{
					lblEncryptPass.setText("PASSWORD:  Test1234$$");
				}
				else
				{
					lblEncryptPass.setText("ERROR:  Invalid Entries !");
				}
			}
		});
		btnRetPass.setBackground(Color.WHITE);
		btnRetPass.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnRetPass.setForeground(Color.BLUE);
		contentPane.add(btnRetPass);
		
		JButton btnGoBack = new JButton("GO BACK to LOGIN");
		btnGoBack.setBounds(396, 573, 175, 49);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain lm = new LoginMain();
				lm.setVisible(true);
			}
		});
		btnGoBack.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(btnGoBack);
		
		JPanel pnlRetPass = new JPanel();
		pnlRetPass.setBounds(310, 424, 383, 90);
		pnlRetPass.setBackground(Color.WHITE);
		contentPane.add(pnlRetPass);
		
		JLabel lblBackImg = new JLabel("");
		lblBackImg.setBounds(0, 0, 900, 678);
		lblBackImg.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/back1.jpg"));
		contentPane.add(lblBackImg);
	}
	
	public static void main(String[] args) {
		ForgotPassword frame = new ForgotPassword();
		frame.setVisible(true);
	}
}
