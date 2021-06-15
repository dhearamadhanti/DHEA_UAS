import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bindo3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bindo3 frame = new Bindo3();
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
	public Bindo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ulasan buku, proposal, laporan, dan laporan ilmiah merupakan contoh dari teks akademik");
		lblNewLabel.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 21, 859, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("genre makro.");
		lblNewLabel_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 62, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Ulasan buku/timbangan buku merupakan tulisan yang berisi tentang kritik terhadap");
		lblNewLabel_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 103, 859, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("buku yang dimaksud.");
		lblNewLabel_3.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(20, 144, 859, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("- Proposal merupakan tulisan yang berisi rancangan penelitian atau kegiatan.");
		lblNewLabel_3_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(20, 185, 859, 31);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Proposal dapat berupa proposal penelitian atau kegiatan.");
		lblNewLabel_3_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(20, 226, 859, 31);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("- Laporan dapat dikelompokkan menjadi laporan penelitian dan laporan kegiatan.");
		lblNewLabel_3_3.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(20, 267, 859, 31);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("- Artikel dapat dibagi menjadi artikel penelitian dan artikel konseptual.");
		lblNewLabel_3_3_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_3_1.setBounds(20, 308, 859, 31);
		contentPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Artikel konseptual merupakan artikel sebagai hasil pemikiran mengenai sesuatu ");
		lblNewLabel_3_3_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_3_2.setBounds(20, 349, 859, 31);
		contentPane.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("secara konseptual.");
		lblNewLabel_3_3_3.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_3_3.setBounds(20, 390, 859, 31);
		contentPane.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanBindo kembalic = new HalamanBindo();
				kembalic.setVisible(true);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_4.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("back");
		lblNewLabel_5.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_5);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		
		
		
	}

}
