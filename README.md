Java FIPE Lookup

This is a simple Java project that allows users to search for automobile information using the official FIPE API
.
It demonstrates how to consume REST APIs in Java, parse JSON data, and return structured results.

✨ Features

🚗 Search automobile data by brand, model, and year

🌍 Integration with the official FIPE API

📦 JSON parsing and mapping to Java objects

🧩 Beginner-friendly example of API consumption in Java

📂 Example Usage
Request
GET https://parallelum.com.br/fipe/api/v1/carros/marcas

Response
[
  {
    "codigo": "1",
    "nome": "Acura"
  },
  {
    "codigo": "2",
    "nome": "Agrale"
  },
  {
    "codigo": "3",
    "nome": "Alfa Romeo"
  }
]


You can then use the returned codes to query models, years, and price details.

🚀 How to Run

Clone the repository:

git clone https://github.com/your-username/java-fipe-lookup.git
cd java-fipe-lookup


Compile and run the project:

javac Main.java
java Main


Enter the required parameters (brand → model → year) and the program will return the market value of the vehicle from the FIPE table.

🎯 Purpose

The goal of this project is to practice API integration in Java, while working with real-world automotive data from the FIPE table.
It is intended as a learning exercise and a reference implementation for students and beginners.
