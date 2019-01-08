package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class DecryptionPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecryptionPage frame = new DecryptionPage();
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
	public DecryptionPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 29, 431, 35);
		panel.setBackground(new Color(250, 128, 114));
		contentPane.add(panel);
		
		JLabel lblSelectYourFile = new JLabel("Select your file type");
		lblSelectYourFile.setForeground(new Color(240, 230, 140));
		lblSelectYourFile.setFont(new Font("Sylfaen", Font.BOLD, 20));
		panel.add(lblSelectYourFile);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(255, 255, 0));
		btnSubmit.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnSubmit.setBackground(new Color(0, 100, 0));
		btnSubmit.setBounds(29, 284, 431, 42);
		contentPane.add(btnSubmit);
		
		JButton btnBackToHome = new JButton("Back to home");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main home = new Main();
				home.setVisible(true);
			}
		});
		btnBackToHome.setForeground(new Color(255, 255, 0));
		btnBackToHome.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnBackToHome.setBackground(new Color(0, 0, 205));
		btnBackToHome.setBounds(299, 349, 161, 35);
		contentPane.add(btnBackToHome);
	}
}
