# Lab 4

## Student information

* Full name: Jordan Sam
* E-mail: jsam007@ucr.edu
* UCR NetID: jsam007
* Student ID: 862148753

## Answers

* (Q1) What do you think the line `job.setJarByClass(Filter.class);` does?

`I believe that the line "job.setJarByClass(Filter.class);" is telling hadoop to get the user functions 
from a JAR file to get ready to carry out the job.`

* (Q2) What is the effect of the line `job.setNumReduceTasks(0);`?

`The line "job.setNumReduceTasks(0);" skips the shuffle phase
and moves onto the map output which writes directly to the HDFS `

* (Q3) Where does the `main` function run? (Driver node, Master node, or an executor node).

`The main function runs on the driver node`

* (Q4) How many lines do you see in the output?

`27972`

* (Q5) How many files are produced in the output?

`1 file is produced in the output called part-m-00000`

* (Q6) Explain this number based on the input file size and default block size.

`The input file size is 2.3MB and the default block size can hold more than that size. This means that
only one block is necessary.`

* (Q7) How many files are produced in the output?

`1 file is produced in the output again`

* (Q8) Explain this number based on the input file size and default block size.

`The input file size is 2.3MB and the default block size is 128MB. This means that
only one block is necessary again.`

* (Q9) How many files are produced in the output directory and how many lines are there in each file?

`Two files are produced in the output directory. 
part-r-00000 has the four lines:`

| 200 | 481974462  |
|-----|:----------:|
| 302 |   26005    |
| 304 |     0      |
| 404 |     0      |

`whereas part-r-00001 has the no (zero) lines:`

* (Q10) Explain these numbers based on the number of reducers and number of response codes in the input file.

`The Aggregation code calls reduce twice. 2 reduces leads to 2 output files. 200, 302, 304, and 404 are response byte codes
and the numbers after thme (481974462, 26005, 0, 0) are the corresponding number of bytes.`

* (Q11) How many files are produced in the output directory and how many lines are there in each file?

`Two files are produced in the output directory. part-r-00000 has the five lines:`

| 200 |   37585778    |
|-----|:-------------:|
| 302 |    3682049    |
| 304 |       0       |
| 404 |       0       |
| 500 |       0       |

`whereas part-r-00001 has the two lines:`

| 403 |  0  |
|-----|:---:|
| 501 |  0  |

* (Q12) Explain these numbers based on the number of reducers and number of response codes in the input file.

The number in "job.setNumReduceTasks(2);" is two leaving 2 files as the output. nasa_19950630.22-19950728.12.tsv
has 7 response code leaving 7 lines in the output. The values in the right of the table are the sum of corresponding bytes
in the code.

* (Q13) How many files are produced in the output directory and how many lines are there in each file?

`Two files are created in the output. part-r-00000 has one line and
part-r-00001 has no (zero) lines.`

* (Q14) Explain these numbers based on the number of reducers and number of response codes in the input file.

`"job.setNumReduceTasks(2);" is still two leaving two output files. Running the filter class first on the large nasa file 
(nasa_19950630.22-19950728.12.tsv) creates an output file with only response code of 200. Running the Aggregation class  
on this outputted file results in 1 line being outputted due to the one response code of 200`