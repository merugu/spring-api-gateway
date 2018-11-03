# spring-api-gateway

This project zuul API gateway implementation for communication between microservices.All the microservices should be communicated through API gateway.I have used Ribbon for Client Side Load balancing and Feign for communication between  microservices.


Request
http://localhost:8000/api/remitservice/remit/from/USD/to/INR

Reuest through Zuul
http://localhost:8765/remit-service/api/remitservice/remit/from/USD/to/INR


Reuest through Zuul

http://localhost:8765/conversion-service/api/conversion/convert/from/USD/to/INR/quantity/100
