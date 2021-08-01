import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZZLeo extends JFrame {

	private JPanel contentPane;
	public static JTextArea taLeo;
	public static ZZLeoAdmin zzz5 = new ZZLeoAdmin();

	public ZZLeo() {
		setTitle("LEO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("LEO :");
		lbl1.setBounds(37, 17, 367, 50);
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(150, 90, 199, 200);
		lbl2.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/leo_lion.png"));
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("The LION");
		lbl3.setBounds(170, 294, 150, 30);
		lbl3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Your Horoscope:");
		lbl4.setBounds(37, 365, 159, 25);
		lbl4.setForeground(Color.DARK_GRAY);
		lbl4.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Element :  FIRE");
		lbl5.setBounds(483, 90, 350, 30);
		lbl5.setForeground(Color.DARK_GRAY);
		lbl5.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("Color :  GOLD, YELLOW");
		lbl6.setBounds(483, 121, 350, 30);
		lbl6.setForeground(Color.DARK_GRAY);
		lbl6.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("Day :  SUNDAY");
		lbl7.setBounds(483, 152, 350, 30);
		lbl7.setForeground(Color.DARK_GRAY);
		lbl7.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("Ruler :  SUN");
		lbl8.setBounds(483, 184, 350, 30);
		lbl8.setForeground(Color.DARK_GRAY);
		lbl8.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("Lucky Numbers :  1, 3, 10, 19");
		lbl9.setBounds(483, 214, 350, 30);
		lbl9.setForeground(Color.DARK_GRAY);
		lbl9.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl9);
		
		JLabel lbl10 = new JLabel("Compatibility :  AQUARIUS");
		lbl10.setBounds(483, 245, 350, 30);
		lbl10.setForeground(Color.DARK_GRAY);
		lbl10.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl10);
		
		JLabel lbl11 = new JLabel("Quality :  FIXED");
		lbl11.setBounds(483, 276, 350, 30);
		lbl11.setForeground(Color.DARK_GRAY);
		lbl11.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl11);
		
		JLabel lbl12 = new JLabel("DATES :  JULY 23 - AUG 22");
		lbl12.setBounds(483, 307, 350, 30);
		lbl12.setForeground(Color.DARK_GRAY);
		lbl12.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		contentPane.add(lbl12);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(375, 608, 150, 50);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZodiacSigns zs = new ZodiacSigns();
				zs.setVisible(true);
			}
		});
		btnGoBack.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPane.add(btnGoBack);
		
		taLeo = new JTextArea();
		taLeo.setBounds(80, 400, 740, 190);
		taLeo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(taLeo);
		taLeo.setEditable(false);
		String srLeo = zzz5.taLeoAdmin.getText();
		taLeo.setText(srLeo);
		
		
		JLabel lblBackImg = new JLabel("");
		lblBackImg.setBounds(0, 0, 900, 678);
		lblBackImg.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblBackImg.setForeground(Color.BLACK);
		lblBackImg.setIcon(new ImageIcon("/Users/siddharth_agarwal/Desktop/java_eclipse/Horoscope_GUI/src/back1.jpg"));
		contentPane.add(lblBackImg);
	}
	
	public static void main(String[] args) {
		ZZLeo frame = new ZZLeo();
		frame.setVisible(true);
	}
}
