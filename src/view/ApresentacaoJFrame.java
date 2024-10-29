package view;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ApresentacaoJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblBackground;
	private JButton btnVerShows;

	public ApresentacaoJFrame() {
		setTitle("Art Music");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Gui\\Documents\\Guilherme\\GitHub\\projeto-integrador-java-sql\\img\\ART Music logo.png"));
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// btnVerShows
		btnVerShows = new JButton();
		btnVerShows.setIcon(null);
		btnVerShows.setBounds(279, 525, 192, 46);
		btnVerShows.setContentAreaFilled(false);
		btnVerShows.setBorderPainted(false);
		btnVerShows.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnVerShows);
		btnVerShows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Main.frameLogin.setVisible(true);
					Main.frameLogin.setLocationRelativeTo(null);
					Main.frameApresentacao.setVisible(false);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		// lblBackground
		lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(
				"C:\\Users\\Gui\\Documents\\Guilherme\\GitHub\\projeto-integrador-java-sql\\img\\ART Music.png"));
		lblBackground.setBounds(0, 0, 484, 661);
		contentPane.add(lblBackground);
	}

	public void setVisible() {
		setVisible(true);
	}
}