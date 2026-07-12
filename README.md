# 🎓 Student Management System

A console-based **Student Management System** developed in **Java** using **Object-Oriented Programming (OOP)** principles. The application allows users to efficiently manage student records through a menu-driven interface.

The project was initially built using **ArrayList** and later **refactored to use HashMap**, improving search, deletion, and duplicate detection by using the student's **RBT Number** as a unique key.

---

## ✨ Features

- ➕ Add Student
- 📋 Display All Students
- 🔍 Search Student by RBT Number
- ❌ Delete Student
- 📊 View Student Statistics
  - Highest CGPA
  - Lowest CGPA
  - Average CGPA
  - Total Students
- 💾 Save All Student Records to a Text File
- 📄 Save Individual Student Record to a Text File
- 🚫 Duplicate RBT Number Validation
- ✅ Input Validation
- ⚠️ Exception Handling

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections Framework (`HashMap`)
- File Handling (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`)
- Exception Handling
- Git & GitHub

---

## 🚀 Key Learning Outcomes

This project demonstrates:

- Object-Oriented Programming
- Encapsulation
- Constructors
- Getters & Setters
- Method Overriding (`toString()`)
- Java Collections Framework
- HashMap
- File Handling
- Exception Handling
- Input Validation
- Basic CRUD Operations
- Console-Based Application Development

---

## ⚡ Why HashMap?

The project originally stored students using an `ArrayList<Student>`.

It was later refactored to use:

```java
HashMap<String, Student>
```

where:

- **Key** → Student RBT Number
- **Value** → Student Object

### Benefits

- Faster student lookup (Average **O(1)**)
- Efficient duplicate RBT detection using `containsKey()`
- Simpler search and deletion
- Cleaner project design

---

## 📂 Project Structure

```
src
│
├── Student.java
├── StudentManager.java
├── FileManager.java
└── StudentManagementSystem.java
```

---

## 🚀 How to Run

1. Clone the repository.

```bash
git clone https://github.com/ysiddhesh57-ui/Student-Management-System-Java.git
```

2. Open the project in IntelliJ IDEA (or any Java IDE).

3. Run:

```
StudentManagementSystem.java
```

4. Follow the console menu.

---

## 📌 Future Improvements

- ✏️ Update Student Details
- 📄 Export Student Data to CSV
- 📥 Import Student Data from CSV
- 🔃 Sort Students by CGPA
- 🔍 Search Students by Name
- 🗄️ Store Data in MySQL using JDBC
- 🌐 Build a Spring Boot REST API
- 🖥️ Develop a GUI Version

---

## 👨‍💻 Author

**Siddhesh Yadav**
