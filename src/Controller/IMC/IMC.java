package Controller.IMC;

public class IMC {

    public static Double calcalator(double height, double weight){

        return weight/ (height* height);
    }

    public static String classifcation(double imc){

        if (imc < 18.5 ){
            return "Magresa";

        }else if(18.5 < imc && imc <24.9){
            return "Normal";

        }else if (24.9 < imc && imc < 30){
            return "sobrepeso";

        }else if(imc > 30){
            return "Obesidade";
        }

        return "";
    }

}
