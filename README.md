# Java Quiz Application

This is a Java-based quiz application built using the `Swing` framework. The application presents a series of multiple-choice questions to users, tracks their answers, and computes a final score at the end of the quiz. The application also includes a countdown timer for each question and a "Help" button that disables incorrect options.

## Features
- **Multiple-choice questions**: Users can select answers from four available options for each question.
- **Timer**: A countdown timer of 15 seconds per question.
- **Help button**: For certain questions, the user can use a "Help" button that disables two incorrect answer options, making it easier to find the right answer.
- **Score calculation**: The final score is calculated based on the number of correct answers.
- **GUI**: A graphical user interface (GUI) built with `Swing`, which includes buttons, radio buttons, and labels.

## Installation and Setup

1. **Clone the repository**:
    ```
    git clone https://github.com/your-repository-link.git
    ```
   
2. **Navigate to the project directory**:
    ```
    cd java-quiz-app
    ```

3. **Run the application**:
    - Open the project in your preferred Java IDE (such as IntelliJ IDEA or Eclipse).
    - Compile and run the `Quiz.java` file.

## Usage

1. Upon launching, the quiz will display a series of questions, each with four answer options.
2. The user selects an answer by clicking on one of the radio buttons.
3. Once an answer is selected, the user can click the "Next" button to proceed to the next question.
4. The "Help" button will disable two incorrect answers for certain questions, making the selection easier.
5. If the timer runs out before an answer is selected, the application will automatically move to the next question.
6. After all questions are answered or the timer runs out, the user's score is calculated and displayed.

## Code Structure

- `Quiz.java`: The main class that handles the UI, event handling, and quiz logic.
    - `start(int count)`: Initializes the current question and updates the GUI with options.
    - `actionPerformed(ActionEvent e)`: Handles actions for buttons like "Next", "Submit", and "Help".
    - `paint(Graphics g)`: Overrides the `paint` method to display the timer and dynamically update it every second.
    - `evaluateAnswer()`: Compares the user's answer to the correct answer and updates the score.

## Timer Functionality
The application includes a countdown timer. If the user doesn't select an answer before the timer reaches 0, the question will be marked unanswered and the application will automatically move to the next question.

## Help Button
The "Help" button is available for certain questions and helps the user by disabling two incorrect answer options, reducing the answer choices to two.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- Java IDE such as IntelliJ IDEA, Eclipse, or NetBeans for easier compilation and running.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Acknowledgments

This quiz application was inspired by and partially based on a tutorial by **TechCoder A.V** on YouTube. You can find the original video tutorial [here](https://www.youtube.com/c/TechCoderA.V).
