package View.Panels.Button;

import Controller.IMC.IMC;
import Controller.Validade.ValidedFields;
import View.Panels.UserPainel.PanelÛser;
import View.Style.Palette;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ButtonHome extends JPanel implements ActionListener {
    JButton calculator = new JButton("Calcular IMC");
    private PanelÛser userApp = new PanelÛser();

    public ButtonHome(){

        this.configuredButton();
        this.setAlignmentX(SwingConstants.CENTER);
        this.setAlignmentY(SwingConstants.CENTER);
        this.setBackground(Palette.principal );
        this.setBorder(BorderFactory.createMatteBorder(20,0,0,0,Palette.principal));

        this.setVisible(true);
        this.setLayout(new FlowLayout( FlowLayout.CENTER));
        this.add(calculator);
    }


    private void configuredButton(){
        calculator.setSize(950 , 900);
        calculator.setAlignmentY(CENTER_ALIGNMENT);
        calculator.setAlignmentX(CENTER_ALIGNMENT);
        calculator.setBackground(Palette.secundary);
        calculator.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Palette.secundary, 10, true),
                null)
        );
        calculator.addActionListener(this);

    }

    public void painelTovalid(PanelÛser user){
       userApp = user;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(ValidedFields.validate(userApp.fieldValid())){
            double [] values = ValidedFields.converter(userApp.fieldValid());
            double  imc = IMC.calcalator(values[0], values[1]);
            String classIMC = IMC.classifcation(imc);
            JOptionPane.showMessageDialog(new JFrame(),
                    "<html> <body style= 'display: flex; justify-content: center;'> <h2 style = 'marginb-bottom: 15'>IMC : "
                    + String.valueOf(new DecimalFormat( "#0.##").format(imc))+ "</h2>" +
                    "<p style= 'font-weight:bold; marginb-bottom: 15' > E sua classificação é: </p>" +
                    "<p>"+ classIMC + "</p>",
                    "IMC",
                    1,
                    null);
            userApp.erasedValues();



        }else{

            JOptionPane.showMessageDialog(null, "<html> <h2 style = ' margin-bottom: 16'> Dados Incorretos</h2>" +
                    "<p>Verifique se á altura e o peso estão corretos. e</p> <p style = 'margin-bottom: 16'>separados por ponto</p>");

        }
    }
}
