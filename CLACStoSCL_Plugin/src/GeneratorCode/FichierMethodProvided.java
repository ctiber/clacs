package GeneratorCode;

import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FichierMethodProvided
{
  protected static String nl;
  public static synchronized FichierMethodProvided create(String lineSeparator)
  {
    nl = lineSeparator;
    FichierMethodProvided result = new FichierMethodProvided();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " compile: '";
  protected final String TEXT_2 = "\"To be completed\"";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Object[] recup = ((Object[])argument);
String nomDescripteur = ((String)recup[0]);
ArrayList<Element> listInterfacesProvided = ((ArrayList<Element>)recup[1]);

for(int i=0; i<listInterfacesProvided.size(); i++){
	NodeList ListServ =  ((Element)listInterfacesProvided.get(i)).getElementsByTagName("cl:Service");
	for(int f=0; f<ListServ.getLength();f++){

    stringBuffer.append("\r\r" + nomDescripteur);
    stringBuffer.append(TEXT_1);
    stringBuffer.append(
"\r" + ((Element)ListServ.item(f)).getAttributes().getNamedItem("name").getNodeValue());
    
	NodeList ListArgs =  ((Element)ListServ.item(f)).getElementsByTagName("cl:Arg");
	for(int a=0; a<ListArgs.getLength();a++){
		String nomArg = ": " + ((Element)ListArgs.item(a)).getElementsByTagName("cl:Name").item(0).getTextContent();
		if(!(a==0)) nomArg = "and" + nomArg ;
		
		if(!(a == (ListArgs.getLength()-1))) nomArg += " ";
    stringBuffer.append(nomArg);
    
	}

    stringBuffer.append("\r\t");
    stringBuffer.append(TEXT_2);
    stringBuffer.append("\r'.\r");
    
    }
}    

    return stringBuffer.toString();
  }
}
