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

public class Kalkulus4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulus4 frame = new Kalkulus4();
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
	public Kalkulus4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 120, 215), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("I N T E G R A L");
		lblNewLabel.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblNewLabel.setBounds(20, 21, 290, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Integral adalah suatu bentuk pada operasi matematika yang menjadi kebalikan atau biasa");
		lblNewLabel_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(20, 55, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("juga disebut sebagai invers dari operasi turunan. Serta limit dari jumlah maupun suatu");
		lblNewLabel_1_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(20, 96, 859, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("luas daerah tertentu.");
		lblNewLabel_1_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(20, 137, 859, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblJenisFungsi = new JLabel("1. Integral Tak Tentu");
		lblJenisFungsi.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblJenisFungsi.setBounds(20, 219, 290, 24);
		contentPane.add(lblJenisFungsi);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Integral dapat dibedakan atas :");
		lblNewLabel_1_3_2_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_2.setBounds(20, 178, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanKalkulus kembali4 = new HalamanKalkulus();
				kembali4.setVisible(true);
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
		
		JLabel lblIntegralTertentu = new JLabel("2. Integral Tertentu");
		lblIntegralTertentu.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblIntegralTertentu.setBounds(20, 294, 290, 24);
		contentPane.add(lblIntegralTertentu);
		
		JLabel lblNewLabel_1_3_2_2_1 = new JLabel("Integral sebagai invers atau kebalikan dari turunan atau yang biasa.");
		lblNewLabel_1_3_2_2_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_2_1.setBounds(20, 253, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_2_1);
		
		JLabel lblNewLabel_1_3_2_2_2 = new JLabel("Jumlah dari elemen-elemen/bagian-bagian (berupa luas, volume, panjang busur, dll)");
		lblNewLabel_1_3_2_2_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_2_2.setBounds(20, 325, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_2_2);
		
		JLabel lblNewLabel_1_3_2_2_3 = new JLabel("yang sangat kecil yang membentuk satu kesatuan.");
		lblNewLabel_1_3_2_2_3.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_3_2_2_3.setBounds(20, 367, 859, 31);
		contentPane.add(lblNewLabel_1_3_2_2_3);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
