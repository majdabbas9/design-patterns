# Java Design Patterns

This repository contains implementations of various software design patterns in Java.

## Structure

The project is organized by design pattern, with each pattern located in its own directory:

- **Abstract Factory** (`abstract_factory/`)
  - A **Computer Assembler** system that builds computers with compatible components (CPU, GPU, RAM) using different factory families.
- **Adaptor** (`adaptor/`)
  - A **Payment Gateway** integration that adapts an incompatible 3rd-party PayPal SDK to a standard Payment Processor interface.
- **Builder** (`builder/`)
  - A fluent **HTTP Request Builder** that simplifies the construction of complex HTTP requests with various parameters, headers, and bodies.
- **Factory Method** (`factory_method_pattern/`)
  - A **Notification System** that creates different types of notifications (SMS, Email, Push) without coupling the client code to specific classes.
- **Observer** (`observer/`)
  - A multi-threaded **Chat Application** where the Server acts as the subject and Clients are observers. Broadcasts messages to all connected clients.
- **Singleton** (`singleton/`)
  - A thread-safe implementation ensuring only one instance of a class exists.
- **Strategy** (`strategy/`)
  - A **Load Balancer** that dynamically switches between different server selection strategies (e.g., Round Robin, Random) at runtime.

## Getting Started

### Prerequisites

- Java Development Kit (JDK 25) installed.

### Running the Observer Pattern

The **Observer** module includes a functional chat server and client.

#### Using Command Line
**Server:**
```bash
javac observer/server/*.java
java observer.server.Main 8080
```

**Client:**
```bash
javac observer/client/*.java
java observer.client.Main 8080
```
