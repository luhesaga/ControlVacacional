import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licence extends JFrame implements ActionListener, ChangeListener {

    private JLabel lblTerms;
    private JLabel lblImage;
    private JCheckBox check1;
    private JButton btnAcept;
    private JButton btnCancel;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private String font1;
    private Color mainColor;
    private String name;

    public Licence() {
        font1 = "Andale Mono";
        mainColor = new Color(59, 130, 253);
        name = Welcome.name;

        setLayout(null);
        setTitle("Licencia de Uso");
        getContentPane().setBackground(mainColor);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        lblTerms = new JLabel("TÉRMINOS Y CONDICIONES");
        lblTerms.setBounds(215, 5, 200, 30);
        lblTerms.setFont(new Font(font1, 1, 14));
        lblTerms.setForeground(new Color(250, 250, 250));
        add(lblTerms);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font(font1, 0, 12));
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

        check1 = new JCheckBox("Yo " + name + ", Acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.setForeground(new Color(250, 250, 250));
        check1.setBackground(mainColor);
        check1.addChangeListener(this);
        add(check1);

        btnAcept = new JButton("Acepto");
        btnAcept.setBounds(10, 290, 100, 30);
        btnAcept.setBackground(new Color(250, 250, 250));
        btnAcept.setForeground(mainColor);
        btnAcept.addActionListener(this);
        btnAcept.setEnabled(false);
        add(btnAcept);

        btnCancel = new JButton("No Acepto");
        btnCancel.setBounds(120, 290, 100, 30);
        btnCancel.setBackground(new Color(250, 250, 250));
        btnCancel.setForeground(mainColor);
        btnCancel.addActionListener(this);
        btnCancel.setEnabled(true);
        add(btnCancel);

        ImageIcon imagen = new ImageIcon("images/mirage-vacation-planning2.png");
        lblImage = new JLabel(imagen);
        lblImage.setBounds(315, 225, 300, 150);
        add(lblImage);
    }

    public void stateChanged(ChangeEvent ev) {
        if (check1.isSelected()) {
            btnAcept.setEnabled(true);
            btnCancel.setEnabled(false);
        } else {
            btnAcept.setEnabled(false);
            btnCancel.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == btnAcept) {
            Calculate mainWindow = new Calculate();
            mainWindow.setBounds(0, 0, 640, 555);
            mainWindow.setVisible(true);
            mainWindow.setResizable(false);
            mainWindow.setLocationRelativeTo(null);
            mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        } else if (ev.getSource() == btnCancel) {
            Welcome welcomeWindow = new Welcome();
            welcomeWindow.setBounds(0, 0, 380, 450);
            welcomeWindow.setVisible(true);
            welcomeWindow.setResizable(false);
            welcomeWindow.setLocationRelativeTo(null);
            welcomeWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }
    }

}
