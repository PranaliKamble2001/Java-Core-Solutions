# Java Core Solutions

This repository is a dedicated technical portfolio for mastering **Core Java** logic, algorithmic efficiency, and clean coding practices.

## Project Overview
The entry point of this project is `src/Main.java`, which initializes the environment, tracks progress, and displays the logic challenge roadmap.

------------------------------------------------------------------------------------------------

## 📂 Solutions Library

### 🔹 String Logic (`src/StringPrograms/`)
Focusing on character manipulation and advanced algorithmic patterns:
* **ReverseString:** Manual string reversal using character indexing and `StringBuilder`.
* **Palindrome:** Optimized symmetry verification using two-pointer logic.
* **CharFrequency:** Frequency calculation using ASCII mapping and `HashMap` for $O(n)$ efficiency.
* **AnagramDetector:** Logic-based sorting and comparison using `Arrays.sort()`.
* **StringCompressor:** Implementation of **Run-Length Encoding (RLE)** (e.g., `aaabb` -> `a3b2`).
* **LongestUniqueSubstring:** Advanced **Sliding Window** logic to find the longest sequence of unique characters.

### 🔹 Array Programs (`src/ArrayPrograms/`)
Efficient data handling and pointer-based manipulation:
* **FindDuplicate:** Identified repeating elements using `HashSet` logic ($O(n)$ complexity).
* **SecondLargest:** Single-pass logic ($O(n)$) to find runner-up values without sorting.
* **Largest & Smallest:** Boundary value identification with proper null-safety.
* **ReverseArray:** In-place reversal using the **Two-Pointer** technique.
* **RotateArray:** Optimal three-step reversal algorithm ($O(n)$ time, $O(1)$ space).
* **MergeSortedArrays:** High-efficiency convergence of two sorted arrays using dual pointers.

### 🔹 Matrix Programs (`src/MatrixPrograms/`)
Nested loop mastery and 2D data manipulation:
* **MatrixTranspose:** Logic to flip a matrix over its diagonal (rows to columns).
* **MatrixAddition:** Element-wise summation of two 2D grids.
* **MatrixSearch:** Linear search implementation for target localization in 2D coordinate systems.
* **MatrixMultiplication:** Optimized triple-nested loop implementation ($O(n^3)$).
* **MatrixDiagonalSum:** Efficient single-pass extraction of the primary diagonal sum.
* **RowColumnSum:** Logic to calculate cumulative totals for each row and column.
* **IdentityMatrix:** Procedural generation of a square matrix with 1s on the diagonal.
* **ScalarMultiplication:** Scaling a 2D array by a constant factor through in-place modification.
* **UpperTriangle:** Filters elements where the column index is $\ge$ row index.
* **LowerTriangle:** Filters elements where the row index is $\ge$ column index.

### 🔹 Sorting Programs (`src/SortingPrograms/`)
*Implementation of fundamental sorting algorithms and efficiency analysis:*
* **BubbleSort:** Classic $O(n^2)$ comparison-based sort using adjacent element swapping and flag-based optimization.
* **SelectionSort:** Logic based on finding the minimum element and placing it at the sorted boundary.
* **InsertionSort:** Efficiently inserts elements into their correct position in a sorted sub-array.

### 🔹 Searching Programs (`src/SearchingPrograms/`)
*Implementation of retrieval algorithms based on data organization:*
* **LinearSearch:** Checks every element sequentially; works on unsorted data.
* **BinarySearch:** Efficiently finds elements in **sorted** arrays by repeatedly halving the search interval.


 ### 🔹 Recursion Programs (`src/RecursionPrograms/`)
*Implementation of functions that call themselves to solve complex problems:*
* **FactorialRecursion:** Classic mathematical recursion calculating $n!$ using base cases and the call stack.
* **FibonacciRecursion:** Generates the Fibonacci sequence by summing two preceding recursive calls ($f(n) = f(n-1) + f(n-2)$).
* **StringReverseRecursion:** Reverses a string by recursively calling the substring and appending the first character to the end.
* **ArraySumRecursion:** Calculates the total sum of an array by traversing it with a recursive index pointer ($O(n)$ complexity).

### 🔹 Number Programs (`src/NumberPrograms/`)
* **ArmstrongNumber:** Checks if a number equals the sum of its digits raised to the power of the digit count.
* **PerfectNumber:** Verifies if the sum of all proper divisors of a number equals the number itself.
* **PrimeCheck:** An efficient algorithm to determine if a number is prime using square root optimization.
* **StrongNumber:** A mathematical check to verify if the sum of the factorials of a number's digits equals the number itself.
------------------------------------------------------------------------------------------------

## Technical Competencies
* **Collections Framework:** Expert use of `HashMap`, `LinkedHashMap`, `HashSet`, and `ArrayList`.
* **Big O Awareness:** Algorithms optimized for **Linear Time Complexity** $O(n)$ and **Space Efficiency**.
* **Memory Management:** Strategic use of `StringBuilder` to handle String immutability.
* **Pattern Mastery:** Implementation of Two-Pointers, Sliding Windows, and Frequency Mapping.

## How to Run
1. **Clone** the repository.
2. **Open** in Eclipse Enterprise Edition.
3. **Navigate** to the `src` directory.
4. **Run** `Main.java` to view the project status dashboard.
