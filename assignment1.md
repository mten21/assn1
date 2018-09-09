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

Fill in the template classes from the provided repository. 

1. Design a `Player` class that represents hockey players. Players have some properties you must add:

- `Position` on a hockey team. There are at least four: defender, winger, centre, goaltender.
- points (a point in hockey is a goal or an assist) and names. 
- names.

In addition, add methods to create a Player, and add a `getPoints` and `getName` method`.

2. Implement the class called Team that will use the `Player` type to maintain a list of players. Use a [generic/parameterized type](https://docs.oracle.com/javase/tutorial/java/generics/types.html) type `List` to hold the players. Teams should store the number of players, and have a name (e.g. Canucks, Penguins ...) 

# Part 2
Using JetUML, create a UML Object diagram to represent a `League` instance. Leagues have multiple Teams. For this diagram, assume your league object has 3 teams and each team has 4 players. **Only show the player objects for one team.** Submit your diagram by committing it to your assignment1 repo, in the JetUML "*.mdl" format and a PDF.  

# Part 3 
1. Implement the `Comparable` interface for the Team class using total Player points. 
1. Implement a `Comparator` method for ranking hockey players based on points. Do this with a lambda expression.
1. Override the `Object.toString()` method in order to print the following for a Team:

`System.out.println(canucks)
: Canucks have four points.`
