import java.awt.Color;
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
        panel.setBackground(Color.LIGHT_GRAY);
        //Titulo de la calculadora
        JLabel titulo = new JLabel("Calculadora PRO");
        panel.add(titulo);
        titulo.setFont(new Font(getName(), 1, 30));
        titulo.setBounds(130, 10, 260, 30);
        //Pantalla
        JTextField txtf = new JTextField();
        panel.add(txtf);
        txtf.setBounds(20, 60, 450, 50);
        //Botones
        JButton btn1 = new JButton("0");
        JButton btn2 = new JButton(".");
        JButton btn3 = new JButton("=");
        JButton btn4 = new JButton("1");
        JButton btn5 = new JButton("2");
        JButton btn6 = new JButton("3");
        JButton btn7 = new JButton("+");
        JButton btn8 = new JButton("4");
        JButton btn9 = new JButton("5");
        JButton btn10 = new JButton("6");
        JButton btn11 = new JButton("-");
        JButton btn12 = new JButton("7");
        JButton btn13 = new JButton("8");
        JButton btn14 = new JButton("9");
        JButton btn15 = new JButton("x");
        JButton btn16 = new JButton("√");
        JButton btn17 = new JButton("^");
        JButton btn18 = new JButton("!");
        JButton btn19 = new JButton("/");
        panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btn4); panel.add(btn5); panel.add(btn6); panel.add(btn7); panel.add(btn8); panel.add(btn9);
        panel.add(btn10); panel.add(btn11); panel.add(btn12); panel.add(btn13); panel.add(btn14); panel.add(btn15); panel.add(btn16); panel.add(btn17);
        panel.add(btn18); panel.add(btn19);
        
    }
}
