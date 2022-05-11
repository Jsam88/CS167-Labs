package edu.ucr.cs.cs167.jsam007;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import java.util.Random;

public class AppB {
    public static void main( String[] args ) throws IOException {
        Configuration conf = new Configuration(); //Arguments

        if (args.length != 1) {
            System.out.println("Incorrect number of arguments! Expected one argument.");
            System.exit(0);
        }

        //Get paths from arguments
        Path path_in = new Path(args[0]);

        //Returns a reference to an existing FileSystem
        FileSystem file_in = path_in.getFileSystem(conf);

        //Check if file exists
        if (!file_in.exists(path_in)) {
            System.out.println("File " + args[0] + " not found!");
            System.exit(0);
        }

        long startTime = System.nanoTime();

        FSDataInputStream inputStream = file_in.open(path_in);

        byte[] buffer = new byte[8192];                             //Buffer for mem
        Random randomNum = new Random();                            //Random position

        for (int i = 0; i < 10000; i++) {   //10,000 reads
            inputStream.seek(randomNum.nextInt(Integer.MAX_VALUE)); //sets the file pointer position and
                                                                    // checks next input as int
            inputStream.read(buffer);                               //Read
        }

        inputStream.close();
        long endTime = System.nanoTime();

        System.out.println("It took " + (endTime - startTime) * 1E-9 + "seconds to read from " + args[0]);
    }
}
