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
- The TTT class helps two players to take turns.
### 4. Player.java
- This class stores information of game players.
- Method for each player to enter a move is included in this class.
- Method that check whether there is a winner is included in this class.
### 5. Message.java
- This class contains static methods that display message shown in the game process.
### 6. Board.java
- This class initializes game boards (custom size allowed).
- Methods for checking whether a position is valid/the board is full.
### 7. Cell.java
- This class initializes cells as individual objects.

## Notes

1. Rules: 3x3 board, two players (Player O starts first), winning by 3 in a row.
2. This program may be extended for more games (but I have not actually inplemented other games :(

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
Please enter the number of the game you want to play, or exit the program.

1. Tic-Tac-Toe
2. Coming soon...
3. Exit

Your choice:
</pre>

#### Input
<pre>
1
</pre>
  
#### Output
<pre>
Welcome to Tic-Tac-Toe!
  
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+

Player O ENTER YOUR MOVE
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
+---+---+---+
|   |   |   |
+---+---+---+
|   | O |   |
+---+---+---+
|   |   |   |
+---+---+---+

Player X ENTER YOUR MOVE
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
+---+---+---+
|   | X |   |
+---+---+---+
|   | O |   |
+---+---+---+
|   |   |   |
+---+---+---+

Player O ENTER YOUR MOVE
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
+---+---+---+
|   | X | O |
+---+---+---+
|   | O |   |
+---+---+---+
|   |   |   |
+---+---+---+

Player X ENTER YOUR MOVE
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
+---+---+---+
| X | X | O |
+---+---+---+
|   | O |   |
+---+---+---+
|   |   |   |
+---+---+---+

Player O ENTER YOUR MOVE
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
+---+---+---+
| X | X | O |
+---+---+---+
|   | O |   |
+---+---+---+
| O |   |   |
+---+---+---+

Congratulations! Player O wins!

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
2. Coming soon...
3. Exit

Your choice:
</pre>

#### Input
<pre>
3
</pre>

#### Output
<pre>
Bye!
</pre>
