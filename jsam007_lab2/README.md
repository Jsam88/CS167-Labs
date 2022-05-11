# Lab 2

## Student information

* Full name: Jordan Sam
* E-mail: jsam007@ucr.edu
* UCR NetID: jsam007
* Student ID: 862148753

## Answers

* (Q1) Verify the file size and record the running time.

The file size is 2271210910 bytes and the running time is around 10.472278 seconds.


* (Q2) Record the running time of the copy command.

```
real    0m7.480s
user    0m0.009s
sys     0m2.315s
```

* (Q3) How do the two numbers compare? (The running times of copying the file through your program and the operating system.) Explain IN YOUR OWN WORDS why you see these results.

Copying the file through the operating system is faster than copying the file through my program. This is because my program is opening files and allocating memory.

* (Q4) Does the program run after you change the default file system to HDFS? What is the error message, if any, that you get?

No the program does not run. The error message that I get is that the  AREAWATER.csv file was not found. First, we aren't using hdfs. Second, the AREAWATER.csv is not copied to hdfs. We have to specify which path we are using since we are not just using the local file system anymore.


* (Q5) Use your program to test the following cases and record the running time for each case.

i) LOCAL TO HDFS

Copied 2271210910 bytes from 'file:///Users/jsam88/cs167/Workspace/jsam007_lab2/AREAWATER.csv' to 'hdfs://localhost:9000/user/jsam88/lab2test.csv' in 11.625596 seconds
```
real    0m13.042s
user    0m11.749s
sys     0m3.864s
```

ii) HDFS TO LOCAL

Copied 2271210910 bytes from 'hdfs://localhost:9000/user/jsam88/AREAWATER.csv' to 'file:///Users/jsam88/cs167/Workspace/jsam007_lab2/fileTest.csv' in 12.613718 seconds
```
real    0m8.983s
user    0m5.937s
sys     0m3.751s
```

iii) HDFS TO HDFS

Copied 2271210910 bytes from 'hdfs://localhost:9000/user/jsam88/AREAWATER.csv' to 'hdfs://localhost:9000/user/jsam88/lab2test.csv' in 12.385232 seconds
```
real    0m14.346s
user    0m12.810s
sys     0m3.097s
```

| FileSystems   |    Time    |
|---------------|:----------:|
| Local To HDFS | 11.625596  |
| HDFS To Local | 12.613718  |
| HDFS To HDFS  | 12.385232  |

* (Q6) Test your program on two files, one file stored on the local file system, and another file stored on HDFS. Compare the running times of both tasks. What do you observe?

```
It locally takes 1.753116558 seconds to read file:///Users/jsam88/cs167/Workspace/jsam007_lab2/AREAWATER.csv
compared to hdfs taking 11.147960371 seconds to read from hdfs://localhost:9000/user/jsam88/AREAWATER.csv
```
