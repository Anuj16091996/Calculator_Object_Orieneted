import javax.swing.*;
import java.awt.*;

public class TextArea extends JPanel {
    private JTextArea text;

//    btnadd= new JButton("+");
//    btnsub= new JButton("-");
//    btnmul= new JButton("*");
//    btndiv= new JButton("/");
//    btntot= new JButton("=");
//    clear= new JButton("C");



    TextArea()
    {
        text= new JTextArea();
        setLayout(new BorderLayout());
        Dimension dimension = getPreferredSize();
        dimension.height = 250;
        setPreferredSize(dimension);
        setBackground(Color.BLACK);
//        GridBagConstraints gc= new GridBagConstraints();

//        gc.insets= new Insets(111,10,10,10);
//
//        text.setSize(120,100);
//        text.setLocation(1122,12);
        setLayout(new BorderLayout());
        add(new JScrollPane(text), BorderLayout.CENTER);
       text.setEditable(false);



    }
    public void appendtext(String str)
    {
        text.append(str);

    }

    public boolean gettext(String str)
    {
        return text.getText().contains(str);
    }

    public void setTextclr(String str)
    {
        text.setText(str);
    }

    public String[] split(String str)
    {
            return text.getText().split(str);
    }



    public boolean getss(String str)
    {
        text.getText().split(str);
        return false;
    }
}
