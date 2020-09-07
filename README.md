# KenoProject

## Introduction
  
  *This test framework is intended to test if the different pages of Keno website has been loaded without any error.The framework has the capability to enhance the functionalities to be tested to next level.
  *Currently the framework focuses only on the sanity checks.
  *It has covered 4-5 screens/pages for sanity check.It can be extended to all the pages/screens depending on requirement
  *Created different classes like "Dashboard", "Check Results", "How To Win" etc under "pages" package(in eclipse) to store variables and functions related to that particular page.Included another package"test" to capture tests for particular pages or a combination of different pages . 
  *All these tests are prioritized using TestNG priority parameter
  *Then the tests are exceuted from testng.xml as a TestNG suite
  
## Requirements/Technologies/Set Up
   
   *Eclipse IDE
   * Java
   * Maven
   *Selenium dependency-placed in pom.xml
   *TestNG dpendency-placed in pom.xml
   *Maven compiler and Maven surefire plugin-placed in pom.xml 
   *drivers(used chrome driver to execute in chrome browser)-placed in src/test/resources
   
## Execution Instructions
   * Proceed to testng.xml and run as TestNG suite after placing all the required tests in it
   *The results can be seen in console and also Test-output folder
   *Please find the results screenshots in Images folder
   
  
   
   
