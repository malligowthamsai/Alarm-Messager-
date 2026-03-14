# Alarm-Messager-
This application is useful to send messages on schedule  

Scheduled Messaging System (Java)

A simple Java console-based application that allows users to schedule messages to be delivered at a specific time. The system automatically sends the message when the scheduled time is reached.

This project demonstrates concepts such as Object-Oriented Programming (OOP), Threads, Scheduling, and Basic User Authentication in Java.


---

Features

User Registration

User Login

Schedule messages to another user

Automatic message delivery at scheduled time

Background scheduler using Java Threads



---

Project Structure

ScheduledMessagingSystem
│
├── User.java
├── Message.java
├── MessagingService.java
├── MessageScheduler.java
└── Main.java

File Description

File	Description

User.java	Represents a system user with username and password
Message.java	Stores message details including sender, receiver, content, and scheduled time
MessagingService.java	Handles user registration, login, and message storage
MessageScheduler.java	Background thread that checks and delivers scheduled messages
Main.java	Main program that runs the console application



---

How It Works

1. User registers in the system.


2. User logs into the system.


3. User schedules a message by entering:

Receiver name

Message content

Delay time



4. The system stores the scheduled message.


5. A background thread continuously checks if the scheduled time has arrived.


6. When the time is reached, the message is automatically delivered.




---

Technologies Used

Java

Object-Oriented Programming (OOP)

Java Threads

Java Collections

LocalDateTime API



---

How to Run the Project

1. Clone the Repository

git clone https://github.com/your-username/scheduled-messaging-system.git

2. Open in IDE

Open the project in any Java IDE such as:

IntelliJ IDEA

Eclipse

VS Code

NetBeans


3. Compile the Program

Compile all Java files.

4. Run the Main Class

Run:

Main.java


---

Example Usage

1.Register
2.Login

After login:

Receiver: Krishna
Message: Happy Birthday
Delay seconds: 10

After 10 seconds:

New Message Delivered!
From: Ram
To: Krishna
Message: Happy Birthday


---

Future Improvements

Add database support (MySQL / PostgreSQL)

Build REST APIs using Spring Boot

Create a web interface

Add email or SMS integration

Implement message notifications

Deploy on cloud platforms like AWS



---

Learning Outcomes

This project helps understand:

Java OOP concepts

Thread-based scheduling

Simple authentication systems

Basic backend application design



---

Author

Gowtham Sai

Software Engineer
AWS Certified Solutions Architect


---

If you want, I can also give you:

Professional GitHub repo structure (industry style)

Spring Boot version of this project

Scheduler using Quartz (used in real companies)

UI version with HTML + JS


That would make this a very strong portfolio project. 🚀
