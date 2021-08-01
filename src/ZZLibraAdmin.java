import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZZLibraAdmin extends JFrame {

	private JPanel contentPane;
	public static JTextArea taLibraAdmin;

	public ZZLibraAdmin() {
		setTitle("EDIT LIBRA");
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
		
		JLabel lbl2 = new JLabel("LIBRA :");
		lbl2.setBounds(34, 130, 352, 50);
		lbl2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("EDIT the HOROSCOPE here:");
		lbl3.setBounds(55, 235, 314, 30);
		lbl3.setForeground(Color.BLACK);
		lbl3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lbl3);
		
		taLibraAdmin = new JTextArea();
		taLibraAdmin.setBounds(95, 270, 740, 190);
		taLibraAdmin.setText("\n Today will be fairly calm in terms of outside events, but your inner world is likely to be in a rush of\n activity. \n Today you wish you could find the solution to your heartaches as well as your career predicaments.\n You'd like to achieve some supreme understanding of the events that took place over the past\n month. \n First, you must force your brain to slow down. \n Haste makes waste, as you know!");
		taLibraAdmin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(taLibraAdmin);
		
		JButton btnView = new JButton("VIEW");
		btnView.setBounds(690, 500, 140, 50);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String srLibra = taLibraAdmin.getText();
				ZZLibra z7 = new ZZLibra();
				z7.taLibra.setText(srLibra);
				z7.setVisible(true);
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
		ZZLibraAdmin frame = new ZZLibraAdmin();
		frame.setVisible(true);
	}
}
