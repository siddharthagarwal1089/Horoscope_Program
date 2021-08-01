import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZodiacSignsAdmin extends JFrame {

	private JPanel contentPane;
	public static ZZAriesAdmin zzz1 = new ZZAriesAdmin();
	public static ZZTaurusAdmin zzz2 = new ZZTaurusAdmin();
	public static ZZGeminiAdmin zzz3 = new ZZGeminiAdmin();
	public static ZZCancerAdmin zzz4 = new ZZCancerAdmin();
	public static ZZLeoAdmin zzz5 = new ZZLeoAdmin();
	public static ZZVirgoAdmin zzz6 = new ZZVirgoAdmin();
	public static ZZLibraAdmin zzz7 = new ZZLibraAdmin();
	public static ZZScorpioAdmin zzz8 = new ZZScorpioAdmin();
	public static ZZSagittariusAdmin zzz9 = new ZZSagittariusAdmin();
	public static ZZCapricornAdmin zzz10 = new ZZCapricornAdmin();
	public static ZZAquariusAdmin zzz11 = new ZZAquariusAdmin();
	public static ZZPiscesAdmin zzz12 = new ZZPiscesAdmin();

	public ZodiacSignsAdmin() {
		setTitle("EDIT ZODIAC SIGNS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectionMsg = new JLabel("Select the ZODIAC SIGN  to be EDITED :");
		lblSelectionMsg.setBounds(31, 25, 460, 30);
		lblSelectionMsg.setFont(new Font("Times", Font.BOLD, 25));
		contentPane.add(lblSelectionMsg);
		
		JButton btnAries = new JButton("");
		btnAries.setBounds(80, 78, 140, 170);
		btnAries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz1.setVisible(true);
			}
		});
		btnAries.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/aries.jpg"));
		contentPane.add(btnAries);
		
		JButton btnTaurus = new JButton("");
		btnTaurus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz2.setVisible(true);
			}
		});
		btnTaurus.setBounds(280, 78, 140, 170);
		btnTaurus.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/taurus.jpg"));
		contentPane.add(btnTaurus);
		
		JButton btnGemini = new JButton("");
		btnGemini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz3.setVisible(true);
			}
		});
		btnGemini.setBounds(480, 78, 140, 170);
		btnGemini.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/gemini.jpg"));
		contentPane.add(btnGemini);
		
		JButton btnCancer = new JButton("");
		btnCancer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz4.setVisible(true);
			}
		});
		btnCancer.setBounds(680, 78, 140, 170);
		btnCancer.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/cancer.jpg"));
		contentPane.add(btnCancer);
		
		JButton btnLeo = new JButton("");
		btnLeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz5.setVisible(true);
			}
		});
		btnLeo.setBounds(80, 278, 140, 170);
		btnLeo.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/leo.jpg"));
		contentPane.add(btnLeo);
		
		JButton btnVirgo = new JButton("");
		btnVirgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz6.setVisible(true);
			}
		});
		btnVirgo.setBounds(280, 278, 140, 170);
		btnVirgo.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/virgo.jpg"));
		contentPane.add(btnVirgo);
		
		JButton btnLibra = new JButton("");
		btnLibra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz7.setVisible(true);
			}
		});
		btnLibra.setBounds(480, 278, 140, 170);
		btnLibra.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/libra.jpg"));
		contentPane.add(btnLibra);
		
		JButton btnScorpio = new JButton("");
		btnScorpio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz8.setVisible(true);
			}
		});
		btnScorpio.setBounds(680, 278, 140, 170);
		btnScorpio.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/scorpio.jpg"));
		contentPane.add(btnScorpio);
		
		JButton btnSagittarius = new JButton("");
		btnSagittarius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz9.setVisible(true);
			}
		});
		btnSagittarius.setBounds(80, 478, 140, 170);
		btnSagittarius.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/sagittarius.jpg"));
		contentPane.add(btnSagittarius);
		
		JButton btnCapricorn = new JButton("");
		btnCapricorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz10.setVisible(true);
			}
		});
		btnCapricorn.setBounds(280, 478, 140, 170);
		btnCapricorn.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/capricorn.jpg"));
		contentPane.add(btnCapricorn);
		
		JButton btnAquarius = new JButton("");
		btnAquarius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz11.setVisible(true);
			}
		});
		btnAquarius.setBounds(480, 478, 140, 170);
		btnAquarius.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/aquarius.jpg"));
		contentPane.add(btnAquarius);
		
		JButton btnPisces = new JButton("");
		btnPisces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zzz12.setVisible(true);
			}
		});
		btnPisces.setBounds(680, 478, 140, 170);
		btnPisces.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/pisces.jpg"));
		contentPane.add(btnPisces);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(742, 18, 126, 38);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain lm = new LoginMain();
				lm.setVisible(true);
			}
		});
		contentPane.add(btnLogout);
		
		JLabel lblBackImg = new JLabel("");
		lblBackImg.setBounds(0, 0, 900, 678);
		lblBackImg.setForeground(Color.BLACK);
		lblBackImg.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/back1.jpg"));
		contentPane.add(lblBackImg);
	}
	
	public static void main(String[] args) {
		ZodiacSignsAdmin frame = new ZodiacSignsAdmin();
		frame.setVisible(true);
	}
}
