package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class DialogoAcercaDeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda;
	private JButton btnCerrar;
	private JLabel lblAutor;
	private JLabel lblFecha;
	private JLabel lblLugar;
	private JLabel lblIntegrante1;
	private JLabel lblIntegrante2;
	private JLabel lblIntegrante3;
	private JLabel lblIntegrante4;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			DialogoAcercaDeTienda dialog = new DialogoAcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAcercaDeTienda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\socio.png"));
		setModal(true);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 319);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTienda.setBounds(164, 11, 89, 17);
		contentPanel.add(lblTienda);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(164, 246, 96, 23);
		contentPanel.add(btnCerrar);

		lblAutor = new JLabel(" Integrantes");
		lblAutor.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblAutor.setBounds(164, 54, 96, 15);
		contentPanel.add(lblAutor);

		lblFecha = new JLabel("2024");
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblFecha.setBounds(197, 194, 56, 15);
		contentPanel.add(lblFecha);

		lblLugar = new JLabel("Lima, Per\u00FA");
		lblLugar.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblLugar.setBounds(178, 220, 102, 15);
		contentPanel.add(lblLugar);
		
		lblIntegrante1 = new JLabel("Mateo Huarcaya Melgarejo");
		lblIntegrante1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIntegrante1.setBounds(145, 80, 165, 14);
		contentPanel.add(lblIntegrante1);
		
		lblIntegrante2 = new JLabel("Abdel  Abad  Asto");
		lblIntegrante2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIntegrante2.setBounds(166, 105, 130, 14);
		contentPanel.add(lblIntegrante2);
		
		lblIntegrante3 = new JLabel("Jose  Fernando  Julca");
		lblIntegrante3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIntegrante3.setBounds(156, 130, 176, 14);
		contentPanel.add(lblIntegrante3);
		
		lblIntegrante4 = new JLabel("Andy Valdivia Centeno");
		lblIntegrante4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIntegrante4.setBounds(156, 156, 176, 14);
		contentPanel.add(lblIntegrante4);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\8522393.jpg"));
		lblNewLabel.setBounds(0, 0, 436, 282);
		contentPanel.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
