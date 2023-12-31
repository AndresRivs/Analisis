import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADA extends JFrame {

	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private JButton btnPerimetro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADA frame = new ADA();
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
	public ADA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(55, 50, 45, 13);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(55, 88, 45, 13);
		contentPane.add(lblAltura);
		
		textBase = new JTextField();
		textBase.setBounds(135, 47, 96, 19);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setColumns(10);
		textAltura.setBounds(135, 85, 96, 19);
		contentPane.add(textAltura);
		
		JButton btnCuadrado = new JButton("Area cuadrado");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int base = Integer.parseInt(textBase.getText());
				int altura = Integer.parseInt(textAltura.getText());
				int area = base*altura;
				JOptionPane.showMessageDialog(btnCuadrado,"el área del cuadrado es de "+area);
			}
		});
		btnCuadrado.setBounds(15, 135, 121, 21);
		contentPane.add(btnCuadrado);
		
		btnPerimetro = new JButton("Perimetro ");
		btnPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int base = Integer.parseInt(textBase.getText());
				int altura = Integer.parseInt(textAltura.getText());
				int perimetro = (base+altura)*2;
				JOptionPane.showMessageDialog(btnCuadrado, perimetro);
			}
		});
		btnPerimetro.setBounds(180, 135, 110, 21);
		contentPane.add(btnPerimetro);
	}
}
