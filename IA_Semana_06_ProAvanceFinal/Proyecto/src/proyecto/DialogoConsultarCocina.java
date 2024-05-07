package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DialogoConsultarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnCerrar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConsultarCocina dialog = new DialogoConsultarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConsultarCocina() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\asistente-virtual.png"));
		setModal(true);
		setTitle("Consultar Cocina");
		setBounds(100, 100, 450, 213);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(0, 11, 46, 14);
		contentPanel.add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(0, 36, 85, 14);
		contentPanel.add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(0, 61, 85, 14);
		contentPanel.add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(0, 84, 85, 14);
		contentPanel.add(lblAlto);

		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(0, 109, 85, 14);
		contentPanel.add(lblFondo);

		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(0, 134, 85, 14);
		contentPanel.add(lblQuemadores);

		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
		cboModelo.setBounds(95, 7, 150, 22);
		contentPanel.add(cboModelo);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setText(String.valueOf(Menu.precio0));
		txtPrecio.setBounds(95, 33, 150, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setText(String.valueOf(Menu.ancho0));
		txtAncho.setBounds(95, 58, 150, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);

		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setText(String.valueOf(Menu.alto0));
		txtAlto.setBounds(95, 81, 150, 20);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);

		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setText(String.valueOf(Menu.fondo0));
		txtFondo.setBounds(95, 106, 150, 20);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);

		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setText(String.valueOf(Menu.quemadores0));
		txtQuemadores.setBounds(95, 131, 150, 20);
		contentPanel.add(txtQuemadores);
		txtQuemadores.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\fondo2.jpg"));
		lblNewLabel.setBounds(0, 0, 436, 176);
		contentPanel.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
//========================================================================
	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}

	int leerModelo() {

		return cboModelo.getSelectedIndex();
	}

	void asignarDatos(int model) {

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

	protected void actionPerformedCboModelo(ActionEvent e) {

		int modelo;

		modelo = leerModelo();

		asignarDatos(modelo);
	}

}
