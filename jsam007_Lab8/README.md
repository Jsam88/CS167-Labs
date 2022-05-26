# Lab 8

## Student information

* Full name: Jordan Sam
* E-mail: jsam007@ucr.edu
* UCR NetID: jsam007
* Student ID: 862148753

## Answers

* (Q1) What is the result?

  ```text
  5
  ```

* (Q2) Which query did you use and what is the answer?
  
  ```sql
    SELECT DISTINCT(primary_type) FROM ChicagoCrimes WHERE location_description = "GAS STATION";
  ```

  ```text
  Answer:
    [
        {
                "primary_type": "DECEPTIVE PRACTICE"
        },
        {
                "primary_type": "ROBBERY"
        },
        {
                "primary_type": "THEFT"
        },
        {
                "primary_type": "BATTERY"
        },
        {
                "primary_type": "MOTOR VEHICLE THEFT"
        }
    ]
  ```

* (Q3) Include the query in your README file

  ```sql
  SELECT year, COUNT(*) AS count 
    FROM (SELECT print_datetime(parse_datetime(date_value, "MM/DD/YYYY hh:mm:ss a"), "YYYY") AS year
    FROM ChicagoCrimes) AS months
    GROUP BY year
    ORDER BY count DESC;
  ```

* (Q4) Which `district` has the most number of crimes? Include the query and the answer in the README file.

  ```sql
  SELECT district AS district, count(*) AS count
    FROM ChicagoCrimes
    GROUP BY district
    ORDER BY count DESC
    LIMIT 1; 
  ```

  ```text
  Answer:
    [
        {
            "district":18,
            "count":108687
        }
    ]
  ```

* (Q5) Include the query in your submission.

  ```sql
  SELECT year_month, count(*) AS count FROM (
    SELECT print_datetime(parse_datetime(date_value, "MM/DD/YYYY hh:mm:ss a"), "YYYY/MM") AS year_month
    FROM ChicagoCrimes
    ) AS months
    GROUP BY year_month
    ORDER BY year_month;
  ```

* (Q6) What is the total number of results produced by this query (not only the shown ones)?

```text
There are 232 objects returned meaning the total number of results produced by the query is 232. 
```