# SelectionSortDemo 🔢

> A simple and beginner-friendly Java implementation of the Selection Sort algorithm.

This project demonstrates how the **Selection Sort** algorithm works in Java, using a utility class to handle common array operations such as swapping elements and generating random arrays.

---

## 📂 Project Structure
```
SelectionSortDemo/
│
├── ArrayUtil.java
├── SelectionSorter.java
└── README.md
```
---

## ✨ Features

- Implements the Selection Sort algorithm  
- Sorts an array of integers in ascending order  
- Uses a utility class for array operations  
- Prints the array before and after sorting  
- Clean, readable, and beginner-friendly code  

---

## 🧠 Algorithm Overview

**Selection Sort** works by repeatedly selecting the smallest element from the unsorted portion of the array and moving it to its correct position.

### Steps:
1. Find the minimum element in the unsorted part of the array  
2. Swap it with the first unsorted element  
3. Move the boundary between sorted and unsorted elements  
4. Repeat until the array is fully sorted  

---

## 🧩 How the Program Works

1. An integer array is created with predefined values  
2. The original array is printed to the console  
3. The `sort()` method is called  
4. For each index:
   - The smallest value is found using `minimumPosition()`  
   - Elements are swapped using `ArrayUtil.swap()`  
5. The sorted array is printed  

---

## ▶ Example Output

```text
[50, 63, 29, 14, 86, 16, 79, 16, 26, 61, 47, 64, 83, 18, 97, 92, 32, 54, 4, 88]
[4, 14, 16, 16, 18, 26, 29, 32, 47, 50, 54, 61, 63, 64, 79, 83, 86, 88, 92, 97]
```
## 🎯 Learning Goals

This project is designed for beginners who want to practice:

- Java arrays  
- Static utility methods  
- `for` loops  
- Method decomposition  
- Basic sorting algorithms  
- Step-by-step algorithm reasoning  

---

## ⏱ Time and Space Complexity

| Complexity | Value |
|-----------|-------|
| Time      | O(n²) |
| Space     | O(1) (in-place) |

---

## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.  
2. Compile the files:
   ```
   javac ArrayUtil.java SelectionSorter.java
   ```
3. Run the program:
   ```
   java SelectionSorter
   ```
   



