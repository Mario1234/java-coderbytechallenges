# java-coderbytechallenges
Code solutions in Java for programming challenges of "coderbyte" webpage.
Sorted by my own scale of diffulty. The resolution time matters.

# CheckNums
Using the Java language, have the function CheckNums(num1,num2) take both parameters being passed and return the string true if num2 is greater than num1, otherwise return the string false. If the parameter values are equal to each other then return the string -1. 

Input1: 3
Input2: 122
Output: "true"

+++

Input1: 67
Input2: 67
Output: "-1"

# TimeConvert
Using the Java language, have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon. 

Input:126
Output:"2:6"

+++

Input:45
Output:"0:45"

# SimpleAdding
Using the Java language, have the function SimpleAdding(num) add up all the numbers from 1 to num. For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter num will be any number from 1 to 1000. 

Input:12
Output:78

+++

Input:140
Output:9870

# FirstFactorial
Using the Java language, have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it (e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 and the input will always be an integer. 

Input:4
Output:24

+++

Input:8
Output:40320

# FirstReverse
Using the Java language, have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH. 

Input:"coderbyte"
Output:"etybredoc"

+++

Input:"I Love Code"
Output:"edoC evoL I"

# AlphabetSoup
Using the Java language, have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string.

Input:"coderbyte"
Output:"bcdeeorty"

+++

Input:"hooplah"
Output:"ahhloop"

# SimpleSymbols
Using the Java language, have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false. The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would be false. The string will not be empty and will have at least one letter. 

Input:"+f+e+d+"
Output:"true"

+++

Input:"+d+=3=+s+"
Output:"false"

+++

Input:"+d+==+s+"
Output:"true"

+++

Input:"f++d+"
Output:"false"

# LetterChanges
Using the Java language, have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 

Input:"hello+3"
Output:"Ifmmp+3"

+++

Input:"fun times!"
Output:"gvO Ujnft!"

+++

Input:"Welcome to the zoo"
Output:"Xfmdpnf Up UIf App"

# LetterCapitalize
Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.

Input:"hello world"
Output:"Hello World"

+++

Input:"i ran there"
Output:"I Ran There"

# LongestWord
Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty.

Input:"fun&!! time"
Output:"time"

+++

Input:"I love dogs"
Output:"love"

# QuestionsMarks
Using the Java language, have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well. 

For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string. 

Input:"aa6?9"
Output:"false"

+++

Input:"acc?7??sss?3rr1??????5"
Output:"true"

+++

Input:"acc?8??sss?3rr1??????5"
Output:"false"

# VowelSquare
Using the Java language, have the function VowelSquare(strArr) take the strArr parameter being passed which will be a 2D matrix of some arbitrary size filled with letters from the alphabet, and determine if a 2x2 square composed entirely of vowels exists in the matrix. For example: strArr is ["abcd", "eikr", "oufj"] then this matrix looks like the following: 

a b c d

e i k r

o u f j 

Within this matrix there is a 2x2 square of vowels starting in the second row and first column, namely, ei, ou. If a 2x2 square of vowels is found your program should return the top-left position (row-column) of the square, so for this example your program should return 1-0. If no 2x2 square of vowels exists, then return the string not found. If there are multiple squares of vowels, return the one that is at the most top-left position in the whole matrix. The input matrix will at least be of size 2x2. 

Input:"aqrst,ukaei,ffooo"
Output:"1-2"

+++

Input:"gg,ff"
Output:"not found"

# ScaleBalancing
Using the Java language, have the function ScaleBalancing(strArr) read strArr which will contain two elements, the first being the two positive integer weights on a balance scale (left and right sides) and the second element being a list of available weights as positive integers. Your goal is to determine if you can balance the scale by using the least amount of weights from the list, but using at most only 2 weights. For example: if strArr is ["[5, 9]", "[1, 2, 6, 7]"] then this means there is a balance scale with a weight of 5 on the left side and 9 on the right side. It is in fact possible to balance this scale by adding a 6 to the left side from the list of weights and adding a 2 to the right side. Both scales will now equal 11 and they are perfectly balanced. Your program should return a comma separated string of the weights that were used from the list in ascending order, so for this example your program should return the string 2,6 

There will only ever be one unique solution and the list of available weights will not be empty. It is also possible to add two weights to only one side of the scale to balance it. If it is not possible to balance the scale then your program should return the string not possible.

Input:"5.9,1.2.6.7"
Output:"6,2"

+++

Input:"3.4,1.2.7.7"
Output:"1"

+++

Input:"13.4,1.2.3.6.14"
Output:"3,6"

+++

Input:"3.4,2.7.7"
Output:"not possible"

# Pentagonal Number
Using the Java language, have the function PentagonalNumber(num) read num which will be a positive integer and determine how many dots exist in a pentagonal shape around a center dot on the Nth iteration. For example, in the image below you can see that on the first iteration there is only a single dot, on the second iteration there are 6 dots, on the third there are 16 dots, and on the fourth there are 31 dots.

Your program should return the number of dots that exist in the whole pentagon on the Nth iteration. 

Hard challenges are worth 15 points and you are not timed for them.

Input:2
Output:6

+++

Input:5
Output:51

# EightQueens
Using the Java language, have the function EightQueens(strArr) read strArr which will be an array consisting of the locations of eight Queens on a standard 8x8 chess board with no other pieces on the board. The structure of strArr will be the following: ["(x,y)", "(x,y)", ...] where (x,y) represents the position of the current queen on the chessboard (x and y will both range from 1 to 8 where 1,1 is the bottom-left of the chessboard and 8,8 is the top-right). Your program should determine if all of the queens are placed in such a way where none of them are attacking each other. If this is true for the given input, return the string true otherwise return the first queen in the list that is attacking another piece in the same format it was provided. 

For example: if strArr is ["(2,1)", "(4,2)", "(6,3)", "(8,4)", "(3,5)", "(1,6)", "(7,7)", "(5,8)"] then your program should return the string true. The corresponding chessboard of queens for this input is below (taken from Wikipedia). 

Input:"2.1,4.3,6.3,8.4,3.4,1.6,7.7,5.8"
Output:"2.1"

+++

Input:"2.1,5.3,6.3,8.4,3.4,1.8,7.7,5.8"
Output:"5.3"

+++

Input:"2.1,4.2,6.3,8.4,3.5,1.6,7.7,5.8"
Output:"true"

# ChessboardTraveling
Using the Java language, have the function ChessboardTraveling(str) read str which will be a string consisting of the location of a space on a standard 8x8 chess board with no pieces on the board along with another space on the chess board. The structure of str will be the following: "(x y)(a b)" where (x y) represents the position you are currently on with x and y ranging from 1 to 8 and (a b) represents some other space on the chess board with a and b also ranging from 1 to 8 where a > x and b > y. Your program should determine how many ways there are of traveling from (x y) on the board to (a b) moving only up and to the right. For example: if str is (1 1)(2 2) then your program should output 2 because there are only two possible ways to travel from space (1 1) on a chessboard to space (2 2) while making only moves up and to the right.

Input:"(1 1)(3 3)"
Output:6

+++

Input:"(2 2)(4 3)"
Output:3

# ClosestEnemyII
Using the Java language, have the function ClosestEnemyII(strArr) read the matrix of numbers stored in strArr which will be a 2D matrix that contains only the integers 1, 0, or 2. Then from the position in the matrix where a 1 is, return the number of spaces either left, right, down, or up you must move to reach an enemy which is represented by a 2. You are able to wrap around one side of the matrix to the other as well. For example: if strArr is ["0000", "1000", "0002", "0002"] then this looks like the following: 

0 0 0 0

1 0 0 0

0 0 0 2

0 0 0 2 

For this input your program should return 2 because the closest enemy (2) is 2 spaces away from the 1 by moving left to wrap to the other side and then moving down once. The array will contain any number of 0's and 2's, but only a single 1. It may not contain any 2's at all as well, where in that case your program should return a 0. 

Input:"000,100,200"
Output:1

+++

Input:"0000,2010,0000,2002"
Output:2

# KaprekarsConstant
Using the Java language, have the function KaprekarsConstant(num) take the num parameter being passed which will be a 4-digit number with at least two distinct digits. Your program should perform the following routine on the number: Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number), and subtract the smaller number from the bigger number. Then repeat the previous step. Performing this routine will always cause you to reach a fixed number: 6174. Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174). Your program should return the number of times this routine must be performed until 6174 is reached. For example: if num is 3524 your program should return 3 because of the following steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174. 

Hard challenges are worth 15 points and you are not timed for them.
Sample Test Cases

Input:2111
Output:5

+++

Input:9831
Output:7

# CorrectPath
Using the Java language, have the function CorrectPath(str) read the str parameter being passed, which will represent the movements made in a 5x5 grid of cells starting from the top left position. The characters in the input string will be entirely composed of: r, l, u, d, ?. Each of the characters stand for the direction to take within the grid, for example: r = right, l = left, u = up, d = down. Your goal is to determine what characters the question marks should be in order for a path to be created to go from the top left of the grid all the way to the bottom right without touching previously travelled on cells in the grid. 

For example: if str is "r?d?drdd" then your program should output the final correct string that will allow a path to be formed from the top left of a 5x5 grid to the bottom right. For this input, your program should therefore return the string rrdrdrdd. There will only ever be one correct path and there will always be at least one question mark within the input string. 

Input:"???rrurdr?"
Output:"dddrrurdrd"

+++

Input:"drdr??rrddd?"
Output:"drdruurrdddd"

# MaximalSquare
Using the Java language, have the function MaximalSquare(strArr) take the strArr parameter being passed which will be a 2D matrix of 0 and 1's, and determine the area of the largest square submatrix that contains all 1's. A square submatrix is one of equal width and height, and your program should return the area of the largest submatrix that contains only 1's. For example: if strArr is ["10100", "10111", "11111", "10010"] then this looks like the following matrix: 

1 0 1 0 0

1 0 1 1 1

1 1 1 1 1

1 0 0 1 0 

For the input above, you can see the bolded 1's create the largest square submatrix of size 2x2, so your program should return the area which is 4. You can assume the input will not be empty. 
Hard challenges are worth 15 points and you are not timed for them.
Sample Test Cases

Input:"0111,1111,1111,1111"
Output:9

+++

Input:"0111,1101,0111"
Output:1
