import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel lblLogo, lblBienvenido, lblTitle, lblNombre, lblAPaterno, lblAMAterno,
                    lblDepartamento, lblAntiguedad, lblResultado, lblFooter;
    private JTextField txtNombre, txtAPaterno, txtAMaterno;
    private JComboBox cbxDepartamento, cbxAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textArea1;
    private String fuente;
    private Color principal;

    public Principal() {
        fuente = "Andale Mono";
        principal = new Color(59, 130, 253);
        setLayout(null);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(principal);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        mb = new JMenuBar();
        mb.setBackground(principal);
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(principal);
        menuOpciones.setFont(new Font(fuente, 1, 14));
        menuOpciones.setForeground(new Color(250, 250, 250));
        mb.add(menuOpciones);

        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font(fuente, 1, 14));
        menuColorFondo.setForeground(principal);
        menuOpciones.add(menuColorFondo);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font(fuente, 1, 14));
        miRojo.setForeground(principal);
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font(fuente, 1, 14));
        miNegro.setForeground(principal);
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font(fuente, 1, 14));
        miMorado.setForeground(principal);
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font(fuente, 1, 14));
        miNuevo.setForeground(principal);
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font(fuente, 1, 14));
        miSalir.setForeground(principal);
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(principal);
        menuCalcular.setFont(new Font(fuente, 1, 14));
        menuCalcular.setForeground(new Color(250, 250, 250));
        mb.add(menuCalcular);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font(fuente, 1, 14));
        miCalculo.setForeground(principal);
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(principal);
        menuAcercaDe.setFont(new Font(fuente, 1, 14));
        menuAcercaDe.setForeground(new Color(250, 250, 250));
        mb.add(menuAcercaDe);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font(fuente, 1, 14));
        miElCreador.setForeground(principal);
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/calculo.png");
        lblLogo = new JLabel(imagen);
        lblLogo.setBounds(5, 5, 250, 100);
        add(lblLogo);

        lblBienvenido = new JLabel("Bienvenido");
        lblBienvenido.setBounds(280, 30, 300, 50);
        lblBienvenido.setFont(new Font(fuente, 1, 32));
        lblBienvenido.setForeground(new Color(250, 250, 250));
        add(lblBienvenido);

        lblTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        lblTitle.setBounds(45, 140, 900, 25);
        lblTitle.setFont(new Font(fuente, 0, 24));
        lblTitle.setForeground(new Color(250, 250, 250));
        add(lblTitle);

        lblNombre = new JLabel("Nombre completo:");
        lblNombre.setBounds(25, 188, 180, 25);
        lblNombre.setFont(new Font(fuente, 1, 12));
        lblNombre.setForeground(new Color(250, 250, 250));
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(25, 213, 150, 25);
        txtNombre.setBackground(new Color(224, 224, 224));
        txtNombre.setFont(new Font(fuente, 1, 14));
        txtNombre.setForeground(principal);
        add(txtNombre);

        lblAPaterno = new JLabel("Primer Apellido:");
        lblAPaterno.setBounds(25, 248, 180, 25);
        lblAPaterno.setFont(new Font(fuente, 1, 12));
        lblAPaterno.setForeground(new Color(250, 250, 250));
        add(lblAPaterno);

        txtAPaterno = new JTextField();
        txtAPaterno.setBounds(25, 273, 150, 25);
        txtAPaterno.setBackground(new Color(224, 224, 224));
        txtAPaterno.setFont(new Font(fuente, 1, 14));
        txtAPaterno.setForeground(principal);
        add(txtAPaterno);

        lblAMAterno = new JLabel("Segundo Apellido:");
        lblAMAterno.setBounds(25, 308, 180, 25);
        lblAMAterno.setFont(new Font(fuente, 1, 12));
        lblAMAterno.setForeground(new Color(250, 250, 250));
        add(lblAMAterno);

        txtAMaterno = new JTextField();
        txtAMaterno.setBounds(25, 334, 150, 25);
        txtAMaterno.setBackground(new Color(224, 224, 224));
        txtAMaterno.setFont(new Font(fuente, 1, 14));
        txtAMaterno.setForeground(principal);
        add(txtAMaterno);

        lblDepartamento = new JLabel("Selecciona el Departamento:");
        lblDepartamento.setBounds(220, 188, 180, 25);
        lblDepartamento.setFont(new Font(fuente, 1, 12));
        lblDepartamento.setForeground(new Color(250, 250, 250));
        add(lblDepartamento);

        cbxDepartamento = new JComboBox();
        cbxDepartamento.setBounds(220, 213, 220, 25);
        cbxDepartamento.setBackground(new Color(224, 224, 224));
        cbxDepartamento.setFont(new Font(fuente, 1, 14));
        cbxDepartamento.setForeground(principal);
        add(cbxDepartamento);
        cbxDepartamento.addItem("");
        cbxDepartamento.addItem("Atención al Cliente");
        cbxDepartamento.addItem("Logística");
        cbxDepartamento.addItem("Gerencia");

        lblAntiguedad = new JLabel("Selecciona la Antiguedad:");
        lblAntiguedad.setBounds(220, 248, 180, 25);
        lblAntiguedad.setFont(new Font(fuente, 1, 12));
        lblAntiguedad.setForeground(new Color(250, 250, 250));
        add(lblAntiguedad);

        cbxAntiguedad = new JComboBox();
        cbxAntiguedad.setBounds(220, 273, 220, 25);
        cbxAntiguedad.setBackground(new Color(224, 224, 224));
        cbxAntiguedad.setFont(new Font(fuente, 1, 14));
        cbxAntiguedad.setForeground(principal);
        add(cbxAntiguedad);
        cbxAntiguedad.addItem("");
        cbxAntiguedad.addItem("1 año de servicio");
        cbxAntiguedad.addItem("2 a 6 años de servicio");
        cbxAntiguedad.addItem("7 años o más de servicio");

        lblResultado = new JLabel("Resultado del Cálculo:");
        lblResultado.setBounds(220, 307, 180, 25);
        lblResultado.setFont(new Font(fuente, 1, 12));
        lblResultado.setForeground(new Color(250, 250, 250));
        add(lblResultado);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224, 224, 224));
        textArea1.setFont(new Font(fuente, 1, 11));
        textArea1.setForeground(principal);
        textArea1.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textArea1);
        scrollpane1.setBounds(220, 333, 385, 90);
        add(scrollpane1);

        lblFooter = new JLabel("©2020 Luhesaga | todos los derechos reservados");
        lblFooter.setBounds(135, 445, 500, 30);
        lblFooter.setFont(new Font(fuente, 1, 12));
        lblFooter.setForeground(new Color(250, 250, 250));
        add(lblFooter);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == miCalculo) {
            System.out.print("calculo");
        }
        if (ev.getSource() == miRojo) {
            System.out.print("rojo");
        }
        if (ev.getSource() == miNegro) {
            System.out.print("negro");
        }
        if (ev.getSource() == miMorado) {
            System.out.print("morado");
        }
        if (ev.getSource() == miNuevo) {
            System.out.print("nuevo");
        }
        if (ev.getSource() == miSalir) {
            System.out.print("salir");
        }
        if (ev.getSource() == miElCreador) {
            System.out.print("creador");
        }
    }

}
