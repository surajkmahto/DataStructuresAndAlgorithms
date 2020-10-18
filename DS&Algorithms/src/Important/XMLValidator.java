package Important;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidator {
    public static void main(String[] args) throws SAXException, IOException {
        System.out.println(ValidateXML());
    }

    private static boolean ValidateXML() {
        try {
//            SchemaFactory schemaFactory = new SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
//            Schema schema = schemaFactory.newSchema(new File("Schema.xsd"));
//
//            Validator validator = schema.newValidator();
//            validator.validate(new StreamSource(new File("Test.xml")));
        } catch(Exception e) {
            System.out.println(e.fillInStackTrace());
            return false;
        }
        return true;
    }
}
