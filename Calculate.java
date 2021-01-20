import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculate extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu menuOptions;
    private JMenu menuCalculate;
    private JMenu menuAbout;
    private JMenu menuBackGround;
    private JMenuItem miCalculate;
    private JMenuItem miBlue;
    private JMenuItem miBlack;
    private JMenuItem miPurple;
    private JMenuItem miAuthor;
    private JMenuItem miExit;
    private JMenuItem miNew;
    private JLabel lblLogo;
    private JLabel lblWelcome;
    private JLabel lblTitle;
    private JLabel lblName;
    private JLabel lblLastName1;
    private JLabel lblLastName2;
    private JLabel lblDepartment;
    private JLabel lblAntiquity;
    private JLabel lblResult;
    private JLabel lblFooter;
    private JTextField txtName;
    private JTextField txtLastName1;
    private JTextField txtLastName2;
    private JComboBox<String> cbxDepartment;
    private JComboBox<String> cbxAntiquity;
    private JScrollPane scrollpane1;
    private JTextArea textArea1;
    private String font1;
    private Color blue;
    private Color black;
    private Color purple;
    private String name;
    private String[] antiquity = {"1 año de servicio", "2 a 6 años de servicio", "7 años o más de servicio"};;

    public Calculate() {
        font1 = "Andale Mono";
        blue = new Color(59, 130, 253);
        black = new Color(10, 10, 10);
        purple = new Color(240, 10, 240);
        name = Welcome.name;
        setLayout(null);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(blue);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        mb = new JMenuBar();
        mb.setBackground(blue);
        setJMenuBar(mb);

        menuOptions = new JMenu("Opciones");
        menuOptions.setBackground(blue);
        menuOptions.setFont(new Font(font1, 1, 14));
        menuOptions.setForeground(new Color(250, 250, 250));
        mb.add(menuOptions);

        menuBackGround = new JMenu("Color de Fondo");
        menuBackGround.setFont(new Font(font1, 1, 14));
        menuBackGround.setForeground(blue);
        menuOptions.add(menuBackGround);

        miBlue = new JMenuItem("Azul");
        miBlue.setFont(new Font(font1, 1, 14));
        miBlue.setForeground(blue);
        menuBackGround.add(miBlue);
        miBlue.addActionListener(this);

        miBlack = new JMenuItem("Negro");
        miBlack.setFont(new Font(font1, 1, 14));
        miBlack.setForeground(blue);
        menuBackGround.add(miBlack);
        miBlack.addActionListener(this);

        miPurple = new JMenuItem("Morado");
        miPurple.setFont(new Font(font1, 1, 14));
        miPurple.setForeground(blue);
        menuBackGround.add(miPurple);
        miPurple.addActionListener(this);

        miNew = new JMenuItem("Nuevo");
        miNew.setFont(new Font(font1, 1, 14));
        miNew.setForeground(blue);
        menuOptions.add(miNew);
        miNew.addActionListener(this);

        miExit = new JMenuItem("Salir");
        miExit.setFont(new Font(font1, 1, 14));
        miExit.setForeground(blue);
        menuOptions.add(miExit);
        miExit.addActionListener(this);

        menuCalculate = new JMenu("Calcular");
        menuCalculate.setBackground(blue);
        menuCalculate.setFont(new Font(font1, 1, 14));
        menuCalculate.setForeground(new Color(250, 250, 250));
        mb.add(menuCalculate);

        miCalculate = new JMenuItem("Vacaciones");
        miCalculate.setFont(new Font(font1, 1, 14));
        miCalculate.setForeground(blue);
        menuCalculate.add(miCalculate);
        miCalculate.addActionListener(this);

        menuAbout = new JMenu("Acerca de");
        menuAbout.setBackground(blue);
        menuAbout.setFont(new Font(font1, 1, 14));
        menuAbout.setForeground(new Color(250, 250, 250));
        mb.add(menuAbout);

        miAuthor = new JMenuItem("El creador");
        miAuthor.setFont(new Font(font1, 1, 14));
        miAuthor.setForeground(blue);
        menuAbout.add(miAuthor);
        miAuthor.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/calculo.png");
        lblLogo = new JLabel(imagen);
        lblLogo.setBounds(5, 5, 250, 100);
        add(lblLogo);

        lblWelcome = new JLabel("Bienvenido " + name);
        lblWelcome.setBounds(280, 30, 300, 50);
        lblWelcome.setFont(new Font(font1, 1, 32));
        lblWelcome.setForeground(new Color(250, 250, 250));
        add(lblWelcome);

        lblTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        lblTitle.setBounds(45, 140, 900, 25);
        lblTitle.setFont(new Font(font1, 0, 24));
        lblTitle.setForeground(new Color(250, 250, 250));
        add(lblTitle);

        lblName = new JLabel("Nombre completo:");
        lblName.setBounds(25, 188, 180, 25);
        lblName.setFont(new Font(font1, 1, 12));
        lblName.setForeground(new Color(250, 250, 250));
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(25, 213, 150, 25);
        txtName.setBackground(new Color(224, 224, 224));
        txtName.setFont(new Font(font1, 1, 14));
        txtName.setForeground(blue);
        add(txtName);

        lblLastName1 = new JLabel("Primer Apellido:");
        lblLastName1.setBounds(25, 248, 180, 25);
        lblLastName1.setFont(new Font(font1, 1, 12));
        lblLastName1.setForeground(new Color(250, 250, 250));
        add(lblLastName1);

        txtLastName1 = new JTextField();
        txtLastName1.setBounds(25, 273, 150, 25);
        txtLastName1.setBackground(new Color(224, 224, 224));
        txtLastName1.setFont(new Font(font1, 1, 14));
        txtLastName1.setForeground(blue);
        add(txtLastName1);

        lblLastName2 = new JLabel("Segundo Apellido:");
        lblLastName2.setBounds(25, 308, 180, 25);
        lblLastName2.setFont(new Font(font1, 1, 12));
        lblLastName2.setForeground(new Color(250, 250, 250));
        add(lblLastName2);

        txtLastName2 = new JTextField();
        txtLastName2.setBounds(25, 334, 150, 25);
        txtLastName2.setBackground(new Color(224, 224, 224));
        txtLastName2.setFont(new Font(font1, 1, 14));
        txtLastName2.setForeground(blue);
        add(txtLastName2);

        lblDepartment = new JLabel("Selecciona el Departamento:");
        lblDepartment.setBounds(220, 188, 180, 25);
        lblDepartment.setFont(new Font(font1, 1, 12));
        lblDepartment.setForeground(new Color(250, 250, 250));
        add(lblDepartment);

        cbxDepartment = new JComboBox();
        cbxDepartment.setBounds(220, 213, 220, 25);
        cbxDepartment.setBackground(new Color(224, 224, 224));
        cbxDepartment.setFont(new Font(font1, 1, 14));
        cbxDepartment.setForeground(blue);
        add(cbxDepartment);
        cbxDepartment.addItem("");
        cbxDepartment.addItem("Atención al Cliente");
        cbxDepartment.addItem("Logística");
        cbxDepartment.addItem("Gerencia");

        lblAntiquity = new JLabel("Selecciona la Antiguedad:");
        lblAntiquity.setBounds(220, 248, 180, 25);
        lblAntiquity.setFont(new Font(font1, 1, 12));
        lblAntiquity.setForeground(new Color(250, 250, 250));
        add(lblAntiquity);

        cbxAntiquity = new JComboBox();
        cbxAntiquity.setBounds(220, 273, 220, 25);
        cbxAntiquity.setBackground(new Color(224, 224, 224));
        cbxAntiquity.setFont(new Font(font1, 1, 14));
        cbxAntiquity.setForeground(blue);
        add(cbxAntiquity);
        cbxAntiquity.addItem("");
        cbxAntiquity.addItem(antiquity[0]);
        cbxAntiquity.addItem(antiquity[1]);
        cbxAntiquity.addItem(antiquity[2]);

        lblResult = new JLabel("Resultado del Cálculo:");
        lblResult.setBounds(220, 307, 180, 25);
        lblResult.setFont(new Font(font1, 1, 12));
        lblResult.setForeground(new Color(250, 250, 250));
        add(lblResult);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224, 224, 224));
        textArea1.setFont(new Font(font1, 1, 11));
        textArea1.setForeground(blue);
        textArea1.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textArea1);
        scrollpane1.setBounds(220, 333, 385, 90);
        add(scrollpane1);

        lblFooter = new JLabel("©2020 Luhesaga | todos los derechos reservados");
        lblFooter.setBounds(135, 445, 500, 30);
        lblFooter.setFont(new Font(font1, 1, 12));
        lblFooter.setForeground(new Color(250, 250, 250));
        add(lblFooter);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == miCalculate) {
            String employeName = txtName.getText();
            String employeeLst1 = txtLastName1.getText();
            String employeeLst2 = txtLastName2.getText();
            String dep = cbxDepartment.getSelectedItem().toString();
            String ant = cbxAntiquity.getSelectedItem().toString();

            if (emptyCheck(employeName, employeeLst1, employeeLst2, dep, ant)) {
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
            } else {
                hollydaysCalculate(employeName, employeeLst1, employeeLst2, dep, ant);
            }
        }
        if (ev.getSource() == miBlue) {
            getContentPane().setBackground(blue);
        }
        if (ev.getSource() == miBlack) {
            getContentPane().setBackground(black);
        }
        if (ev.getSource() == miPurple) {
            getContentPane().setBackground(purple);
        }
        if (ev.getSource() == miNew) {
            txtLastName2.setText("");
            txtLastName1.setText("");
            txtName.setText("");
            cbxAntiquity.setSelectedIndex(0);
            cbxDepartment.setSelectedIndex(0);
            textArea1.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        }
        if (ev.getSource() == miExit) {
            Welcome ventanaBienvenida = new Welcome();
            ventanaBienvenida.setBounds(0, 0, 380, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            ventanaBienvenida.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }
        if (ev.getSource() == miAuthor) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Luhesaga." );
        }
    }

    private void hollydaysCalculate(
        String name,
        String lastName1,
        String lastName2,
        String department,
        String antiq
    ) {
        int hollyDays = 0;
        if (department.equals("Atención al Cliente")) {
            if (antiq.equals(antiquity[0])) {
                hollyDays = 6;
            } else if (antiq.equals(antiquity[1])) {
                hollyDays = 14;
            } else {
                hollyDays = 20;
            }
        } else if (department.equals("Logística")) {
            if (antiq.equals(antiquity[0])) {
                hollyDays = 7;
            } else if (antiq.equals(antiquity[1])) {
                hollyDays = 15;
            } else {
                hollyDays = 22;
            }
        } else {
            if (antiq.equals(antiquity[0])) {
                hollyDays = 10;
            } else if (antiq.equals(antiquity[1])) {
                hollyDays = 20;
            } else {
                hollyDays = 30;
            }
        }

        textArea1.setText("\n El trabajador " + name + " " +
                            lastName1 + " " + lastName2 + " " +
                            "\n quien labora en " + department + " con " +
                            antiq + "\n recibe " + hollyDays + " dias de vacaciones.");
    }


    private Boolean emptyCheck(
        String name,
        String lastName1,
        String lastName2,
        String department,
        String antiquity
    ) {
        Boolean validation = false;

        if (name.equals("") ||
            lastName1.equals("") ||
            lastName2.equals("") ||
            department.equals("") ||
            antiquity.equals("")) {

                validation = true;
            } else {
                validation = false;
            }

        return validation;
    }

}
