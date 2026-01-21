# WonderLust-Selenium-POM-Framework

> A complete UI automation testing framework for the WonderLust web application built using **Selenium WebDriver**, **TestNG**, **Maven**, and **Page Object Model (POM)**.

---

## 🚀 Project Overview

This framework automates core components of the WonderLust site (https://wonde-lust.onrender.com/listings), including:

✅ Navigation bar  
✅ Listings grid validation  
✅ Individual listing cards  
✅ Footer visibility  
✅ Navigation and interaction tests  

It follows industry-standard practices:
- **Page Object Model (POM)**
- **Maven project structure**
- **TestNG test framework**
- **WebDriverManager for driver setup**
- **TestNG XML suite runner**

---

## 🗂 Project Structure
```
WonderLust-Selenium-POM-Framework/
│
├── src/
│ ├── main/java/pages/ # Page Object classes
│ └── test/java/tests/ # Test classes
│
├── testng.xml # TestNG suite config
├── pom.xml # Maven configuration
├── README.md
└── .gitignore

yaml

Copy code
```

---

## 🛠 Tools & Technologies
````
| Technology | Purpose |
|------------|---------|
| **Java** | Core language |
| **Selenium WebDriver** | Web automation |
| **TestNG** | Test framework |
| **Maven** | Dependency & build management |
| **WebDriverManager** | Auto-manages browser drivers |
| **Page Object Model (POM)** | Design pattern for maintainable test code |

---
````

## 📦 Setup & Installation

1. **Clone the repository**
2. ```
   ```bash
   git clone https://github.com/VanshRanaR/WonderLust-Selenium-POM-Framework.git
   ```
Open in IntelliJ / Eclipse

Refresh Maven dependencies

Run tests:

From IDE: Right click on testng.xml → Run

From terminal:

bash
Copy code
mvn test
📋 Test Execution
All tests are configured in testng.xml.

Example:
````
xml
Copy code
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="WonderLust Automation Suite">
    <test name="UI Tests">
        <packages>
            <package name="tests"/>
        </packages>
    </test>
</suite>'
````
📌 Example Test
````
java
Copy code
@Test
public void verifyNavbarVisible() {
    NavbarPage nav = new NavbarPage(driver);
    Assert.assertTrue(nav.isNavbarVisible());
}
````
💡 Best Practices Followed
✔ Separation of test logic and UI locators
✔ Reusable page objects
✔ Centralized WebDriver setup
✔ Clean & readable test reports
✔ Easy maintenance and scalability

🧪 Future Improvements
✔ Add Screenshot on Failure
✔ Add ReportNG / ExtentReports
✔ Add Data Driven tests (Excel / CSV)
✔ CI / GitHub Actions integration

🙌 Credits
Developed by Vansh Rana
GitHub: https://github.com/VanshRanaR

