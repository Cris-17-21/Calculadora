import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Interfaz extends JFrame{
    public Interfaz (){
        super("Calculadora");
        setSize(420, 650);
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
        titulo.setBounds(90, 10, 260, 30);
        //Pantalla
        JTextField txtf = new JTextField();
        panel.add(txtf);
        txtf.setFont(new Font(getName(), 1, 30));
        txtf.setBounds(20, 60, 370, 50);
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
        btn1.setFont(new Font(getName(), 1, 30));
        btn2.setFont(new Font(getName(), 1, 30));
        btn3.setFont(new Font(getName(), 1, 30));
        btn4.setFont(new Font(getName(), 1, 30));
        btn5.setFont(new Font(getName(), 1, 30));
        btn6.setFont(new Font(getName(), 1, 30));
        btn7.setFont(new Font(getName(), 1, 30));
        btn8.setFont(new Font(getName(), 1, 30));
        btn9.setFont(new Font(getName(), 1, 30));
        btn10.setFont(new Font(getName(), 1, 30));
        btn11.setFont(new Font(getName(), 1, 30));
        btn12.setFont(new Font(getName(), 1, 30));
        btn13.setFont(new Font(getName(), 1, 30));
        btn14.setFont(new Font(getName(), 1, 30));
        btn15.setFont(new Font(getName(), 1, 30));
        btn16.setFont(new Font(getName(), 1, 30));
        btn17.setFont(new Font(getName(), 1, 30));
        btn18.setFont(new Font(getName(), 1, 30));
        btn19.setFont(new Font(getName(), 1, 30));
        btn16.setBounds(20, 130, 70, 70);
        btn17.setBounds(120, 130, 70, 70);
        btn18.setBounds(220, 130, 70, 70);
        btn19.setBounds(320, 130, 70, 70);
        btn12.setBounds(20, 230, 70, 70);
        btn13.setBounds(120, 230, 70, 70);
        btn14.setBounds(220, 230, 70, 70);
        btn15.setBounds(320, 230, 70, 70);
        btn8.setBounds(20, 330, 70, 70);
        btn9.setBounds(120, 330, 70, 70);
        btn10.setBounds(220, 330, 70, 70);
        btn11.setBounds(320, 330, 70, 70);
        btn4.setBounds(20, 430, 70, 70);
        btn5.setBounds(120, 430, 70, 70);
        btn6.setBounds(220, 430, 70, 70);
        btn7.setBounds(320, 430, 70, 70);
        btn1.setBounds(20, 530, 70, 70);
        btn2.setBounds(120, 530, 70, 70);
        btn3.setBounds(220, 530, 170, 70);
    }
}
