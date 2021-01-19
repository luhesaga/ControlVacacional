import javax.swing.*;

public class Inicio extends JFrame {
    public static void main(String[] args) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0, 0, 380, 450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
        ventanaBienvenida.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
