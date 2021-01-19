import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField txtNombre;
    private JLabel lblLogo, lblTitulo, lblNombre, lblLuhesaga;
    private JButton btnIngresar;
    private Font fuente1, fuente2;
    private Color principal;
    public static String nombre = "";

    public Bienvenida() {
        fuente1 = new Font("Andale Mono", 3, 20);
        fuente2 = new Font("Andale Mono", 3, 14);
        principal = new Color(59, 130, 253);

        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(principal);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/mirage-vacation-planning.png");
        lblLogo = new JLabel(imagen);
        lblLogo.setBounds(25, 15, 300, 150);
        add(lblLogo);

        lblTitulo = new JLabel("Sistema de Control Vacacional");
        lblTitulo.setBounds(35, 180, 300, 30);
        lblTitulo.setFont(fuente1);
        lblTitulo.setForeground(new Color(250, 250, 250));
        add(lblTitulo);

        lblNombre = new JLabel("Ingrese su nombre");
        lblNombre.setBounds(45, 217, 200, 30);
        lblNombre.setFont(fuente2);
        lblNombre.setForeground(new Color(250, 250, 250));
        add(lblNombre);

        lblLuhesaga = new JLabel("2020 luhesaga");
        lblLuhesaga.setBounds(130, 375, 300, 30);
        lblLuhesaga.setFont(fuente2);
        lblLuhesaga.setForeground(new Color(250, 250, 250));
        add(lblLuhesaga);

        txtNombre = new JTextField();
        txtNombre.setBounds(45, 245, 255, 25);
        txtNombre.setBackground(new Color(224, 224, 224));
        txtNombre.setFont(fuente2);
        txtNombre.setForeground(principal);
        add(txtNombre);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(125, 285, 100, 30);
        btnIngresar.setBackground(new Color(250, 250, 250));
        btnIngresar.setFont(fuente2);
        btnIngresar.setForeground(principal);
        btnIngresar.addActionListener(this);
        add(btnIngresar);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == btnIngresar) {
            nombre = txtNombre.getText().trim();
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                Licencia ventaLicencia = new Licencia();
                ventaLicencia.setBounds(0, 0, 600, 420);
                ventaLicencia.setVisible(true);
                ventaLicencia.setResizable(false);
                ventaLicencia.setLocationRelativeTo(null);
                ventaLicencia.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setVisible(false);
            }
        }
    }

}