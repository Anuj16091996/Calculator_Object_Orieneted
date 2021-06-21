import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Textpannel pan;
    private TextArea area;
    MainFrame()
    {


        super("Calculator");

        setLayout(new BorderLayout());


        pan= new Textpannel();
        area= new TextArea();

        add(pan, BorderLayout.SOUTH);
        add(area,BorderLayout.PAGE_START);

        pan.Setlistener(new Listener() {
            @Override
            public void Setlist(String str) {

                area.appendtext(str);
            }

            public void Setlistclr(String str)
            {
                area.setTextclr(str);
            }
            public boolean Gettext(String str)
            {
                return area.gettext(str);
            }

            public String[] split(String str)
            {
                return area.split(str);
            }


        });





        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }


}
