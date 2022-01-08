# TDD

Some exercises to practice TDD techniques.

## Exercises

### Exercise 1

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

### Exercise 2

Write a function that formats a csv input into a pretty table.

Example Input:
```
Name;Strasse;Ort;Alter
Peter Pan;Am Hang 5;12345 Einsam;42
Maria Schmitz;Kölner Straße 45;50123 Köln;43
Paul Meier;Münchener Weg 1;87654 München;65
```

The first row should be handled as caption. Column width should respect the largest input for the given column.
Example Output:

```
|Name         |Strasse         |Ort          |Alter|
|-------------|----------------|-------------|-----|
|Peter Pan    |Am Hang 5       |12345 Einsam |42   |
|Maria Schmitz|Kölner Straße 45|50123 Köln   |43   |
|Paul Meier   |Münchener Weg 1 |87654 München|65   |
```

### Exercise 3

Write a function that converts decimal numbers to roman numbers.

```
1   -> I
7   -> VII
18  -> XVIII
91  -> XCI
196 -> CXCVI
246 -> CCXLVI
300 -> CCC
```

Valid decimal numbers range from 1 to 300

| Roman Numeral | I   | V   | X   | L   | C   |
|---------------|-----|-----|-----|-----|-----|
| Value         | 1   | 5   | 10  | 50  | 100 |

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