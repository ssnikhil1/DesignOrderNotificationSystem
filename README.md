# Order Notification System
A modular Java-based notification system using Observer, Factory, and Proxy design patterns.

## The Problem:

### Design a notification system for an online shoping app

* Sends notifications to users when certain actions happen (e.g., order placed, order shipped, order delivered).
* Notifications can be of different types (e.g., Email, SMS).
* The system should be flexible to add new types of notifications or behaviors easily.
* We should be able to extend the system without modifying existing code (Open/Closed principle).

## 🏗️ Architecture
The system uses:

| Pattern    | Purpose                                         |
|------------|-------------------------------------------------|
| Observer   | Decouples order management from notifications   |
| Factory    | Creates appropriate sender based on channel     |
| Proxy      | Adds logging and retry logic around senders     |

