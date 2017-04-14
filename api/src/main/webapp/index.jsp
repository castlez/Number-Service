<html>
    <body>
        <h2>Simple Values REST Service</h2>
        <p>Once the war has been placed in the Tomcat webapps folder
        you<br>access the api using the following commands:</p>
        <p>for POST:<br>
            $ curl -X POST localhost8080:/api/values --data "values=n"<br> 
            where n is a numeber</p>
        <p>for GET: 
            <br> $ curl localhost:8080/api/sum/values</p>
        <p>for DELETE: 
            <br> $ curl -X DELETE localhost:8080/api/values</p>
        
        <p>see the github repository for more information</p>
        <a href="https://github.com/castlez/Number-Service">Github Repository</a>
</body>
</html>
