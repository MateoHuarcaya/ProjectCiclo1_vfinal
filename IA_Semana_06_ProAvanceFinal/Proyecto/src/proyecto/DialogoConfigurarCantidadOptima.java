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

public class DialogoConfigurarCantidadOptima extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadOptima;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarCantidadOptima dialog = new DialogoConfigurarCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarCantidadOptima() {
		setModal(true);
		setTitle("Configurar Cantidad Optima");
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadOptima = new JLabel("Cantidad Optima de Unidades Vendidas");
			lblCantidadOptima.setBounds(10, 24, 239, 14);
			contentPanel.add(lblCantidadOptima);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.setText(String.valueOf(Menu.cantidadOptima));
			txtCantidadOptima.setBounds(259, 21, 50, 20);
			contentPanel.add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 20, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 49, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
//======================================================================
	void mensajeConfirmacion() {
		int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro de Realizar este Cambio?", "Confirmar",
				JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			Menu.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
			dispose();
			JOptionPane.showMessageDialog(null, "El Cambio se Realizo con Exito", "Confirmacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {

		dispose();
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {

		
		mensajeConfirmacion();

	}
}
