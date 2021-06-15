import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private static JTextField username;
	private static JTextField nim;
	ArrayList<muncul> muncullist = new ArrayList<muncul>();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setFont(new Font("Avocados", Font.PLAIN, 12));
		setBackground(Color.LIGHT_GRAY);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(153, 180, 209), 6));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel Judul = new JLabel("S Y C O M A S   N O T E S");
		Judul.setBounds(242, 49, 360, 87);
		Judul.setHorizontalAlignment(SwingConstants.CENTER);
		Judul.setBackground(Color.WHITE);
		Judul.setFont(new Font("Bakso Sapi", Font.PLAIN, 32));
		
		JLabel nama = new JLabel("NAMA");
		nama.setBounds(185, 180, 125, 47);
		nama.setFont(new Font("Mithella", Font.PLAIN, 16));
		
		username = new JTextField();
		username.setBounds(314, 190, 305, 29);
		username.setColumns(10);
		
		nim = new JTextField();
		nim.setBounds(314, 237, 305, 29);
		nim.setColumns(10);
		
		JLabel lblNim = new JLabel("NIM");
		lblNim.setBounds(185, 228, 125, 47);
		lblNim.setFont(new Font("Mithella", Font.PLAIN, 16));
		
		JButton tombolLogin = new JButton("LOGIN");
		tombolLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namaa = username.getText();
				String nimm = nim.getText();
				if(namaa.equals("") && nimm.equals("")) {
					catatan login1 = new catatan();
					login1.setVisible(false);
					JOptionPane.showMessageDialog(null, "Maaf, silahkan isi data terlebih dahulu", "SYCOMAS NOTES", JOptionPane.INFORMATION_MESSAGE);
				}
				
				else {
					catatan login1 = new catatan();
					login1.setVisible(true);
				}
				
				}	
			
	});
		tombolLogin.addMouseListener(new MouseAdapter() {
			
			
		});
		tombolLogin.setBounds(356, 322, 161, 47);
		tombolLogin.setFont(new Font("Baby Pumpkin", Font.BOLD, 14));
		panel.setLayout(null);
		panel.add(nama);
		panel.add(username);
		panel.add(lblNim);
		panel.add(nim);
		panel.add(Judul);
		panel.add(tombolLogin);
		
		JLabel ikonJudulKiri = new JLabel("");
		ikonJudulKiri.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\mortarboard (2).png"));
		ikonJudulKiri.setBounds(174, 49, 60, 81);
		panel.add(ikonJudulKiri);
		
		JLabel ikonJudulKanan = new JLabel("");
		ikonJudulKanan.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\mortarboard (2).png"));
		ikonJudulKanan.setBounds(612, 49, 77, 81);
		panel.add(ikonJudulKanan);
		
		JLabel lblNewLabel_1 = new JLabel("-------------------------------------------------------------------\r\n\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(253, 122, 338, 13);
		panel.add(lblNewLabel_1);
		
		JLabel keluar = new JLabel("X");
		keluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keluar.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				keluar.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar dari SYCOMAS NOTES?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == 0) {
					FrameLogin.this.dispose();
				};
			}
			
		});
		keluar.setForeground(Color.BLACK);
		keluar.setHorizontalAlignment(SwingConstants.CENTER);
		keluar.setFont(new Font("Tahoma", Font.BOLD, 18));
		keluar.setBounds(833, 0, 34, 36);
		panel.add(keluar);
		
		JTextArea initeksarea = new JTextArea();
		initeksarea.setBounds(550, 304, 295, 65);
		panel.add(initeksarea);
		
		JButton munculdata = new JButton("LIHAT DATA");
		munculdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namaMhs = username.getText();
				String nimMhs = nim.getText();
				muncullist.add(new muncul(namaMhs, nimMhs));
				for (int i=0; i<muncullist.size(); i++){
					initeksarea.setText("\n NAMA   :  "+muncullist.get(i).username+ "\n NIM       :  " +muncullist.get(i).nim);
			}
		        	
		 	
			}
		});
		munculdata.setBounds(673, 265, 131, 21);
		panel.add(munculdata);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
