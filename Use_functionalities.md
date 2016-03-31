_A quick summary of the steps to create a clacs project and an overview of its features_

Summary :




# Create a project #

Create a new project (New -> Project)

![http://clacs.googlecode.com/files/newProject.png](http://clacs.googlecode.com/files/newProject.png)

Once the projecyt is created, it is possible to add gclacs\_diagram document.(Right click on the new project ->New->Other...) This new document is automatically open with GCLACS environnement. A document which his type is gclacs is generated at the same time.

![http://clacs.googlecode.com/files/newGCLACSDiagram2.png](http://clacs.googlecode.com/files/newGCLACSDiagram2.png)


# Overview #

As in all modeling environments based on GMF, the GCLACS environment decomposes on :

![http://clacs.googlecode.com/files/FenetrePrincipaleAnnotee.png](http://clacs.googlecode.com/files/FenetrePrincipaleAnnotee.png)

  * (a) : the main window where you will place the various graphic elements from the palette.

  * (b) : the toolbox for creating nodes and links

  * (c) : the Properties tab describing the properties of the selected item in the main window

# Features #

Once the desired archirecture is realized, it is it is sufficien to use the plugin features in CLACS menu:


![http://clacs.googlecode.com/files/menuPlugin.png](http://clacs.googlecode.com/files/menuPlugin.png)


The selected functionality will be applied on the current page of the graphical editor. In case of misuse, a message will specify the cause of the problem.
The modeled architecture will successively undergoes various procedures:


## GCLACS Architecture towards CLACS Architecture ##

A CLACS document will be generated basing on the modeled architecture.

Example of a generated CLACS document:

```
<?xml version="1.0" encoding="UTF-8"?>
<cl:Component_Instance xmlns:cl="Metamodele/clacsCL" kind="business" name="instGlobalComp">
<cl:DefinedByDescriptor>GlobalComp</cl:DefinedByDescriptor>
	<cl:Component_Instance name="instCst">
		<cl:DefinedByDescriptor>Cst</cl:DefinedByDescriptor>
	</cl:Component_Instance>
	<cl:Component_Instance name="instCst2">
		<cl:DefinedByDescriptor>Cst2</cl:DefinedByDescriptor>
	</cl:Component_Instance>
	<cl:Component_Instance name="instComp">
		<cl:DefinedByDescriptor>Comp</cl:DefinedByDescriptor>
	</cl:Component_Instance>
	<cl:Port name="PPGComp">
		<cl:Direction>provided</cl:Direction>
		<cl:Visibility>internal</cl:Visibility>
		<cl:DefinedByInterface></cl:DefinedByInterface>
	</cl:Port>
	<cl:Port name="RPGComp">
		<cl:Direction>required</cl:Direction>
		<cl:Visibility>internal</cl:Visibility>
		<cl:DefinedByInterface></cl:DefinedByInterface>
	</cl:Port>
	<cl:Binding name="bindCstCst2" glue="false" kind="simple">
		<cl:Source>instCst.PPCst</cl:Source>
		<cl:Target>instCst2.RPCst2</cl:Target>
		<cl:UsedService name="serviceCst">
		</cl:UsedService>
	</cl:Binding>
	<cl:Binding name="bindCst2Comp" glue="false" kind="simple">
		<cl:Source>instCst2.PPCst2</cl:Source>
		<cl:Target>instComp.RPComp</cl:Target>
	</cl:Binding>
	<cl:Binding name="bindCompGComp" glue="false" kind="delegation">
		<cl:Source>instComp.PPComp</cl:Source>
		<cl:Target>PPGComp</cl:Target>
	</cl:Binding>
</cl:Component_Instance>
```

## CLACS Architecture validation ##

will verify that the rules are respected.

Example : all elements must be nominated


![http://clacs.googlecode.com/files/erreurValidation.png](http://clacs.googlecode.com/files/erreurValidation.png)

## Constraints verification ##

Will analyze the OCL constraints described in the architecture. A listing of the constraints and their possible parameters will be displayed to show the results. In case of constraint would be invalidated or syntactically incorrect, a message will inform the user, inviting him to correct errors. The user is notified when the number of parameters differs from the number of arguments.

Example of analysis of validated constraints :

![http://clacs.googlecode.com/files/cstOK.png](http://clacs.googlecode.com/files/cstOK.png)

Example analysis of invalidated constraints :

![http://clacs.googlecode.com/files/cstFalse.png](http://clacs.googlecode.com/files/cstFalse.png)

Exemple of analysis of constraints with error in OCL syntax:

![http://clacs.googlecode.com/files/cstErr.png](http://clacs.googlecode.com/files/cstErr.png)

## CLACS Architecture towards SCL code ##

Will generate the template of SCL code of components architecture described by the selected CLACS file.

Example of a generated SCL document :

```
(SclBuilder new: #GlobalComp
	category: 'GlobalComp_category')
	requiredPorts:{};
	providedPorts:{}.

GlobalComp compile: '
init
	|instCst instCst2 instComp |
	instCst := Cst new.
	instCst2 := Cst2 new.
	instComp := Comp new.

	(instCst port: #PPCst) bindTo: (instCst2 port: #RPCst2).
	(instCst2 port: #PPCst2) bindTo: (instComp port: #RPComp).
	(instComp port: #PPComp) bindTo: PPGComp.
'.
```

## Load in Squeak ##

will open the Squeak editor tacking as parameter the current SCL file.

A screenshot of Squeak :

![http://clacs.googlecode.com/files/squeak.png](http://clacs.googlecode.com/files/squeak.png)

Squeak is a graphic editor for est un éditeur graphique pour le langage SmallTalk language (SCL is a component language based on SmallTalk)

Les différentes fenêtres d'interaction sont :

  * (1) : Allow to choose the category

  * (2) : Allow to  select the component descriptor

  * (3) : Allow to choose the category of the method

  * (4) : Displays all methods corresponding to the category

  * (5) : Editor allows to modify the method

  * (6) : The workspace where you can execute commands

  * (7) : The transcript where the results are displayed