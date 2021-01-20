import javax.swing.*;

public class appLauncher extends JFrame {
    public static void main(String[] args) {
        Welcome welcomeWindow = new Welcome();
        welcomeWindow.setBounds(0, 0, 380, 450);
        welcomeWindow.setVisible(true);
        welcomeWindow.setResizable(false);
        welcomeWindow.setLocationRelativeTo(null);
        welcomeWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
