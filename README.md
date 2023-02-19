# vaipra_assesment
This project is about student management system

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `src/main/java/com/vaipra/studentManagement/StudentManagementApplication.java` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:


Before running the application you have to configure the database cconnectin in application.propetirs file.The steps are below:
```
1: Create a schema inside MySql database named "vipra_assignment".
2: Give your mysql username and password
    spring.datasource.username = root //your own mysql username
    spring.datasource.password = tiger //your own mysql password
3: If you don't want to create the tables manually the uncomment 
   spring.jpa.hibernate.ddl-auto=update
   
   Tables will be created automatically in the database
   ```

```shell
mvn spring-boot:run
```
## use swagger ui to access student management API 

[Swagger](http://localhost:8080/swagger-ui/index.html#/)

## Project requirement

```
Create a student management microservices which Insert, update, delete and read operations. You have two table to store student information - 

 
a. student_info.  

         1. std_id bigint, primary_key

2. std_name varchar (250) 

3. std_address varchar(500) 

4. std_email varchar(100) 

5. std_phoneno char(10) 

6. std_section char(03) 

7. std_grade char(06)

      

b. student_markes 

         1. std_id  bigint

2. session char(9)   ( sample value - 2021-2022) 

3. semester char(03)  ( sample value - 1st, 2nd, 3rd) 

4. total_subject int 

5. total_markes 

 

Now you have to build the below apis using the above data points 

 

1.   

  endpoints  :  /student/details/ 

  method : post 

  http header :  operation=insert 

  payload : 

 

[{

    "id": 123454,

    "name": "Rishi Samantha",

    "address":"Chennai - 400001",

    "email":"abc@xyz.com",

    "phoneno":"1234567890",

    "section":"AAA",

    "grade":"3rd" 

 

},

{

    "id": 123455,

    "name": "Resmi Samantha",

    "address":"Chennai - 400001",

    "email":"abd@xyz.com",

    "phoneno":"1534567890",

    "section":"BBB",

    "grade":"2nd"

}

]

 

Output:  

{

    "message": "2 records inserted successful"

    "code":"00"

}

 

2.   endpoints  :  /student/details/ 

  method : GET

  http header :  operation=read

 

 Output:

[{

    "id": 123454,

    "name": "Rishi Samantha",

    "address":"Chennai - 400001",

    "email":"abc@xyz.com",

    "phoneno":"1234567890",

    "section":"AAA",

    "grade":"3rd"

},

{

    "id": 123455,

    "name": "Resmi Samantha",

    "address":"Chennai - 400001",

    "email":"abd@xyz.com",

    "phoneno":"1534567890",

    "section":"BBB",

    "grade":"2nd"

}]

 

3.   endpoints  :  /student/marks/detail

  method : post 

  http header :  operation=insert 

 

Payload: 

{

    "id": 123455,

    "session":"2022-2023",

    "totalSubject":5,

    "totalMarkes":410 

}

 

Condition Check : Please insert records on table only if same id present on student_info table else error it out.

Output:

{

    "message": "record inserted successfully/fail"

    "code":"00/99"

}

 

4. 


 endpoints  :  /student/details/{id}

  method : GET

  http header :  operation=read

 

 Output:

/student/details/123455

 

{ 

"studentInfo":{

    "id": 123455,

    "name": "Resmi Samantha",

    "address":"Chennai - 400001",

    "email":"abd@xyz.com",

    "phoneno":"1534567890",

    "section":"BBB",

    "grade":"2nd"

},

"studentMarks":{

    "id": 123455,

    "session":"2022-2023",

    "totalSubject":5,

    "totalMarkes":410 

}

}

Language - Java-8 , Spring 

DataBase - MySQL 

ORM - JPA or Mybatis

Dependency Management - Gradle /Maven 
```
