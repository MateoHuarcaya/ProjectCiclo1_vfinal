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

public class DialogoConfigurarCuotaDiaria extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuotaDiaria;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarCuotaDiaria dialog = new DialogoConfigurarCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarCuotaDiaria() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\dia-de-paga.png"));
		setModal(true);
		setTitle("Configurar Cuota Diaria");
		setBounds(100, 100, 450, 105);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCuotaDiaria = new JLabel("Cuota Diaria Esperada (S/.)");
			lblCuotaDiaria.setBounds(10, 11, 183, 14);
			contentPanel.add(lblCuotaDiaria);
		}
		{
			txtCuotaDiaria = new JTextField();
			txtCuotaDiaria.setText(String.valueOf(Menu.cuotaDiaria));
			txtCuotaDiaria.setBounds(180, 8, 145, 20);
			contentPanel.add(txtCuotaDiaria);
			txtCuotaDiaria.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matthcode\\Documents\\Proyects_programming\\Proyect_Git\\ProjectCiclo1_vfinal\\pictures\\fondo2.jpg"));
			lblNewLabel.setBounds(0, 0, 436, 68);
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
	
	//=======================================================================
	void mensajeConfirmacion() {
		int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro de Realizar este Cambio?", "Confirmar",
				JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			Menu.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());
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
