package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(56, 36, 390, 37);
		contentPane.add(panel);
		
		JLabel lblWelcomeToOur = new JLabel("Welcome to our software");
		lblWelcomeToOur.setForeground(new Color(255, 0, 0));
		lblWelcomeToOur.setFont(new Font("Sylfaen", Font.BOLD, 20));
		panel.add(lblWelcomeToOur);
		
		JButton btnEncryption = new JButton("Encryption");
		btnEncryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncryptionPage encpage = new EncryptionPage();
				encpage.setVisible(true);
			}
		});
		btnEncryption.setForeground(new Color(255, 255, 0));
		btnEncryption.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnEncryption.setBackground(new Color(255, 69, 0));
		btnEncryption.setBounds(128, 109, 235, 60);
		contentPane.add(btnEncryption);
		
		JButton btnDecryption = new JButton("Decryption");
		btnDecryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecryptionPage decpage = new DecryptionPage();
				decpage.setVisible(true);
			}
		});
		btnDecryption.setForeground(new Color(0, 0, 255));
		btnDecryption.setBackground(new Color(123, 104, 238));
		btnDecryption.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnDecryption.setBounds(128, 211, 235, 60);
		contentPane.add(btnDecryption);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
				
			}
		});
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 255, 0));
		btnExit.setBounds(128, 313, 235, 60);
		contentPane.add(btnExit);
		
		
		
	}
}
