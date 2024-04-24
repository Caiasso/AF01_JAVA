package ex02;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setStroke(new BasicStroke(7));
		g2.setColor(Color.GRAY);
		g2.drawLine(10, 400, 490, 400);
		
		
		g2.setStroke(new BasicStroke(1));
		g2.setColor(Color.RED);
		g2.drawLine(20, 20, 50, 400);
		
		g2.setColor(Color.GREEN);
		g2.fillRect(70, 20, 100, 380);
		
		g2.setColor(Color.BLUE);
		g2.setFont(new Font("Libertation Serif", Font.BOLD, 350));
		g2.drawString("A", 200, 400);
		
	
	}

}
