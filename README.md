# Inventory Management System
A Simple RESTful API built with Spring Boot for managing products in an inventory system.

## Features
- Create new products
- Get all products 
- Get a single products by ID
- update a product details and stock quantity
- Delete product from inventory
- Search and filter product by name and status

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL (psql) Database
- Maven

## API Endpoints

### Create Product 
**POST** `/api/products`
Creates a new product in the inventory.
___

### Get All Products
**GET** `/api/products` 
Retrieves all products

This end point supports optional query parameter for searching and filtering

**GET** `/api/products?name=Book` 
Retrieves product by name

**GET** `/api/products?status=Available` 
Retrieves product by status

___

### Get Product by ID
**GET** `/api/products/{id}`
Retrieve a single product using its ID.

___

### Update Product
**PATCH** `/api/products/{id}`
Updates product details and stock quantity

___ 
### Delete Product
**DELETE** `/api/products/{id}`
Remove product from the inventory

___

## API Documentation
The complete API documentaion,including request and response examples, is available on postman: https://documenter.getpostman.com/view/29716797/2sBXVo87VB
## Database
This project uses **PostgreSQL (psql) database**

## How to Run

### Prerequisites
- Java 17 or higher
- Maven

### Steps
1. Clone the repository
2. Navigate to the project directory
3. Run the application 
- mvn spring-boot:run
4. The application will start on : http://localhost:8000

## Author 
Odedoyin Oyinloluwa
