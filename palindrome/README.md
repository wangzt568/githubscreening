# githubscreening



This project is based on spring and H2 in-memory database.

At the start the project will create a table with three columns:

id (varchar(240)) 

string (varchar(1000))

palindrome (varchar(1000))

# 3 APIs 

## To post a string and find the palindrome

Make a post request to "http://localhost:8080/v1/palindrome",

Set Content-Type "text/plain"

And input the string in the request body. 

The server will store a generated id, the string itself and the longest palindrome in the table and return a json file containing theses values.

## To retrieve all strings and palindromes stored.
Make a get request to "http://localhost:8080/v1/palindrome"

## To find one specific string by id
Make a get request to "http://localhost:8080/v1/palindrome/{id}" 










