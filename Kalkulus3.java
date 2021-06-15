import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kalkulus3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulus3 frame = new Kalkulus3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kalkulus3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 120, 215), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("P E N D A H U L U A N");
		lblNewLabel.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblNewLabel.setBounds(20, 21, 290, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Turunan fungsi (diferensial) ialah fungsi lain dari suatu fungsi sebelumnya, misalnya fungsi");
		lblNewLabel_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(20, 171, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("f menjadi f\u2019 yang memiliki nilai tak beraturan. Turunan ( diferensial ) dipakai sebagai suatu");
		lblNewLabel_1_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(20, 212, 859, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("alat untuk menyelesaikan berbagai masalah dalam geometri dan mekanika.");
		lblNewLabel_1_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(20, 253, 859, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblJenisFungsi = new JLabel("Definisi");
		lblJenisFungsi.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblJenisFungsi.setBounds(20, 137, 290, 24);
		contentPane.add(lblJenisFungsi);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Turunan/differensial adalah laju sesaat perubahan fungsi f(x) pada interval x2 dan x1");
		lblNewLabel_1_3_2_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_2.setBounds(20, 55, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_2);
		
		JLabel lblNewLabel_1_3_2_3 = new JLabel("yang mendekati nol");
		lblNewLabel_1_3_2_3.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_3.setBounds(20, 96, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanKalkulus kembali3 = new HalamanKalkulus();
				kembali3.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_2.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("back");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(816, 483, 45, 13);
		contentPane.add(lblNewLabel_3);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
