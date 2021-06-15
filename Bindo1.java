import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bindo1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bindo1 frame = new Bindo1();
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
	public Bindo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bahasa  adalah  sarana serta alat  komunikasi  antar anggota  masyarakat dalam");
		lblNewLabel.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 44, 859, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PENGERTIAN");
		lblNewLabel_1.setFont(new Font("Pink Chicken", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(22, 10, 144, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("menyampaikan ide maupun pemikiran, serta perasaan secara lisan atau tulis.");
		lblNewLabel_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 85, 859, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kedudukan bahasa Indonesia :\r\n");
		lblNewLabel_3.setFont(new Font("Mithella", Font.BOLD, 20));
		lblNewLabel_3.setBounds(20, 126, 859, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("1. Sebagai bahasa nasional (persatuan)");
		lblNewLabel_3_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(20, 167, 859, 31);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Sebagai bahasa nasional (persatuan), bahasa Indonesia mempunyai fungsi sebagai lambang ");
		lblNewLabel_3_1_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(20, 208, 859, 31);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("kebanggaan dan identitas nasional, serta alat pemersatu berbagai suku yang berbeda.");
		lblNewLabel_3_1_2.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblNewLabel_3_1_2.setBounds(20, 252, 859, 31);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblSebagaiBahasa = new JLabel("2. Sebagai bahasa negara (resmi)");
		lblSebagaiBahasa.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblSebagaiBahasa.setBounds(20, 334, 859, 31);
		contentPane.add(lblSebagaiBahasa);
		
		JLabel lblSebagaiBahasaNegara = new JLabel("Sebagai bahasa negara, bahasa Indonesia menjadi bahasa yang resmi yang digunakan");
		lblSebagaiBahasaNegara.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblSebagaiBahasaNegara.setBounds(20, 375, 859, 31);
		contentPane.add(lblSebagaiBahasaNegara);
		
		JLabel lblDiDalamPenyelenggaraan_1 = new JLabel("di dalam penyelenggaraan negara. ");
		lblDiDalamPenyelenggaraan_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblDiDalamPenyelenggaraan_1.setBounds(20, 416, 859, 31);
		contentPane.add(lblDiDalamPenyelenggaraan_1);
		
		JLabel lblDiDalamPenyelenggaraan_1_1 = new JLabel("latar belakang sosial, budaya, dan bahasanya.");
		lblDiDalamPenyelenggaraan_1_1.setFont(new Font("Mithella", Font.PLAIN, 20));
		lblDiDalamPenyelenggaraan_1_1.setBounds(20, 293, 859, 31);
		contentPane.add(lblDiDalamPenyelenggaraan_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanBindo kembalia = new HalamanBindo();
				kembalia.setVisible(true);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_4.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("back");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_5);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}

}
