package View.Style.ConvertRgbToHex;

import java.awt.*;
import java.util.Arrays;

public class ConverterColor {

    public Color convertColor(String hexadecimal){

        int[] RGB = this.ConvertToColor(this.abstractRGB(hexadecimal));

        return new Color(RGB[0], RGB[1], RGB[2]);
    }

    private String[] abstractRGB(String Hexadecimal){

        String blueHex = Hexadecimal.substring(4,6);
        String greenHex =  Hexadecimal.substring(2,4);
        String redHex = Hexadecimal.substring(0,2);

        return new String[]{redHex, greenHex, blueHex};
    }

    private int[] ConvertToColor (String[] strRGB ){

        int red = Integer.parseInt(strRGB[0], 16);
        int green = Integer.parseInt(strRGB[1], 16);
        int blue = Integer.parseInt(strRGB[2], 16);

        return  new int[]{red, green, blue};
    }
}
