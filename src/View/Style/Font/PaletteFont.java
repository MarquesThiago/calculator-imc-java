package View.Style.Font;

import java.awt.*;
import java.io.IOException;

public class PaletteFont {

    public static void main(String[] args) {
        CreatorFont font;

        {
            try {
                font = new  CreatorFont("./Fonts/roboto/Roboto-Regular.ttf");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (FontFormatException e) {
                e.printStackTrace();
            }
        }
    }

}
