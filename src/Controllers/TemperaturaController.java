package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import views.ConversionTemperatura;

/**
 *
 * @author angel
 */
public class TemperaturaController implements KeyListener, ActionListener {

    private ConversionTemperatura view_temperatura;

    public TemperaturaController(ConversionTemperatura view_temperatura) {
        this.view_temperatura = view_temperatura;
        this.view_temperatura.btn_enter_temp.addActionListener(this);
        this.view_temperatura.txt_input_temp.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyChar();
        boolean numeros = (key >= 48 && key <= 57) || (key == 46);

        if (!numeros) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view_temperatura.btn_enter_temp) {
            /* Formulas de conversón de temperatura
            °F = (°C * 1.8) + 32, de Celsius a Fahrenheit
            °K = °C + 273.15, de Celsius a Kelvin    
            °C = (°F - 32) / 1.8, de Fahrenheit a Celsius
            °K = (°F - 32) * 1.8 + 273.15, de Fahrenheit a Kelvin
            °C = °K - 273.15, de Kelvin a Celsius
            °F = (°K -273.15) * 1.8 + 32, de Kelvin a Fahrenheit
             */
            if (view_temperatura.txt_input_temp.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Debe agregar información");
            } else {
                double temperatura = Double.parseDouble(view_temperatura.txt_input_temp.getText());
                DecimalFormat formato = new DecimalFormat("0.00");

                switch (view_temperatura.cmb_option_temp.getSelectedIndex()) {
                    case 0 -> {
                        temperatura = (temperatura * 1.8) + 32;
                        String message = "La temperatura equivalente es de " + formato.format(temperatura) + " °F";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 1 -> {
                        temperatura += 273.15;
                        String message = "La temperatura equivalente es de " + formato.format(temperatura) + " K";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 2 -> {
                        temperatura = (temperatura - 32) / 1.8;
                        String message = "La temperatura equivalente es de " + formato.format(temperatura) + " °C";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 3 -> {
                        temperatura = (temperatura - 32) * (1.8 + 273.15);
                        String message = "La temperatura equivalente es de " + formato.format(temperatura) + " K";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 4 -> {
                        temperatura -= 273.15;
                        String message = "La temperatura equivalente es de " + formato.format(temperatura) + " °C";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 5 -> {
                        temperatura = (temperatura - 273.15) * (1.8 + 32);
                        String message = "La temperatura equivalente es de " + formato.format(temperatura) + " °F";
                        JOptionPane.showMessageDialog(null, message);
                    }
                }
            }
        }
    }

}
