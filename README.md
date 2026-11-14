# OceanFleet – Vessel Performance Management System

A simple Java-based console application that helps users **store, manage, search, and compare vessels (ships)** based on their average speed.

This project was developed as part of the **BridgeLabz Java learning journey**, focusing on Java fundamentals, Object-Oriented Programming (OOPS), collections, and clean code organization.

## Project Overview

Imagine a shipping company managing multiple vessels. Each vessel has its own identification number, name, type, and average speed.

Managing these details manually can become difficult as the number of vessels increases.

**OceanFleet** provides a simple solution where users can:

- Add multiple vessels and store their information.
- Search for a particular vessel using its unique ID.
- Identify the fastest vessels based on average speed.
- Interact with the application through an easy-to-use menu.

The application runs in the terminal and does not require a website or database.

## Project Objectives

The main objectives of OceanFleet are:

1. Understand how real-world information can be represented using Java classes and objects.
2. Store multiple vessel records using Java collections.
3. Search and retrieve vessel details efficiently.
4. Compare vessel performance using average speed.
5. Build an interactive console-based application.
6. Organize code using Object-Oriented Programming principles.

## Key Features

### 1. Add Vessel Details

Users can enter the number of vessels they want to add and provide information for each vessel.

Each vessel contains four details:

| Field | Description | Example |
|---|---|---|
| Vessel ID | Unique identification number | V001 |
| Vessel Name | Name of the vessel | OceanStar |
| Average Speed | Average travelling speed | 60.0 |
| Vessel Type | Category of vessel | Cargo |

### 2. Search Vessel by ID

Users can search for a specific vessel by entering its ID.

If the vessel exists, the application displays its details.

If it does not exist, a message informs the user.

### 3. Find Highest-Speed Vessels

The application compares the average speeds of all stored vessels and identifies the fastest ones.

If multiple vessels have the same highest average speed, all of them are displayed.

### 4. Interactive Console Menu

The application provides a simple menu:

```text
----- VESSEL MANAGEMENT -----
1. Add Vessels
2. Search Vessel by ID
3. Display Highest Speed Vessels
4. Exit
```

Users can perform multiple operations until they choose to exit.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Main programming language |
| Java Collections | Store vessel information |
| ArrayList | Maintain a dynamic list of vessels |
| Optional | Handle vessel search results safely |
| Scanner | Accept user input |
| Git | Track changes to the project |
| GitHub | Store and manage the project repository |
| IntelliJ IDEA | Development environment |

## 📂 Project Structure

```text
bridgelabz_OceanFleet/
│
└── src/
    └── in/
        └── mihirlakhani/
            │
            ├── Main.java
            │
            ├── model/
            │   └── Vessel.java
            │
            ├── util/
            │   └── VesselUtil.java
            │
            └── ui/
                └── UserInterface.java
```

**Main.java:** Starts the application.

**Vessel.java:** Defines what information each vessel stores.

**VesselUtil.java:** Contains the logic for adding, searching, and comparing vessels.

**UserInterface.java:** Handles user input, menu options, and console interaction.

This structure separates responsibilities, making the application easier to understand, maintain, and extend.

## 📚 Use Cases Implemented

The project is developed through six use cases, with each stage introducing new functionality or improving the existing code.

| Use Case | Functionality | Purpose |
|---|---|---|
| UC1 | Vessel Data Model | Represent vessel information using a Java class |
| UC2 | Vessel Collection | Store multiple vessel objects |
| UC3 | Search Vessel by ID | Find a vessel using its unique ID |
| UC4 | Highest Average Speed | Identify the fastest vessels |
| UC5 | Console User Interaction | Allow users to interact through a menu |
| UC6 | OOPS Refactoring | Improve code structure and maintainability |

### UC1 – Vessel Data Model

Created the `Vessel` class to represent a ship and its information.

Introduced Java classes, objects, constructors, getters, and setters.

### UC2 – Vessel Collection

Implemented a collection to store multiple vessel records using `ArrayList`.

This allows the application to manage multiple vessels instead of just one.

### UC3 – Search Vessel by ID

Implemented a method to search for a vessel using its ID.

Used Java `Optional` to safely handle cases where a vessel is not found.

### UC4 – Highest Average Speed

Implemented logic to compare vessel speeds and find the maximum average speed.

The application also supports multiple vessels sharing the same maximum speed.

### UC5 – Console User Interaction

Added an interactive menu using `Scanner` and `switch-case`.

Users can add vessels, search for vessels, and display the highest-speed vessels.

### UC6 – OOPS Refactoring

Improved the project structure by separating the application into different classes.

Applied:

- **Encapsulation:** Vessel data is stored in private fields.
- **Abstraction:** Users perform operations through methods without needing to understand internal logic.
- **Single Responsibility Principle:** Each class has a clearly defined responsibility.
- **Modularity:** The project is divided into separate model, utility, and UI components.
- **Reusability:** Existing methods can be reused for future features.

## 🌿 Git Branches and Version Control

Git branches help organize development by allowing new features to be developed separately without immediately changing the main version of the project.

### Main Branch

`main` contains the primary version of the OceanFleet application.

It serves as the central branch where completed and tested features can be maintained.

### Development Branches

During development, separate branches may be used for individual use cases or improvements.

| Branch | Purpose |
|---|---|
| `main` | Main project version |
| `uc1-vessel-model` | Vessel class and data model |
| `uc2-vessel-collection` | Vessel collection implementation |
| `uc3-search-vessel` | Search functionality |
| `uc4-highest-speed` | Vessel speed comparison |
| `uc5-console-ui` | Console menu and user interaction |
| `uc6-oops-refactoring` | OOPS-based code restructuring |

**Note:** These are suggested branch names. The actual branch names and available branches should be verified from the GitHub repository before publishing this section.

### Why Are Branches Important?

Branches help developers:

- Work on features independently.
- Keep the main code organized.
- Track changes made during development.
- Test new functionality before integrating it.
- Understand how the project evolved.

### Common Git Commands

Check the current branch:

```bash
git branch
```

View all local and remote branches:

```bash
git branch -a
```

Create and switch to a new branch:

```bash
git switch -c branch-name
```

Add and save changes:

```bash
git add .
git commit -m "Describe your changes"
```

Push the current branch to GitHub:

```bash
git push -u origin branch-name
```

## ▶️ How to Run the Project

### Prerequisites

- Java Development Kit (JDK)
- IntelliJ IDEA or another Java IDE
- Git (optional, for cloning the repository)

### Steps

1. Open the OceanFleet repository on GitHub.
2. Clone or download the project.
3. Open the project in IntelliJ IDEA.
4. Make sure the JDK is configured.
5. Open `Main.java`.
6. Click **Run**.
7. Follow the instructions displayed in the console.

## Example Input and Output

### Step 1: Add Vessels

Select option `1` from the menu.

```text
Enter number of vessels:
5

Enter vessel details:
V001:Titanic:35.5:Passenger
V002:OceanStar:60.0:Cargo
V003:SeaQueen:42.5:Passenger
V004:BlueWave:60.0:Tanker
V005:MarineKing:38.0:Fishing

Vessels added successfully!
```

### Step 2: Search Vessel

Select option `2`.

```text
Enter Vessel ID:
V002

V002|OceanStar|Cargo|60.0
```

If the vessel is not found:

```text
Enter Vessel ID:
V999

Vessel Id V999 not found.
```

### Step 3: Display Fastest Vessels

Select option `3`.

```text
Highest Speed Vessels:

V002|OceanStar|Cargo|60.0
V004|BlueWave|Tanker|60.0
```

Both vessels are displayed because they share the highest average speed.

## Java Concepts Learned

Through this project, the following concepts were practiced:

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- ArrayList and List
- Optional
- Loops and Conditional Statements
- Searching and Filtering
- Object Property Comparison
- Scanner and Console Input
- Switch-Case
- Method Reusability
- Separation of Concerns
- Object-Oriented Design
- Git and GitHub Version Control

## Future Improvements

Possible future enhancements include:

- Update existing vessel details.
- Delete vessel records.
- Display all registered vessels.
- Sort vessels by speed.
- Validate duplicate vessel IDs.
- Handle invalid user input.
- Store vessel information permanently using a database.
- Develop a graphical user interface.

## Learning Outcome

OceanFleet demonstrates how basic Java programming concepts can be combined to build a small but functional management application.

The project also highlights the importance of organizing code into separate layers rather than keeping all functionality inside a single class.

By progressing through multiple use cases, the application becomes more structured, reusable, and maintainable.

---

**Project:** OceanFleet – Vessel Performance Management System

**Repository:** `bridgelabz_OceanFleet`

**Learning Focus:** Core Java | OOPS | Collections | Console Applications | Git & GitHub

**Developed as part of the BridgeLabz Java learning journey.**