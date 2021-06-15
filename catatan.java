import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class catatan extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					catatan frame = new catatan();
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
	public catatan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.activeCaption, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bahasa Indonesia\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(49, 212, 178, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("S E M E S T E R  1");
		lblNewLabel_2.setFont(new Font("Almond Nougat", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(308, 25, 246, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel bindo = new JLabel("");
		bindo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanBindo bukuA = new HalamanBindo();
				bukuA.setVisible(true);
			}
		});
		
		bindo.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\BINDO.png"));
		bindo.setBounds(75, 85, 127, 127);
		contentPane.add(bindo);
		
		JLabel bing = new JLabel("");
		bing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Maaf, belum tersedia materi tertulis", "SYCOMAS NOTES", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		bing.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\BAHASA INGGRIS 1.png"));
		bing.setBounds(272, 85, 127, 127);
		contentPane.add(bing);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bahasa Inggris\r\n");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(250, 212, 178, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel kalkulus = new JLabel("");
		kalkulus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HalamanKalkulus bukuC = new HalamanKalkulus();
				bukuC.setVisible(true);
			}
		});
		kalkulus.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\KALKULUS.png"));
		kalkulus.setBounds(473, 85, 127, 127);
		contentPane.add(kalkulus);
		
		JLabel lblNewLabel_1_2 = new JLabel("Kalkulus");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(449, 212, 178, 32);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel fisdas = new JLabel("");
		fisdas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Maaf, materi belum tersedia", "SYCOMAS NOTES", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		fisdas.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\FISIKA DASAR 1.png"));
		fisdas.setBounds(678, 85, 127, 127);
		contentPane.add(fisdas);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fisika Dasar 1\r\n");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(654, 212, 178, 32);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel pti = new JLabel("");
		pti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Maaf, materi belum tersedia", "SYCOMAS NOTES", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
	
		pti.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\PTI.png"));
		pti.setBounds(75, 282, 127, 127);
		contentPane.add(pti);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("PTI");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1_4_1.setBounds(36, 419, 202, 32);
		contentPane.add(lblNewLabel_1_4_1);
		
		JLabel tombolBack1 = new JLabel("");
		tombolBack1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameLogin kembali = new FrameLogin();
				kembali.setVisible(true);
			}
		});
		tombolBack1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\back (2).png"));
		tombolBack1.setBounds(816, 428, 45, 45);
		contentPane.add(tombolBack1);
		
		JLabel lblNewLabel_9 = new JLabel("back");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("BabyDoll", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(809, 471, 60, 32);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Maaf, materi belum tersedia", "SYCOMAS NOTES", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\MATDIS.png"));
		lblNewLabel.setBounds(473, 282, 127, 127);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Dasar Pemrograman");
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1_4_2.setBounds(250, 419, 202, 32);
		contentPane.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Silakan membuka e-learning untuk mengakses materi", "SYCOMAS NOTES", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\DASPRO.png"));
		lblNewLabel_3.setBounds(272, 282, 127, 127);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Matematika Diskrit");
		lblNewLabel_1_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2_1.setFont(new Font("Forte", Font.PLAIN, 18));
		lblNewLabel_1_4_2_1.setBounds(449, 419, 202, 32);
		contentPane.add(lblNewLabel_1_4_2_1);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
