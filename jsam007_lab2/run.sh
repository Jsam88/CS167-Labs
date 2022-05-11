#!/usr/bin/env sh
mvn clean package

# LAB 2

hadoop jar target/jsam007_lab2-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.jsam007.App file://`pwd`/AREAWATER.csv  hdfs:///AREAWATER.csv

hadoop jar target/jsam007_lab2-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.jsam007.App hdfs:///AREAWATER.csv  file://`pwd`/lab2test.csv

hadoop jar target/jsam007_lab2-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.jsam007.App hdfs:///test/AREAWATER.csv hdfs:///lab2test.csv


#LAB 2 BONUS

hadoop jar target/jsam007_lab2-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.jsam007.AppB file://`pwd`/AREAWATER.csv

hadoop jar target/jsam007_lab2-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.jsam007.AppB hdfs://AREAWATER.csv
