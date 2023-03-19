package Controller.Validade;

import java.util.Arrays;

public class ValidedFields {

    public static boolean validate(String[] fieldsToValidate){

        try {

            converter(fieldsToValidate);

            return true;

        }catch (Exception E){

            return false;
        }
    }

    public static double[] converter (String[] fields){

        double height = Double.parseDouble(fields[0]);
        double weight = Double.parseDouble(fields[1]);

        return new double[]{height, weight};
    }

}
