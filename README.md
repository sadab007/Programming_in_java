# Programming in Java - Master Pattern Application

A consolidated, interactive Java application that brings multiple core structural pattern-printing exercises into a single menu-driven program. This project focuses on utilizing nested `while` loops, functional code organization, and standard terminal control interfaces.

---

 Application Features

When you run the application, it presents a console menu allowing you to dynamically print any of the following patterns:

1. **Butterfly Pattern:** A symmetric, mirror-image layout using dynamic spacing logic.
2. **Diamond Pattern:** A clean geometric shape composed of symmetric standard and inverted pyramids.
3. **Floyd's Triangle:** A sequential layout printing continuously increasing integer numbers across rows.
4. **Half Pyramid:** The basic baseline structural nested loop logic utilizing stars.
5. **Half Pyramid with Numbers:** A structural pyramid layout where columns increment with the active execution step.

---

Java Concepts Demonstrated

* **Functional Decoupling:** Every pattern pattern-printing module is separated into its own static execution block (`runButterfly`, `runDiamond`, etc.) for readability.
* **Menu-Driven Loop Execution:** Employs an infinite `while(true)` control loop combined with a `switch` selection interface for a continuous user experience.
* **Memory Management:** Closes the resource scanner cleanly once user signals application exit.

---

 How to Compile and Run

Ensure you have the Java Development Kit (JDK) configured locally.

1. **Setup Directory:** Ensure your file is saved inside a folder named `pattern` to align with the package definition:
   ```text
   └── pattern/
       └── PatternMenu.java
