import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Object[] opciones = {"Temperatura","Divisas"};

        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione el conversor que desea utilizar",
                "Conversor",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        /*
        if (unitChoise == null){
            JOptionPane.showMessageDialog(null,"Error, cerrando el progama");
        }*/

        if(seleccion.equals("Temperatura")){
            Object[] tempUnits = {"°C","°F","K"};
            String nombre1;
            String nombre2;
            double valor1;

            nombre1 = (String) JOptionPane.showInputDialog(null,"Seleccione la temperatura que quiere convertir","Conversor de temperaturas",JOptionPane.QUESTION_MESSAGE,null,tempUnits,tempUnits[0]);

            nombre2 =(String) JOptionPane.showInputDialog(null,"Seleccione la temperatura que quiere obtener","Conversor de temperaturas",JOptionPane.QUESTION_MESSAGE,null,tempUnits,tempUnits[0]);

            valor1 = Double.parseDouble(JOptionPane.showInputDialog(null,"que cantidad desea convertir"));

            Temperatura temperaturaFrom = new Temperatura(nombre1, valor1);
            Temperatura temperaturaTo = new Temperatura(nombre2);

            ConversorTemperatura conversor1 = new ConversorTemperatura(temperaturaFrom,temperaturaTo);

            JOptionPane.showMessageDialog(null,conversor1.convertir());

            System.out.println(temperaturaFrom.getCantidad());
            System.out.println(temperaturaTo.getNombre());
            System.out.println(temperaturaFrom.getNombre());
        }else{
            String nombre1;
            String nombre2;
            double valor1;

            Moneda monedaFrom = new Moneda();
            Moneda monedaTo = new Moneda();

            ConversorMoneda conversor1 = new ConversorMoneda();

            conversor1.convertir();

        }

    }

}
