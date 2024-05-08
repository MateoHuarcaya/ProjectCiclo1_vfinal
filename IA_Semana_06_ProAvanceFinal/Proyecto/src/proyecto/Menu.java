package proyecto;

import java.awt.EventQueue;
import java.awt.Frame;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Menu extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;

	// Datos minimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	// Datos minimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos minimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos minimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos minimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad optima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	// Cantidad de Cocinas Vendidas

	public static int cantidadCocinasVendidas0 = 0;
	public static int cantidadCocinasVendidas1 = 0;
	public static int cantidadCocinasVendidas2 = 0;
	public static int cantidadCocinasVendidas3 = 0;
	public static int cantidadCocinasVendidas4 = 0;
	// Cantidad de Ventas en Total
	public static int cantidadVentasTotales = 0;
	// Importe de pago por Cocina
	public static double importePagoTotal0 = 0;
	public static double importePagoTotal1 = 0;
	public static double importePagoTotal2 = 0;
	public static double importePagoTotal3 = 0;
	public static double importePagoTotal4 = 0;
	// Aporte de la cuota diaria por cocina
	public static double aporteCuota0 = 0;
	public static double aporteCuota1 = 0;
	public static double aporteCuota2 = 0;
	public static double aporteCuota3 = 0;
	public static double aporteCuota4 = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
        SwingUtilities.invokeLater(() -> {
            Menu frame = new Menu();
        });
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\carro-de-la-compra.png"));
		setTitle("Tienda ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 416);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);

		mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\cerrar-sesion.png"));
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);

		mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);

		mntmNewMenuItem_1 = new JMenuItem("Consultar Cocina");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\asistente-virtual.png"));
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_1);

		mntmNewMenuItem_2 = new JMenuItem("Modificar Cocina");
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\cocina.png"));
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_2);

		mntmNewMenuItem_3 = new JMenuItem("Listar Cocinas");
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\tarea-completada.png"));
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_3);

		mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);

		mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\punto-de-venta.png"));
		mntmNewMenuItem_4.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_4);

		mntmNewMenuItem_5 = new JMenuItem("Generar Reportes");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\reporte-de-negocios.png"));
		mntmNewMenuItem_5.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_5);

		mnNewMenu_3 = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnNewMenu_3);

		mntmNewMenuItem_6 = new JMenuItem("Configurar Descuentos");
		mntmNewMenuItem_6.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\descuento.png"));
		mntmNewMenuItem_6.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_6);

		mntmNewMenuItem_7 = new JMenuItem("Configurar Obsequios");
		mntmNewMenuItem_7.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\regalo.png"));
		mntmNewMenuItem_7.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_7);

		mntmNewMenuItem_8 = new JMenuItem("Configurar Cantidad Optima");
		mntmNewMenuItem_8.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\cajas.png"));
		mntmNewMenuItem_8.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_8);

		mntmNewMenuItem_9 = new JMenuItem("Configurar Cuota Diaria");
		mntmNewMenuItem_9.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\dia-de-paga.png"));
		mntmNewMenuItem_9.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_9);

		mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);

		mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_10.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\socio.png"));
		mntmNewMenuItem_10.addActionListener(this);
		mnNewMenu_4.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 setTitle("Mi Ventana");
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	     // Configurar el layout del content pane
	     getContentPane().setLayout(new BorderLayout());

	     // Agregar contenido
	     JLabel label = new JLabel("");
	     label.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\final3.png"));
	     getContentPane().add(label, BorderLayout.NORTH);

	     // Obtener el tamaño de la pantalla
	     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	     // Establecer el tamaño del content pane para que coincida con el tamaño de la pantalla
	     getContentPane().setPreferredSize(screenSize);

	     // Hacer visible la ventana
	     pack();
	     setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	     setVisible(true);
	}
      

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}

		if (e.getSource() == mntmNewMenuItem_9) {
			actionPerformedMntmNewMenuItem_9(e);
		}
		if (e.getSource() == mntmNewMenuItem_8) {
			actionPerformedMntmNewMenuItem_8(e);
		}
		if (e.getSource() == mntmNewMenuItem_7) {
			actionPerformedMntmNewMenuItem_7(e);
		}
		if (e.getSource() == mntmNewMenuItem_6) {
			actionPerformedMntmNewMenuItem_6(e);
		}
		if (e.getSource() == mntmNewMenuItem_5) {
			actionPerformedMntmNewMenuItem_5(e);
		}
		if (e.getSource() == mntmNewMenuItem_4) {
			actionPerformedMntmNewMenuItem_4(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem_10) {
			actionPerformedMntmNewMenuItem_10(e);
		}
		if (e.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(e);
		}
	}

	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {

		int opcion = JOptionPane.showConfirmDialog(this, "¿Desea Salir del Programa?", "Confirmar",
				JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			dispose();
			JOptionPane.showMessageDialog(null, "Gracias por Usar el Programa", "Adios",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {

		DialogoConsultarCocina obj = new DialogoConsultarCocina();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {

		DialogoModificarCocina obj = new DialogoModificarCocina();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {

		DialogoListar obj = new DialogoListar();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_4(ActionEvent e) {

		DialogoVender obj = new DialogoVender();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_5(ActionEvent e) {

		DialogoGenerarReportes obj = new DialogoGenerarReportes();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_6(ActionEvent e) {

		DialogoConfigurarDescuentos obj = new DialogoConfigurarDescuentos();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_7(ActionEvent e) {

		DialogoConfigurarObsequios obj = new DialogoConfigurarObsequios();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_8(ActionEvent e) {

		DialogoConfigurarCantidadOptima obj = new DialogoConfigurarCantidadOptima();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_9(ActionEvent e) {

		DialogoConfigurarCuotaDiaria obj = new DialogoConfigurarCuotaDiaria();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_10(ActionEvent e) {

		DialogoAcercaDeTienda obj = new DialogoAcercaDeTienda();
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);

	}
}
