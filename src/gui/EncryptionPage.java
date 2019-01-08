package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class EncryptionPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncryptionPage frame = new EncryptionPage();
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
	public EncryptionPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 31, 431, 35);
		panel.setBackground(new Color(250, 128, 114));
		contentPane.add(panel);
		
		JLabel lblSelectYourFile = new JLabel("Select your file type");
		lblSelectYourFile.setForeground(new Color(240, 230, 140));
		lblSelectYourFile.setFont(new Font("Sylfaen", Font.BOLD, 20));
		panel.add(lblSelectYourFile);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(255, 255, 0));
		btnSubmit.setFont(new Font("Sylfaen", Font.BOLD, 20));
		btnSubmit.setBackground(new Color(0, 128, 0));
		btnSubmit.setBounds(29, 302, 431, 35);
		contentPane.add(btnSubmit);
		
		JButton btnBackToHome = new JButton("Back to home");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main home = new Main();
				home.setVisible(true);
			}
		});
		btnBackToHome.setForeground(new Color(255, 215, 0));
		btnBackToHome.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnBackToHome.setBackground(new Color(0, 0, 205));
		btnBackToHome.setBounds(280, 348, 180, 40);
		contentPane.add(btnBackToHome);
		
		textField = new JTextField();
		textField.setBounds(29, 131, 298, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				textField.setText(filename);
			}
		});
		btnOpen.setForeground(new Color(255, 215, 0));
		btnOpen.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnOpen.setBackground(new Color(72, 61, 139));
		btnOpen.setBounds(337, 131, 123, 35);
		contentPane.add(btnOpen);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 128, 114));
		panel_1.setBounds(29, 189, 431, 35);
		contentPane.add(panel_1);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password here");
		lblEnterYourPassword.setForeground(new Color(255, 255, 0));
		lblEnterYourPassword.setFont(new Font("Sylfaen", Font.BOLD, 20));
		panel_1.add(lblEnterYourPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(29, 246, 298, 37);
		contentPane.add(passwordField);
		passwordField.setEchoChar('*');
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setEchoChar((char) 0);
			}
		});
		btnShow.setForeground(new Color(255, 255, 0));
		btnShow.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnShow.setBackground(new Color(0, 0, 139));
		btnShow.setBounds(337, 246, 123, 37);
		contentPane.add(btnShow);
		
		JCheckBox chckbxDocuments = new JCheckBox("Documents");
		chckbxDocuments.setForeground(Color.RED);
		chckbxDocuments.setFont(new Font("Sylfaen", Font.BOLD, 14));
		chckbxDocuments.setBackground(Color.YELLOW);
		chckbxDocuments.setBounds(29, 87, 105, 23);
		contentPane.add(chckbxDocuments);
		
		JCheckBox chckbxImages = new JCheckBox("Images");
		chckbxImages.setForeground(Color.RED);
		chckbxImages.setFont(new Font("Sylfaen", Font.BOLD, 14));
		chckbxImages.setBackground(Color.YELLOW);
		chckbxImages.setBounds(143, 87, 105, 23);
		contentPane.add(chckbxImages);
		
		JCheckBox chckbxVideos = new JCheckBox("Videos");
		chckbxVideos.setForeground(Color.RED);
		chckbxVideos.setBackground(Color.YELLOW);
		chckbxVideos.setFont(new Font("Sylfaen", Font.BOLD, 14));
		chckbxVideos.setBounds(258, 87, 97, 23);
		contentPane.add(chckbxVideos);
		
		JCheckBox chckbxArchive = new JCheckBox("Archive");
		chckbxArchive.setForeground(Color.RED);
		chckbxArchive.setBackground(Color.YELLOW);
		chckbxArchive.setFont(new Font("Sylfaen", Font.BOLD, 14));
		chckbxArchive.setBounds(363, 87, 97, 23);
		contentPane.add(chckbxArchive);
	}
}
