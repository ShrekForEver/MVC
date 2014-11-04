package mvc;

import mvc.kontroler.Kontroler;
import mvc.model.Model;
import mvc.widok.Widok;

public class MVC {
    public static void main(String[] args) {
         Model model      = new Model();
         Widok widok       = new Widok(model);
         Kontroler kontroler = new Kontroler(model, widok);
        
         widok.setVisible(true);
        
    }
}
