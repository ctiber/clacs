_Explicit the differences between the version 1.0 and the version 1.1_

Summary :




# Difference between the version 1.0 and the version 1.1 #


**List of main changes between the two versions :**

  * Additions of many tests / exception handling limits validation crashes of an architecture and increase the feedback.

  * Modification of CLACS and GCLACS meta-metamodeles. (In the following of this page, the meta-metamodels will be nominated by metamodels).

  * Modification of GMF models (gmfgraph, gmftool, gmfmap, gmfgen)

  * Improvement of graphic interface (Custom figure)

  * Graphic and implementation addition of the arguments(Arg) and the body (Body), return type (returnedType) for the services.

  * Graphic and implementation addition of used services (UsedService) and its arguments values(listArgService) for the bindings.

  * Integration and analyses of OCL constraints (with and without arguments)basing on the modeled component architecture

## Details ##


_We will develop the modifications made for the two metamodels in the project. They correspond to the core of the project. They will define the rules of CLACS language, graphics elements, its relationships etc.
We will discuss the additions to gmf models (gmfgraph, gmfmap, gmftool etc.) that define the graphical environment.
Finally, we discuss the changes made to the source code._

### Comparison old / new CLACS metamodel ###


#### CLACS old metamodel ####
![http://clacs.googlecode.com/files/CLACS2.png](http://clacs.googlecode.com/files/CLACS2.png)
#### CLACS new metamodel ####
![http://clacs.googlecode.com/files/CLACS23-07-092.png](http://clacs.googlecode.com/files/CLACS23-07-092.png)

The component descriptor (ComponentDescriptor), which was the main element of the old metamodel has given place to the component instance (ComponentInstance). This allows to see a modeled component as an instance of a component (describing the descriptor of that component).

Manipulate an instance allows the generation of an instance or a componenet descriptor easily. Thus, the ports, the interfaces and the binding are found "included" in the component instance. The concept of descriptor was encapsulated, to simplify the modeling.

We can see that the concepts of AssemblyBinding and DelegationBinding have been added, but they are not currently connected to the binding.

The old BindingKind gives a way to A\_BindingKind et D\_BindingKind. (these modifications will induce a modification in the system of interpretation of OCL constraints). They allow to perform associations of constraints. For example, if two components are interconnected by OR binding. they also connected to a business one. This later should satisfay one or other constraints.


### Comparison old/ new GCLACS metamodel ###

#### GCLACS old metamodel ####
![http://clacs.googlecode.com/files/GCLACS2.png](http://clacs.googlecode.com/files/GCLACS2.png)
#### GCLACS new metamodel ####
![http://clacs.googlecode.com/files/GCLACS23-07-092.png](http://clacs.googlecode.com/files/GCLACS23-07-092.png)

All the modifications made for CLACS metamodel has repercussions on this metamodel.

The following items have been reworked :

  * In the same way as for the metamodel clacs, the metamodel is centralized around the concept of component instance(ComponentInstance)

  * As the CLACS metamodel, services now have a body (Body), a set of arguments (Arg) and a return type (returnedType).

  * The binding now have a name (to be identified in the OCL constraints). They have over a used service (usedServiceName) and the list of parameters (usedServiceArgs).

### gmfgraph modifications ###

As indicated in the new version of gmfgraph, the node of ComponentDescriptor and its representation was removed.

The figure of ComponentInstance is seen with an additional label, to enter the name of the descriptor that is linked to it.

Arg and Body nodes are described by "Custom Figure", Figure that will be created by creating a new class based on the generic class "Shape".

A "Compartment" BodyArgsCompartments was added. it will be belong to Service element to store Arg and body.

![http://clacs.googlecode.com/files/gmfgraph23-07-09.png](http://clacs.googlecode.com/files/gmfgraph23-07-09.png)

### gmfmap modifications ###

The hierarchy of elements has been completely redesigned. It has therefore been adapted to not contain the components descriptors, and expanded to handle new concepts like the body of a service or its arguments.

![http://clacs.googlecode.com/files/gmfmap23-07-09.png](http://clacs.googlecode.com/files/gmfmap23-07-09.png)

### gmftool modifications ###

This model depicts the palette used to model the elements ( Component, Ports, Services ...) in GCLACS environnemet.

So, ComponentDescriptor tool is removed and Body and Arg tools are appeared.

![http://clacs.googlecode.com/files/gmftool23-07-09.png](http://clacs.googlecode.com/files/gmftool23-07-09.png)

### Code source modifications ###

  * Classes administ the management of items GCLACS plugin menu have been reworked to match the new models

  * CLACS and GCLACS are modified, the resulting operations were also reworked.


A new plugin will manage the OCL constraints included in the definitions of component services. This plugin handles currently OCL constraints with and without parameter.
The context of the constraint component is propagated in the case where this component is connected to one or several other  constraints components.


In the example presented below (modeled with GCLACS), Cst et Cst2 are two constraints compoenents and Comp  is a business components.
Cst will bring a constraint on its context. But Cst is connected to Cst2 that it is also a constraint component. The context will spreadto Comp:

![http://clacs.googlecode.com/files/exemplePropagationContexte.png](http://clacs.googlecode.com/files/exemplePropagationContexte.png)

Interpretations taking advantage of more advanced binding (AND, OR, XOR etc.) to combine the constraints are not implemented yet.