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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Kalkulus1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulus1 frame = new Kalkulus1();
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
	public Kalkulus1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PENGERTIAN BILANGAN");
		lblNewLabel.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblNewLabel.setBounds(20, 21, 290, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan adalah suatu idea, sifatnya abstrak. Bilangan bukan simbol/lambang dan bukan");
		lblNewLabel_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(20, 55, 859, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("pula lambang bilangan.");
		lblNewLabel_1_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(20, 96, 859, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Suatu bilangan yang berbentuk suatu bilangan yang desimalnya berakhir atau");
		lblNewLabel_1_1_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1_1.setBounds(20, 171, 859, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("tidak berakhir, tetapi berulang.");
		lblNewLabel_1_1_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1_2.setBounds(20, 212, 859, 31);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("pula lambang bilangan.");
		lblNewLabel_1_1_3.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1_3.setBounds(20, 246, 859, 31);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblBilanganRasional = new JLabel("Bilangan Rasional");
		lblBilanganRasional.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblBilanganRasional.setBounds(20, 137, 290, 24);
		contentPane.add(lblBilanganRasional);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Suatu bilangan yang desimalnya tidak berakhir dan tidak berulang.");
		lblNewLabel_1_1_3_1.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1_3_1.setBounds(20, 321, 859, 31);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Kalimat matematika terbuka yang menggunakan tanda ketidaksamaan dan");
		lblNewLabel_1_1_3_2.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1_3_2.setBounds(20, 410, 859, 31);
		contentPane.add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_3_3 = new JLabel("mengandung variabel.");
		lblNewLabel_1_1_3_3.setFont(new Font("Mithella", Font.PLAIN, 21));
		lblNewLabel_1_1_3_3.setBounds(20, 451, 859, 31);
		contentPane.add(lblNewLabel_1_1_3_3);
		
		JLabel lblBilanganIrasional = new JLabel("Bilangan Irasional");
		lblBilanganIrasional.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblBilanganIrasional.setBounds(20, 287, 290, 24);
		contentPane.add(lblBilanganIrasional);
		
		JLabel lblPertidaksamaan = new JLabel("PERTIDAKSAMAAN");
		lblPertidaksamaan.setFont(new Font("Pink Chicken", Font.BOLD, 21));
		lblPertidaksamaan.setBounds(20, 362, 290, 24);
		contentPane.add(lblPertidaksamaan);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanKalkulus kembali1 = new HalamanKalkulus();
				kembali1.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_2.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("back");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(816, 483, 45, 13);
		contentPane.add(lblNewLabel_3);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
