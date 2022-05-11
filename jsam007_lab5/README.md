# Lab 5

## Student information

* Full name: Jordan Sam
* E-mail: jsam007@ucr.edu
* UCR NetID: jsam007
* Student ID: 862148753

## Answers

* (Q1) Do you think it will use your local cluster? Why or why not?

`No i do not think it will use my local cluster. This is because my web page was not affected after running my code.`

* (Q2) Does the application use the cluster that you started? How did you find out?

`Yes the application uses the cluster that I started. I found out by looking at the completed actions which now has a (1) next to it`

* (Q3) What is the Spark master printed on the standard output on IntelliJ IDEA?

`Using Spark master 'local[*]`

* (Q4) What is the Spark master printed on the standard output on the terminal?

`Using Spark master 'spark://127.0.0.1:7077'`

* (Q5) For the previous command that prints the number of matching lines, list all the processed input splits.

`HadoopRDD: Input split: file:/Users/jsam88/cs167/Workspace/jsam007_lab5/nasa_19950801.tsv:0+1169610`

`HadoopRDD: Input split: file:/Users/jsam88/cs167/Workspace/jsam007_lab5/nasa_19950801.tsv:1169610+1169610`

* (Q6) For the previous command that counts the lines and prints the output, how many splits were generated?

`4 splits were generated`

`HadoopRDD: Input split: file:/Users/jsam88/cs167/Workspace/jsam007_lab5/nasa_19950801.tsv:0+1169610`

`HadoopRDD: Input split: file:/Users/jsam88/cs167/Workspace/jsam007_lab5/nasa_19950801.tsv:1169610+1169610`

`HadoopRDD: Input split: file:/Users/jsam88/cs167/Workspace/jsam007_lab5/nasa_19950801.tsv:0+1169610`

`HadoopRDD: Input split: file:/Users/jsam88/cs167/Workspace/jsam007_lab5/nasa_19950801.tsv:1169610+1169610`

* (Q7) Compare this number to the one you got earlier.

`We got 2x the number of splots from earlier.`

* (Q8) Explain why we get these numbers.

`We have another action which is "saveAsTextFile" and we have to read the input file again. 2 actions = 2 splits`

* (Q9) What can you do to the current code to ensure that the file is read only once?

`We can use the cache funtion on matchingLines to get 2 splits`