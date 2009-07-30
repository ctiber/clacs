package GeneratorCode;

import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EnteteFichier
{
  protected static String nl;
  public static synchronized EnteteFichier create(String lineSeparator)
  {
    nl = lineSeparator;
    EnteteFichier result = new EnteteFichier();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "(SclBuilder new: #";
  protected final String TEXT_2 = "category: '";
  protected final String TEXT_3 = "')";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Object[] recup = ((Object[])argument); 
String nomDescription = ((String)recup[0]);
String categorie = ((String)recup[1]);
    stringBuffer.append(TEXT_1);
    stringBuffer.append(nomDescription +"\r\t" );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(categorie);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
