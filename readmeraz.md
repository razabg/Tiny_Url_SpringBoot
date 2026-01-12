
# TinyURL Service

## Project Overview

This project is a robust and scalable TinyURL service built with Java and Spring Boot. It provides a simple and efficient way to shorten long URLs, track user clicks, and analyze URL performance. The application is designed to handle a high volume of requests and data, making it an ideal showcase of modern back-end engineering practices.

## Core Functionality

The primary function of this service is to take a long URL and generate a unique, short alias for it. When a user accesses the short URL, they are redirected to the original long URL. This is particularly useful for sharing links on social media, in messages, and in other places where space is limited.

## Technology Stack

This project leverages a variety of technologies to ensure high performance, scalability, and reliability.

### Back-End

- **Java**: The core programming language for the application.
- **Spring Boot**: A framework that simplifies the development of stand-alone, production-grade Spring-based applications.
- **Maven**: A build automation tool used for managing project dependencies and building the application.

### Databases

- **Redis**: An in-memory data store used for caching frequently accessed URLs. This significantly reduces latency and improves the user experience by providing faster redirects for popular links.
- **MongoDB**: A NoSQL document database used to store the mapping between the original and shortened URLs. Its flexible schema and scalability make it an excellent choice for this purpose.
- **Cassandra**: A distributed NoSQL database used to store user click data. Its high write throughput and fault tolerance make it ideal for handling large volumes of analytical data, such as tracking when and where users click on the shortened links.

### Containerization

- **Docker**: A platform for developing, shipping, and running applications in containers. This ensures that the application and its dependencies can be easily deployed and run in any environment.
- **Docker Compose**: A tool for defining and running multi-container Docker applications. This is used to orchestrate the deployment of the TinyURL service and its associated databases (Redis, MongoDB, and Cassandra).

## The Importance of Each Database

The choice of databases in this project is critical to its performance, scalability, and reliability.

- **Redis for Caching**: By caching the most frequently accessed URLs, Redis dramatically improves the speed of redirects. When a user requests a short URL, the application first checks Redis. If the URL is found in the cache, it is returned immediately, avoiding a slower database lookup. This is a common pattern in high-performance systems and demonstrates an understanding of how to optimize for speed.

- **MongoDB for URL Mapping**: MongoDB's document-oriented structure is a natural fit for storing URL mappings. Each document can represent a single shortened URL, containing the original URL, the short alias, and any other relevant metadata. This flexible schema allows for easy evolution of the data model and is well-suited for a large number of records.

- **Cassandra for User Analytics**: Cassandra is designed for high-availability and scalability, making it the perfect choice for storing time-series data like user clicks. Every time a user clicks on a shortened link, a record is written to Cassandra. This data can then be used for analytics, such as tracking the popularity of links, understanding user behavior, and generating reports. Cassandra's distributed architecture ensures that this data is always available and can be written to at a high velocity.

## How to Run the Project

To run the project locally, you will need to have Docker and Docker Compose installed.

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/tinyurl.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd tinyurl
   ```

3. **Run the application using Docker Compose**:
   ```bash
   docker-compose up
   ```

This will start the TinyURL service, as well as the Redis, MongoDB, and Cassandra containers. The application will be accessible at `http://localhost:8080`.

## Conclusion

This project is a practical and impressive example of a modern, scalable back-end service. It demonstrates a strong understanding of Java, Spring Boot, and a variety of database technologies. The thoughtful use of Redis, MongoDB, and Cassandra showcases the ability to choose the right tool for the job and to design a system that is both performant and resilient. This is the kind of project that is sure to impress in any technical interview.
