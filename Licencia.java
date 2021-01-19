import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton btnAceptar, btnCancelar;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private String fuente;
    private Color principal;
    private String nombre;

    public Licencia() {
        fuente = "Andale Mono";
        principal = new Color(59, 130, 253);
        nombre = Bienvenida.nombre;

        setLayout(null);
        setTitle("Licencia de Uso");
        getContentPane().setBackground(principal);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font(fuente, 1, 14));
        label1.setForeground(new Color(250, 250, 250));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font(fuente, 0, 12));
        textArea1.setText(
            "\n\n         TÉRMINOS Y CONDICIONES" +
            "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LUHESAGA." +
            "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
            "\n            C.  LUHESAGA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
            "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
            "\n          (EL AUTOR LUHESAGA), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
            "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
            "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
            "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
            "\n          https://github.com/luhesaga");

        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 40, 560, 200);
        add(scrollPane1);

        check1 = new JCheckBox("Yo " + nombre + ", Acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.setForeground(new Color(250, 250, 250));
        check1.setBackground(principal);
        check1.addChangeListener(this);
        add(check1);

        btnAceptar = new JButton("Acepto");
        btnAceptar.setBounds(10, 290, 100, 30);
        btnAceptar.setBackground(new Color(250, 250, 250));
        btnAceptar.setForeground(principal);
        btnAceptar.addActionListener(this);
        btnAceptar.setEnabled(false);
        add(btnAceptar);

        btnCancelar = new JButton("No Acepto");
        btnCancelar.setBounds(120, 290, 100, 30);
        btnCancelar.setBackground(new Color(250, 250, 250));
        btnCancelar.setForeground(principal);
        btnCancelar.addActionListener(this);
        btnCancelar.setEnabled(true);
        add(btnCancelar);

        ImageIcon imagen = new ImageIcon("images/mirage-vacation-planning2.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 225, 300, 150);
        add(label2);
    }

    public void stateChanged(ChangeEvent ev) {
        if (check1.isSelected()) {
            btnAceptar.setEnabled(true);
            btnCancelar.setEnabled(false);
        } else {
            btnAceptar.setEnabled(false);
            btnCancelar.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == btnAceptar) {
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0, 0, 640, 555);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        } else if (ev.getSource() == btnCancelar) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0, 0, 380, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            ventanaBienvenida.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }
    }

    // public static void main(String args[]) {
    //     Licencia ventaLicencia = new Licencia();
    //     ventaLicencia.setBounds(0, 0, 600, 420);
    //     ventaLicencia.setVisible(true);
    //     ventaLicencia.setResizable(false);
    //     ventaLicencia.setLocationRelativeTo(null);
    //     ventaLicencia.setDefaultCloseOperation(EXIT_ON_CLOSE);
    // }

}
