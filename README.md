## Gambling Simulation Project

This project simulates a gambling scenario where a gambler starts with a certain stake and bets on games each day. The project is implemented in Java.

### Gambling Simulator Use Cases

1. **UC-1**: Gambler starts with a stake of $100 every day and bets $1 per game.
2. **UC-2**: Gambler makes $1 bet, either winning or losing $1.
3. **UC-3**: Calculative gambler resigns for the day if they win or lose 50% of the stake.
4. **UC-4**: After 20 days of playing every day, the total amount won or lost is calculated.
5. **UC-5**: Each month, the number of days won and lost and the amount won or lost are determined.
6. **UC-6**: The luckiest and unluckiest days, where the maximum amount won and lost, are identified.
7. **UC-7**: If won, the gambler decides whether to continue playing next month or stop gambling.

### Project Description

The `GamblingSimulation` program simulates a gambling scenario where a gambler engages in daily betting activities. Here's what's happening in the program:

1. The gambler starts each day with a stake of $100 and bets $1 per game.
2. For each of the 20 days simulated:
   - The program randomly determines whether the gambler wins or loses the bet.
   - If the gambler loses 50% or more of their stake, they resign for the day.
   - The program keeps track of the amount won and lost on each day.
3. After simulating 20 days of gambling:
   - The program calculates the total amount won or lost.
   - It also determines the number of days won and lost.
4. Additionally:
   - The program identifies the luckiest and unluckiest days, where the maximum amount won and lost occurred.
   - It prompts the user to continue playing for the next month if they won.

The simulation is structured to provide insights into the gambling behavior of the player over multiple days and months. It offers a simple yet illustrative example of how a gambling scenario can be modeled programmatically.

### How to Run

To run the gambling simulation:

1. Clone the repository.
2. Compile and run the `GamblingSimulation` class.
3. Follow the prompts to play the game and observe the results.

### Author

This project is developed by Tanuj Patil.

### License

This project is licensed under the [MIT License](LICENSE).
