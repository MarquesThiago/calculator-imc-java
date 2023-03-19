package View.Style.Font;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CreatorFont {

    Font font;

    CreatorFont (String path) throws IOException, FontFormatException {
        System.out.println(new File(path));
        font = Font.createFont(
                Font.TRUETYPE_FONT,
                getClass().getClassLoader().getResourceAsStream(path));
        GraphicsEnvironment EnvGraphic = GraphicsEnvironment.getLocalGraphicsEnvironment();
        EnvGraphic.registerFont(font);
        System.out.print(EnvGraphic.getAllFonts());
    }





}
