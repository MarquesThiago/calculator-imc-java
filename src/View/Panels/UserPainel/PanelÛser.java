package View.Panels.UserPainel;

import View.Style.Palette;

import javax.swing.*;
import javax.swing.text.ComponentView;
import java.awt.*;

public class PanelÛser extends JPanel {

    JLabel height = new JLabel("informe sua altura?");
    JTextField inputHeigth = new JTextField();

    JLabel wieght = new JLabel("informe sua Peso?");
    JTextField inputwieght = new JTextField();

    JLabel descrHeight = new JLabel("<html><p>*Altura em metros </p> <p>Ex.: 1.67");
    JLabel descrWeight = new JLabel("<html><p>*Peso em kilos</p> <p>Ex.: 52.6");

    JPanel paneltext = new JPanel();
    JPanel panelinput = new JPanel();
    JPanel panelDescription = new JPanel();

    GridBagConstraints controllerPanelText = new GridBagConstraints();
    GridBagConstraints getControllerPanelInput = new GridBagConstraints();


    public PanelÛser(){
        controllerPanelText.gridx = 2;
        getControllerPanelInput.gridy = 3;
        getControllerPanelInput.gridx = 2;

        this.configuredPanel();
        this.configuredText();
        this.configuredInput();
        this.configureDescription();
        this.add(paneltext,controllerPanelText );
        this.add(panelinput);
        this.add(panelDescription);

    }


    private void configuredPanel(){
        this.setLayout(new GridLayout(3,3));
        this.setBackground(Palette.principal);
        this.setAlignmentX(SwingConstants.CENTER);
        this.setAlignmentY(SwingConstants.CENTER);
        this.setVisible(true);
    }

    private void configuredText(){
        height.setHorizontalAlignment(SwingConstants.CENTER);
        height.setVerticalAlignment(SwingConstants.CENTER);
        height.setForeground(Color.white);

        wieght.setVerticalAlignment(SwingConstants.CENTER);
        wieght.setHorizontalAlignment(SwingConstants.CENTER);
        wieght.setForeground(Color.white);

        paneltext.setLayout(new GridLayout(1,2));
        paneltext.setBackground(Palette.principal);
        paneltext.add(height);
        paneltext.add(wieght);

    }

    private void configuredInput(){
        panelinput.setSize(250, 100);
        panelinput.setBackground(Palette.principal);


        inputHeigth.setSize(100,30);
        inputwieght.setSize(100,30);

        panelinput.setBorder(BorderFactory.createMatteBorder(0,10,10,10, Palette.principal));
        inputHeigth.setBorder(BorderFactory.createMatteBorder(0,0,0, 5, Palette.principal));
        inputwieght.setBorder(BorderFactory.createMatteBorder(0,5,0,0, Palette.principal));

        inputHeigth.setHorizontalAlignment(SwingConstants.CENTER);
        inputwieght.setHorizontalAlignment(SwingConstants.CENTER);

        panelinput.setLayout(new GridLayout(1,2));

        panelinput.add(inputHeigth);
        panelinput.add(inputwieght);
    }

    private void configureDescription (){
        descrHeight.setForeground(Color.white);
        descrWeight.setForeground(Color.white);
        panelDescription.setBackground(Palette.principal);

        descrWeight.setFont(new Font("Arial", 1, 11));
        descrHeight.setFont(new Font("Arial", 1, 11));

        panelDescription.setLayout(new GridLayout(1,2));

        panelDescription.setBorder(BorderFactory.createMatteBorder(0 ,15,0,15, Palette.principal));
        descrHeight.setBorder(BorderFactory.createMatteBorder(0,0,0,5,Palette.principal));
        descrWeight.setBorder(BorderFactory.createMatteBorder(0,8,0,0, Palette.principal));

        panelDescription.add(descrHeight);
        panelDescription.add(descrWeight);

    }

    public String[] fieldValid(){
        String textHeight = inputHeigth.getText();
        String textWeight = inputwieght.getText();

        return new String[]{textHeight, textWeight};
    }

    public void erasedValues(){
        inputwieght.setText("");
        inputHeigth.setText("");
    }
}
