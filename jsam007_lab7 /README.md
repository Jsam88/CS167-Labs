# Lab 7

## Student information

* Full name: Jordan Sam
* E-mail: jsam007@ucr.edu
* UCR NetID: jsam007
* Student ID: 862148753

## Answers

* (Q1) What is your command?

    ```
    mongoimport --jsonArray --db CS167_LAB7 --collection contacts --file ~/cs167/Workspace/jsam007_lab7/contacts.json
    ```

* (Q2) What is the output of the above command?

    ```
    connected to: mongodb://localhost/
    10 document(s) imported successfully. 0 document(s) failed to import
    ```

* (Q3) What is your command?

    ```shell
    db.contacts.find().sort({Name:1}) 
  
    OR 
  
    db.contacts.find().pretty().sort({Name:1})
    ```

* (Q4) What is your command?

    ```shell
    db.contacts.find({}, {_id:1, Name:1}).sort({Name:-1})
    ```

* (Q5) Is the comparison of the attribute `Name` case-sensitive?

```
db.contacts.insertOne({Name: "apple"})
{
"acknowledged" : true,
"insertedId" : ObjectId("62817ca85203add1051a2265")
}
db.contacts.find({}, {_id:1, Name:1}).sort({Name:-1})
{ "_id" : ObjectId("62817ca85203add1051a2265"), "Name" : "apple" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f1"), "Name" : "Workman Holloway" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f0"), "Name" : "Susan Graham" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ed"), "Name" : "Sandy Oneil" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ef"), "Name" : "Patrick Thornton" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f2"), "Name" : "Levine Johnston" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f5"), "Name" : "Hayes Weaver" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ec"), "Name" : "Craft Parks" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f3"), "Name" : "Cooke Schroeder" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f4"), "Name" : "Aimee Mcintosh" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ee"), "Name" : "Aguirre Fox" }

Yes the comparison is case sensitive. In this example I inserted apple in all 
lower case and it placed it at the top of the list even though I am printing in 
descending order (Z-A)
```

* (Q6) What is your command?

    ```shell
    db.contacts.find({},{_id: 0, Name: 1}).sort({Name: -1})
    ```

* (Q7) Does MongoDB accept this document while the `Name` field has a different type than other records?

```
Yes, MongoDB accepts this document while the name field has a different type than other records
```

* (Q8) What is your command?

    ```shell
    db.contacts.insertOne({Name: {First: "David", Last: "Bark"}})
    ```

* (Q9) What is the output of the above command?

    ```text
    {
    "acknowledged" : true,
    "insertedId" : ObjectId("62817e6a5203add1051a2266")
    }
    ```

* (Q10) Where do you expect the new record to be located in the sort?

```
I expect the new record to be located at the top. This is because we made an object and this puts the 
object first in the descending order.
```

* (Q11) What is your command?

    ```shell
    db.contacts.insertOne({Name: ["David", "Bark"]})
    ```

* (Q12) What is the output of the above command?

    ```text
    {
    "acknowledged" : true,
    "insertedId" : ObjectId("628181665203add1051a2267")
    }
    ```

* (Q13) Where do you expect the new document to appear in the sort order. Verify your answer and explain after running the query.

```
I expect the record to be inserted in between Hayes and Craft.

db.contacts.find({}, {_id:1, Name:1}).sort({Name:-1})
{ "_id" : ObjectId("62817e6a5203add1051a2266"), "Name" : { "First" : "David", "Last" : "Bark" } }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f1"), "Name" : "Workman Holloway" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f0"), "Name" : "Susan Graham" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ed"), "Name" : "Sandy Oneil" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ef"), "Name" : "Patrick Thornton" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f2"), "Name" : "Levine Johnston" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f5"), "Name" : "Hayes Weaver" }
{ "_id" : ObjectId("628181665203add1051a2267"), "Name" : [ "David", "Bark" ] }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ec"), "Name" : "Craft Parks" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f3"), "Name" : "Cooke Schroeder" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f4"), "Name" : "Aimee Mcintosh" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ee"), "Name" : "Aguirre Fox" }

After running the query we see that this is true because we take the highest value in the array for 
descending order which is David
```

* (Q14) Where do you expect the last inserted record, `{Name: ["David", "Bark"]}` to appear this time? Does it appear in the same position relative to the other records? Explain why or why not.

```
We expect {Name: ["David", "Bark"]} to be in between Aimee and Cooke.
db.contacts.find({}, {_id:1, Name:1}).sort({Name:1})
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ee"), "Name" : "Aguirre Fox" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f4"), "Name" : "Aimee Mcintosh" }
{ "_id" : ObjectId("628181665203add1051a2267"), "Name" : [ "David", "Bark" ] }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f3"), "Name" : "Cooke Schroeder" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ec"), "Name" : "Craft Parks" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f5"), "Name" : "Hayes Weaver" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f2"), "Name" : "Levine Johnston" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ef"), "Name" : "Patrick Thornton" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1ed"), "Name" : "Sandy Oneil" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f0"), "Name" : "Susan Graham" }
{ "_id" : ObjectId("627ed2ca5657c33a8317b1f1"), "Name" : "Workman Holloway" }
{ "_id" : ObjectId("62817e6a5203add1051a2266"), "Name" : { "First" : "David", "Last" : "Bark" } }

After running the query we see that this is true because we take the lowest value in the array for 
ascending order which is Bark.
```

* (Q15) Is MongoDB able to build the index on that field with the different value types stored in the `Name` field?

```
Yes, MongoDB is able to build the index on that field with the different value types stored in the Name field.
```

* (Q16) What is your command?

    ```shell
    db.contacts.createIndex({Name:1})
    ```

* (Q17) What is the output of the above command?

    ```text
    {
    "numIndexesBefore" : 1,
    "numIndexesAfter" : 2,
    "createdCollectionAutomatically" : false,
    "ok" : 1
    }
    ```