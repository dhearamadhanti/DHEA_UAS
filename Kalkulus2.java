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

public class Kalkulus2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulus2 frame = new Kalkulus2();
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
	public Kalkulus2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 120, 215), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEFINISI FUNGSI DAN  GRAFIK\r\n");
		lblNewLabel.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblNewLabel.setBounds(20, 21, 290, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Suatu fungsi f adalah suatu aturan/padanan yang menghubungkan tiap unsur dari suatu");
		lblNewLabel_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(20, 55, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("himpunan (Daerah Asal) dengan sebuah unsur tunggal dari himpunan kedua (Daerah Hasil).");
		lblNewLabel_1_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(20, 96, 859, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Secara garis besar, berdasarkan atas macamnya pekerjaan yang harus dilakukan dengan x");
		lblNewLabel_1_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(20, 171, 859, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("untuk menghitung/mencari nilai y, maka fungsi dapat dibagi menjadi 2 golongan/jenis.");
		lblNewLabel_1_3.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3.setBounds(20, 212, 859, 31);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblJenisFungsi = new JLabel("Jenis Fungsi");
		lblJenisFungsi.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblJenisFungsi.setBounds(20, 137, 290, 24);
		contentPane.add(lblJenisFungsi);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("1. Fungsi Aljabar");
		lblNewLabel_1_3_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_1.setBounds(20, 253, 859, 31);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("menggunakan sejumlah suku terbatas, yang hanya melibatkan penambahan operasi aljabar");
		lblNewLabel_1_3_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2.setBounds(20, 294, 859, 31);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("pengurangan, perkalian, pembagian, dan peningkatan menjadi pangkat pecahan. ");
		lblNewLabel_1_3_2_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_1.setBounds(20, 335, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("2. Fungsi Transcendent");
		lblNewLabel_1_3_2_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_2.setBounds(20, 376, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_2);
		
		JLabel lblNewLabel_1_3_2_3 = new JLabel("Suatu fungsi yang bukan merupakan fungsi Aljabar.");
		lblNewLabel_1_3_2_3.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_3.setBounds(20, 417, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanKalkulus kembali2 = new HalamanKalkulus();
				kembali2.setVisible(true);
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
