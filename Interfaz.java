import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz extends JFrame{
    double [] numeros = {0, 0};
    int operacion;
    int auxiliar = 0;
    double numResultado = 0;
    int auxResultado = 0;
    String [] operaciones = {"+", "-", "x", "/", "^", "!", "√"};
    int xd = 0;
    int auxPotencia = 0;

    public Interfaz (){
        super("Calculadora");
        setSize(420, 700);
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
        JTextField txtf = new JTextField("");
        panel.add(txtf);
        txtf.setFont(new Font(getName(), 1, 30));
        txtf.setEditable(false);;
        txtf.setBounds(20, 60, 370, 50);
        //Resultado
        JTextField resultado = new JTextField("=");
        panel.add(resultado);
        resultado.setHorizontalAlignment(JTextField.RIGHT);
        resultado.setFont(new Font(getName(), 1, 30));
        resultado.setEditable(false);
        resultado.setBounds(20, 110, 370, 50);
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
        btn16.setBounds(20, 180, 70, 70);
        btn17.setBounds(120, 180, 70, 70);
        btn18.setBounds(220, 180, 70, 70);
        btn19.setBounds(320, 180, 70, 70);
        btn12.setBounds(20, 280, 70, 70);
        btn13.setBounds(120, 280, 70, 70);
        btn14.setBounds(220, 280, 70, 70);
        btn15.setBounds(320, 280, 70, 70);
        btn8.setBounds(20, 380, 70, 70);
        btn9.setBounds(120, 380, 70, 70);
        btn10.setBounds(220, 380, 70, 70);
        btn11.setBounds(320, 380, 70, 70);
        btn4.setBounds(20, 480, 70, 70);
        btn5.setBounds(120, 480, 70, 70);
        btn6.setBounds(220, 480, 70, 70);
        btn7.setBounds(320, 480, 70, 70);
        btn1.setBounds(20, 580, 70, 70);
        btn2.setBounds(120, 580, 70, 70);
        btn3.setBounds(220, 580, 170, 70);

        //EVENTOS
        //Operadores
        //Suma = 1; Resta = 2; Multiplicacion = 3; Division = 4; Raiz = 5; Potencia = 6; Factorial = 7
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (xd == 0){
                    txtf.setText(txtf.getText()+"+");
                    xd = 1;
                } 
                operacion = 1;
            }
        });
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (xd == 0){
                    txtf.setText(txtf.getText()+"-");
                    xd = 1;
                } 
                operacion = 2;
            }
        });
        btn15.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (xd == 0){
                    txtf.setText(txtf.getText()+"x");
                    xd = 1;
                } 
                operacion = 3;
            }
        });
        btn16.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (xd == 0){
                    txtf.setText(txtf.getText()+"√");
                    xd = 1;
                } 
                operacion = 5;
            }
        });
        btn17.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (xd == 0){
                    txtf.setText(txtf.getText()+"^");
                    xd = 1;
                } 
                operacion = 6;
            }
        });
        btn18.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                //Encontrar numero para la operacion
                operacion = 7;
            }
        });
        btn19.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (xd == 0){
                    txtf.setText(txtf.getText()+"/");
                    xd = 1;
                }
                operacion = 4;
            }
        });

        //Numeros
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("1");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"1");
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("2");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"2");
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("3");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"3");
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("4");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"4");
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("5");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"5");
                }
            }
        });
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("6");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"6");
                }
            }
        });
        btn12.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("7");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"7");
                }
            }
        });
        btn13.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("8");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"8");
                }
            }
        });
        btn14.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("9");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"9");
                }
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(auxiliar == 0){
                    txtf.setText("0");
                    auxiliar = 1;
                } else {
                    txtf.setText(txtf.getText()+"0");
                }
            }
        });
        //Punto
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                txtf.setText(txtf.getText()+".");
            }
        });
        //Resultado
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                auxiliar = 0;
                xd = 0;
            }
        });
    }

    public void encontrarNumeros (JTextField txt){
        for (int i = 0; i < operaciones.length; i++){
            
        }
    }
}
