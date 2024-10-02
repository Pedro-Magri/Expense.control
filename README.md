Expense Control System

Overview
The Expense Control System is a simple command-line application written in Java to help users track their expenses. It allows users to categorize expenses, add new expenses, and generate a report summarizing their spending habits. This project is ideal for those looking to manage their personal finances or for developers who want to explore basic object-oriented programming concepts in Java.

Features
Add Categories: Users can create custom categories to classify their expenses.
Add Expenses: Expenses can be logged with a description, value, and associated category.
Expense Report: Generates a detailed report listing all recorded expenses and the total amount spent.
How to Run
To run the Expense Control System, follow these steps:

Prerequisites
Java Development Kit (JDK): Ensure you have JDK 8 or higher installed on your system.
IDE or Terminal: You can use an IDE like IntelliJ IDEA, Eclipse, or simply compile and run the code from the terminal.
Running the Project
Clone the repository to your local machine:
bash
Copiar código
git clone https://github.com/your-username/expense-control.git
Navigate to the project directory:
bash
Copiar código
cd expense-control
Compile the Java classes:
bash
Copiar código
javac expensecontrol/expensecontrol.java
Run the program:
bash
Copiar código
java expensecontrol.expensecontrol
Once the application starts, you will see a menu with the following options:

Add a category.
Add an expense.
View the expense report.
Exit the application.
Usage Example
Here’s a basic interaction with the system:

Add Category:

yaml
Copiar código
Nome da Categoria: Alimentação
Category "Alimentação" successfully added!
Add Expense:

yaml
Copiar código
Descrição da Despesa: Jantar com amigos
Valor da Despesa: 150.00
Escolha a categoria da despesa:
1. Alimentação
Expense added successfully!
Expense Report:

yaml
Copiar código
=== Relatório de Despesas ===
Descrição: Jantar com amigos | Valor: R$150.0 | Categoria: Alimentação
Total de gastos: R$150.0
Project Structure
bash
Copiar código
expensecontrol/
│
├── Categoria.java        # Class that represents an expense category.
├── Despesa.java          # Class that represents an expense with its details.
└── expensecontrol.java   # Main class that runs the program and handles user interaction.

Future Improvements
Expense Editing: Allow users to edit or delete existing expenses.
More Detailed Reports: Add options to filter expenses by category or by date.
Data Persistence: Save and load expense data from a file or database.
Multi-language Support: Add support for more languages besides Portuguese.

Contributing
Contributions are welcome! Feel free to submit issues or pull requests to improve the system or add new features.
