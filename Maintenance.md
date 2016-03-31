_Details the various "technical" components of the project in order to allow the future updates_

Summary:



# Maintenance #

## To Start ##

To become familiar with the basics of the project:

  * [Tutorial EMF](http://www.eclipse.org/articles/Article-Using%20EMF/using-emf.html)

  * [Tutorial GMF](http://wiki.eclipse.org/index.php/GMF_Tutorial)

  * [Notions plus avancees](http://wiki.eclipse.org/GMF_Documentation_Index)

## Details of source files ##


### Generated source files (unnecessary to modify) ###
Omong the source repertory CLACS.edit, CLACS.editor, CLACS.tests, GCLACS.edit, GCLACS.editor, GCLACS.tests are generated from emf and gmf models. It does not seem that it is necessary to modify them.

### Generated source files (it is possible to be modified) ###
The repertory GCLACS.diagram is also generated, but it can be sometimes manually modified (to customize the environment with new classes).
The repertory CLACStoSCL\_Plugin centralizes the interactions with the graphic design (1 Class by item of the plugin menu  and a package for generating the SCL code).

### Source files: OCL constraints management ###
The repertory CLACS\_OCLConst corresponds to an analyzer of OCL contraintes.
Think to generate a new executable jar in order to take it into account for GCLACS.
we present here the class diagram explaining the structure of the constraint plugin:
![http://clacs.googlecode.com/files/DiagrammeClasseConstraintPlugin.png](http://clacs.googlecode.com/files/DiagrammeClasseConstraintPlugin.png)

These details are clearly simplified :

  * CaseAnalysis class will perform a case study of clacs input files. According to the type found, the corresponding Parsing class will be used.

  * AccessorModel class is composed of a set of accessors for the instancied model specified by CCLACS metamodel.

  * erializerXMI class allows to serialize the instancied model in XMI to perform verifications, tests etc.

  * onstraintInterpretor class manages the interpretation of OCL contraints.

  * FenetreGUI is the class that is responsible to manage the graphic interface, SoftConstraint class contains the main function.
Finally, CLACS and GCLACS repertories are respectively the main of CLACS langage and graphic environnement GCLACS.

### Source files generated with metamodels ###
CLACS contains the ecore metamodel allowing to model CLACS language specifications.

## GMF models ##

GCLACS contains the ecore metamodel manageant the graphic aspects that are relatives on GCLACS environnement. It is completed by a set of interconnected gmf models(gmfgraph, gmfgen, gmfmap et gmftool). The dashboard presented below depicts the relations between models in order to constitute GCLACS environment.

![http://clacs.googlecode.com/files/dashboard.png](http://clacs.googlecode.com/files/dashboard.png)


### Code generation based on models ###

when we perform modifications on ecore metamodels, we must reload genmodel model. (Right click on genmodel -> reload)

Once the latter is charged, it is sufficient to do a right click and do "Generate All".

When the modifications are made on Lorsque des modifcations gmfgraph model, it must regenerate the figures. (Rignt click -> Generate Figure Plug in), The name of "main plugin" to do is "CLACS".

If gmfmap model is modified, it must create the le "Generator Model" (Right Click).

gmfgen model centralizes the modifications of all models. It must to update it once one of the models is updated. (Right Click-> Generate Diagram Code).

/!\ During code generation, the existed code is crashed even if the manual modifications are made. To remedy this, precede simply the function to not regenerate with the keyword NOT behind the generated mention.

Exemple :
```

	/**
	 * @generated NOT
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}
```