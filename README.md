# springboot-kotlin


https://www.callicoder.com/kotlin-spring-boot-mysql-jpa-hibernate-rest-api-tutorial/

1. POST /api/articles - Create an Article

curl -i -H "Content-Type: application/json" -X POST \
-d '{"title": "How to learn Spring framework", "content": "Resources to learn Spring framework"}' \
http://localhost:8080/api/articles

# Output
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 06 Oct 2017 03:25:59 GMT

{"id":1,"title":"How to learn Spring framework","content":"Resources to learn Spring framework"}
2. GET /api/articles - Get all Articles

curl -i -H 'Accept: application/json' http://localhost:8080/api/articles

# Output
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 06 Oct 2017 03:25:29 GMT

[{"id":1,"title":"How to learn Spring framework","content":"Resources to learn Spring framework"}]
3. Get /api/articles/{id} - Get an Article by id

curl -i -H 'Accept: application/json' http://localhost:8080/api/articles/1

# Output
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 06 Oct 2017 03:27:51 GMT

{"id":1,"title":"How to learn Spring framework","content":"Resources to learn Spring framework"}
4. PUT /api/articles/{id} - Update an Article

curl -i -H "Content-Type: application/json" -X PUT \
-d '{"title": "Learning Spring Boot", "content": "Some resources to learn Spring Boot"}' \
http://localhost:8080/api/articles/1

# Output
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 06 Oct 2017 03:33:15 GMT

{"id":1,"title":"Learning Spring Boot","content":"Some resources to learn Spring Boot"}
5. DELETE /api/articles/{id} - Delete an Article

curl -i -X DELETE http://localhost:8080/api/articles/1

# Output
HTTP/1.1 200 
Content-Length: 0
Date: Fri, 06 Oct 2017 03:34:22 GMT

