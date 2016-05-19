package delahayeyourself.info.animalsproject;

import delahayeyourself.info.animalsproject.models.Animal;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sam
 */
public class AnimalsMain {

    public static void main(String[] args) {
        try {
            for (Animal animal : Animal.findAll()) {
                System.out.println(animal);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AnimalsMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFileChooser fileChooser = new JFileChooser();     
        FileNameExtensionFilter filter = new FileNameExtensionFilter("SQLite", "sqlite");
        fileChooser.setFileFilter(filter);
        
        int returnVal = fileChooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }
    }
}
