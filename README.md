
# java-compiler-using-java-basic-codes
This codes runs a java program in order to create and execute existing code in system.
it mainly consists of four java code files to create and run files.
four codes as follows:
1.starter.java
2.createJavaFile.java
3.Run.java
4.launcher.java
Working :- 
A.
of starter.java:
1)This file will decide which operation is to be performed it would be either to create a file or to execute the existing file
2)if the user selects to create a new file then it will a call method name as launch(); which is in createJavaFile.java,.
3)if the user selects run then it will ask for file name after that it will call a method from Run.java which will create a .bat to execute the code that user have requested for.
then this .bat file will be executed from launcher.java and a command promt window will be poped and this window will show our output from requested code.
B.
of createJavaFile.java:
1)This class will be called by the method named as create() in this file only.if the user wants to create a new file.
2)After calling method.it will ask you for a film name so that it can able to create a new file for your code using IO libraries in java
3)After creating a new file a ArrayList will be executed to store our code when we are done with our code then we just have to type "exit" to exit editor.
4)After wrinting code it will ask user to run it if user says yes then it will call run() method from Run.java then this Run.java will create a .bat file for execution of our code that we just made .
C.
of Run.java:
1)from createJavafile.java or starter.java a String will be given to run(String file_name) method this method will make a new .bat file to execute requested or to execute the file that we just made.
2)Further this method will call a launch() method from launch.java for execution of .bat file.
D.
of launcher.java
1)This method will be only called from Run.java for opening of .bat file using awt and net libraries 
2)This .bat will open command promt which further display our output of file.

After the code will be ended you get a file in myJavaIDE folder.
in myJavaIDE folder there is a sub folder named as programingunit which contains our base code for Compiler.
