package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import views.ConversionDivisas;

/**
 *
 * @author angel
 */
public class DivisaController implements ActionListener, KeyListener {

    //private NewClass datos;
    private ConversionDivisas view_divisa;

    public DivisaController(ConversionDivisas view_divisa) {
        //this.datos = datos;
        this.view_divisa = view_divisa;
        this.view_divisa.btn_continue_data.addActionListener(this);
        this.view_divisa.txt_data_divisa.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view_divisa.btn_continue_data) {
            /**
                Valor de las monedas hasta la fecha del 22/02/2023 a las 12.50 hrs 
                * Peso a Dolar = 0.055, Dolar a Peso = 18.33 
                * Peso a Euro =0.051, Euro a Peso = 19.48 
                * Peso a Libras Esterlinas = 0.045, Libras Esterlinas a Peso = 22.12 
                * Peso a Yen = 7.35, Yen a Peso =0.14 
                * Peso a Won sul-coreano = 70.94, Won sul-coreano = 0.014
            */

            if (view_divisa.txt_data_divisa.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "No puede dejar el espacio vacío.");
            } else {
                double divisa = Double.parseDouble(view_divisa.txt_data_divisa.getText()); //Agregando en una variable los datos
                DecimalFormat formato = new DecimalFormat("0.000"); //Limitando la muestra de numeros decimales
                switch (view_divisa.cmb_currency_conversion_option.getSelectedIndex()) {
                    case 0 -> {
                        divisa *= 0.055;
                        String message = "Tienes un total de $" + formato.format(divisa) + " dolar(es)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 1 -> {
                        divisa *= 0.051;
                        String message = "Tienes un total de $" + formato.format(divisa) + " euro(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 2 -> {
                        divisa *= 0.045;
                        String message = "Tienes un total de $" + formato.format(divisa) + " libra(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 3 -> {
                        divisa *= 7.35;
                        String message = "Tienes un total de $" + formato.format(divisa) + " yen(es)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 4 -> {
                        divisa *= 70.94;
                        String message = "Tienes un total de $" + formato.format(divisa) + " won sul-coreano";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 5 -> {
                        divisa *= 18.33;
                        String message = "Tienes un total de $" + formato.format(divisa) + " peso(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 6 -> {
                        divisa *= 19.48;
                        String message = "Tienes un total de $" + formato.format(divisa) + " peso(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 7 -> {
                        divisa *= 22.12;
                        String message = "Tienes un total de $" + formato.format(divisa) + " peso(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 8 -> {
                        divisa *= 0.14;
                        String message = "Tienes un total de $" + formato.format(divisa) + " peso(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    case 9 -> {
                        divisa *= 0.014;
                        String message = "Tienes un total de $" + formato.format(divisa) + " peso(s)";
                        JOptionPane.showMessageDialog(null, message);
                    }
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyChar();
        //Asignando el numero ASCII que solo aceptara el campo de texto
        boolean numeros = (key >= 48 && key <= 57) || (key == 46);
        
        if(!numeros){
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
