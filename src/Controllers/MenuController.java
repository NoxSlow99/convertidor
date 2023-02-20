package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.MenuView;
import views.InputView;

/**
 *
 * @author angel
 */
public class MenuController implements ActionListener{

    private MenuView view_menu;

    public MenuController(MenuView view_menu) {
        this.view_menu = view_menu;
        this.view_menu.btn_enter.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view_menu.btn_enter){
            if(view_menu.cmb_menu.getSelectedIndex() == 0){
                InputView input = new InputView();
                input.setVisible(true);
            }
        }
    }
    
}
