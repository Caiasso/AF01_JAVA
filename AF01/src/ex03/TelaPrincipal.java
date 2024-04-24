package ex03;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("TELA DE LOGIN");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		URL caminho = TelaPrincipal.class.getResource("/figuras2/Login-icon.png");
		
		ImageIcon icone = new ImageIcon(caminho);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 13, 160, 136);
		Image iconeNovo = icone.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), 0);
		icone = new ImageIcon(iconeNovo);
		lblNewLabel.setIcon(icone);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(262, 26, 72, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(262, 82, 72, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(196, 51, 193, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 107, 193, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/figuras1/ok1.png")));
		btnNewButton.setBounds(196, 154, 94, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/figuras2/clean.png")));
		btnNewButton_1.setBounds(295, 154, 94, 23);
		panel_1.add(btnNewButton_1);
	}
}
