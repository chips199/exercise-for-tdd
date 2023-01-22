# TDD

Some exercises to practice TDD techniques.

## Exercises

### Exercise 1 - Sum

Write a function that sums all numbers in a string. 
* The numbers are comma separated
* The numbers can be floating point
* Empty string counts as `0`

Examples:
```
""
"1"
"1.1,2.2"
```

Variation:
* Handle negative numbers
* Use custom separator

### Exercise 2 - Leap Years

Write a function that calculates if a given year is a leap year.

For a leap year the following criteria apply:
* Years dividable by 4 ARE leap years, BUT
* Years dividable by 100 ARE NOT leap years, BUT
* Years dividable by 400 ARE leap years

### Exercise 3 - Manhattan Distance

Manhattan distance is the distance between two points in a grid (like the grid-like street geography of the New York 
borough of Manhattan) calculated by only taking a vertical and/or horizontal path.

Write a function that is able to calculate the Manhattan Distance between two points.

Examples:
```
(1, 1) - (1, 1) -> 0
(5, 4) - (3, 2) -> 4
(1, 1) - (0, 3) -> 3
```

### Exercise 4 - Count Characters

Write a function that receives a string and counts the characters in it.

```
IDictionary<char, int> CountCharacters(string input)
```

Use `_` as representation for space.

The string `Hello World` should return the following result:
```
H:1, e:1, l:3, o:2, _:1, W:1, r:1, d:1
```

Advanced options:
* Sort the output by highest count first
* Treat upper and lower case letters the same

## Execute

Run tests with Gradle
```shell
# Windows
gradlew.bat test

# MacOS/Unix
./gradlew test
```

Run tests only for one class
```shell
# Windows
gradlew.bat test --tests "Exercise1Test"

# MacOS/Unix
./gradlew test --tests "Exercise1Test"
```

Run the main function of a class
```shell
# Windows
gradlew.bat -PmainClass="Exercise1" run

# MacOS/Unix
./gradlew -PmainClass="Exercise1" run 
```