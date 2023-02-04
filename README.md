# CS611 Assignment 1 - Tic Tac Toe

> **Name**:       Claire Fan<br>
> **Email**:      jfan22@bu.edu<br>
> **Student ID**: U80694562<br>

## Files

### 1. START.java<br>
- This file contains a main method
### 2. RunGame.java
- ss
### 3. TTT.java
- ss
### 4. Message.java
- ss
### 5. Board.java
- ss
### 6. Cell.java
- ss

## Notes

1. <Files to be parsed should be stored in ConfigFiles, for parser class to
read class>
2. <Bonus Done>
3. <Notes to grader>

## How to compile and run

1. Navigate to the directory "pa1" after unzipping the files
2. Run the following instructions:
<Example below>
javac -d bin src/*.java
java -cp bin Main

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
