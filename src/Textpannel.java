import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Textpannel extends JPanel implements ActionListener {
    private Listener lis;
    private TextArea text;
    String strNum1 = "";
    String strNum2 = "";
    String[] statement;
    double num1 = 0;
    double num2 = 0;
    String strTotal = "";
    double totalVal = 0;

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnsub;
    private JButton btnadd;
    private JButton btndiv;
    private JButton btnmul;
    private JButton btntot;
    private JButton clear;


    Textpannel() {
        Dimension dimension = getPreferredSize();
        dimension.height = 250;
        setPreferredSize(dimension);
        setBackground(Color.BLUE);

//        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
//        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
//        Border fullBorder = BorderFactory.createCompoundBorder(outerBorder,innerBorder);
//        setBorder(fullBorder);


        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnadd = new JButton("+");
        btnsub = new JButton("-");
        btnmul = new JButton("*");
        btndiv = new JButton("/");
        btntot = new JButton("=");
        clear = new JButton("C");
        text = new TextArea();

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);
        btntot.addActionListener(this);
        clear.addActionListener(this);

        Alligment();


    }

    public void Setlistener(Listener lis) {
        this.lis = lis;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton click = (JButton) e.getSource();
        String s = e.getActionCommand();

        switch (click.getText()) {
            case "1":
                lis.Setlist("1");
                break;

            case "2":
                lis.Setlist("2");
                break;

            case "3":
                lis.Setlist("3");
                break;

            case "4":
                lis.Setlist("4");
                break;

            case "5":
                lis.Setlist("5");
                break;

            case "6":
                lis.Setlist("6");
                break;

            case "7":
                lis.Setlist("7");
                break;

            case "8":
                lis.Setlist("8");
                break;

            case "9":
                lis.Setlist("9");
                break;

            case "0":
                lis.Setlist("0");
                break;


            case "C":
                lis.Setlistclr("");
                break;

            case "+":
//                num1 = Double.parseDouble(click.getText());
                lis.Setlist("+");
                break;

            case "-":

                lis.Setlist("-");
                break;

            case "*":

                lis.Setlist("*");
                break;

            case "/":

                lis.Setlist("/");
                break;
//
//
            case "=": {
                if (lis.Gettext("+"))
                {
                    statement = lis.split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);

                    totalVal = num1 + num2;

                    strTotal = Double.toString(totalVal);

                    lis.Setlistclr(strTotal);
                }
                else if(lis.Gettext("-"))
                {
                    statement = lis.split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);

                    totalVal = num1 - num2;

                    strTotal = Double.toString(totalVal);

                    lis.Setlistclr(strTotal);
                }

                else if(lis.Gettext("/"))
                {
                    statement = lis.split("\\/");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);

                    totalVal = num1 / num2;

                    strTotal = Double.toString(totalVal);

                    lis.Setlistclr(strTotal);
                }

                else if(lis.Gettext("*"))
                {
                    statement = lis.split("\\*");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);

                    totalVal = num1 * num2;

                    strTotal = Double.toString(totalVal);

                    lis.Setlistclr(strTotal);
                }
            }
        }
    }


    public void Alligment() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        ///First Line- Start

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;


        add(btn1, gc);
        gc.gridx = 1;
        add(btn2, gc);

        gc.gridx = -1;

        add(btn3, gc);
        ///First Line- Over


        ///Second Line- Start
//        gc.weighty=-0.11;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy++;

        add(btn4, gc);

        gc.gridx = -1;
        add(btn5, gc);


        gc.gridx = -1;
        add(btn6, gc);
        ///Second Line- Over


        ///Third Line- Start
        gc.gridx = 0;
        gc.gridy++;
        gc.weighty = 1;


        add(btn7, gc);

        gc.gridx = -1;
        add(btn8, gc);


        gc.gridx = -1;
        add(btn9, gc);


        ///Third Line- Over

        ///Fourth Line- Start
        gc.gridx = 0;
        gc.gridy++;
        gc.weighty = 1;


        add(btnsub, gc);

        gc.gridx = -1;
        add(btnadd, gc);


        gc.gridx = -1;
        add(btndiv, gc);

        ///5 Line- Start
        gc.gridx = 0;
        gc.gridy++;
        gc.weighty = 1;


        add(btnmul, gc);

        gc.gridx = -1;
        add(btntot, gc);


        gc.gridx = -1;
        add(btn0, gc);


        ///6 Line- Start
        gc.gridx = -2;
        gc.gridy++;
        add(clear, gc);
        gc.weighty = 3;


        ///Fourth Line- Over
    }
}