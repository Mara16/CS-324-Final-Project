###### CS-324-2: Introduction to the Design of Algorithms <br> Spring 2021 <br> Northeastern Illinois University <br> Final Project <br> Due Date: 04/30/21 at 9:00 p.m. (CT) 

###Burrows-Wheeler Transform 

> The Burrows-Wheeler Transform (BWT) algorithm is commonly used in data compression. 
> It doesn't compress data on its own, but it is the first step in transforming a given text into a string 
> where repeated characters in that string are grouped together. 
> The transformed string is more amenable to compression with the application of other compression algorithms like Huffman or arithmetic coding . 

**1.** `Demo.java` contains a main method to exhibit how your code can be run.


**2.** The `BWT.Java` uses three instance variables and constructor to set the original text. It is also composed of the three following methods:

- **permutations()** creates the permutations of the text calls encode() by sending it a 1D String array 'rotations' holding the permutations. 

- **encode(String[] rotations)** receives the 'rotations' array and concatenates the last column, as well as the index of the row at which the original text sits in the 1D array. The methods then calls decode. 
     
- **decode()** reverses the encoded text back to its original form. 

**3.** `Test.java` ensures that the algorithm is encoding and decoding correctly. It uses a combination of one-word text and sentences. 




