mvn clean package

spark-submit --class edu.ucr.cs.cs167.jsam007.Filter --master local[2] target/jsam007_lab5-1.0-SNAPSHOT.jar hdfs://localhost:9000/user/jsam88/nasa_19950630.22-19950728.12.tsv hdfs://localhost:9000/user/jsam88/filter_output 302
spark-submit --class edu.ucr.cs.cs167.jsam007.Aggregation --master local[2] target/jsam007_lab5-1.0-SNAPSHOT.jar hdfs://localhost:9000/user/jsam88/filter_output hdfs://localhost:9000/user/jsam88/aggregation_output