import javax.swing.JOptionPane;

public class Visual {
    Object[] mainUnits = {"Temperatura","Divisas"};

    Object unitChoise = JOptionPane.showInputDialog(
            null,
            "Seleccione el conversor que desea utilizar",
            "Conversor",
            JOptionPane.QUESTION_MESSAGE,
            null,
            mainUnits,
            mainUnits[0]);
    }

