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

public class DialogoConfigurarDescuentos extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarDescuentos dialog = new DialogoConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarDescuentos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures/descuento.png"));
		setModal(true);
		setTitle("Configurar Porcentajes de Descuento");
		setBounds(100, 100, 450, 169);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPorcentaje1 = new JLabel("1 a 5 unidades");
			lblPorcentaje1.setBounds(10, 21, 103, 14);
			contentPanel.add(lblPorcentaje1);
		}
		{
			JLabel lblPorcentaje2 = new JLabel("6 a 10 unidades");
			lblPorcentaje2.setBounds(10, 46, 103, 14);
			contentPanel.add(lblPorcentaje2);
		}
		{
			JLabel lblPorcentaje3 = new JLabel("11 a 15 unidades");
			lblPorcentaje3.setBounds(10, 71, 115, 14);
			contentPanel.add(lblPorcentaje3);
		}
		{
			JLabel lblPorcentaje4 = new JLabel("M\u00E1s de 15 unidades");
			lblPorcentaje4.setBounds(10, 96, 115, 14);
			contentPanel.add(lblPorcentaje4);
		}
		{
			txtPorcentaje1 = new JTextField();
			txtPorcentaje1.setText(String.valueOf(Menu.porcentaje1));
			txtPorcentaje1.setBounds(135, 18, 86, 20);
			contentPanel.add(txtPorcentaje1);
			txtPorcentaje1.setColumns(10);
		}
		{
			txtPorcentaje2 = new JTextField();
			txtPorcentaje2.setText(String.valueOf(Menu.porcentaje2));
			txtPorcentaje2.setBounds(135, 43, 86, 20);
			contentPanel.add(txtPorcentaje2);
			txtPorcentaje2.setColumns(10);
		}
		{
			txtPorcentaje3 = new JTextField();
			txtPorcentaje3.setText(String.valueOf(Menu.porcentaje3));
			txtPorcentaje3.setBounds(135, 68, 86, 20);
			contentPanel.add(txtPorcentaje3);
			txtPorcentaje3.setColumns(10);
		}
		{
			txtPorcentaje4 = new JTextField();
			txtPorcentaje4.setText(String.valueOf(Menu.porcentaje4));
			txtPorcentaje4.setBounds(135, 93, 86, 20);
			contentPanel.add(txtPorcentaje4);
			txtPorcentaje4.setColumns(10);
		}
		{
			JLabel lblSimbolo1 = new JLabel("%");
			lblSimbolo1.setBounds(223, 21, 46, 14);
			contentPanel.add(lblSimbolo1);
		}
		{
			JLabel lblSimbolo2 = new JLabel("%");
			lblSimbolo2.setBounds(223, 46, 46, 14);
			contentPanel.add(lblSimbolo2);
		}
		{
			JLabel lblSimbolo3 = new JLabel("%");
			lblSimbolo3.setBounds(223, 71, 46, 14);
			contentPanel.add(lblSimbolo3);
		}
		{
			JLabel lblSimbolo4 = new JLabel("%");
			lblSimbolo4.setBounds(223, 96, 46, 14);
			contentPanel.add(lblSimbolo4);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 17, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 42, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("pictures/fondo2.jpg"));
			lblNewLabel.setBounds(0, 0, 436, 132);
			contentPanel.add(lblNewLabel);
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

//===============================================================================
	void mostrarPorcentajes() {

		Menu.porcentaje1 = Double.parseDouble(txtPorcentaje1.getText());
		Menu.porcentaje2 = Double.parseDouble(txtPorcentaje2.getText());
		Menu.porcentaje3 = Double.parseDouble(txtPorcentaje3.getText());
		Menu.porcentaje4 = Double.parseDouble(txtPorcentaje4.getText());

	}

	void mensajeConfirmacion() {
		int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro de Realizar este Cambio?", "Confirmar",
				JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			mostrarPorcentajes();
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
