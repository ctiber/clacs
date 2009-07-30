package GeneratorCode;

import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FichierPortRequired
{
  protected static String nl;
  public static synchronized FichierPortRequired create(String lineSeparator)
  {
    nl = lineSeparator;
    FichierPortRequired result = new FichierPortRequired();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "requiredPorts:{";
  protected final String TEXT_2 = "#";
  protected final String TEXT_3 = "->#(";
  protected final String TEXT_4 = "#";
  protected final String TEXT_5 = ")";
  protected final String TEXT_6 = "};";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Object[] recup = ((Object[])argument); 
ArrayList<Element> listInterfacesRequired = ((ArrayList<Element>)recup[0]);
ArrayList<Element> listPortsRequired = ((ArrayList<Element>)recup[1]);

    stringBuffer.append("\r\t");
    stringBuffer.append(TEXT_1);
    
			for(int i=0; i<listInterfacesRequired.size(); i++){
			
    stringBuffer.append(TEXT_2);
    stringBuffer.append(listPortsRequired.get(i));
    stringBuffer.append(TEXT_3);
    
			NodeList ListServ =  ((Element)listInterfacesRequired.get(i)).getElementsByTagName("cl:Service");
			for(int f=0; f<ListServ.getLength();f++){
			    String nomServ =  ((Element)ListServ.item(f)).getAttributes().getNamedItem("name").getNodeValue();
			    NodeList ListArgs =  ((Element)ListServ.item(f)).getElementsByTagName("cl:Arg");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(nomServ);
    
				for(int a=0; a<ListArgs.getLength();a++){
					String nomArg = "";
					if(a==0) nomArg = ":";
					else nomArg = "and:";
					if(!(a == (ListArgs.getLength()-1))) nomArg += " ";
					
    stringBuffer.append(nomArg);
    
			   
			    }			
				
				if(!(f == (ListServ.getLength()-1)))
    stringBuffer.append(" ");
    
	   	    }
    stringBuffer.append(TEXT_5);
    
	   	 }
	
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
