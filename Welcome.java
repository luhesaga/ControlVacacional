import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener {

    private JTextField txtName;
    private JLabel lblLogo, lblTitle, lblName, lblLuhesaga;
    private JButton btnEnter;
    private Font font1, font2;
    private Color mainColor;
    public static String name;

    public Welcome() {
        font1 = new Font("Andale Mono", 3, 20);
        font2 = new Font("Andale Mono", 3, 14);
        mainColor = new Color(59, 130, 253);

        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(mainColor);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/mirage-vacation-planning.png");
        lblLogo = new JLabel(imagen);
        lblLogo.setBounds(25, 15, 300, 150);
        add(lblLogo);

        lblTitle = new JLabel("Sistema de Control Vacacional");
        lblTitle.setBounds(35, 180, 300, 30);
        lblTitle.setFont(font1);
        lblTitle.setForeground(new Color(250, 250, 250));
        add(lblTitle);

        lblName = new JLabel("Ingrese su nombre");
        lblName.setBounds(45, 217, 200, 30);
        lblName.setFont(font2);
        lblName.setForeground(new Color(250, 250, 250));
        add(lblName);

        lblLuhesaga = new JLabel("2020 luhesaga");
        lblLuhesaga.setBounds(130, 375, 300, 30);
        lblLuhesaga.setFont(font2);
        lblLuhesaga.setForeground(new Color(250, 250, 250));
        add(lblLuhesaga);

        txtName = new JTextField();
        txtName.setBounds(45, 245, 255, 25);
        txtName.setBackground(new Color(224, 224, 224));
        txtName.setFont(font2);
        txtName.setForeground(mainColor);
        add(txtName);

        btnEnter = new JButton("Ingresar");
        btnEnter.setBounds(125, 285, 100, 30);
        btnEnter.setBackground(new Color(250, 250, 250));
        btnEnter.setFont(font2);
        btnEnter.setForeground(mainColor);
        btnEnter.addActionListener(this);
        add(btnEnter);
    }

    public static void changeName(String username) {
        name = username;
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == btnEnter) {
            changeName(txtName.getText().trim());
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                Licence licenceWindow = new Licence();
                licenceWindow.setBounds(0, 0, 600, 420);
                licenceWindow.setVisible(true);
                licenceWindow.setResizable(false);
                licenceWindow.setLocationRelativeTo(null);
                licenceWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setVisible(false);
            }
        }
    }

}