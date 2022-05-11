# Part A
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar count-all file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar code-filter file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv 200
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar time-filter file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv 807274014 807283738
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar count-by-code file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar sum-bytes-by-code file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar avg-bytes-by-code file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.App --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar top-host file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv

# Part B
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar count-all file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar code-filter file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv 200
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar time-filter file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv 807274014 807283738
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar count-by-code file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar sum-bytes-by-code file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar avg-bytes-by-code file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar top-host file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.jsam007.AppSQL --master "local[*]" target/jsam007_lab6-1.0-SNAPSHOT.jar comparison file:/Users/jsam88/cs167/Workspace/jsam007_lab6/nasa_19950801.tsv 807295758