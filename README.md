# TinyURL Service

A high-performance URL shortening service built with Java and Spring Boot, demonstrating scalable architecture and multi-database design patterns.

## 🎯 What It Does

Converts long URLs into short, shareable links with built-in click tracking and analytics. When users access a short URL, they're instantly redirected to the original destination.

## 🛠️ Tech Stack

**Backend:** Java, Spring Boot, Maven  

**Databases:** Redis (caching), MongoDB (URL storage), Cassandra (analytics)

**Documentation:** Swagger UI (SpringDoc OpenAPI) 

**Deployment:** Docker, Docker Compose

## 🗄️ Database Architecture

**Redis** - Caches popular URLs for lightning-fast redirects, minimizing database lookups for frequently accessed links.

**MongoDB** - Stores URL mappings with flexible schema design, perfect for handling large volumes of shortening requests.

**Cassandra** - Powers analytics with high-throughput click tracking. Captures every user interaction for real-time reporting and insights.

## 🚀 Quick Start

```bash
# Clone the repository
git clone https://github.com/razabergel/tinyurl.git
cd tinyurl

# Start all services
docker-compose up

# Access the service
http://localhost:8080
```

**Prerequisites:** Docker and Docker Compose installed

## 📊 Key Features

- Multi-tier caching for optimal performance
- Distributed analytics for scalability
- Containerized deployment for portability
- Production-ready architecture with fault tolerance

---

Built to demonstrate modern backend engineering: microservices architecture, polyglot persistence, and cloud-native design patterns.
