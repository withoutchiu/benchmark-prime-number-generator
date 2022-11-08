# benchmark-prime-number-generator

### How to run the program?
###### This is built using Blue J. If you are going to execute the program using BlueJ you can simply compile the the main method and run it.
###### It has Scanner in where you have to input numeric value to find its prime number
###### Included are the testing for the methods created


##### Is there any measurable difference between the two algorithms for small values of N? - I little bit but not compared to millions
##### Approximately at what value of N, if any, does the performance gap become significant? - When it goes around 10millions+ Sieve turns out to be much slower than
##### Do you think it was a good idea to benchmark the two algorithms in parallel? Why or why not? For me, I would say no. Because you have to manage the algorithms and it shared the memory environment. It needs low coupling and high cohesion, which is difficult to create.
##### In general, does it always make sense to use the algorithms with the best O(n) performance in our code? Describe some scenarios where it could make sense to choose a slower algorithm. -Yes. Insertion will be the best. I mean there is no such fast and slow algorithm, it depends on the usage of it. It sometimes go fast and slow depending on how you are going to use it. But for slower algorithm we can use it for insertion sort.

