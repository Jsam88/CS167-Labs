# Lab 9

## Student information

* Full name: Jordan Sam
* E-mail: jsam007@ucr.edu
* UCR NetID: jsam007
* Student ID: 862148753

## Answers

* (Q1) What is the schema of the file after loading it as a Dataframe

    ```text
    root
    |-- Timestamp: string (nullable = true)
    |-- Text: string (nullable = true)
    |-- Latitude: double (nullable = true)
    |-- Longitude: double (nullable = true)
    ```

* (Q2) Why in the second operation, convert, the order of the objects in the  tweetCounty RDD is (tweet, county) while in the first operation, count-by-county, the order of the objects in the spatial join result was (county, tweet)?

    ```text
    The second operation, convert, has the order of objects in the tweetCounty RDD
    as (tweet,county) because we are joining tweet with county with an output as tweet, county.
    In the first operation, we are joining county with tweet which is why our output is county, tweet.
    ```

* (Q3) What is the schema of the tweetCounty Dataframe?

    ```text
    root
     |-- Timestamp: string (nullable = true)
     |-- Text: string (nullable = true)
     |-- Latitude: double (nullable = true)
     |-- Longitude: double (nullable = true)
     |-- geometry: geometry (nullable = true)
     |-- CountyID: string (nullable = true)
    ```

* (Q4) What is the schema of the convertedDF Dataframe?

    ```text
    root
     |-- CountyID: string (nullable = true)
     |-- Longitude: double (nullable = true)
     |-- Latitude: double (nullable = true)
     |-- keywords: array (nullable = true)
     |    |-- element: string (containsNull = true)
     |-- Timestamp: string (nullable = true)
    ```

* (Q5) For the tweets_10k dataset, what is the size of the decompressed ZIP file as compared to the converted Parquet file?

    | Size of the original decompressed file | Size of the Parquet file |
    | - | - |
    |  `758KB` | `528KB` |

* (Q6) (Bonus) Write down the SQL query(ies) that you can use to compute the ratios as described above. Briefly explain how your proposed solution works.

    ```SQL
    -- Enter the SQL query(ies) here
    ```

    ```text
    Use this space to explain how it works.
    ```