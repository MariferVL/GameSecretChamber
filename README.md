
# Secret Chamber Console Game

## Introduction
Welcome to the Secret Chamber Console Game, a Java-based game that lets you simulate a battle between protesters armed with eggs and security vehicles protecting a secret chamber. In this game, you will play as the protesters and try to earn points by hitting the security vehicles with eggs.

## How to Play
Follow these simple steps to play the Secret Chamber Console Game:

### Prerequisites
Before you start, make sure you have Java installed on your computer.

### Running the Game
1. Access the game through the provided Replit link.

2. Click the "Run" button to start the game.

### Game Mechanics
- You will be presented with a 15x15 grid representing the game board.

- Security vehicles on the board are represented as follows:
  - **Kromis** (K): These are vertical vehicles that occupy three cells.
  - **Caguanos** (C): These are horizontal vehicles that occupy two cells.
  - **Trupallas** (T): These are single-cell vehicles.

- Your goal is to throw eggs at the security vehicles by specifying the row and column where you want to throw.

- Enter the row and column numbers when prompted.

- Points are awarded based on the type of vehicle hit:
  - Kromi: 3 points
  - Caguano: 2 points
  - Trupalla: 1 point

- If you hit a Kromi three times and disable it completely, you earn an additional 10 points. For a Caguano, you earn an extra 7 points if you disable it.

- You can throw an unlimited number of eggs, and an egg can hit the same position multiple times. 

- If a cell has been hit by an egg, it will be marked as "H" on the game board. No additional points will be awarded for hitting a previously attacked position.

- The game continues until you decide to exit.

### Ending the Game
To end the game and check your total score, simply press any key when prompted to continue or exit.

## Technical Details
For those interested in the technical details of the game, here's an overview:

- The game is implemented in Java and follows object-oriented programming principles.

- It consists of several classes, including:
  - Car: Represents different security vehicles.
  - Kromi, Caguano, Trupalla: Subclasses representing specific vehicle types.
  - Huevo: Represents egg throws.
  - Tablero: Manages the game board and actions.
  
- The game uses a 15x15 matrix to represent the game board.

- The program incorporates features like class inheritance, polymorphism, and encapsulation.

- The code has been structured to allow easy modification and expansion for future enhancements.

Enjoy playing the Secret Chamber Console Game!

 
