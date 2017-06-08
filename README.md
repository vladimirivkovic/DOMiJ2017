# DOMiJ2017
## Domain Specific Modeling and Languages Course Project
### Development Environment
* [Eclipse Modeling Tools]

### Tech
This project uses a number of open source projects to work properly:
* [Eclipse Modeling Framework (EMF)]
* [Xtext] - Language Engineering For Everyone
* [Sirius] - The easiest way to get your own Modeling Tool
* [Xtend] - Modernized Java
* [GEDCOM] - Genealogical Data Communication

### Running the project
Import the following projects into Eclipse workspace
- 	genDSL2
- 	org.xtext.genDSL2.gsl.ide
- 	org.xtext.genDSL2.gsl.tests
-	org.xtext.genDSL2.gsl.ui.tests
-	org.xtext.genDSL2.gsl.ui
-	org.xtext.genDSL2.gsl
-	gsl.examples
-	gsl.generator

Run **org.xtext.genDSL2.gsl.ide** as *Eclipse Application*
Import the following projects into Eclipse runtime workspace
- genDSL2.project.design
- test

Add new file to **test** project with extenstion *.gsl
Create family tree using textual or graphical syntax
Generate GEDCOM file by running **gsl.examples** project *TestClass* with **path to folder** and **gsl file name** (in previously specified folder) as command line arguments


## Nemanić Dinasty Family Tree
![](https://s-media-cache-ak0.pinimg.com/originals/bb/8f/e0/bb8fe07736718f56c23465bc5e75b9c4.jpg?raw=true)

   [Eclipse Modeling Framework (EMF)]: <https://eclipse.org/modeling/emf>
   [Xtext]: <https://eclipse.org/Xtext>
   [Sirius]: <https://eclipse.org/sirius>
   [Xtend]: <http://www.eclipse.org/xtend>
   [GEDCOM]: <https://en.wikipedia.org/wiki/GEDCOM>
   [Eclipse Modeling Tools]: <http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/neon3>

License
----

MIT
