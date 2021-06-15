import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class HalamanBindo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HalamanBindo frame = new HalamanBindo();
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
	public HalamanBindo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.activeCaption, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				catatan siskom1 = new catatan();
				siskom1.setVisible(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("back");
		lblNewLabel_1.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DAFTAR ISI");
		lblNewLabel_2.setFont(new Font("Avocados", Font.PLAIN, 26));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(349, 21, 190, 89);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1. Kedudukan dan Fungsi Bahasa Indonesia");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bindo1 materi = new Bindo1();
				materi.setVisible(true);
			}
		});
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(64, 120, 342, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("2. Hakikat Bahasa dan Sejarah Singkat Bahasa Indonesia");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bindo2 materi2 = new Bindo2();
				materi2.setVisible(true);
			}
		});
		lblNewLabel_3_1.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_3_1.setBackground(SystemColor.menu);
		lblNewLabel_3_1.setBounds(64, 167, 475, 37);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("3. Membangun Teks Akademik");
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bindo3 materi3 = new Bindo3();
				materi3.setVisible(true);
			}
		});
		lblNewLabel_3_1_1.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_3_1_1.setBackground(SystemColor.menu);
		lblNewLabel_3_1_1.setBounds(64, 214, 241, 37);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("4. Menjelajahi Dunia Pustaka");
		lblNewLabel_3_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bindo4 materi4 = new Bindo4();
				materi4.setVisible(true);
			}
		});
		lblNewLabel_3_1_1_1.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_3_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_3_1_1_1.setBounds(64, 261, 241, 37);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("5. Artikel Ilmiah");
		lblNewLabel_3_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bindo5 materi5 = new Bindo5();
				materi5.setVisible(true);
			}
		});
		lblNewLabel_3_1_1_2.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_3_1_1_2.setBackground(SystemColor.menu);
		lblNewLabel_3_1_1_2.setBounds(64, 308, 241, 37);
		contentPane.add(lblNewLabel_3_1_1_2);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
