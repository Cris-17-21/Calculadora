import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz extends JFrame{
    double result = 0;
    double primerNumero = 0;
    double segundoNumero = 0;
    int aux = 1;
    int operacion = 0;

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
        JTextField txtf = new JTextField();
        panel.add(txtf);
        txtf.setFont(new Font(getName(), 1, 30));
        txtf.setEditable(false);
        txtf.setColumns(ALLBITS);
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
        JButton btn20 = new JButton("C");
        panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btn4); panel.add(btn5); panel.add(btn6); panel.add(btn7); panel.add(btn8); panel.add(btn9);
        panel.add(btn10); panel.add(btn11); panel.add(btn12); panel.add(btn13); panel.add(btn14); panel.add(btn15); panel.add(btn16); panel.add(btn17);
        panel.add(btn18); panel.add(btn19); panel.add(btn20);
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
        btn20.setFont(new Font(getName(), 1, 30));
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
        btn3.setBounds(320, 580, 70, 70);
        btn20.setBounds(220, 580, 70, 70);

        //EVENTOS
        //Numeros
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("1");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "1");
                }
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("2");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "2");
                }
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("3");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "3");
                }
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("4");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "4");
                }
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("5");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "5");
                }
            }
        });

        btn10.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("6");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "6");
                }
            }
        });

        btn12.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("7");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "7");
                }
            }
        });

        btn13.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("8");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "8");
                }
            }
        });

        btn14.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if(aux == 1){
                    txtf.setText("9");
                    aux = 0;
                } else {
                    txtf.setText(txtf.getText() + "9");
                }
            }
        });


        //Operaciones
        btn7.addActionListener(new ActionListener() { //suma
            public void actionPerformed (ActionEvent e){
                operacion = 1;
                if (aux == 1){
                    txtf.setText(String.valueOf(result) + "+");
                    aux = 0;
                } else {
                    String auxii = String.valueOf(txtf.getText());
                    char ultimo = auxii.charAt(auxii.length()-1);
                    if (ultimo == '+' || ultimo == '-' || ultimo == 'x' || ultimo == '/' || ultimo == '^'){
                        String xddd = auxii.substring(0, auxii.length()-1);
                        txtf.setText(xddd + "+");
                    } else {
                        txtf.setText(txtf.getText() + "+");
                    }
                }
            }
        });

        btn11.addActionListener(new ActionListener() { //resta
            public void actionPerformed (ActionEvent e){
                operacion = 2;
                if (aux == 1){
                    txtf.setText(String.valueOf(result) + "-");
                    aux = 0;
                } else {
                    String auxii = String.valueOf(txtf.getText());
                    char ultimo = auxii.charAt(auxii.length()-1);
                    if (ultimo == '+' || ultimo == '-' || ultimo == 'x' || ultimo == '/' || ultimo == '^'){
                        String xddd = auxii.substring(0, auxii.length()-1);
                        txtf.setText(xddd + "-");
                    } else {
                        txtf.setText(txtf.getText() + "-");
                    }
                }
            }
        });

        btn15.addActionListener(new ActionListener() { //multiplicacion
            public void actionPerformed (ActionEvent e){
                operacion = 3;
                if (aux == 1){
                    txtf.setText(String.valueOf(result) + "x");
                    aux = 0;
                } else {
                    String auxii = String.valueOf(txtf.getText());
                    char ultimo = auxii.charAt(auxii.length()-1);
                    if (ultimo == '+' || ultimo == '-' || ultimo == 'x' || ultimo == '/' || ultimo == '^'){
                        String xddd = auxii.substring(0, auxii.length()-1);
                        txtf.setText(xddd + "x");
                    } else {
                        txtf.setText(txtf.getText() + "x");
                    }
                }
            }
        });

        btn19.addActionListener(new ActionListener() { //division
            public void actionPerformed (ActionEvent e){
                operacion = 4;
                if (aux == 1){
                    txtf.setText(String.valueOf(result) + "/");
                    aux = 0;
                } else {
                    String auxii = String.valueOf(txtf.getText());
                    char ultimo = auxii.charAt(auxii.length()-1);
                    if (ultimo == '+' || ultimo == '-' || ultimo == 'x' || ultimo == '/' || ultimo == '^'){
                        String xddd = auxii.substring(0, auxii.length()-1);
                        txtf.setText(xddd + "/");
                    } else {
                        txtf.setText(txtf.getText() + "/");
                    }
                }
            }
        });

        btn17.addActionListener(new ActionListener() { //potencia
            public void actionPerformed (ActionEvent e){
                operacion = 5;
                if (aux == 1){
                    txtf.setText(String.valueOf(result) + "^");
                    aux = 0;
                } else {
                    String auxii = String.valueOf(txtf.getText());
                    char ultimo = auxii.charAt(auxii.length()-1);
                    if (ultimo == '+' || ultimo == '-' || ultimo == 'x' || ultimo == '/' || ultimo == '^'){
                        String xddd = auxii.substring(0, auxii.length()-1);
                        txtf.setText(xddd + "^");
                    } else {
                        txtf.setText(txtf.getText() + "^");
                    }
                }
            }
        });

        btn18.addActionListener(new ActionListener() { //Factorial
            public void actionPerformed (ActionEvent e){
                String num = String.valueOf(txtf.getText());
                primerNumero = Math.round(Double.parseDouble(num));
                if (aux == 1){
                    txtf.setText(String.valueOf(result)+"!");
                    if(result == 0){
                        resultado.setText("1.0");
                    } else {
                        primerNumero = result;
                        for(int i = 1; i <= primerNumero; i++){
                            result = result * i;
                        }
                        txtf.setText(primerNumero + "!");
                        resultado.setText(String.valueOf(result));
                    }
                    aux = 0;
                } else {
                    result = 1;
                    if (primerNumero == 0){
                        txtf.setText("0!");
                        resultado.setText("1.0");
                    } else {
                        for(int i = 1; i <= primerNumero; i++){
                            result = result * i;
                        }
                        txtf.setText(primerNumero + "!");
                        resultado.setText(String.valueOf(result));
                    }
                    aux = 1;
                }
            }
        });

        

        //Resultado
        btn20.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                txtf.setText("");
                resultado.setText("");
                result = 0;
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                encontrarNumeros(txtf);
                result = hacerOperacion(operacion, primerNumero, segundoNumero);
                resultado.setText(String.valueOf(result));
                aux = 1;
            }
        });
    }

    public void encontrarNumeros (JTextField txt){
        String texto = String.valueOf(txt.getText());
        int axuliar = 0;
        int operador = 0;
        int axilaaaar = 0;
        for (int i = 1; i < texto.length(); i++){
            if (texto.charAt(i) == '+' || texto.charAt(i) == '-' || texto.charAt(i) == 'x' || texto.charAt(i) == '/' || texto.charAt(i) == '^'){
                operador = i;
                break;
            }
        }
        for (int i = 1; i < texto.length(); i++){
            if (texto.charAt(i) == '+' || texto.charAt(i) == '-' || texto.charAt(i) == 'x' || texto.charAt(i) == '/' || texto.charAt(i) == '^'){
                axuliar ++;
            } 
        }
        
        if (axuliar == 0){
            primerNumero = Double.parseDouble(texto);
        } else if (axuliar == 1){
            String num1 = texto.substring(0, operador);
            String num2 = texto.substring(operador+1);
            primerNumero = Double.parseDouble(num1);
            segundoNumero = Double.parseDouble(num2);
        } else {
            for (int i = operador+1; i < texto.length(); i++){
                if (texto.charAt(i) == '+' || texto.charAt(i) == '-' || texto.charAt(i) == 'x' || texto.charAt(i) == '/' || texto.charAt(i) == '^'){
                    axilaaaar = i;
                    break;
                } 
            }
            String num1 = texto.substring(0, operador);
            String num2 = texto.substring(operador+1, axilaaaar);
            primerNumero = Double.parseDouble(num1);
            segundoNumero = Double.parseDouble(num2);
            String textoNuevo = texto.substring(0, axilaaaar);
            txt.setText(textoNuevo);
        }
    }

    public double hacerOperacion (int operacion, double num1, double num2){
        double resultadoo = 0;
        if (operacion == 1){
            resultadoo = num1 + num2;
            return resultadoo;
        } else if (operacion == 2){
            resultadoo = num1 - num2;
            return resultadoo;
        } else if (operacion == 3){
            resultadoo = num1*num2;
            return resultadoo;
        } else if (operacion == 4) {
            resultadoo = num1 / num2;
            return resultadoo;
        } else if (operacion == 5){
            resultadoo = Math.pow(num1, num2);
            return resultadoo;
        }else {
            return resultadoo;
        }
    }
}
