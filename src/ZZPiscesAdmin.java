import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZZPiscesAdmin extends JFrame {

	private JPanel contentPane;
	public static JTextArea taPiscesAdmin;

	public ZZPiscesAdmin() {
		setTitle("EDIT PISCES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("EDITING  PAGE");
		lbl1.setBounds(290, 50, 320, 40);
		lbl1.setForeground(Color.RED);
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("PISCES :");
		lbl2.setBounds(34, 130, 352, 50);
		lbl2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("EDIT the HOROSCOPE here:");
		lbl3.setBounds(55, 235, 314, 30);
		lbl3.setForeground(Color.BLACK);
		lbl3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lbl3);
		
		taPiscesAdmin = new JTextArea();
		taPiscesAdmin.setBounds(95, 270, 740, 190);
		taPiscesAdmin.setText("\n Have you been reviewing your family history lately, Pisces? \n Of special interest is your cultural background. \n What educational, social, and religious environment were you born into? \n What are their values? \n In the end, do you feel a strong affinity with them now or are those views different from the ones\n you hold? \n These are interesting avenues of thought for you today.");
		taPiscesAdmin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(taPiscesAdmin);
		
		JButton btnView = new JButton("VIEW");
		btnView.setBounds(690, 500, 140, 50);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String srPisces = taPiscesAdmin.getText();
				ZZPisces z12 = new ZZPisces();
				z12.taPisces.setText(srPisces);
				z12.setVisible(true);
			}
		});
		btnView.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(btnView);
		
		JButton btnSaveGoBack = new JButton("Save & Go Back");
		btnSaveGoBack.setBounds(360, 580, 180, 60);
		btnSaveGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZodiacSignsAdmin zsa = new ZodiacSignsAdmin();
				zsa.setVisible(true);
			}
		});
		btnSaveGoBack.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(btnSaveGoBack);
		
		JLabel lblWarning = new JLabel("On clicking VIEW, you will be logged out from the ADMIN page and redirected to the GUEST page :");
		lblWarning.setBounds(165, 469, 670, 30);
		lblWarning.setForeground(Color.ORANGE);
		lblWarning.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		contentPane.add(lblWarning);
		
		JLabel lblBackImg = new JLabel("");
		lblBackImg.setBounds(0, 0, 900, 678);
		lblBackImg.setForeground(Color.BLACK);
		lblBackImg.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/back1.jpg"));
		contentPane.add(lblBackImg);
	}
	
	public static void main(String[] args) {
		ZZPiscesAdmin frame = new ZZPiscesAdmin();
		frame.setVisible(true);
	}
}
