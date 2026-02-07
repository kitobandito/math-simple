

## Overview
Basic starter codes, learning to code

## Contents

### Basic Calculator Operations
code for the basic calculator functions:
- Addition
- Subtraction
- Multiplication
- Division

#### Addition
```python
#  add two numbers

def add(x, y):
    return x + y
```

#### Subtraction
```python
#  subtract two numbers

def subtract(x, y):
    return x - y
```

#### Multiplication
```python
# multiply two numbers

def multiply(x, y):
    return x * y
```

#### Division
```python
#  divide two numbers

def divide(x, y):
    if y == 0:
        return "error: division by zero"
    return x / y
```

### Geometry Calculations
 calculate the perimeter of various geometric shapes:
- Perimeter of a rectangle
- Perimeter of a triangle
- Perimeter of a circle

#### Perimeter of a Rectangle
```python
# calculate the perimeter of a rectangle

def rectangle_perimeter(length, width):
    return 2 * (length + width)
```

#### Perimeter of a Triangle
```python
# calculate the perimeter of a triangle

def triangle_perimeter(a, b, c):
    return a + b + c
```

#### Perimeter of a Circle
```python
# calculate the perimeter (circumference) of a circle
import math

def circle_perimeter(radius):
    return 2 * math.pi * radius
```
#### Mode+ Median

finding mode and median from given numbers






