# Programming in Java - Master Pattern Application

A consolidated, interactive Java application that brings multiple core structural pattern-printing exercises into a single menu-driven program. This project focuses on utilizing nested `while` loops, functional code organization, and standard terminal control interfaces.

---

## 🚀 Application Features

When you run the application, it presents a console menu allowing you to dynamically print any of the following patterns based on user-defined sizes:

1. **Butterfly Pattern:** A symmetric, mirror-image layout using dynamic spacing logic.
2. **Diamond Pattern:** A clean geometric shape composed of symmetric standard and inverted pyramids.
3. **Floyd's Triangle:** A sequential layout printing continuously increasing integer numbers across rows.
4. **Half Pyramid:** The basic baseline structural nested loop logic utilizing stars.
5. **Half Pyramid with Numbers:** A structural pyramid layout where columns increment with the active execution step.
6. **Hollow Triangle:** An inverted, hollow triangle pattern with dynamic leading spaces.
7. **Hollow Rectangle:** A standard boundary-only rectangle defined by row and column dimensions.
8. **Inverted Half Pyramid:** A downward-facing right triangle made of stars.
9. **Inverted Half Pyramid (180° Rotated):** A right-aligned half pyramid utilizing leading empty space blocks.
10. **Inverted Half Pyramid with Numbers:** A downward-facing right triangle where elements are represented by incrementing column counts.
11. **Number Pyramid:** A pyramid where each row consists of the current row number repeated, separated by spaces.
12. **Palindromic Number Pyramid:** A palindromic number pyramid that decreases down to 1 and then increases back up on each row.
13. **Plus Pattern:** A star (`*`) plus sign pattern, centered based on the user's input size.

---

## 🛠️ Java Concepts Demonstrated

* **Functional Decoupling:** Pattern-printing modules are separated into individual files or static execution blocks (`runButterfly`, `runDiamond`, etc.) for clean readability and high maintainability.
* **Control Flow & Conditional Logic:** Extensively uses nested `while` loops alongside boundary evaluation conditions (`if-else`) to handle hollow shapes, stars, and dynamic spacing.
* **Menu-Driven Loop Execution:** Employs an infinite `while(true)` control loop combined with a `switch` selection interface for a continuous user experience.
* **Resource Optimization:** Demonstrates standard terminal keyboard stream handling by managing and cleanly closing `java.util.Scanner` resources.

---

## 📂 Project Directory Structure

To maintain package alignment (`package pattern;`), ensure your source files are organized inside a folder named `pattern`:

```text
└── pattern/
    ├── Hollow_Tri.java
    ├── HollowRec.java
    ├── InvHalfPyramid.java
    ├── InvhalfPyramid180.java
    ├── InvHalfPyramidNum.java
    └── PatternMenu.java
