_Overivew of CLACS Eclipse plugin download and installation_

Summary :



# Downloads #

  * Plugins sources codes (SVN repository)

  * Two .jar containing the dependencies (See URL link below)

  * Squeak and SoftConstraint plugin

# Installation #

_To test and to complete_

## Eclipse and plugins Installation ##

### With Galileo Eclipse Modeling Tools ###

Install Eclipse 3.5 Galileo version Eclipse Modeling Tools can avoid most plugins installation (exceptionally Orbit and Squeak) and dependency problems.

**_Nb : We strongly recommend to install Eclipse 3.5 Galileo version Eclipse Modeling Tools. The installation of Eclipse with this version on a computer which has another version of Eclipse will not affect on the  version already installed. Just install the new version in a different directory. Both versions can also use differents workspaces but eventually can share the same one._**

  * [Galileo Eclipse Modeling Tools Version Linux](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/galileo/R/eclipse-modeling-galileo-incubation-linux-gtk.tar.gz)

  * [Galileo Eclipse Modeling Tools Version Windows](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/galileo/R/eclipse-modeling-galileo-incubation-win32.zip)

  * [Galileo Eclipse Modeling Tools Version Mac Carbon](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/galileo/R/eclipse-modeling-galileo-incubation-macosx-carbon.tar.gz)

### Without Galileo Eclipse Modeling Tools ###

  * Download and extract the dependencies [Part 1](http://clacs.googlecode.com/files/D%C3%A9pendances1.tar.gz) [Part 2](http://clacs.googlecode.com/files/D%C3%A9pendances2.tar.gz)

  * Install in Eclipse the plugins presented below in the following order:
(copy the .jar in plugin folder of Eclipse)

  1. EMF
  1. Query
  1. Transaction
  1. Validation
  1. OCL
  1. UML 2.0
  1. GEF
  1. Orbit(map)

## Squeak and Softconstraint Installation ##

### Squeak ###

  * Download and extract Squeak archive
[Archive Squeak](http://clacs.googlecode.com/files/Squeak.zip)

  * For windows, put Squeak folder in the same folder as Eclipse launcher.
  * For Linux and Mac, Versions to install are presented in the Squeak folder.

### Softconstraint : Constraints plugin ###

  * Download SoftConstraint plugin [Plugin SoftConstraint](http://clacs.googlecode.com/files/SoftConstraint.jar)

  * Copy SoftConstraint.jar in project repertory (Bu default with Galileo : same level as eclipse launcher).

## Project Installation ##

### Recovery of the SVN repository password ###

  * Authenticate with the credentials of your account on http://code.google.com/p/clacs/.

  * Go to Sources tab and click on "googlecode.com password"  and save the generated password.

### Subclipse Tigris Installation ###

  * Add the following url in the eclipse update tool (help, install new software) : `http://subclipse.tigris.org/update_1.6.x`

  * Select subclipse and its dependencies and launch the installation

### Recovery of the project from SVN repository ###

  * It is possible to create a new SVN Checkout. (New-> SVN ->Checkout Projets from SVN)

  * Check "Create a new repository location", and put l'url : `https://clacs.googlecode.com/svn/trunk/`

  * Authenticate with the login and e-mail on `http://code.google.com/p/clacs/` and with passsword that is previously recovered.

  * A window summarizes all project folders, select all the folders and complete.

  * All the project directory is added to the Workspace.

### Resolving missing dependencies ###

Add the following dependencies (the project : right click -> Properties ->Java build path -> Libraries)

_nb : If the librairies are present and not found, delet it_

#### CLACS Project ####

  * org.eclipse.emf.ocl\_1.1.1.v200709121956 (répertoire mdt-ocl-SDK-1.1.2/eclipse/plugins des dépendances)

#### CLACStoSCL\_Plugin Project ####

  * org.eclipse.emf.ecore\_2.3.2.v200802051830(répertoire emf-sdo-xsd-SDK-2.3.2/eclipse/plugins des dépendances)

#### CLACS\_OCLConst Project ####

  * org.eclipse.emf.common\_2.3.2.v200802051830(répertoire emf-sdo-xsd-SDK-2.3.2/eclipse/plugins des dépendances)

  * org.eclipse.emf.ecore\_2.3.2.v200802051830(répertoire emf-sdo-xsd-SDK-2.3.2/eclipse/plugins des dépendances)

  * org.eclipse.emf.ocl\_1.1.1.v200709121956(répertoire mdt-ocl-SDK-1.1.2/eclipse/plugins des dépendances)

  * org.eclipse.emf.ecore.xmi\_2.5.0.v200906151043(répertoire plugins d'eclipse)

  * org.eclipse.core.commands\_3.5.0.I20090525-2000(répertoire plugins d'eclipse)

  * org.eclipse.core.resources\_3.5.0.v20090512(répertoire plugins d'eclipse)

  * org.eclipse.equinox.registry\_3.4.100.v20090520-1800(répertoire plugins d'eclipse)

  * org.eclipse.gmf.runtime.diagram.ui\_1.2.0.v20090526-1925(répertoire plugins d'eclipse)

  * org.eclipse.gmf.runtime.diagram.ui.resources.editor\_1.2.0.v20090526-1925(répertoire plugins d'eclipse)

  * org.eclipse.gmf.runtime.notation\_1.2.0.v20090521-1925(répertoire plugins d'eclipse)

  * org.eclipse.ui.view.properties.tabbed\_3.5.0.I20090429-1800(répertoire plugins d'eclipse)

  * org.eclipse.ui.workbench\_3.5.0.I20090603-2000(répertoire plugins d'eclipse)

### Project launching ###
The project should not have errors (if that is the case, add missing dependencies in the same way, they will be reported by the tab "problems" Eclipse.

To compile it, just run CLACS as an "Eclipse Application" (right click on the clacs project, Run as -> Eclipse Application, or shortcut Shift + Alt + X sunken, and E). The version of Eclipse have a plugin CLACS 1.1.

Using the plugin clacs is explained in the [Utilisation et Fonctionnalités](http://code.google.com/p/clacs/wiki/Utilisation_fonctionnalites)