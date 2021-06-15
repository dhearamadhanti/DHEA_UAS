import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bindo4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bindo4 frame = new Bindo4();
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
	public Bindo4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanBindo kembalid = new HalamanBindo();
				kembalid.setVisible(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_11 = new JLabel("back");
		lblNewLabel_11.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1 = new JLabel("PENGERTIAN");
		lblNewLabel_1.setFont(new Font("Pink Chicken", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 10, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Daftar pustaka adalah sebuah tulisan referensi atau sumber dalam penulisan sebuah");
		lblNewLabel_1_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(20, 51, 859, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("karya tulis ilmiah baru, biasanya daftar pustaka ini terletak di akhir sebuah karya tulis ilmiah.");
		lblNewLabel_1_1_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(20, 92, 859, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("-> Menurut KBBI daftar pustaka adalah daftar yang mencantumkan judul buku, nama");
		lblNewLabel_1_1_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(20, 133, 859, 31);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("pengarang, penerbit, dan sebagainya yang ditempatkan pada bagian akhir suatu karangan");
		lblNewLabel_1_1_3.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(20, 174, 859, 31);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("atau buku, dan disusun menurut abjad.");
		lblNewLabel_1_1_4.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_4.setBounds(20, 215, 859, 31);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("PERAN PENTING DAFTAR PUSTAKA");
		lblNewLabel_1_2.setFont(new Font("Pink Chicken", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(20, 256, 859, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("1. Menjadikan sebuah karya tulis menjadi valid sebab disusun berdasarkan referensi yang ada.");
		lblNewLabel_1_1_5.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_5.setBounds(20, 297, 859, 31);
		contentPane.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("2. sebagai bentuk apresiasi penulis atas penggunaan ide dan gagasan karya orang lain.");
		lblNewLabel_1_1_6.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_6.setBounds(20, 338, 859, 31);
		contentPane.add(lblNewLabel_1_1_6);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("3. Untuk menghindari tuduhan plagiat pada suatu karya tulis.");
		lblNewLabel_1_1_7.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_7.setBounds(20, 379, 859, 31);
		contentPane.add(lblNewLabel_1_1_7);
		
		JLabel lblNewLabel_1_1_8 = new JLabel("4. Sebagai pemenuhan syarat yang utama dalam penyusunan karya tulis.");
		lblNewLabel_1_1_8.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1_1_8.setBounds(20, 420, 859, 31);
		contentPane.add(lblNewLabel_1_1_8);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		
	}
}
