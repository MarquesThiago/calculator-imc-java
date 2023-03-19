package View.Basic;

import View.Style.ConvertRgbToHex.ConverterColor;
import View.Style.Palette;

import javax.swing.*;
import java.awt.*;

public class ScreenBasic extends JFrame {

    Dimension screenSize = new Dimension(350 , 500);

    public ScreenBasic(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(screenSize);
        this.setTitle("Caculator IMC");
        this.setResizable(false);
        this.setVisible(true);
        this.setBackground(Palette.principal);
        this.setLocationRelativeTo(null);
    }

}
