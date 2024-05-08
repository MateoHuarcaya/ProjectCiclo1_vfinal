package proyecto;

import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DialogoListar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoListar dialog = new DialogoListar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoListar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("pictures/tarea-completada.png"));
		setModal(true);
		setTitle("Listado de Cocinas");
		setBounds(100, 100, 466, 321);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 226);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(237, 248, 89, 23);
		getContentPane().add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(113, 248, 89, 23);
		getContentPane().add(btnListar);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("pictures/fondo2.jpg"));
		lblNewLabel.setBounds(0, 0, 452, 284);
		getContentPane().add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}

	// =====================================================================================

	void imprimir(String cad) {

		txtS.append(cad + "\n");
	}

	void ImprimirListadoCocina() {
		txtS.setText("LISTADO DE COCINAS\n\n");
		imprimir("Modelo\t\t: " + Menu.modelo0);
		imprimir("Precio\t\t: " + "S/ " + String.format("%,12.2f", Menu.precio0));
		imprimir("Profundidad\t: " + String.format("%,12.2f", Menu.fondo0) + " cm");
		imprimir("Ancho\t\t: " + String.format("%,12.2f", Menu.ancho0) + " cm");
		imprimir("Alto\t\t: " + String.format("%,12.2f", Menu.alto0) + " cm");
		imprimir("Quemadores\t: " + String.format("%15d", Menu.quemadores0));
		imprimir("");
		imprimir("Modelo\t\t: " + String.format("%15s",Menu.modelo1));
		imprimir("Precio\t\t: " + "S/ " + String.format("%,12.2f", Menu.precio1));
		imprimir("Profundidad\t: " + String.format("%,12.2f", Menu.fondo1) + " cm");
		imprimir("Ancho\t\t: " + String.format("%,12.2f", Menu.ancho1) + " cm");
		imprimir("Alto\t\t: " + String.format("%,12.2f", Menu.alto1) + " cm");
		imprimir("Quemadores\t: " + String.format("%15d", Menu.quemadores1));
		imprimir("");
		imprimir("Modelo\t\t: " + String.format("%15s",Menu.modelo2));
		imprimir("Precio\t\t: " + "S/ " + String.format("%,12.2f", Menu.precio2));
		imprimir("Profundidad\t: " + String.format("%,12.2f", Menu.fondo2) + " cm");
		imprimir("Ancho\t\t: " + String.format("%,12.2f", Menu.ancho2) + " cm");
		imprimir("Alto\t\t: " + String.format("%,12.2f", Menu.alto2) + " cm");
		imprimir("Quemadores\t: " + String.format("%15d", Menu.quemadores2));
		imprimir("");
		imprimir("Modelo\t\t: " + String.format("%15s",Menu.modelo3));
		imprimir("Precio\t\t: " + "S/ " + String.format("%,12.2f", Menu.precio3));
		imprimir("Profundidad\t: " + String.format("%,12.2f", Menu.fondo3) + " cm");
		imprimir("Ancho\t\t: " + String.format("%,12.2f", Menu.ancho3) + " cm");
		imprimir("Alto\t\t: " + String.format("%,12.2f", Menu.alto3) + " cm");
		imprimir("Quemadores\t: " + String.format("%15d", Menu.quemadores3));
		imprimir("");
		imprimir("Modelo\t\t: " + String.format("%15s",Menu.modelo4));
		imprimir("Precio\t\t: " + "S/ " + String.format("%,12.2f", Menu.precio4));
		imprimir("Profundidad\t: " + String.format("%,12.2f", Menu.fondo4) + " cm");
		imprimir("Ancho\t\t: " + String.format("%,12.2f", Menu.ancho4) + " cm");
		imprimir("Alto\t\t: " + String.format("%,12.2f", Menu.alto4) + " cm");
		imprimir("Quemadores\t: " + String.format("%15d", Menu.quemadores4));

	}

	protected void actionPerformedBtnListar(ActionEvent e) {

		ImprimirListadoCocina();

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}

}