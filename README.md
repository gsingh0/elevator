# elevator
elevator simulation on the command line


 1. Purpose: To write a program name elevator.java that simulates one elevator services in a 12-floor building.
 
 2. Solution & Algorithm: 
        6 array-lists total (3 for 'up' and 3 for 'down'), with 2 of the 6 array-lists being of type 'list' (self-  created object that           determines floor number and a boolean value for whether true = stop at floor and false = keep going down. Programmed the                   entire solution in a do-while loop so that it would allow the user to execute the program again. Used selection sort algorithm to         sort random generated list.
       
 
 3. Description & Expected I/O: 
        To use the program, simply enter 'yes' or 'no' when the programs asks the user to go up the elevator. When you select 'yes,' the           program outputs the floor you are on, the floor you will go to, and the floor you will stop at. The floors that are  stopped are           randomly generated and will move in one direction until it reaches the top or bottom floor. When the program finishes taking you           up and down, the program will ask the user again if he/she wants to run the elevator again. If you select 'no,' the program               terminates.

4. Purpose of Classes: 
        The elevator class is the client class that executes the program, with all the necessary array-lists, static methods, and loops           required to run. The list class is a class that has field values of the floor number (int) and a boolean value whether the                 elevator should stop or not. The class is used in Array-lists 'comb' and 'dow,' meaning that the array-list is of type 'list.' We         use these two array-list to determine what floor the elevator is currently on and whether it is going to stop at a floor or not.
