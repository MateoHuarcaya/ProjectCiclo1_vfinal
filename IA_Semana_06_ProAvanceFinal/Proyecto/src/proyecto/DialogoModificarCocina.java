package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DialogoModificarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnGrabar;
	private JComboBox<String> cboModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoModificarCocina dialog = new DialogoModificarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoModificarCocina() {
		setModal(true);
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 221);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 11, 46, 14);
			contentPanel.add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 36, 86, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(10, 61, 86, 14);
			contentPanel.add(lblAncho);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setBounds(10, 86, 86, 14);
			contentPanel.add(lblAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setBounds(10, 111, 86, 14);
			contentPanel.add(lblFondo);
		}
		{
			JLabel lblQuemadores = new JLabel("Quemadores");
			lblQuemadores.setBounds(10, 136, 86, 14);
			contentPanel.add(lblQuemadores);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setText(String.valueOf(Menu.precio0));
			txtPrecio.setBounds(106, 33, 141, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setText(String.valueOf(Menu.ancho0));
			txtAncho.setBounds(106, 58, 141, 20);
			contentPanel.add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setText(String.valueOf(Menu.alto0));
			txtAlto.setBounds(106, 83, 141, 20);
			contentPanel.add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setText(String.valueOf(Menu.fondo0));
			txtFondo.setBounds(106, 108, 141, 20);
			contentPanel.add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtQuemadores = new JTextField();
			txtQuemadores.setText(String.valueOf(Menu.quemadores0));
			txtQuemadores.setBounds(106, 133, 141, 20);
			contentPanel.add(txtQuemadores);
			txtQuemadores.setColumns(10);
		}
		{
			cboModelo = new JComboBox<String>();
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { "Mabe EMP6120PG0", "Indurama Parma",
					"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			cboModelo.setBounds(106, 7, 141, 22);
			contentPanel.add(cboModelo);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.setBounds(335, 7, 89, 23);
			btnGrabar.addActionListener(this);
			contentPanel.add(btnGrabar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 32, 89, 23);
			contentPanel.add(btnCerrar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
	}

//=====================================================================================

	int leerModelo() {

		return cboModelo.getSelectedIndex();

	}

	void ModificarPrecioCero() {

		Menu.precio0 = Double.parseDouble(txtPrecio.getText());
		Menu.ancho0 = Double.parseDouble(txtAncho.getText());
		Menu.alto0 = Double.parseDouble(txtAlto.getText());
		Menu.fondo0 = Double.parseDouble(txtFondo.getText());
		Menu.quemadores0 = Integer.parseInt(txtQuemadores.getText());

	}

	void ModificarPrecioUno() {

		Menu.precio1 = Double.parseDouble(txtPrecio.getText());
		Menu.ancho1 = Double.parseDouble(txtAncho.getText());
		Menu.alto1 = Double.parseDouble(txtAlto.getText());
		Menu.fondo1 = Double.parseDouble(txtFondo.getText());
		Menu.quemadores1 = Integer.parseInt(txtQuemadores.getText());

	}

	void ModificarPrecioDos() {

		Menu.precio2 = Double.parseDouble(txtPrecio.getText());
		Menu.ancho2 = Double.parseDouble(txtAncho.getText());
		Menu.alto2 = Double.parseDouble(txtAlto.getText());
		Menu.fondo2 = Double.parseDouble(txtFondo.getText());
		Menu.quemadores2 = Integer.parseInt(txtQuemadores.getText());

	}

	void ModificarPrecioTres() {

		Menu.precio3 = Double.parseDouble(txtPrecio.getText());
		Menu.ancho3 = Double.parseDouble(txtAncho.getText());
		Menu.alto3 = Double.parseDouble(txtAlto.getText());
		Menu.fondo3 = Double.parseDouble(txtFondo.getText());
		Menu.quemadores3 = Integer.parseInt(txtQuemadores.getText());

	}

	void ModificarPrecioCuatro() {

		Menu.precio4 = Double.parseDouble(txtPrecio.getText());
		Menu.ancho4 = Double.parseDouble(txtAncho.getText());
		Menu.alto4 = Double.parseDouble(txtAlto.getText());
		Menu.fondo4 = Double.parseDouble(txtFondo.getText());
		Menu.quemadores4 = Integer.parseInt(txtQuemadores.getText());

	}

	void mensajeConfirmacion(int model) {
		int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro de Realizar este Cambio?", "Confirmar",
				JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			switch (model) {
			case 0:
				ModificarPrecioCero();
				break;
			case 1:
				ModificarPrecioUno();
				break;
			case 2:
				ModificarPrecioDos();
				break;
			case 3:
				ModificarPrecioTres();
				break;
			default:
				ModificarPrecioCuatro();
				break;
			}

			dispose();
			JOptionPane.showMessageDialog(null, "El Cambio se Realizo con Exito", "Confirmacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	void asignarModelo(int model) {

		switch (model) {
		case 0:
			txtPrecio.setText(String.valueOf(Menu.precio0));
			txtAlto.setText(String.valueOf(Menu.alto0));
			txtAncho.setText(String.valueOf(Menu.ancho0));
			txtFondo.setText(String.valueOf(Menu.fondo0));
			txtQuemadores.setText(String.valueOf(Menu.quemadores0));
			break;
		case 1:
			txtPrecio.setText(String.valueOf(Menu.precio1));
			txtAlto.setText(String.valueOf(Menu.alto1));
			txtAncho.setText(String.valueOf(Menu.ancho1));
			txtFondo.setText(String.valueOf(Menu.fondo1));
			txtQuemadores.setText(String.valueOf(Menu.quemadores1));
			break;
		case 2:
			txtPrecio.setText(String.valueOf(Menu.precio2));
			txtAlto.setText(String.valueOf(Menu.alto2));
			txtAncho.setText(String.valueOf(Menu.ancho2));
			txtFondo.setText(String.valueOf(Menu.fondo2));
			txtQuemadores.setText(String.valueOf(Menu.quemadores2));
			break;
		case 3:
			txtPrecio.setText(String.valueOf(Menu.precio3));
			txtAlto.setText(String.valueOf(Menu.alto3));
			txtAncho.setText(String.valueOf(Menu.ancho3));
			txtFondo.setText(String.valueOf(Menu.fondo3));
			txtQuemadores.setText(String.valueOf(Menu.quemadores3));
			break;
		default:
			txtPrecio.setText(String.valueOf(Menu.precio4));
			txtAlto.setText(String.valueOf(Menu.alto4));
			txtAncho.setText(String.valueOf(Menu.ancho4));
			txtFondo.setText(String.valueOf(Menu.fondo4));
			txtQuemadores.setText(String.valueOf(Menu.quemadores4));
			break;

		}

	}

//====================================================================
	protected void actionPerformedBtnGrabar(ActionEvent e) {

		int modelo;

		modelo = leerModelo();
		mensajeConfirmacion(modelo);

	}

	protected void actionPerformedCboModelo(ActionEvent e) {

		int modelo;

		modelo = leerModelo();
		asignarModelo(modelo);

	}

	protected void actionPerformedBtnBorrar(ActionEvent e) {

		dispose();
	}
}
