import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeMain extends JFrame {

	private JPanel contentPane;

	public HomeMain() {
		setTitle("Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setBounds(386, 268, 142, 36);
		lblWelcome.setFont(new Font("Times", Font.BOLD, 25));
		contentPane.add(lblWelcome);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(372, 30, 164, 175);
		lblLogo.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/logo.png"));
		contentPane.add(lblLogo);
		
		JLabel lblCompName = new JLabel("Rising Stars");
		lblCompName.setBounds(386, 201, 144, 28);
		lblCompName.setForeground(Color.BLACK);
		lblCompName.setFont(new Font("Ayuthaya", Font.BOLD, 20));
		contentPane.add(lblCompName);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(442, 291, 34, 42);
		lblTo.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(lblTo);
		
		JLabel lblHoroscope = new JLabel("HOROSCOPE");
		lblHoroscope.setBounds(314, 321, 295, 58);
		lblHoroscope.setFont(new Font("Times New Roman", Font.BOLD, 45));
		contentPane.add(lblHoroscope);
		
		JLabel lblLoginMsg = new JLabel("Please SELECT to continue:");
		lblLoginMsg.setBounds(32, 391, 244, 28);
		lblLoginMsg.setForeground(Color.DARK_GRAY);
		lblLoginMsg.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(lblLoginMsg);
		
		JButton btnGuestLogin = new JButton("Guest Login");
		btnGuestLogin.setBounds(337, 432, 253, 47);
		btnGuestLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZodiacSigns zs = new ZodiacSigns();
				zs.setVisible(true);
			}
		});
		btnGuestLogin.setForeground(Color.RED);
		btnGuestLogin.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		contentPane.add(btnGuestLogin);
		
		JLabel lblGuestMsg = new JLabel("Free to Access");
		lblGuestMsg.setBounds(414, 480, 119, 28);
		lblGuestMsg.setForeground(Color.BLACK);
		lblGuestMsg.setFont(new Font("Times", Font.BOLD, 17));
		contentPane.add(lblGuestMsg);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(337, 546, 253, 47);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain lm = new LoginMain();
				lm.setVisible(true);
			}
		});
		btnAdminLogin.setForeground(Color.RED);
		btnAdminLogin.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		contentPane.add(btnAdminLogin);
		
		JLabel lblAdminMsg = new JLabel("Only for ADMINISTRATOR");
		lblAdminMsg.setBounds(357, 597, 222, 28);
		lblAdminMsg.setForeground(Color.BLACK);
		lblAdminMsg.setFont(new Font("Times", Font.BOLD, 17));
		contentPane.add(lblAdminMsg);
		
		JLabel lblBackImg = new JLabel("");
		lblBackImg.setBounds(0, 0, 900, 678);
		lblBackImg.setForeground(Color.BLACK);
		lblBackImg.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/back1.jpg"));
		contentPane.add(lblBackImg);
	}
	
	public static void main(String[] args) {
		HomeMain frame = new HomeMain();
		frame.setVisible(true);
	}
}
