import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bindo5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bindo5 frame = new Bindo5();
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
	public Bindo5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PENGERTIAN");
		lblNewLabel.setFont(new Font("Pink Chicken", Font.BOLD, 20));
		lblNewLabel.setBounds(20, 10, 859, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Artikel Ilmiah merupakan karya tulis yang dirancang untuk dimuat dalam jurnal ilmiah");
		lblNewLabel_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 51, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("atau buku kumpulan artikel ilmiah yang ditulis dengan tata cara ilmiah dan mengikuti");
		lblNewLabel_1_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(20, 92, 859, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("pedoman atau konvensi ilmiah");
		lblNewLabel_1_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(20, 133, 859, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblJenisArtikelIlmiah = new JLabel("JENIS ARTIKEL ILMIAH");
		lblJenisArtikelIlmiah.setFont(new Font("Pink Chicken", Font.BOLD, 20));
		lblJenisArtikelIlmiah.setBounds(20, 174, 859, 31);
		contentPane.add(lblJenisArtikelIlmiah);
		
		JLabel lblNewLabel_1_3 = new JLabel("1. Artikel penelitian");
		lblNewLabel_1_3.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(20, 215, 859, 31);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Laporan penelitian yang disajikan dalam bentuk artikel.");
		lblNewLabel_1_3_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_3_1.setBounds(20, 256, 859, 31);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("2. Artikel non penelitian (konseptual)");
		lblNewLabel_1_3_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_3_2.setBounds(20, 297, 859, 31);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Artikel yang tidak didasarkan pada penelitian, dan biasanya merupakan ulasan konsep.");
		lblNewLabel_1_3_3.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_3_3.setBounds(20, 338, 859, 31);
		contentPane.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanBindo kembalie = new HalamanBindo();
				kembalie.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_2.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("back");
		lblNewLabel_3.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_3);
		setUndecorated(true);
		setLocationRelativeTo(null);
		

	}

}
