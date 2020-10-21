
# Ada's Sol

"The Analytical Engine weaves algebraic patterns, just as the Jacquard loom weaves flowers and leaves." ― adapted from Ada Lovelace’s notes from 1842.

The Analytical Engine is considered to be one of the very first computer designs. Although it was never fully built, its design was inspired by the Jacquard Loom, and data was inputted into the machine via punchcards - a technique that is still used today in modern knitting and weaving machines. 

To demonstrate how the Analytical Engine worked, Ada Lovelace wrote examples of programs that the machine could run. This knitted piece represents a well-known example, Note G. Based on this work, Lovelace is widely considered to be the first computer programmer, and her method is recognized as the world's first computer program.

![knit](knit1.jpg)

Note G computes the first n odd Bernouilli numbers. The note shows a table where columns are variables, and each line indicates how each step of the program changes the values held by each of the variables.

The left most columns contains the input parameter, the middle section contains intermediate values that the program needs to compute in order to obtain the desired values in the rightmost columns.
These last columns contain the Bernouilli's number that the program is designed to compute.

These values are represented in the knitted pattern. Each value is a fraction of natural number.

| Number | Representation |
|--------|----------------|
| 0 / 1 | ![0 over 1](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_0.png) |
| 1 / 1 | ![1 over 1](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_1.png) |
| 2 / 1 | ![2 over 1](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_2.png) |
| 1 / 2 | ![1 over 2](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_1_2.png) |

You can observe the first line and see the numbers one the first three columns: 1 2 1 and the first value computed by the program 2 2 and 2.

After many steps the program computes the first Bernouilli number (1/6) in column 21. This value will then never change. Then the third Bernouilli number (-1 / 30) appears in column 22 and so on.
On the last line, at the last column the value of the fifth Bernouilli number (5 / 66) appears.

| Number | Representation |
|--------|----------------|
| 1 / 6 | ![0 over 1](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_1_6.png) |
| -1 / 30 | ![1 over 1](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_-1_30.png) |
| 5 / 66 | ![2 over 1](https://github.com/nharrand/Note_G/raw/main/java/ex/Example_5_66.png) |



# Implementation of A. A. L.'s Note G in Ada

To compile run:
```sh
	gnatmake note_g.adb
```

To run:
```sh
	./note_g
```

## References

 [See this image](https://upload.wikimedia.org/wikipedia/commons/c/cf/Diagram_for_the_computation_of_Bernoulli_numbers.jpg)
 [See this pdf](https://rclab.de/_media/analyticalengine/aal_noteg_glaschick_v1.2.pdf)
