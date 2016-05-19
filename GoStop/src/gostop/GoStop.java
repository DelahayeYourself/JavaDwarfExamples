package gostop;

import gostop.controllers.GoStopController;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author sam
 */
public class GoStop {

    private static byte[] readFile(String file) {
        ByteArrayOutputStream bos = null;
        try {
            File f = new File(file);
            FileInputStream fis = new FileInputStream(f);
            byte[] buffer = new byte[1024];
            bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
        return bos != null ? bos.toByteArray() : null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new GoStopController();
        System.out.println(Base64.getEncoder().encode(readFile("/home/sam/Pictures/azjBwYZ_460s_v1.jpg")));
        System.out.println(DatatypeConverter.printBase64Binary(readFile("/home/sam/Pictures/azjBwYZ_460s_v1.jpg")));
    }

}
