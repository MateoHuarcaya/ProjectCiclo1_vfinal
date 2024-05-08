package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DialogoGenerarReportes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JComboBox<String> cboTipoDeReporte;
	private JTextArea txtS;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoGenerarReportes dialog = new DialogoGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoGenerarReportes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures/reporte-de-negocios.png"));
		setModal(true);
		setTitle("Generar Reportes");
		setBounds(100, 100, 587, 336);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTipoDeReporte = new JLabel("Tipo de Reporte");
			lblTipoDeReporte.setBounds(10, 11, 103, 14);
			contentPanel.add(lblTipoDeReporte);
		}
		{
			cboTipoDeReporte = new JComboBox<String>();
			cboTipoDeReporte.addActionListener(this);
			cboTipoDeReporte.setModel(new DefaultComboBoxModel<String>(
					new String[] { "Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima",
							"Precios en relaci\u00F3n al precio promedio", "Promedios, menores y mayores" }));
			cboTipoDeReporte.setBounds(128, 7, 283, 22);
			contentPanel.add(cboTipoDeReporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(472, 7, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 36, 551, 250);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
				scrollPane.setViewportView(txtS);

			}
		}
		{
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon("pictures/8522393.jpg"));
			lblNewLabel_1.setBounds(0, 0, 573, 299);
			contentPanel.add(lblNewLabel_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipoDeReporte) {
			actionPerformedCboTipoDeReporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

//=====================================================================================================
	int EntradadeDatos() {

		return cboTipoDeReporte.getSelectedIndex();
	}

	double precioPromedio() {

		return (Menu.precio0 + Menu.precio1 + Menu.precio2 + Menu.precio3 + Menu.precio4) / 5;

	}

	double anchoPromedio() {

		return (Menu.ancho0 + Menu.ancho1 + Menu.ancho2 + Menu.ancho3 + Menu.ancho4) / 5;
	}

	double altoPromedio() {

		return (Menu.alto0 + Menu.alto1 + Menu.alto2 + Menu.alto3 + Menu.alto4) / 5;
	}

	double profundidadPromedio() {

		return (Menu.fondo0 + Menu.fondo1 + Menu.fondo2 + Menu.fondo3 + Menu.fondo4) / 5;
	}

	int quemadoresPromedio() {
		return (Menu.quemadores0 + Menu.quemadores1 + Menu.quemadores2 + Menu.quemadores3 + Menu.quemadores4) / 5;
	}

	String DeterminamosRangosPrimeraCocina(double prom, double pre0, double pre1, double pre2, double pre3,
			double pre4) {

		String rang0;
		if (pre0 <= prom)
			rang0 = "(Menor al Promedio)";
		else if (pre0 >= prom)
			rang0 = "(Mayor al Promedio)";
		else
			rang0 = "(Igual al Promedio)";

		return rang0;
	}

	String DeterminamosRangosSegundaCocina(double prom, double pre0, double pre1, double pre2, double pre3,
			double pre4) {

		String rang1;

		if (pre1 <= prom)
			rang1 = "(Menor al Promedio)";
		else if (pre1 >= prom)
			rang1 = "(Mayor al Promedio)";
		else
			rang1 = "(Igual al Promedio)";
		return rang1;

	}

	String DeterminamosRangosTerceraCocina(double prom, double pre0, double pre1, double pre2, double pre3,
			double pre4) {

		String rang2;
		if (pre2 <= prom)
			rang2 = "(Menor al Promedio)";
		else if (pre2 >= prom)
			rang2 = "(Mayor al Promedio)";
		else
			rang2 = "(Igual al Promedio)";
		return rang2;
	}

	String DeterminamosRangosCuartaCocina(double prom, double pre0, double pre1, double pre2, double pre3,
			double pre4) {

		String rang3;
		if (pre3 <= prom)
			rang3 = "(Menor al Promedio)";
		else if (pre3 >= prom)
			rang3 = "(Mayor al Promedio)";
		else
			rang3 = "(Igual al Promedio)";
		return rang3;

	}

	String DeterminamosRangosQuintaCocina(double prom, double pre0, double pre1, double pre2, double pre3,
			double pre4) {

		String rang4;
		if (pre4 <= prom)
			rang4 = "(Menor al Promedio)";
		else if (pre4 >= prom)
			rang4 = "(Mayor al Promedio)";
		else
			rang4 = "(Igual al Promedio)";

		return rang4;
	}

	double precioMayor(double pre0, double pre1, double pre2, double pre3, double pre4) {

		double preMa;
		preMa = pre0;

		if (pre1 >= preMa)
			preMa = pre1;
		if (pre2 >= preMa)
			preMa = pre2;
		if (pre3 >= preMa)
			preMa = pre3;
		if (pre4 >= preMa)
			preMa = pre4;
		return preMa;
	}

	double precioMenor(double pre0, double pre1, double pre2, double pre3, double pre4) {

		double preMe;
		preMe = pre0;

		if (pre1 <= preMe)
			preMe = pre1;
		if (pre2 <= preMe)
			preMe = pre2;
		if (pre3 <= preMe)
			preMe = pre3;
		if (pre4 <= preMe)
			preMe = pre4;
		return preMe;

	}

	double anchoMayor(double ancho0, double ancho1, double ancho2, double ancho3, double ancho4) {

		double anchMa;
		anchMa = ancho0;

		if (ancho1 >= anchMa)
			anchMa = ancho1;
		if (ancho2 >= anchMa)
			anchMa = ancho2;
		if (ancho3 >= anchMa)
			anchMa = ancho3;
		if (ancho3 >= anchMa)
			anchMa = ancho4;
		return anchMa;
	}

	double anchoMenor(double ancho0, double ancho1, double ancho2, double ancho3, double ancho4) {

		double anchMe;
		anchMe = ancho0;

		if (ancho1 <= anchMe)
			anchMe = ancho1;
		if (ancho2 <= anchMe)
			anchMe = ancho2;
		if (ancho3 <= anchMe)
			anchMe = ancho3;
		if (ancho4 <= anchMe)
			anchMe = ancho4;
		return anchMe;
	}

	double alturaMayor(double alto0, double alto1, double alto2, double alto3, double alto4) {

		double altMa;
		altMa = alto0;

		if (alto1 >= altMa)
			altMa = alto1;
		if (alto2 >= altMa)
			altMa = alto2;
		if (alto3 >= altMa)
			altMa = alto3;
		if (alto4 >= altMa)
			altMa = alto4;
		return altMa;
	}

	double alturaMenor(double alto0, double alto1, double alto2, double alto3, double alto4) {

		double altMe;
		altMe = alto0;

		if (alto1 <= altMe)
			altMe = alto1;
		if (alto2 <= altMe)
			altMe = alto2;
		if (alto3 <= altMe)
			altMe = alto3;
		if (alto4 <= altMe)
			altMe = alto4;
		return altMe;
	}

	double fondoMayor(double fondo0, double fondo1, double fondo2, double fondo3, double fondo4) {

		double fondoMa;
		fondoMa = fondo0;

		if (fondo1 >= fondoMa)
			fondoMa = fondo1;
		if (fondo2 >= fondoMa)
			fondoMa = fondo2;
		if (fondo3 >= fondoMa)
			fondoMa = fondo3;
		if (fondo4 >= fondoMa)
			fondoMa = fondo4;
		return fondoMa;
	}

	double fondoMenor(double fondo0, double fondo1, double fondo2, double fondo3, double fondo4) {

		double fondoMe;
		fondoMe = fondo0;

		if (fondo1 <= fondoMe)
			fondoMe = fondo1;
		if (fondo2 <= fondoMe)
			fondoMe = fondo2;
		if (fondo3 <= fondoMe)
			fondoMe = fondo3;
		if (fondo4 <= fondoMe)
			fondoMe = fondo4;
		return fondoMe;

	}

	int quemadoresMayor(int quemadores0, int quemadores1, int quemadores2, int quemadores3, int quemadores4) {

		int queMa;
		queMa = quemadores0;

		if (quemadores1 >= queMa)
			queMa = quemadores1;
		if (quemadores2 >= queMa)
			queMa = quemadores2;
		if (quemadores3 >= queMa)
			queMa = quemadores3;
		if (quemadores4 >= queMa)
			queMa = quemadores4;

		return queMa;
	}

	int quemadoresMenor(int quemadores0, int quemadores1, int quemadores2, int quemadores3, int quemadores4) {

		int queMe;
		queMe = quemadores0;

		if (quemadores1 <= queMe)
			queMe = quemadores1;
		if (quemadores2 <= queMe)
			queMe = quemadores2;
		if (quemadores3 <= queMe)
			queMe = quemadores3;
		if (quemadores4 <= queMe)
			queMe = quemadores4;
		return queMe;

	}

	String ComparacionCantidadOptima0(int cantidadCocinasVendidas0, int cantidadOptima) {

		String compa0;
		if (cantidadCocinasVendidas0 < cantidadOptima)
			compa0 = "Menos que la cantidad optima";
		else if (cantidadCocinasVendidas0 > cantidadOptima)
			compa0 = "Mas que la cantidad optima";
		else
			compa0 = "Igual que la cantidad optima";
		return compa0;
	}

	String ComparacionCantidadOptima1(int cantidadCocinasVendidas1, int cantidadOptima) {

		String compa1;
		if (cantidadCocinasVendidas1 < cantidadOptima)
			compa1 = "Menos que la cantidad optima";
		else if (cantidadCocinasVendidas1 > cantidadOptima)
			compa1 = "Mas que la cantidad optima";
		else
			compa1 = "Igual que la cantidad optima";
		return compa1;
	}

	String ComparacionCantidadOptima2(int cantidadCocinasVendidas2, int cantidadOptima) {

		String compa2;
		if (cantidadCocinasVendidas2 < cantidadOptima)
			compa2 = "Menos que la cantidad optima";
		else if (cantidadCocinasVendidas2 > cantidadOptima)
			compa2 = "Mas que la cantidad optima";
		else
			compa2 = "Igual que la cantidad optima";
		return compa2;
	}

	String ComparacionCantidadOptima3(int cantidadCocinasVendidas3, int cantidadOptima) {

		String compa3;
		if (cantidadCocinasVendidas3 < cantidadOptima)
			compa3 = "Menos que la cantidad optima";
		else if (cantidadCocinasVendidas3 > cantidadOptima)
			compa3 = "Mas que la cantidad optima";
		else
			compa3 = "Igual que la cantidad optima";
		return compa3;
	}

	String ComparacionCantidadOptima4(int cantidadCocinasVendidas4, int cantidadOptima) {

		String compa4;
		if (cantidadCocinasVendidas4 < cantidadOptima)
			compa4 = "Menos que la cantidad optima";
		else if (cantidadCocinasVendidas4 > cantidadOptima)
			compa4 = "Mas que la cantidad optima";
		else
			compa4 = "Igual que la cantidad optima";
		return compa4;
	}

	void imprimir(String cad) {

		txtS.append(cad + "\n");

	}

	void ventasModelo() {

		txtS.setText("VENTAS POR MODELO\n\n");
		
		imprimir("Modelo\t\t\t\t: " + Menu.modelo0 );
		imprimir("Cantidad de Ventas\t\t: " + String.format("%15d", Menu.cantidadVentasTotales));
		imprimir("Cantidad de Unidades Vendidas\t: " + String.format("%15d", Menu.cantidadCocinasVendidas0));
		imprimir("Importe Total Vendido\t\t: " + "S/ " + String.format("%,12.2f", Menu.importePagoTotal0));
		imprimir("Aporte a la Cuota Diaria\t: " + String.format("%,15.2f", Menu.aporteCuota0) + " %" );
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%15s", Menu.modelo1));
		imprimir("Cantidad de Ventas\t\t: " + String.format("%15d", Menu.cantidadVentasTotales));
		imprimir("Cantidad de Unidades Vendidas\t: " + String.format("%15d", Menu.cantidadCocinasVendidas1));
		imprimir("Importe Total Vendido\t\t: " + "S/ " + String.format("%,12.2f", Menu.importePagoTotal1));
		imprimir("Aporte a la Cuota Diaria\t: " + String.format("%,15.2f", Menu.aporteCuota1) + " %");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%15s", Menu.modelo2));
		imprimir("Cantidad de Ventas\t\t: " + String.format("%15d", Menu.cantidadVentasTotales));
		imprimir("Cantidad de Unidades Vendidas\t: " + String.format("%15d", Menu.cantidadCocinasVendidas2));
		imprimir("Importe Total Vendido\t\t: " + "S/ " + String.format("%,12.2f", Menu.importePagoTotal2));
		imprimir("Aporte a la Cuota Diaria\t: " + String.format("%,15.2f", Menu.aporteCuota2) + " %");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%15s", Menu.modelo3));
		imprimir("Cantidad de Ventas\t\t: " + String.format("%15d", Menu.cantidadVentasTotales));
		imprimir("Cantidad de Unidades Vendidas\t: " + String.format("%15d", Menu.cantidadCocinasVendidas3));
		imprimir("Importe Total Vendido\t\t: " + "S/ " + String.format("%,12.2f", Menu.importePagoTotal3));
		imprimir("Aporte a la Cuota Diaria\t: " + String.format("%,15.2f", Menu.aporteCuota3) + " %");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%15s", Menu.modelo4));
		imprimir("Cantidad de Ventas\t\t: " + String.format("%15d", Menu.cantidadVentasTotales));
		imprimir("Cantidad de Unidades Vendidas\t: " + String.format("%15d", Menu.cantidadCocinasVendidas4));
		imprimir("Importe Total Vendido\t\t: " + "S/ " + String.format("%,12.2f", Menu.importePagoTotal4));
		imprimir("Aporte a la Cuota Diaria\t: " + String.format("%,15.2f", Menu.aporteCuota4) + " %");
	}

	void ventaOptima(String comparacion0, String comparacion1, String comparacion2, String comparacion3,
			String comparacion4) {

		txtS.setText("VENTAS EN RELACION A LA VENTA OPTIMA\n\n");
		
		imprimir("Modelo\t\t\t\t: " + String.format("%16s", Menu.modelo0));
		imprimir("Cantidad de unidades vendidas\t:" + String.format("%3d", Menu.cantidadCocinasVendidas0) + "("
				+ comparacion0 + ")" );
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%15s", Menu.modelo1));
		imprimir("Cantidad de unidades vendidas\t:" + String.format("%3d", Menu.cantidadCocinasVendidas1) + "("
				+ comparacion1 + ")");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%14s", Menu.modelo2));
		imprimir("Cantidad de unidades vendidas\t:" + String.format("%3d", Menu.cantidadCocinasVendidas2) + "("
				+ comparacion2 + ")");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%13s", Menu.modelo3));
		imprimir("Cantidad de unidades vendidas\t:" + String.format("%3d", Menu.cantidadCocinasVendidas3) + "("
				+ comparacion3 + ")");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + String.format("%12s", Menu.modelo4));
		imprimir("Cantidad de unidades vendidas\t:" + String.format("%3d", Menu.cantidadCocinasVendidas4) + "("
				+ comparacion4 + ")");
	}

	void ventasPromedio(String rango0, String rango1, String rango2, String rango3, String rango4) {

		txtS.setText("PRECIOS EN RELACION AL PRECIO PROMEDIO\n\n");
		
		imprimir("Modelo\t: " + String.format("%7s", Menu.modelo0));
		imprimir("Precio\t:" + " S/" + String.format("%,9.2f", Menu.precio0) + rango0);
		imprimir("");
		imprimir("Modelo\t: " + String.format("%7s", Menu.modelo1) );
		imprimir("Precio\t:" + " S/" + String.format("%,9.2f", Menu.precio1) + rango1);
		imprimir("");
		imprimir("Modelo\t: " + String.format("%7s", Menu.modelo2));
		imprimir("Precio\t:" + " S/" + String.format("%,9.2f", Menu.precio2) + rango2);
		imprimir("");
		imprimir("Modelo\t: " + String.format("%7s", Menu.modelo3) );
		imprimir("Precio\t:" + " S/" + String.format("%,9.2f", Menu.precio3) + rango3);
		imprimir("");
		imprimir("Modelo\t: " + String.format("%7s", Menu.modelo4));
		imprimir("Precio\t:" + " S/" + String.format("%,9.2f", Menu.precio4) + rango4);
	}

	void ventaMayoresMenores(int queMa, int queMe, int queProm, double fondMa, double fondMe, double fondProm,
			double altMa, double altMe, double altProm, double anchMa, double anchMe, double anchProm, double preMa,
			double preMe, double prom) {

		txtS.setText("PROMEDIOS, MENORES Y MAYORES\n\n");

		imprimir("Precio promedio\t\t: " + "S/ " + String.format("%,12.2f", prom));
		imprimir("Precio mayor\t\t: " + "S/ " + String.format("%,12.2f", preMa));
		imprimir("Precio menor\t\t: " + "S/ " + String.format("%,12.2f", preMe));
		imprimir("");
		imprimir("Ancho promedio\t\t: " + String.format("%,12.2f", anchProm) + " cm");
		imprimir("Ancho mayor\t\t: " + String.format("%,12.2f", anchMa) + " cm");
		imprimir("Ancho menor\t\t: " + String.format("%,12.2f", anchMe) + " cm");
		imprimir("");
		imprimir("Altura promedio\t\t: " + String.format("%,12.2f", altProm) + " cm");
		imprimir("Altura mayor\t\t: " + String.format("%,12.2f", altMa) + " cm");
		imprimir("Altura menor\t\t: " + String.format("%,12.2f", altMe) + " cm");
		imprimir("");
		imprimir("Fondo promedio\t\t: " + String.format("%,12.2f", fondProm) + " cm");
		imprimir("Fondo mayor\t\t: " + String.format("%,12.2f", fondMa) + " cm");
		imprimir("Fondo menor\t\t: " + String.format("%,12.2f", fondMe) + " cm");
		imprimir("");
		imprimir("Quemadores promedio\t: " + String.format("%15d", queProm));
		imprimir("Quemadores mayor\t: " + String.format("%15d", queMa));
		imprimir("Quemadores menor\t: " + String.format("%15d", queMe));
	}

	void SalidaDatos(int tp, int queMa, int queMe, int queProm, double fondMa, double fondMe, double fondProm,
			double altMa, double altMe, double altProm, double anchMa, double anchMe, double anchProm, double preMa,
			double preMe, double prom, String comparacion0, String comparacion1, String comparacion2,
			String comparacion3, String comparacion4, String rango0, String rango1, String rango2, String rango3,
			String rango4) {

		switch (tp) {
		case 0:
			ventasModelo();
			break;
		case 1:
			ventaOptima(comparacion0, comparacion1, comparacion2, comparacion3, comparacion4);
			break;
		case 2:
			ventasPromedio(rango0, rango1, rango2, rango3, rango4);
			break;
		default:
			ventaMayoresMenores(queMa, queMe, queProm, fondMa, fondMe, fondProm, altMa, altMe, altProm, anchMa, anchMe,
					anchProm, preMa, preMe, prom);
			break;

		}
	}

	protected void actionPerformedCboTipoDeReporte(ActionEvent e) {
		String rango0, rango1, rango2, rango3, rango4, comparacion0, comparacion1, comparacion2, comparacion3,
				comparacion4;
		double promedio, anchoProm, altoProm, fondoProm, precioMa, precioMe, anchoMa, anchoMe, altoMa, altoMe, fondoMa,
				fondoMe;
		int tipo, quemadoresProm, quemadoresMa, quemadoresMe;

		tipo = EntradadeDatos();
		promedio = precioPromedio();
		anchoProm = anchoPromedio();
		altoProm = altoPromedio();
		fondoProm = profundidadPromedio();
		quemadoresProm = quemadoresPromedio();

		rango0 = DeterminamosRangosPrimeraCocina(promedio, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3,
				Menu.precio4);
		rango1 = DeterminamosRangosSegundaCocina(promedio, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3,
				Menu.precio4);
		rango2 = DeterminamosRangosTerceraCocina(promedio, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3,
				Menu.precio4);
		rango3 = DeterminamosRangosCuartaCocina(promedio, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3,
				Menu.precio4);
		rango4 = DeterminamosRangosQuintaCocina(promedio, Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3,
				Menu.precio4);
		precioMa = precioMayor(Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3, Menu.precio4);
		precioMe = precioMenor(Menu.precio0, Menu.precio1, Menu.precio2, Menu.precio3, Menu.precio4);

		anchoMa = anchoMayor(Menu.ancho0, Menu.ancho1, Menu.ancho2, Menu.ancho3, Menu.ancho4);
		anchoMe = anchoMenor(Menu.ancho0, Menu.ancho1, Menu.ancho2, Menu.ancho3, Menu.ancho4);

		altoMa = alturaMayor(Menu.alto0, Menu.alto1, Menu.alto2, Menu.alto3, Menu.alto4);
		altoMe = alturaMenor(Menu.alto0, Menu.alto1, Menu.alto2, Menu.alto3, Menu.alto4);

		fondoMa = fondoMayor(Menu.fondo0, Menu.fondo1, Menu.fondo2, Menu.fondo3, Menu.fondo4);
		fondoMe = fondoMenor(Menu.fondo0, Menu.fondo1, Menu.fondo2, Menu.fondo3, Menu.fondo4);

		quemadoresMa = quemadoresMayor(Menu.quemadores0, Menu.quemadores1, Menu.quemadores2, Menu.quemadores3,
				Menu.quemadores4);
		quemadoresMe = quemadoresMenor(Menu.quemadores0, Menu.quemadores1, Menu.quemadores2, Menu.quemadores3,
				Menu.quemadores4);
		comparacion0 = ComparacionCantidadOptima0(Menu.cantidadCocinasVendidas0, Menu.cantidadOptima);
		comparacion1 = ComparacionCantidadOptima1(Menu.cantidadCocinasVendidas1, Menu.cantidadOptima);
		comparacion2 = ComparacionCantidadOptima1(Menu.cantidadCocinasVendidas2, Menu.cantidadOptima);
		comparacion3 = ComparacionCantidadOptima1(Menu.cantidadCocinasVendidas3, Menu.cantidadOptima);
		comparacion4 = ComparacionCantidadOptima1(Menu.cantidadCocinasVendidas4, Menu.cantidadOptima);

		SalidaDatos(tipo, quemadoresMa, quemadoresMe, quemadoresProm, fondoMa, fondoMe, fondoProm, altoMa, altoMe,
				altoProm, anchoMa, anchoMe, anchoProm, precioMa, precioMe, promedio, comparacion0, comparacion1,
				comparacion2, comparacion3, comparacion4, rango0, rango1, rango2, rango3, rango4);
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}

}
