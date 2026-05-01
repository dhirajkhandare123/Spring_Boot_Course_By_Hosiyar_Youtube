# REST API

A REST API (Representational State Transfer Application Programming Interface) is a way for different software systems to communicate with each other over the internet using a set of standard rules.

### 📌 Definition

A REST API is an architectural style for designing networked applications where clients and servers communicate using HTTP requests to perform operations on resources, typically represented in formats like JSON or XML.

http verb + URL

GET + 172.10.10.01:8080/jornal/list

### ⚙️ How It Works

A REST API uses standard HTTP methods:

GET → Retrieve data
POST → Send/create data
PUT → Update data
DELETE → Remove data

### @RestController
In Spring Boot, @RestController is an annotation used to create web APIs easily.
@RestController tells Spring Boot:
👉 “This class will handle HTTP requests and directly return data (like JSON), not a webpage.”

🧠 Explanation (Easy Language)

Normally in Spring:

@Controller → returns HTML pages (views)
@ResponseBody → returns data (JSON/text)

👉 @RestController = @Controller + @ResponseBody combined

So you don’t need to write both separately.

### ⚙️ What It Does
Handles incoming HTTP requests (GET, POST, etc.)
Sends responses directly as JSON or text
Used for building REST APIs

<hr>

### @RequestMapping
In Spring Boot, @RequestMapping is used to map web requests (URLs) to specific methods or classes.

It acts like a URL → method connector.

When a user hits a URL in the browser, Spring checks:

“Which method is mapped to this URL?”
Then it calls that method.

<hr>

### @GetMapping

In Spring Boot, @GetMapping is used to handle HTTP GET requests.

It is a shortcut of @RequestMapping(method = GET)
Used when you want to fetch or read data from the server
Commonly used in REST APIs

🧩 Key Points
Used for retrieving data only
Should NOT be used to modify data
Cleaner and shorter than @RequestMapping
Very common in REST APIs

<hr>

In Spring Boot, @PostMapping is used to handle HTTP POST requests.

@PostMapping tells Spring:
👉 “When a POST request comes to this URL, run this method and usually create new data.”

Used when you want to send data to the server
Commonly used for:
Creating a new user
Submitting a form
Saving data in a database

🧩 Key Points
Used to create/send data
Takes input using @RequestBody
Not idempotent (calling multiple times creates multiple entries)
Common in REST APIs

<hr>

### @RequestBody

In Spring Boot, @RequestBody is used to take data from the HTTP request body and convert it into a Java object.

@RequestBody tells Spring:
👉 “Take the incoming JSON (or data) from the request and convert it into a Java object.”

🧠 Explanation (Easy Language)

When a client (like Postman or frontend) sends data:

That data comes in JSON format
Spring cannot directly use JSON
👉 So @RequestBody converts JSON → Java object automatically

#### 🧩 Key Points
Used with POST / PUT requests
Converts JSON → Java Object
Works automatically using Spring’s converter (Jackson)
Makes API handling very easy

⚠️ Without @RequestBody
Spring won’t understand JSON input properly
You may get errors or null values

🧠 In One Line

👉 @RequestBody = “Convert incoming JSON into Java object”

<hr>

### @PathVariable

In Spring Boot, @PathVariable is used to get values directly from the URL path.

Sometimes data is sent in the URL itself, like:
/user/101
👉 Here 101 is part of the URL (path)
👉 @PathVariable extracts that value and gives it to your method

<img width="1036" height="392" alt="image" src="https://github.com/user-attachments/assets/c0a5641b-ffa8-43b4-bfa8-f15163cadcb6" />

<br>

<img width="1142" height="312" alt="image" src="https://github.com/user-attachments/assets/4e5d4e54-670c-4783-bb63-3d5728c01f1e" />
<br><br>

<hr>

### @DeleteMapping

In Spring Boot, @DeleteMapping is used to handle HTTP DELETE requests.

📌 Simple Definition

@DeleteMapping tells Spring:
👉 “When a DELETE request comes to this URL, delete the specified data.”

🧠 Explanation (Easy Language)
Used when you want to remove/delete data from the server
Commonly used in REST APIs for delete operations
Usually works with an ID to identify what to delete

🧩 Key Points
Used to delete data
Usually combined with @PathVariable

<hr>

### @PutMapping

In Spring Boot, @PutMapping is used to handle HTTP PUT requests.

📌 Simple Definition

@PutMapping tells Spring:
👉 “When a PUT request comes to this URL, update existing data.”

🧠 Explanation (Easy Language)
Used when you want to update data on the server
Usually requires:
An ID (which data to update)
Updated data (sent in request body)

<br>
<img width="1257" height="412" alt="image" src="https://github.com/user-attachments/assets/eeb15bec-038d-4c5b-bb83-a4e2e914e0b3" />
<br>
<br>

🧩 Key Points
Used to update existing data
Often combines:
@PathVariable → to get ID
@RequestBody → to get new data
