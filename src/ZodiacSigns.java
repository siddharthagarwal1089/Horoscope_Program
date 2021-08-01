import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZodiacSigns extends JFrame {

	private JPanel contentPane;

	public ZodiacSigns() {
		setTitle("ZODIAC SIGNS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectionMsg = new JLabel("Select your ZODIAC SIGN :");
		lblSelectionMsg.setBounds(297, 17, 306, 30);
		lblSelectionMsg.setFont(new Font("Times", Font.BOLD, 25));
		contentPane.add(lblSelectionMsg);
		
		JButton btnAries = new JButton("");
		btnAries.setBounds(80, 58, 140, 170);
		btnAries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZAries z1 = new ZZAries();
				z1.setVisible(true);
			}
		});
		btnAries.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/aries.jpg"));
		contentPane.add(btnAries);
		
		JButton btnTaurus = new JButton("");
		btnTaurus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZTaurus z2 = new ZZTaurus();
				z2.setVisible(true);
			}
		});
		btnTaurus.setBounds(280, 58, 140, 170);
		btnTaurus.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/taurus.jpg"));
		contentPane.add(btnTaurus);
		
		JButton btnGemini = new JButton("");
		btnGemini.setBounds(480, 58, 140, 170);
		btnGemini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZGemini z3 = new ZZGemini();
				z3.setVisible(true);
			}
		});
		btnGemini.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/gemini.jpg"));
		contentPane.add(btnGemini);
		
		JButton btnCancer = new JButton("");
		btnCancer.setBounds(680, 58, 140, 170);
		btnCancer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZCancer z4 = new ZZCancer();
				z4.setVisible(true);
			}
		});
		btnCancer.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/cancer.jpg"));
		contentPane.add(btnCancer);
		
		JButton btnLeo = new JButton("");
		btnLeo.setBounds(80, 238, 140, 170);
		btnLeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZLeo z5 = new ZZLeo();
				z5.setVisible(true);
			}
		});
		btnLeo.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/leo.jpg"));
		contentPane.add(btnLeo);
		
		JButton btnVirgo = new JButton("");
		btnVirgo.setBounds(280, 238, 140, 170);
		btnVirgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZVirgo z6 = new ZZVirgo();
				z6.setVisible(true);
			}
		});
		btnVirgo.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/virgo.jpg"));
		contentPane.add(btnVirgo);
		
		JButton btnLibra = new JButton("");
		btnLibra.setBounds(480, 238, 140, 170);
		btnLibra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZLibra z7 = new ZZLibra();
				z7.setVisible(true);
			}
		});
		btnLibra.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/libra.jpg"));
		contentPane.add(btnLibra);
		
		JButton btnScorpio = new JButton("");
		btnScorpio.setBounds(680, 238, 140, 170);
		btnScorpio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZScorpio z8 = new ZZScorpio();
				z8.setVisible(true);
			}
		});
		btnScorpio.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/scorpio.jpg"));
		contentPane.add(btnScorpio);
		
		JButton btnSagittarius = new JButton("");
		btnSagittarius.setBounds(80, 418, 140, 170);
		btnSagittarius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZSagittarius z9 = new ZZSagittarius();
				z9.setVisible(true);
			}
		});
		btnSagittarius.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/sagittarius.jpg"));
		contentPane.add(btnSagittarius);
		
		JButton btnCapricorn = new JButton("");
		btnCapricorn.setBounds(280, 418, 140, 170);
		btnCapricorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZCapricorn z10 = new ZZCapricorn();
				z10.setVisible(true);
			}
		});
		btnCapricorn.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/capricorn.jpg"));
		contentPane.add(btnCapricorn);
		
		JButton btnAquarius = new JButton("");
		btnAquarius.setBounds(480, 418, 140, 170);
		btnAquarius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZAquarius z11 = new ZZAquarius();
				z11.setVisible(true);
			}
		});
		btnAquarius.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/aquarius.jpg"));
		contentPane.add(btnAquarius);
		
		JButton btnPisces = new JButton("");
		btnPisces.setBounds(680, 418, 140, 170);
		btnPisces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZZPisces z12 = new ZZPisces();
				z12.setVisible(true);
			}
		});
		btnPisces.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/pisces.jpg"));
		contentPane.add(btnPisces);
		
		JButton btnBackHome = new JButton("Go To Homepage");
		btnBackHome.setBounds(350, 612, 200, 40);
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
		ZodiacSigns frame = new ZodiacSigns();
		frame.setVisible(true);
	}
}
