# REAGroup

README
-----
This sample project provides a command line tool to move a Robot in a 5*5 square table.


System requirements
-------------------

1. JDK 1.8
2. Maven Build tool (3.X.X)


Compiling project
----------------
Change directory path to the "REAGroup" folder location and run as;
# mvn clean install

Above will build the project.

Run program
------------
Change directory path to the "target" folder location and run as;

#java -jar com.reagroup.robot-1.0-jar-with-dependencies.jar

you will be asked for inputs  like;

Please enter command  eg: PLACE 0,0,NORTH (If you want to quit type 'exit') 

 $ >

and if you provide like;
PLACE 0,0,NORTH
> REPORT

you will see the output as;

Position of the Robot is :0, 0, NORTH
 

TestCases
---------

Test scenarios are added as Junit tests.(src/test/java/com/reagroup/robot/test/RobotTest.java)

