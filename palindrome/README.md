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

## Test Cases

1. 	input: babad  
   
	response: 

    ```josn
    {
    "id": "7ced03b2-2681-4d39-a4b2-d2cc6a64f936",
"string": "babad",
	"palindrome": "bab"
}
   ```
   
2. input: abcdeffedcbeee
   response: 

   ```json
   {
   "id": "4d9c48c3-90f0-40e7-ac9c-8c326f954637",
   "string": "abcdeffedcbeee",
   "palindrome": "bcdeffedcb"
   }
   ```

3. input: rtyuizxcxzxcxczui

   response:

   ```json
   {
       "id": "3c248204-bfc9-4f1c-af48-3633a10f1d67",
       "string": "rtyuizxcxzxcxczui",
       "palindrome": "xcxzxcx"
   }
   ```

4. input: xyzxyzxyzxyz

   response: 

   ```json
   {
       "id": "61d42e0c-f695-44ae-8b86-e4d12c734790",
       "string": "xyzxyzxyzxyz",
       "palindrome": "x"
   }
   ```

5. input: cbbd

   response: 

   ```json
   {
       "id": "30082279-49e9-4275-aa47-5954352a2c43",
       "string": "cbbd",
       "palindrome": "bb"
   }
   ```

   





