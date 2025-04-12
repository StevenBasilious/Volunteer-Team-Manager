# Volunteer Team Manager

## Project Overview
This Java application manages a volunteer team tasked with assembling kits (referred to as "boxes"). Each volunteer is assigned a number of boxes, and their payment is calculated based on a tiered pricing model: £0.15 per box for the first 50 boxes and £0.20 per box thereafter. A team leader role extends the volunteer class with a 20% pay increase. The system supports adding volunteers, updating box counts, sorting the team by box count, calculating total boxes and payments, and displaying team details in a formatted table.

## Objectives
- Model a volunteer team with object-oriented programming principles.
- Track and update the number of boxes assembled by each volunteer.
- Calculate payments with a tiered pricing structure.
- Support a team leader role with a pay premium.
- Sort and display the team based on box contributions.
- Format payments in UK currency (£).

## Features
- **Volunteer Class**: Represents a volunteer with a name and box count. Supports adding/removing boxes and calculating payments.
- **Team Leader Class**: Inherits from `Volunteer`, applies a 20% pay increase, and formats output to indicate leadership status.
- **Volunteer Team Class**: Manages a list of volunteers, sorts them by box count, and computes total boxes and payments.
- **Utils Class**: Provides currency formatting for UK locale (£).
- **Main Class**: Demonstrates functionality by creating a sample team, updating box counts, and displaying results.

## Project Structure
The project consists of the following Java files:
- `Main.java`: Entry point; creates volunteers, updates boxes, and displays team details.
- `volunteer.java`: Defines the `Volunteer` class with box tracking and payment calculation.
- `teamLeader.java`: Extends `Volunteer` for the team leader with a pay premium.
- `volunteerTeam.java`: Manages the team, including sorting and aggregating boxes/payments.
- `Utils.java`: Formats payments in UK currency.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools for compilation and execution.

## Installation and Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Volunteer-Team-Manager.git
