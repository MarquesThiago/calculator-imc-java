package View.Style;

import View.Style.ConvertRgbToHex.ConverterColor;

import java.awt.*;

public class Palette {
    private static ConverterColor  converter = new ConverterColor();
    public static final Color principal = converter.convertColor("bb5555");
    public static final Color secundary = converter.convertColor("eeeeee");
    Color sd = new Color(0xFAD0D0D0, true);
}
