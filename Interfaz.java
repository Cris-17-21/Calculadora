import java.awt.Font;
import javax.swing.*;

public class Interfaz extends JFrame{
    public Interfaz (){
        super("Calculadora");
        setSize(500, 700);
        setLocation(500, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Panel
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);
        //Titulo de la calculadora
        JLabel titulo = new JLabel("Calculadora PRO");
        panel.add(titulo);
        titulo.setFont(new Font(getName(), 1, 30));
        titulo.setBounds(130, 10, 260, 30);
    }
}
