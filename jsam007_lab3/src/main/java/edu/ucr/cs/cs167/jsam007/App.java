package edu.ucr.cs.cs167.jsam007;

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.minidev.json.JSONUtil;
import org.apache.hadoop.conf.Configuration;

import java.util.Objects;
import java.util.function.Function;

public class App {


    public static Function<Integer, Boolean> combineWithAnd(Function<Integer, Boolean>... filters) {
        return x -> {
            for(Function<Integer, Boolean> f : filters) {
                 if(!f.apply(x)){
                    return false;
                 }
            }
            return true;
        };
    }

    public static Function<Integer, Boolean> combineWithOr(Function<Integer, Boolean>... filters) {
        return x -> {
            for(Function<Integer, Boolean> f : filters) {
                if(f.apply(x)){
                    return true;
                }
            }
            return false;
        };
    }

    public static void printNumbers(int from, int to, Function<Integer, Boolean> filter) {
        System.out.println("Printing numbers in the range [" + from + "," + to + "]");
        while (from <= to) {
            if (filter.apply(from)) {
                System.out.println(from);
            }
            from++;
        }
    }


    public static void main(String[] args) {
        int firstArg;
        int secondArg;

        firstArg = Integer.parseInt(args[0]);
        secondArg = Integer.parseInt(args[1]);

        if (args.length < 3) {
            System.err.println("Error: At least three parameters expected, from, to, and odd.");
            System.exit(-1);
        }

        boolean isOr = true;

        String[] bases;

        bases = args[2].split("v");

        if (bases.length == 1) {
            bases = args[2].split("\\^");
            isOr = false;
        }
//        System.out.println(bases.length);

        Function<Integer, Boolean>[] filters = new Function[bases.length];
        for(int i = 0; i < bases.length; i++){
            int temp = Integer.parseInt(bases[i]);
            assert temp != 0;
            filters[i] = x -> x % temp == 0;
        }

        Function<Integer, Boolean> filter;

        if(isOr){
            filter = combineWithOr(filters);
        }

        else{
            filter = combineWithAnd(filters);
        }
        printNumbers(firstArg, secondArg, filter);

    }
}

