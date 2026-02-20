# Student Manager App - Part 1: Setup

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

A Java starter project that provides the foundational class structure for building a student management application.

## Overview

This is Part 1 of a multi-part Java programming exercise designed for students at GMIT (Galway-Mayo Institute of Technology). It sets up the initial project scaffold with core classes for a student management system, including a `Student` model, a `StudentManager` service class, and a `Main` entry point. Students extend this foundation to implement full CRUD functionality with a menu-driven interface.

## Features

- **Project Scaffold** — Pre-configured Java package structure under `ie.gmit.studentmanagerpackage`
- **Student Model** — Stub `Student` class ready for fields, constructors, and methods
- **Manager Service** — Stub `StudentManager` class for implementing data operations
- **Main Entry Point** — `Main` class with the application bootstrap logic
- **DevContainer Support** — VS Code DevContainer with Java 21 (Zulu FX) and desktop-lite for GUI development
- **Eclipse Compatible** — Includes `.project` and `.classpath` files for Eclipse IDE

## Prerequisites

- [Java JDK 21+](https://www.azul.com/downloads/?version=java-21-lts) (Zulu FX recommended for JavaFX support)
- An IDE such as [Eclipse](https://www.eclipse.org/downloads/), [IntelliJ IDEA](https://www.jetbrains.com/idea/), or [VS Code](https://code.visualstudio.com/) with the Java Extension Pack
- [Git](https://git-scm.com/downloads)

## Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/danielcregg/student-manager-app-part1-setup.git
   cd student-manager-app-part1-setup
   ```

2. Open the project in your preferred IDE:
   - **Eclipse:** File > Import > Existing Projects into Workspace
   - **VS Code:** Open the folder and install recommended Java extensions
   - **Codespaces:** Open in GitHub Codespaces for a pre-configured DevContainer environment

### Usage

1. Compile the Java source files:
   ```bash
   javac -d bin src/ie/gmit/studentmanagerpackage/*.java
   ```

2. Run the application:
   ```bash
   java -cp bin ie.gmit.studentmanagerpackage.Main
   ```

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming language |
| Eclipse | Primary IDE support |
| VS Code DevContainers | Cloud-based development environment |

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
