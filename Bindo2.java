import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bindo2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bindo2 frame = new Bindo2();
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
	public Bindo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menurut Gorys Keraf bahasa diartikan sebagai alat komunikasi antara anggota masyarakat");
		lblNewLabel.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 51, 859, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblBerupaSimbolBunyi = new JLabel("berupa simbol bunyi yang dihasilkan oleh alat ucap manusia.");
		lblBerupaSimbolBunyi.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblBerupaSimbolBunyi.setBounds(20, 92, 859, 31);
		contentPane.add(lblBerupaSimbolBunyi);
		
		JLabel lblHakikatBahasa = new JLabel("HAKIKAT BAHASA");
		lblHakikatBahasa.setFont(new Font("Pink Chicken", Font.BOLD, 20));
		lblHakikatBahasa.setBounds(20, 10, 859, 31);
		contentPane.add(lblHakikatBahasa);
		
		JLabel lblBahasaIndonesia = new JLabel("1. Bahasa Indonesia berasal dari bahasa Melayu. ");
		lblBahasaIndonesia.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblBahasaIndonesia.setBounds(20, 174, 859, 31);
		contentPane.add(lblBahasaIndonesia);
		
		JLabel lblBahasaIndonesiaDinyatakan = new JLabel("2. Bahasa Indonesia dinyatakan lahir pada tanggal 28 Oktober 1928 (sumpah pemuda).");
		lblBahasaIndonesiaDinyatakan.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblBahasaIndonesiaDinyatakan.setBounds(20, 215, 859, 31);
		contentPane.add(lblBahasaIndonesiaDinyatakan);
		
		JLabel lblSejarahBahasaIndonesia = new JLabel("SEJARAH BAHASA INDONESIA");
		lblSejarahBahasaIndonesia.setFont(new Font("Pink Chicken", Font.BOLD, 20));
		lblSejarahBahasaIndonesia.setBounds(20, 133, 859, 31);
		contentPane.add(lblSejarahBahasaIndonesia);
		
		JLabel lblKeputusanKongres = new JLabel("3. Keputusan Kongres Bahasa Indonesia II tahun 1945 menyatakan bahasa Indonesia berasal ");
		lblKeputusanKongres.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblKeputusanKongres.setBounds(20, 256, 859, 31);
		contentPane.add(lblKeputusanKongres);
		
		JLabel lblDariBahasaMelayu = new JLabel("dari bahasa melayu.\r\n");
		lblDariBahasaMelayu.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblDariBahasaMelayu.setBounds(20, 297, 859, 31);
		contentPane.add(lblDariBahasaMelayu);
		
		JLabel lblBahasaMelayu = new JLabel("4. Bahasa Melayu sebagai bahasa perhubungan (lingua franca).");
		lblBahasaMelayu.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblBahasaMelayu.setBounds(20, 338, 859, 31);
		contentPane.add(lblBahasaMelayu);
		
		JLabel lblBahasaIndoensia = new JLabel("5. Bahasa Indoensia dinyatakan kedudukannya sebagai bahasa negara pada tanggal ");
		lblBahasaIndoensia.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblBahasaIndoensia.setBounds(20, 379, 859, 31);
		contentPane.add(lblBahasaIndoensia);
		
		JLabel lblAgustus = new JLabel("18 Agustus 1945 (dalam Undang-Undang Dasar 1945, Pasal 36). ");
		lblAgustus.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblAgustus.setBounds(20, 420, 859, 31);
		contentPane.add(lblAgustus);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanBindo kembalib = new HalamanBindo();
				kembalib.setVisible(true);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_1.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("back");
		lblNewLabel_2.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_2);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
