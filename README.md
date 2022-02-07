# SORT MANAGER

It is a console application. It asks the user to create a random array and ask them to choose the type of sorting among 3 sorters. These are bubble, merge, binary search tree sorts. If user wants not to exit the application, it asks them to enter array length and sorting type again from scratch. Model, view, controller design pattern is used. Sorting time is calculated and user can compare the sorters manually. 

## Generating Random Array

It generates an array which its length is decided by user and each value can be between 0 and 99 randomly.

## Bubble Sort

It sorts the array based on swapping that means it compares adjacent elements and swapping them if they are not in correct order.

## Merge Sort

It sorts the array by dividing it into 2 and sorting them and merging afterwards. Recursion was used to be able to that. 

## Binary Search Tree Sort

It sorts the array using nodes that compare two values to root and after that by using recursion again the sorted array is generated. Nested class is used to be able to do that. 

## Logging

Logging is used to make the following steps easier if anything goes wrong.


## Code Coverage

If user uses all the sortings, then code coverage is like below: 

![alt-image](codeCoverage.jpg)

## Singleton Pattern

ArrayGenerateManager is singleton class to be able to get the same array when we generate and selecting the sort type. 

## Unit testing

Unit testing is done to be able to measure how sorting methods work. 

(Note: When pushing the code to github, some merging issues occurred as you can see in commit messages.)