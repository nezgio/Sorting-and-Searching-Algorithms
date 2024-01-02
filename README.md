The purpose of this assignment is understand algorithmic time complexities and to acquire 
skills in visualizing algorithm performance through graphical representations. In this report, i 
will detail the implementation and analysis of four different algorithms with varying time 
complexities, the creation of graphical representations, and an analysis of their performance. 
The selected algorithms for this assignments are Linear Search, Binary Search, Selection 
Sort, and an algortihm for Cubic Time complexity.
Selected Sorting Algorithms & Time Complexities:
Linear Search (O(n)): Linear Search is a basic searching algorithm that sequentially checks 
each element in a list until a match is found. It has a time complexity of O(n), where 'n' 
represents the size of the dataset. Linear Search is a linear-time algorithm.
Binary Search (O(log n)): Binary Search is an efficient searching algorithm that works by 
repeatedly dividing the search interval in half. It has a time complexity of O(log n), making it 
suitable for sorted datasets.
Selection Sort (O(n^2)): Selection Sort is a simple comparison-based sorting algorithm that 
repeatedly finds the minimum element from the unsorted part of the list and puts it at the 
beginning. It has a time complexity of O(n^2), which is inefficient for larger datasets.
Cubic Time Algorithm (O(n^3)): The Cubic Time Algorithm represents an algorithm with a 
cubic time complexity of O(n^3). It is used to simulate an algorithm with a significantly 
higher time complexity compared to the other three algorithms.
Implementing Algorithms & Creating Java Project:
Firstly I created classes containing methods for each algorithm and checked if they are 
correct and functional. For generating data sets, I created DataSetFactory class which 
contains generateArrays method for generating random arrays of integers based on provided 
size. This method creates arrays and then put random numbers at the indexes of the arrays. I 
used java.util.Random class. And I used for loops for this operations. Additionally, I created 
execution classes for each algorithm which include methods for executing respective 
algorithms to increase the readability and make graphs easier. In my main method, I 
generated data set sizes by using for loop, generated my data sets based on those sizes with 
generateArrays, and I put execution methods invocations.
Furthermore I created ExecutionTimer Class which contains a method for measuring 
execution time of functions for executing the algorithms. With getExecutionTime getter I am 
retrieving execution time of the algorithms. When the main method is invoked, it generates 
data sets, executes algorithms, takes execution durations and operations counts and write 
them to a file.
At last I wrote an python code which I already used for reading files from excel. I developed 
it a bit and I used it to make the graphs. 
Generated Graphs &Analysis of Algorithm Performance:
The following graphs illustrate the performance of the selected algorithms across different 
dataset sizes. Also for each algorithm there is two graphs which shows based on the operation 
counts and based on the execution time
