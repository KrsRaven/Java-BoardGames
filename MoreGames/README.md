# CS611 Assignment 1 - Tic Tac Toe

> **Name**:       Claire Fan<br>
> **Email**:      jfan22@bu.edu<br>
> **Student ID**: U80694562<br>

## Files

### 1. START.java<br>
- This file contains a main method which is used to run the board game program.
### 2. RunGame.java
- This class controls the game process, including methods that start/end the game.
### 3. TTT.java
- This class includes the Tic-Tac-Toe game process.
### 4. OAC.java
- This class includes the Order and Chaos game process.
### 5. Connect4.java
- This class includes the Connect-4 game process.
### 6. Player.java
- This class stores information of game players.
- Method for each player to enter a move is included in this class, including a general version and a Connect-4 version.
- Each player has a record for their number of wins for all games.
### 7. Message.java
- This class contains static methods that display message shown in the game process.
### 8. Board.java
- This class initializes game board that is compatible with any type of board games.
- Methods for checking whether a position is valid/the board is full.
- Method for checking winning conditions is included in this class.
### 9. Cell.java
- This class initializes cells as individual objects.

## Notes

1. The method for checking winning conditions is moved from the Player class to the Board class.
2. Player record is added to the program.
3. Scalability for board size (YES), winning condition (YES), for number of players in a game (NO).

## How to compile and run

1. Download all files into one folder.
2. Navigate to the folder in Terminal.
3. Run the following instructions:
<pre>
javac START.java
java START
</pre>
  
## Input/Output Example

#### Output
<pre>
Welcome to the Board Game Center!

Player 1, please enter your name:
</pre>

#### Input
<pre>
Taco
</pre>

#### Output
<pre>
Player 2, please enter your name:
</pre>

#### Input
<pre>
Cat
</pre>

#### Output
<pre>
Please enter the number of the game you want to play, or exit the program.

1. Tic-Tac-Toe
2. Order and Chaos
3. Connect-4
4. Exit

Your choice:
</pre>

#### Input
<pre>
1
</pre>
  
#### Output
<pre>
Welcome to Tic-Tac-Toe!

     [0] [1] [2]
    +---+---+---+
[0] |   |   |   |
    +---+---+---+
[1] |   |   |   |
    +---+---+---+
[2] |   |   |   |
    +---+---+---+

Taco, ENTER YOUR MOVE
Enter Row [0-2]: 
</pre>

#### Input
<pre>
1
</pre>

#### Output
<pre>
Enter Column [0-2]: 
</pre>

#### Input
<pre>
1
</pre>

#### Output

<pre>
     [0] [1] [2]
    +---+---+---+
[0] |   |   |   |
    +---+---+---+
[1] |   | O |   |
    +---+---+---+
[2] |   |   |   |
    +---+---+---+

Cat, ENTER YOUR MOVE
Enter Row [0-2]: 
</pre>

#### Input
<pre>
0
</pre>

#### Output
<pre>
Enter Column [0-2]: 
</pre>
  
#### Input
<pre>
1
</pre>
  
#### Output

<pre>
     [0] [1] [2]
    +---+---+---+
[0] |   | X |   |
    +---+---+---+
[1] |   | O |   |
    +---+---+---+
[2] |   |   |   |
    +---+---+---+

Taco, ENTER YOUR MOVE
Enter Row [0-2]: 
</pre>
  
#### Input
<pre>
0
</pre>
  
#### Output
<pre>
Enter Column [0-2]: 
</pre>
  
#### Input
<pre>
2
</pre>

#### Output

<pre>
     [0] [1] [2]
    +---+---+---+
[0] |   | X | O |
    +---+---+---+
[1] |   | O |   |
    +---+---+---+
[2] |   |   |   |
    +---+---+---+

Cat, ENTER YOUR MOVE
Enter Row [0-2]: 
</pre>
  
#### Input
<pre>
0
</pre>
  
#### Output
<pre>
Enter Column [0-2]: 
</pre>
  
#### Input
<pre>
0
</pre>
  
#### Output

<pre>
     [0] [1] [2]
    +---+---+---+
[0] | X | X | O |
    +---+---+---+
[1] |   | O |   |
    +---+---+---+
[2] |   |   |   |
    +---+---+---+

Taco, ENTER YOUR MOVE
Enter Row [0-2]: 
</pre>
  
#### Input
<pre>
2
</pre>
  
#### Output
<pre>
Enter Column [0-2]: 
</pre>
  
#### Input
<pre>
0
</pre>
  
#### Output

<pre>
     [0] [1] [2]
    +---+---+---+
[0] | X | X | O |
    +---+---+---+
[1] |   | O |   |
    +---+---+---+
[2] | O |   |   |
    +---+---+---+

Congratulations! Taco wins!

Here are your records of wins!

Player: Taco
{Tic-Tac-Toe=1, Connect-4=0, Order and Chaos=0}

Player: Cat
{Tic-Tac-Toe=0, Connect-4=0, Order and Chaos=0}

Would you like to play another game? Press 'Y' for continue, press any other key to exit.
</pre>

#### Input
<pre>
y
</pre>
 
#### Output
<pre>
Please enter the number of the game you want to play, or exit the program.

1. Tic-Tac-Toe
2. Order and Chaos
3. Connect-4
4. Exit

Your choice:
</pre>

#### Input
<pre>
4
</pre>

#### Output
<pre>
Bye!
</pre>
