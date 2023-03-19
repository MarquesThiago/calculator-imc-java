package View;


import View.Basic.ScreenBasic;
import View.Panels.Button.ButtonHome;
import View.Panels.UserPainel.PanelÛser;
import View.Style.ConvertRgbToHex.ConverterColor;
import View.Style.Palette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomeScreen extends JPanel implements ActionListener {
     JLabel imc = new JLabel("<html> <span style = 'width: 100%; font-family: verdana; font-size: 38; text=aling: center'> IMC");
     ButtonHome calcIMC = new ButtonHome();
     PanelÛser inputs = new PanelÛser();

    public HomeScreen(){
        ScreenBasic screen = new ScreenBasic();
        screen.add(this);
        this.setLayout(new GridLayout(4, 1));
        this.setVisible(true);
        this.setBackground(Palette.principal);

        imc.setHorizontalAlignment(SwingConstants.CENTER);
        calcIMC.painelTovalid(inputs);

        this.add(imc);
        this.add(inputs);
        this.add(calcIMC);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button");
    }
}
