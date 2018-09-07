Assignment 1

Due: Sep 21, 2018 at midnight in Github.

# Overview
For this, and the remaining assignments: 
- not running (and fixing) Checkstyle warnings will result in lost marks.
- code that does not compile will be given 0 marks (for that part of the assignment).
- since we auto-mark, following the template code and the naming conventions is vital to pass tests. 

This assignment uses Gradle, a build tool. Gradle makes it easy to automate compile/test/build loops from the command line, and also has an Eclipse plugin. 

To run your code from the command line, type `gradle build`. `gradle test` will execute the tests I've added to the code here. NB: **the full test suite is on Travis, and you should commit/push to Github to see these results**.

# Part 1
Design an Enumerated Type (java 8+) Player that represents positions on a hockey team. There are at least four. 

Design a class called Team that will use the Play

# Part 2
Using JetUML, design a UML Object diagram to represent a League. Leagues have multiple teams. Submit your diagram by committing it to your assignment1 repo, in the JetUML "*.mdl" format and a PDF.  

# Part 3 
Implement the Comparable interface for the Team class using Player points as a total. 
Implement a Comparator method for ranking hockey players based on points. 

Override the toString method in order to print the following:

`System.out.println(canucks)
: Canucks have four points.`

You should do this using an anonymous function (lambda). 
