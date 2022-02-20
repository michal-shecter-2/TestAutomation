package utilities;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;


public class ReadData {

    public static String getData(String nodeName) {
        DocumentBuilder duilder;
        Document value = null;
        File file = new File("./Data.XML");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            duilder = dbFactory.newDocumentBuilder();
            value = duilder.parse(file);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        value.getDocumentElement().normalize();
        return value.getElementsByTagName(nodeName).item(0).getTextContent();
    }
}

