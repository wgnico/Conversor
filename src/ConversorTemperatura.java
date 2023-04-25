import javax.swing.*;

public class ConversorTemperatura {
    private Temperatura from;
    private Temperatura to;

    public ConversorTemperatura(Temperatura from, Temperatura to) {
        super();
        this.from = from;
        this.to = to;
    }

    public double convertir() {
        double temperaturaConvert = 0.0;
        switch (from.getNombre()) {
            case "°C":
                if (to.getNombre().equals(("°F"))) {
                    temperaturaConvert = (1.8 * from.getCantidad()) + 32;
                    break;
                } else {
                    if (to.getNombre().equals("°k")) {
                        temperaturaConvert = from.getCantidad() + 273;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                        break;
                    }
                }
            case "°F":
                if (to.getNombre().equals(("°C"))) {
                    temperaturaConvert = (1.8 * from.getCantidad() - 32) / 1.8;
                    break;
                } else {
                    if (to.getNombre().equals("°k")) {
                        temperaturaConvert = from.getCantidad() + 273;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                        break;
                    }
                }
            case "°k":
                if (to.getNombre().equals("°C")) {
                    temperaturaConvert = from.getCantidad() - 273;
                    break;
                } else {
                    if (to.getNombre().equals(("°F"))) {
                        temperaturaConvert = (1.8 * from.getCantidad()) + 32;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                        break;
                    }
                }
        }
        return temperaturaConvert;
    }

    public Temperatura getFrom() {
        return from;
    }

    public void setFrom(Temperatura from) {
        this.from = from;
    }

    public Temperatura getTo() {
        return to;
    }

    public void setTo(Temperatura to) {
        this.to = to;
    }
}