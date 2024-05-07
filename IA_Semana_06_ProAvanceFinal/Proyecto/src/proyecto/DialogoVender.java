package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DialogoVender extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox<String> cboModelo;
	private JButton btnCerrar;
	private JButton btnVender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoVender dialog = new DialogoVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setModal(true);
		setTitle("Vender");
		setBounds(100, 100, 450, 337);
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
			JLabel lblPrecio = new JLabel("Precio( S/)");
			lblPrecio.setBounds(10, 36, 76, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(10, 64, 76, 14);
			contentPanel.add(lblCantidad);
		}
		{
			cboModelo = new JComboBox<String>();
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { "Mabe EMP6120PG0", "Indurama Parma",
					"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			cboModelo.setBounds(96, 7, 141, 22);
			contentPanel.add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setText(String.valueOf(Menu.precio0));
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(96, 33, 141, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(96, 61, 141, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setBounds(318, 7, 89, 23);
			contentPanel.add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(318, 32, 89, 23);
			contentPanel.add(btnCerrar);
		}

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 89, 414, 198);
		contentPanel.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

//====================================================================================================================
	int leerCantitadCocinasVendidas() {

		return Integer.parseInt(txtCantidad.getText());
	}

	String leerModelo() {

		return (String) cboModelo.getSelectedItem();

	}

	void mostrarVentanaEmergente() {
		double impTotalAcumulado;
		double porceCuotaDiaria;
		impTotalAcumulado = Menu.importePagoTotal0 + Menu.importePagoTotal1 + Menu.importePagoTotal2
				+ Menu.importePagoTotal3 + Menu.importePagoTotal4;
		porceCuotaDiaria = (impTotalAcumulado / Menu.cuotaDiaria) * 100;
		if (Menu.cantidadVentasTotales % 5 == 0)
			JOptionPane.showMessageDialog(null,
					"Venta Nro." + Menu.cantidadVentasTotales + "\n" + "Importe total general acumulado : S/ "
							+ String.format("%,.2f", impTotalAcumulado) + "\n" + "Porcentaje de la cuota diaria : "
							+ String.format("%.2f", porceCuotaDiaria) + "%",
					"Ventas", JOptionPane.INFORMATION_MESSAGE);

	}
	
	void confirmacionVenta() {
		if(Menu.cantidadVentasTotales % 5 != 0)
		JOptionPane.showMessageDialog(null, "Venta Realizada con Exito", "Confirmacion de Venta", JOptionPane.INFORMATION_MESSAGE);
	}

	double AsignacionPrecios(String model, double pre0, double pre1, double pre2, double pre3, double pre4) {

		double pre;
		switch (model) {
		case "Mabe EMP6120PG0":
			pre = Menu.precio0;
			break;
		case "Indurama Parma":
			pre = Menu.precio1;
			break;
		case "Sole COSOL027":
			pre = Menu.precio2;
			break;
		case "Coldex CX602":
			pre = Menu.precio3;
			break;
		default:
			pre = Menu.precio4;
			break;

		}

		return pre;
	}

	void conteoDatosVentas(String model, int cantCocina, double ip) {

		switch (model) {
		case "Mabe EMP6120PG0":
			Menu.cantidadCocinasVendidas0 += cantCocina;
			Menu.importePagoTotal0 += ip;
			Menu.cantidadVentasTotales++;
			Menu.aporteCuota0 = (Menu.importePagoTotal0 / Menu.cuotaDiaria) * 100;
			break;
		case "Indurama Parma":
			Menu.cantidadCocinasVendidas1 += cantCocina;
			Menu.importePagoTotal1 += ip;
			Menu.cantidadVentasTotales++;
			Menu.aporteCuota1 = (Menu.importePagoTotal1 / Menu.cuotaDiaria) * 100;
			break;
		case "Sole COSOL027":
			Menu.cantidadCocinasVendidas2 += cantCocina;
			Menu.importePagoTotal2 += ip;
			Menu.cantidadVentasTotales++;
			Menu.aporteCuota2 = (Menu.importePagoTotal2 / Menu.cuotaDiaria) * 100;
			break;
		case "Coldex CX602":
			Menu.cantidadCocinasVendidas3 += cantCocina;
			Menu.importePagoTotal3 += ip;
			Menu.cantidadVentasTotales++;
			Menu.aporteCuota3 = (Menu.importePagoTotal3 / Menu.cuotaDiaria) * 100;
			break;
		default:
			Menu.cantidadCocinasVendidas4 += cantCocina;
			Menu.importePagoTotal4 += ip;
			Menu.cantidadVentasTotales++;
			Menu.aporteCuota4 = (Menu.importePagoTotal4 / Menu.cuotaDiaria) * 100;
			break;

		}
	}

	double CalculoImporteCompra(String model, int cantCocina, double pre0, double pre1, double pre2, double pre3,
			double pre4) {

		double ic;
		switch (model) {
		case "Mabe EMP6120PG0":
			ic = pre0 * cantCocina;
			break;
		case "Indurama Parma":
			ic = pre1 * cantCocina;
			break;
		case "Sole COSOL027":
			ic = pre2 * cantCocina;
			break;
		case "Coldex CX602":
			ic = pre3 * cantCocina;
			break;
		default:
			ic = pre4 * cantCocina;
			break;
		}

		return ic;
	}

	double CalculoDescuento(int cantCocina, double ic, double por1, double por2, double por3, double por4) {

		double id;
		if (cantCocina >= 1 && cantCocina <= 5)
			id = ic * (por1 / 100);
		else if (cantCocina >= 6 && cantCocina <= 10)
			id = ic * (por2 / 100);
		else if (cantCocina >= 11 && cantCocina <= 15)
			id = ic * (por3 / 100);
		else
			id = ic * (por4 / 100);

		return id;
	}

	double CalculoImportePagar(double ic, double id) {

		return ic - id;

	}

	String ObsequioAdquirido(int cantCocina, String obs1, String obs2, String obs3) {

		String obs;
		if (cantCocina == 1)
			obs = obs1;
		else if (cantCocina >= 2 && cantCocina <= 5)
			obs = obs2;
		else
			obs = obs3;

		return obs;
	}

	
	void imprimir(String cad) {
		
		txtS.append(cad + "\n");
	}

	void SalidaDatos(String model, double pre, int cant, double ic, double id, double ip, String obs) {

		txtS.setText("BOLETA DE VENTA\n\n");
		imprimir("Modelo\t\t\t: " + String.format("%20s", model));
		imprimir("Precio\t\t\t: " + "S/ " + String.format("%,17.2f", pre));
		imprimir("Cantidad\t\t: " + String.format("%20d", cant));
		imprimir("Importe de Compra\t: " + "S/ " + String.format("%,17.2f", ic));
		imprimir("Importe de Descuento\t: " + "S/ " + String.format("%,17.2f", id));
		imprimir("Importe a Pagar\t\t: " + "S/ " + String.format("%,17.2f", ip));
		imprimir("Obesquio\t\t: " + String.format("%20s", obs));
	}

//========================================================================================================================
	protected void actionPerformedBtnVender(ActionEvent e) {
		double impCo, impDes, impPa, precio;
		String obsequio, modelo;
		int cantidadCocina;

		cantidadCocina = leerCantitadCocinasVendidas();
		modelo = leerModelo();
		
		impCo = CalculoImporteCompra(modelo, cantidadCocina, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3,
				Menu.precio4);
		impDes = CalculoDescuento(cantidadCocina, impCo, Menu.porcentaje1, Menu.porcentaje2, Menu.porcentaje3,
				Menu.porcentaje4);
		impPa = CalculoImportePagar(impCo, impDes);
		conteoDatosVentas(modelo, cantidadCocina, impPa);
		
		mostrarVentanaEmergente();
		precio = AsignacionPrecios(modelo, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3, Menu.precio4);

		obsequio = ObsequioAdquirido(cantidadCocina, Menu.obsequio1, Menu.obsequio2, Menu.obsequio3);
		SalidaDatos(modelo, precio, cantidadCocina, impCo, impDes, impPa, obsequio);
		confirmacionVenta();
		txtCantidad.setText("");
		txtCantidad.requestFocus();
		

	}

//============================================================================================
	void EleccionModelo() {
		String modelo = (String) cboModelo.getSelectedItem();

		if (modelo == "Mabe EMP6120PG0")
			txtPrecio.setText(String.valueOf(Menu.precio0));
		else if (modelo == "Indurama Parma")
			txtPrecio.setText(String.valueOf(Menu.precio1));
		else if (modelo == "Sole COSOL027")
			txtPrecio.setText(String.valueOf(Menu.precio2));
		else if (modelo == "Coldex CX602")
			txtPrecio.setText(String.valueOf(Menu.precio3));
		else
			txtPrecio.setText(String.valueOf(Menu.precio4));
	}

	protected void actionPerformedCboModelo(ActionEvent e) {

		EleccionModelo();

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}
}
