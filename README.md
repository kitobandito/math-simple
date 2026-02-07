# Code Snippets Repository

## Overview
This repository contains a collection of reusable code snippets for various calculations, focusing primarily on a basic calculator and geometry-related calculations. The snippets included are designed to be easily copied and pasted for quick use in your own projects.

## Contents

### Basic Calculator Operations
This section includes code snippets for the following basic calculator functions:
- Addition
- Subtraction
- Multiplication
- Division

#### Addition
```python
# Function to add two numbers

def add(x, y):
    return x + y
```

#### Subtraction
```python
# Function to subtract two numbers

def subtract(x, y):
    return x - y
```

#### Multiplication
```python
# Function to multiply two numbers

def multiply(x, y):
    return x * y
```

#### Division
```python
# Function to divide two numbers

def divide(x, y):
    if y == 0:
        return "Error: Division by zero!"
    return x / y
```

### Geometry Calculations
In this section, you will find code snippets that help calculate the perimeter of various geometric shapes:
- Perimeter of a rectangle
- Perimeter of a triangle
- Perimeter of a circle

#### Perimeter of a Rectangle
```python
# Function to calculate the perimeter of a rectangle

def rectangle_perimeter(length, width):
    return 2 * (length + width)
```

#### Perimeter of a Triangle
```python
# Function to calculate the perimeter of a triangle

def triangle_perimeter(a, b, c):
    return a + b + c
```

#### Perimeter of a Circle
```python
# Function to calculate the perimeter (circumference) of a circle
import math

def circle_perimeter(radius):
    return 2 * math.pi * radius
```

## Usage
Simply copy any of the code snippets above and paste them into your codebase or development environment. Make sure to import any necessary libraries, such as `math` for geometric calculations.

## Contributions
Feel free to contribute more code snippets by submitting a pull request! This will help enhance the collection and keep it up to date with various programming needs.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.