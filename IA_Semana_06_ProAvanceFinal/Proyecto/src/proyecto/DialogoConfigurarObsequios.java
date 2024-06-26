package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DialogoConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblObsequio1;
	private JLabel lblObsequio2;
	private JLabel lblObsequio3;
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObsequios dialog = new DialogoConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarObsequios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures/regalo.png"));
		setModal(true);
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 135);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblObsequio1 = new JLabel("1 Unidad");
		lblObsequio1.setBounds(10, 11, 110, 14);
		contentPanel.add(lblObsequio1);

		lblObsequio2 = new JLabel("2 a 5 Unidades");
		lblObsequio2.setBounds(10, 36, 110, 14);
		contentPanel.add(lblObsequio2);

		lblObsequio3 = new JLabel("6 a M\u00E1s Unidades");
		lblObsequio3.setBounds(10, 61, 110, 14);
		contentPanel.add(lblObsequio3);

		txtObsequio1 = new JTextField();
		txtObsequio1.setText(Menu.obsequio1);
		txtObsequio1.setBounds(130, 8, 86, 20);
		contentPanel.add(txtObsequio1);
		txtObsequio1.setColumns(10);

		txtObsequio2 = new JTextField();
		txtObsequio2.setText(Menu.obsequio2);
		txtObsequio2.setBounds(130, 33, 86, 20);
		contentPanel.add(txtObsequio2);
		txtObsequio2.setColumns(10);

		txtObsequio3 = new JTextField();
		txtObsequio3.setText(Menu.obsequio3);
		txtObsequio3.setBounds(130, 58, 86, 20);
		contentPanel.add(txtObsequio3);
		txtObsequio3.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 32, 89, 23);
		contentPanel.add(btnCancelar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("pictures/fondo2.jpg"));
		lblNewLabel.setBounds(0, 0, 436, 98);
		contentPanel.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

//===============================================================================
	void mostrarObsequios() {

		Menu.obsequio1 = txtObsequio1.getText();
		Menu.obsequio2 = txtObsequio2.getText();
		Menu.obsequio3 = txtObsequio3.getText();

	}

	void mensajeConfirmacion() {
		int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro de Realizar este Cambio?", "Confirmar",
				JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			mostrarObsequios();
			dispose();
			JOptionPane.showMessageDialog(null, "El Cambio se Realizo con Exito", "Confirmacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {

		mensajeConfirmacion();

	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {

		dispose();
	}
}
