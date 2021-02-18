# The Library-Service Code

This is a fully Api-first developed project that I use in my youtube tutorials found here: https://www.youtube.com/watch?v=69P7p0_olG4 
<br>
<br>


## How To Run
1. At the root directory run `mvn clean install`
2. Run the TestProjectApplication.java class 
3. Send the following POST request to http://localhost:8080/books
```json
{
    "author": "mike",
    "name": "my boook"
}
```


## Tech Used
Here is the list of all the technologies I have used: <br>
* OpenApi 3.0
* Swagger Code gen
* Spring Boot
* Maven
