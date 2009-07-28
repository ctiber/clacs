import groovy.swing.factory.BoxFactory.GlueFactory;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ocl.query.QueryFactory;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
//import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.Resource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import GCLACS.Arg;
import GCLACS.Binding;
import GCLACS.BindingKind;
import GCLACS.BodyType;
import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.DefineByInterface;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;
import GCLACS.GCLACSPackage;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.ProvidedPort;
import GCLACS.RequiredPort;
import GCLACS.ServiceKind;
import GCLACS.Services;
import GCLACS.UsedService;
import GCLACS.Visibility;
import GCLACS.diagram.part.GclacsDiagramEditorPlugin;

public class SoftConstraint{

	   static FenetreGUI FG;
	   static boolean cstFound;
	   
	static Document_Root DR;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FG = new FenetreGUI("TestFG");
		
		FG.contentW.add(FG.content);
		FG.contentW.add(Box.createHorizontalStrut(15));
		FG.contentW.add(FG.contentArg);
		FG.contentW.add(Box.createHorizontalStrut(15));
		FG.contentW.add(FG.contentRes);
		FG.contentW.add(Box.createVerticalStrut(70));
		FG.contentW.add(FG.contentError);
		FG.content.add(new JLabel("Contrainte"));
		FG.contentArg.add(new JLabel("Arguments/Valeurs"));
		FG.contentRes.add(new JLabel("Résultat"));
				
		String nomFile = args[0];
		FG.setSize(1000, 200);
		FG.setLocation(200,200);
	 
	    //content.setBackground(Color.white);
		FlowLayout fl = new FlowLayout();
		FG.contentW.setLayout(fl);
	
		CaseAnalysis ca = new CaseAnalysis(args, FG);
	}
	
}
