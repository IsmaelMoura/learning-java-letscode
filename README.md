# Java Exercises - Let's Code

This repository contains 5 Java exercises made by Let's Code (Ada Tech).

## JDK Version
- Zulu 17.0.5 LTS

## IDE
- IntelliJ IDEA Community Edition 2022.1.4

## Exercises

You can find the original document (in portuguese) here: [java-exercises-list-and-final-challenge](./java-exercises-list-and-final-challenge.pdf)

## [Question 1](./src/com/ismaelmoura/letscode/ExerciseOne.java)
Write a program that informs the multiplication table (1 to 10) of a number informed by user.

### Input

```terminal
37
```

### Output

```terminal
37 X 1 = 37 
37 X 2 = 74 
37 X 3 = 111 
37 X 4 = 148 
37 X 5 = 185 
37 X 6 = 222 
37 X 7 = 259 
37 X 8 = 296 
37 X 9 = 333 
37 X 10 = 370
```

## [Question 2](./src/com/ismaelmoura/letscode/ExerciseTwo.java)
Write a program that converts the temperature from Celsius to Fahrenheit.

### Input

```terminal
33
```

### Output

```terminal
The equivalent of 33.00°C is 91.40°F
```

## [Question 3](./src/com/ismaelmoura/letscode/ExerciseThree.java)
Write a program that reads the name of 5 fruits and stock in the shopping cart.
In the end of 5 entries, show the complete list.

### Input

```terminal
banana
lemon
lemon
banana
apple
```

### Output

```terminal
Your shopping cart have: 
[BANANA, LEMON, APPLE]
```

## [Question 4](./src/com/ismaelmoura/letscode/ExerciseFour.java)
A supermarket daily announce a list of 5 fruits on sale.
Write a program that receive the name of fruit do you want to buy and inform if this fruit is on sale.

For example: <br>
Fruits on sale today: **[ORANGE, BANANA, GRAPE, LEMON]**

### Input

```terminal
grape
```

### Output

```terminal
Good choice! This fruit is on sale today.
```

## [Question 5](./src/com/ismaelmoura/letscode/ExerciseFive.java)
Write a program that compares a shopping list and calculates the 5% discount accrued for each fruit found on the list.

For example: <br>
Fruits on sale today: **[BANANA, PINEAPPLE, WATERMELON, LEMON, GRAPE]**

### Input

```terminal
banana
limão
limão
uva
Pêra
kiwi
melancia
banana
```

### Output

```terminal
You bought this fruits on sale: [BANANA]
Therefore, you will receive a 5% discount.
```

## [Final challenge](./src/com/ismaelmoura/letscode/FinalChallenge.java)
Write a program that calculates the buyer's tip based on the correspondence between what was requested
and what was actually purchased. Following those parameters:

- Purchases correspond to **50% or more** of the list, tip of **R$ 3.00**;
- Purchases correspond to **75% or more** of the list, tip of **R$ 5.00**;
- Purchases correspond to **90% or more** of the list, tip of **R$ 10.00**.

### Input

```terminal
banana
limão
uva
Pêra
grape
orange
lemon
banana
```

### Output

```terminal
Client list: [BANANA, LIMÃO, UVA, PÊRA, GRAPE, ORANGE, LEMON]
Purchased fruits: [ORANGE, BANANA, GRAPE, LEMON]
57% of correspondence, tip of R$ 3,00.
```
