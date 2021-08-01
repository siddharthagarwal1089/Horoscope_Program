import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginMain extends JFrame {

	private JPanel contentPane;
	private JTextField tfUserName;
	private JPasswordField pfPass;

	public LoginMain() {
		setTitle("Login MAIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setBounds(369, 63, 169, 36);
		lblWelcome.setFont(new Font("Times", Font.BOLD, 30));
		contentPane.add(lblWelcome);
		
		JLabel lblTo = new JLabel("BACK");
		lblTo.setBounds(424, 97, 65, 42);
		lblTo.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(lblTo);
		
		JLabel lblHoroscope = new JLabel("ADMINISTRATOR");
		lblHoroscope.setBounds(248, 152, 393, 58);
		lblHoroscope.setFont(new Font("Times New Roman", Font.BOLD, 45));
		contentPane.add(lblHoroscope);
		
		JLabel lblLoginMsg = new JLabel("Please login to continue:");
		lblLoginMsg.setBounds(45, 260, 222, 28);
		lblLoginMsg.setForeground(Color.DARK_GRAY);
		lblLoginMsg.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(lblLoginMsg);
		
		JLabel lblUserName = new JLabel("Username:");
		lblUserName.setBounds(238, 309, 152, 36);
		lblUserName.setFont(new Font("Times", Font.BOLD, 30));
		contentPane.add(lblUserName);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(248, 362, 142, 36);
		lblPass.setFont(new Font("Times", Font.BOLD, 30));
		contentPane.add(lblPass);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(424, 312, 252, 36);
		tfUserName.setFont(new Font("Times", Font.PLAIN, 22));
		contentPane.add(tfUserName);
		tfUserName.setColumns(10);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(424, 362, 252, 36);
		pfPass.setFont(new Font("Times", Font.PLAIN, 15));
		contentPane.add(pfPass);
		
		JLabel lblErrorMsg = new JLabel("");
		lblErrorMsg.setBounds(258, 518, 393, 35);
		lblErrorMsg.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblErrorMsg.setForeground(Color.ORANGE);
		contentPane.add(lblErrorMsg);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(385, 472, 130, 42);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = tfUserName.getText();
				String pass = pfPass.getText();
				if(un.equals("admin") && pass.equals("Test1234$$")) 
				{
					ZodiacSignsAdmin zsa = new ZodiacSignsAdmin();
					zsa.setVisible(true);
				}
				else
				{
					lblErrorMsg.setText("ERROR:  Invalid Username & Password !!");
				}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(btnLogin);
		
		JButton btnForgotPass = new JButton("Forgot Password");
		btnForgotPass.setBounds(541, 398, 132, 29);
		btnForgotPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgotPassword fp = new ForgotPassword();
				fp.setVisible(true);
			}
		});
		btnForgotPass.setForeground(Color.RED);
		contentPane.add(btnForgotPass);
		
		JButton btnBackHome = new JButton("Go To Homepage");
		btnBackHome.setBounds(355, 580, 190, 42);
		btnBackHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeMain hm = new HomeMain();
				hm.setVisible(true);
			}
		});
		btnBackHome.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(btnBackHome);
		
		JLabel lblBackImg = new JLabel("");
		lblBackImg.setBounds(0, 0, 900, 678);
		lblBackImg.setForeground(Color.BLACK);
		lblBackImg.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/back1.jpg"));
		contentPane.add(lblBackImg);
	}
	
	public static void main(String[] args) {
		LoginMain frame = new LoginMain();
		frame.setVisible(true);
	}
}
