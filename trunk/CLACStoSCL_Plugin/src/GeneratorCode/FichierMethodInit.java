package GeneratorCode;

import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FichierMethodInit
{
  protected static String nl;
  public static synchronized FichierMethodInit create(String lineSeparator)
  {
    nl = lineSeparator;
    FichierMethodInit result = new FichierMethodInit();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = " compile: '";
  protected final String TEXT_3 = "init";
  protected final String TEXT_4 = " := ";
  protected final String TEXT_5 = " new.";
  protected final String TEXT_6 = " port: #";
  protected final String TEXT_7 = " bindTo: ";
  protected final String TEXT_8 = "(";
  protected final String TEXT_9 = " port: #";
  protected final String TEXT_10 = ")";
  protected final String TEXT_11 = ".";
  protected final String TEXT_12 = "SclBinaryConnector new";
  protected final String TEXT_13 = " port: #";
  protected final String TEXT_14 = ")";
  protected final String TEXT_15 = "target:(";
  protected final String TEXT_16 = " port: #";
  protected final String TEXT_17 = ")";
  protected final String TEXT_18 = "glue: [ :source :target :si |";
  protected final String TEXT_19 = "\"To be completed\"";
  protected final String TEXT_20 = "].";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Object[] recup = ((Object[])argument);
String nomDescripteur = ((String)recup[0]);
ArrayList<Element> listInstance = ((ArrayList<Element>)recup[1]);
ArrayList<Element> listBinding = ((ArrayList<Element>)recup[2]);
ArrayList<Element> listBindingGlue = ((ArrayList<Element>)recup[3]);
String[] portName = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append("\r\r" + nomDescripteur);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("\r");
    stringBuffer.append(TEXT_3);
    if(listInstance.size()>0){
    stringBuffer.append("\r\t|");
    
for(int i=0;i<listInstance.size();i++){

    stringBuffer.append(((Element)listInstance.get(i)).getAttributes().getNamedItem("name").getNodeValue()+" ");
    }}
    stringBuffer.append("|");
    

for(int i=0;i<listInstance.size();i++){

    stringBuffer.append("\r\t" +((Element)listInstance.get(i)).getAttributes().getNamedItem("name").getNodeValue());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(
	((Element)listInstance.get(i)).getElementsByTagName("cl:DefinedByDescriptor").item(0).getTextContent());
    stringBuffer.append(TEXT_5);
    }


    stringBuffer.append("\r");
    for(int b=0;b<listBinding.size();b++){
	portName = ((Element)listBinding.get(b)).getElementsByTagName("cl:Source").item(0).getTextContent().split("\\.");
	if(portName.length == 1){
	
    stringBuffer.append("\r\t" + portName[0]);
    }else{
	
    stringBuffer.append("\r\t("+portName[0]);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(portName[1]+")");
    }
    stringBuffer.append(TEXT_7);
    
	portName = ((Element)listBinding.get(b)).getElementsByTagName("cl:Target").item(0).getTextContent().split("\\.");
	if(portName.length == 1)
    stringBuffer.append(portName[0]);
    else{
    stringBuffer.append(TEXT_8);
    stringBuffer.append(portName[0]);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(portName[1]);
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    }
for(int bg=0;bg<listBindingGlue.size();bg++){
    stringBuffer.append("\r\t");
    stringBuffer.append(TEXT_12);
    stringBuffer.append("\r\tsource: (");
    portName = ((Element)listBindingGlue.get(bg)).getElementsByTagName("cl:Source").item(0).getTextContent().split("\\.");
		 	   if(portName.length == 1)
    stringBuffer.append(portName[0]);
    else{
    stringBuffer.append(portName[0]);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(portName[1]);
    }
		 	   
    stringBuffer.append(TEXT_14);
    stringBuffer.append("\r\t");
    stringBuffer.append(TEXT_15);
    portName = ((Element)listBindingGlue.get(bg)).getElementsByTagName("cl:Target").item(0).getTextContent().split("\\.");
		 	   if(portName.length == 1)
    stringBuffer.append(portName[0]);
    else{
    stringBuffer.append(portName[0]);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(portName[1]);
    }
		 	   
    stringBuffer.append(TEXT_17);
    stringBuffer.append("\r\t");
    stringBuffer.append(TEXT_18);
    stringBuffer.append("\r\t\t");
    stringBuffer.append(TEXT_19);
    stringBuffer.append("\r\t");
    stringBuffer.append(TEXT_20);
    }

    stringBuffer.append("\r'.");
    return stringBuffer.toString();
  }
}
