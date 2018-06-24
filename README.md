# iasa_oop_2018
Course project for "Object Oriented Programming" course at Kyiv Polytechnic Institute

This is a simple text-interaction app that allows to create a list of vehicles of different type and display this list to a user. The list is not limited and adding new items is stops only when a user doesn't want to add new items anymore. Each item contains information added by a user (name, year of production etc) as well as some information that is predetermined and depends on a user's choice (typology, drive characteristics).

1. Firstly, download all the files from this repository.

2. Open it in Java (in particualr, in IntelliJ Idea).
3. Run "Autopark.java".
4. If everything works well, you should be able to see some text written in the console: there should be written "Enter vehicle name:". 
5. Follow the instructions that are written in the console. You should interact with it by adding some data via input.
6. After everything is filled, you should be asked if you want to continue adding items or to finish and display the list. In case you choose to "add more", all previous steps will be repeated. Otherwise, you will see a list of all items you have added and the program will finish its work.

Note: Some methods are called directly during the process of filling information and are never used again. This is done just to demonstrate capabilities of the "interfaces" that are implemented in different classes.
