import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static int btnW = 70;
    private static int btnH = 40;

    private static boolean blPlus = false;
    private static boolean blMinus = false;
    private static boolean blMult = false;
    private static boolean blDev = false;
    private static boolean blProcent = false;

    private static int number1, number2;


    public static void main(String[] args) {


        JFrame frame = new JFrame();


        //text area location

        JTextField textAreaForNumbers = new JTextField();

        textAreaForNumbers.setBounds(0, 3, 300, 30);

        textAreaForNumbers.setText("");

        //end text area location


        //location for create buttons

        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

        //end


        //location for create symbol for Math

        JButton plusBtn = new JButton("+");
        JButton minusBtn = new JButton("-");
        JButton multBtn = new JButton("*");
        JButton devBtn = new JButton("/");
        JButton equalsBtn = new JButton("=");
        JButton doteBtn = new JButton(".");
        JButton clearBtn = new JButton("C");
        JButton procentBtn = new JButton("%");

        //end


        //road n 0

        btn0.setBounds(0, 340, 140, 40);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textAreaForNumbers.getText().length() == 1 && textAreaForNumbers.getText().equals("0")) {
                    JOptionPane.showMessageDialog(frame, "You can not write sec number 0 , " +
                            "im not do for double numbers sorry");
                } else {
                    textAreaForNumbers.setText(textAreaForNumbers.getText() + "0");
                }

            }
        });
        equalsBtn.setBounds(145, 340, btnW, btnH);
        equalsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                number2 = Integer.parseInt(textAreaForNumbers.getText());

                if (blPlus == true) {
                    number1 = number1 + number2;
                    textAreaForNumbers.setText(String.valueOf(number1));
                    number2 = 0;
                    blPlus = false;
                }
                if (blMinus == true) {
                    number1 = number1 - number2;
                    textAreaForNumbers.setText(String.valueOf(number1));
                    number2 = 0;
                    blMinus = false;
                }
                if (blMult == true) {
                    number1 = number1 * number2;
                    textAreaForNumbers.setText(String.valueOf(number1));
                    number2 = 0;
                    blMult = false;
                }
                if (blDev == true) {
                    if (number1 == 0) {
                        number1 = number1 / number2;
                        number1 = 0;
                        textAreaForNumbers.setText(String.valueOf(number1));
                        number2 = 0;
                        blDev = false;
                    } else if (number2 == 0) {
                        JOptionPane.showMessageDialog(frame, "You can't dev number to 0 , clear all and start again");
                        number2 = 0;
                        blDev = false;
                    }
                }
                if (blProcent == true) {
                    number1 = number1 * number2 / 100;
                    textAreaForNumbers.setText(String.valueOf(number1));
                    number2 = 0;
                    blProcent = false;
                }

            }
        });
        doteBtn.setBounds(220, 340, btnW, btnH);
        doteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + ".");
            }
        });

        //end road n 0


        //road n 1

        btn1.setBounds(0, 300, btnW, btnH);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "1");
            }
        });
        btn2.setBounds(70, 300, btnW, btnH);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "2");
            }
        });
        btn3.setBounds(140, 300, btnW, btnH);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "3");
            }
        });
        plusBtn.setBounds(210, 300, btnW, btnH);
        plusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Integer.parseInt(textAreaForNumbers.getText());
                textAreaForNumbers.setText("+");
                blPlus = true;
                textAreaForNumbers.setText("");
            }
        });

        //end road n 1


        //road n 2

        btn4.setBounds(0, 260, btnW, btnH);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + 4);
            }
        });
        btn5.setBounds(70, 260, btnW, btnH);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "5");
            }
        });
        btn6.setBounds(140, 260, btnW, btnH);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "6");
            }
        });
        minusBtn.setBounds(210, 260, btnW, btnH);
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Integer.parseInt(textAreaForNumbers.getText());
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "-");
                blMinus = true;
                textAreaForNumbers.setText("");
            }
        });

        //end road n 2


        //road n 3

        btn7.setBounds(0, 220, btnW, btnH);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "7");
            }
        });
        btn8.setBounds(70, 220, btnW, btnH);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + 8);
            }
        });
        btn9.setBounds(140, 220, btnW, btnH);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "9");
            }
        });
        multBtn.setBounds(210, 220, btnW, btnH);
        multBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Integer.parseInt(textAreaForNumbers.getText());
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "*");
                blMult = true;
                textAreaForNumbers.setText("");
            }
        });

        //end road n 3


        //road n 4

        clearBtn.setBounds(0, 180, btnW, btnH);
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaForNumbers.setText("");
            }
        });
        devBtn.setBounds(70, 180, btnW, btnH);
        devBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Integer.parseInt(textAreaForNumbers.getText());
                textAreaForNumbers.setText(textAreaForNumbers.getText() + "/");
                blDev = true;
                textAreaForNumbers.setText("");
            }
        });
        procentBtn.setBounds(140, 180, btnW, btnH);
        procentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Integer.parseInt(textAreaForNumbers.getText());
                blProcent = true;
                textAreaForNumbers.setText("");
            }
        });


        //end road n 4


        frame.add(textAreaForNumbers);

        //Add component road 0

        frame.add(btn0);
        frame.add(equalsBtn);
        frame.add(doteBtn);

        //end road n 0 comp

        //Add component road 1

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(plusBtn);

        // end road n 1 comp


        //Add component n 2 road

        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(minusBtn);

        //end road n 2 comp


        //Add component n 3 road

        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(multBtn);

        //end road n 3 comp


        //Add component n 4 road

        frame.add(clearBtn);
        frame.add(devBtn);
        frame.add(procentBtn);

        //end road n 4 road


        // frame.add(textAreaForNumbers);


        frame.setTitle("Calculator");

        frame.setLayout(null);

        frame.setSize(300, 400);

        frame.setVisible(true);


    }

}
