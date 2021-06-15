import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class HalamanKalkulus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HalamanKalkulus frame = new HalamanKalkulus();
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
	public HalamanKalkulus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DAFTAR ISI");
		lblNewLabel.setFont(new Font("Avocados", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(349, 21, 190, 89);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Sistim Bilangan, Pertidaksamaan Dan Sistem Koordinat Orthogonal");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kalkulus1 materia = new Kalkulus1();
				materia.setVisible(true);
			}
		});
		lblNewLabel_1.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(64, 120, 635, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. Fungsi dan Grafik");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kalkulus2 materib = new Kalkulus2();
				materib.setVisible(true);
			}
		});
		lblNewLabel_1_1.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(64, 167, 635, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3. Turunan dan Diferensial");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kalkulus3 materic = new Kalkulus3();
				materic.setVisible(true);
			}
			
		});
		lblNewLabel_1_2.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(64, 214, 635, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("4. Integral");
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kalkulus4 materid = new Kalkulus4();
				materid.setVisible(true);
			}
		});
		lblNewLabel_1_2_1.setFont(new Font("Pink Chicken", Font.PLAIN, 21));
		lblNewLabel_1_2_1.setBounds(64, 261, 635, 37);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				catatan kembalii = new catatan();
				kembalii.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		lblNewLabel_2.setBounds(816, 428, 45, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(816, 483, 45, 13);
		contentPane.add(lblNewLabel_3);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
