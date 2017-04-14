# Number-Service
Simple RESTful service that allows users to POST numbers, sum them, GET them, and DELETE them

### Purpose
This code sample illustrates the implementation of RESTful APIs with maven and tomcat. 

### Components  
There are three classes involved in this web app. The Values class holds the numbers inputed by users. 
The Editor class allows users to update the Values list as well as delete the values. Finally, 
the Adder class responds to GET requests and will return the summation of all numbers in the Values list.

### To Run
In the directory of the source with the POM.xml file (/api)  
`$ mvn package`  
`$ cp <cloned location>/api/target/api.war <Tomcat Install>/webapps`
