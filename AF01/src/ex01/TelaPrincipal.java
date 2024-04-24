package ex01;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		
		g2.drawLine(100, 100, 200, 100);
		
		g2.drawLine(100, 100, 50, 150);
		
		g2.drawLine(50, 150, 100, 200);
		
		g2.drawLine(100, 200, 200, 200);
		
		g2.drawLine(200, 200, 250, 150);
		
		g2.drawLine(250, 150, 200, 100);
	}

}
