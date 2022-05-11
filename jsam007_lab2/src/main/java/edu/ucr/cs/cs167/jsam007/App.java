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

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Configuration conf = new Configuration(); //Arguments
        if (args.length != 2){
            System.err.println("Incorrect number of arguments! Expected two arguments.");
            System.exit(-1);
        }

        //Get paths from arguments
        Path path_in = new Path(args[0]);
        Path path_out = new Path(args[1]);

        //Returns a reference to an existing FileSystem
        FileSystem file_in = path_in.getFileSystem(conf);
        FileSystem file_out = path_out.getFileSystem(conf);

        // `input` is a Path variable in step 3
        if(!file_in.exists(path_in)) {
            System.err.printf("Input file '%s' does not exist!\n", path_in);
            System.exit(-1);
        }

        // `output` is a Path variable in step 3
        if(file_out.exists(path_out)) {
            System.err.printf("Output file '%s' already exists!\n", path_out);
            System.exit(-1);
        }

        FSDataInputStream inputStream = file_in.open(path_in);          //file path is opened
        FSDataOutputStream outputStream = file_out.create(path_out);

        long startTime = System.nanoTime();
        long bytesCopied = 0;
        int byteCounter;
        byte [] buffer = new byte[4096];        //Buffer needed so that we can have something to write to/store in mem
        while ((byteCounter = inputStream.read(buffer)) != -1) { //.read returns the total # of bytes read from input to output
            // write() function to write
            // the byte of data
            outputStream.write(buffer);
            bytesCopied += byteCounter;
        }

        inputStream.close();
        outputStream.close();
        long endTime = System.nanoTime();

        // `bytesCopied` is the actual number of bytes copied. You may need to use `long` type to avoid overflow.
        // `input` and `output` are Path in step 3.
        // `startTime` and `endTime` are the System.nanoTime() before and after the copy function.
        System.out.printf("Copied %d bytes from '%s' to '%s' in %f seconds\n",
                bytesCopied, args[0], args[1], (endTime - startTime) * 1E-9);
    }
}
