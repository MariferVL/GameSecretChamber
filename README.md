# Secret Chamber Console Game

 <b>Authors</b>
  [Bárbara Carvajal](https://github.com/BarbaraCarvajal)
<br />
[Luis Zenteno](https://github.com/LuisZentenxx)
<br />
[María-Fernanda Villalobos](https://github.com/MariferVL)
<br/>

<img width="300px" src="https://github.com/MariferVL/GameSecretChamber/assets/99364311/51c1e97c-87e8-453e-b47b-04571b4f12ba">


<br/>
    <a href="https://github.com/MariferVL/GameSecretChamber" target="_blank"><strong>Docs Access »</strong></a>
<br/>
     <a href="https://replit.com/@marifervl/CamaraSecreta-Juego" target="_blank"><strong>Deployment Access »</strong></a>
<br/>

## Introduction
<p>Welcome to the Secret Chamber Console Game, a Java-based game that lets you simulate a battle between protesters armed with eggs and security vehicles protecting a secret chamber. In this game, you will play as the protesters and try to earn points by hitting the security vehicles with eggs.</p>

## How to Play
<p>Follow these simple steps to play the Secret Chamber Console Game:</p>

### Prerequisites
<p>Before you start, make sure you have Java installed on your computer.</p>

### Running the Game
<ol>
<li>Access the game through the provided Replit link.</li>
<li>Click the "Run" button to start the game.</li>
</ol>

### Game Mechanics
<p>You will be presented with a 15x15 grid representing the game board.</p>
<p>Security vehicles on the board are represented as follows:</p>
<ul>
<li><strong>Kromis</strong> (K): These are vertical vehicles that occupy three cells.</li>
<li><strong>Caguanos</strong> (C): These are horizontal vehicles that occupy two cells.</li>
<li><strong>Trupallas</strong> (T): These are single-cell vehicles.</li>
</ul>
<p>Your goal is to throw eggs at the security vehicles by specifying the row and column where you want to throw.</p>
<p>Enter the row and column numbers when prompted.</p>
<p>Points are awarded based on the type of vehicle hit:</p>
<ul>
<li>Kromi: 3 points</li>
<li>Caguano: 2 points</li>
<li>Trupalla: 1 point</li>
</ul>
<p>If you hit a Kromi three times and disable it completely, you earn an additional 10 points. For a Caguano, you earn an extra 7 points if you disable it.</p>
<p>You can throw an unlimited number of eggs, and an egg can hit the same position multiple times.</p>
<p>If a cell has been hit by an egg, it will be marked as "H" on the game board. No additional points will be awarded for hitting a previously attacked position.</p>
<p>The game continues until you decide to exit.</p>

### Ending the Game
<p>To end the game and check your total score, simply press any key when prompted to continue or exit.</p>

## Technical Details
<p>For those interested in the technical details of the game, here's an overview:</p>
<ul>
<li>The game is implemented in Java and follows object-oriented programming principles.</li>
<li>It consists of several classes, including:
  <ul>
  <li>Car: Represents different security vehicles.</li>
  <li>Kromi, Caguano, Trupalla: Subclasses representing specific vehicle types.</li>
  <li>Huevo: Represents egg throws.</li>
  <li>Tablero: Manages the game board and actions.</li>
  </ul>
</li>
<li>The game uses a 15x15 matrix to represent the game board.</li>
<li>The program incorporates features like class inheritance, polymorphism, and encapsulation.</li>
<li>The code has been structured to allow easy modification and expansion for future enhancements.</li>
</ul>

<p>Enjoy playing the Secret Chamber Console Game!</p>
