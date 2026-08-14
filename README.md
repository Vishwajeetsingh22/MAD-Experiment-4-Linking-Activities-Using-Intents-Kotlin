# MAD Experiment 4: Linking Activities Using Intents in Android Kotlin

## 📱 Project Overview

This project demonstrates how to **link two Android Activities using Explicit Intent** and pass user data from one Activity to another.

The application contains a modern and aesthetic **Login Page** where the user enters their **Name, Age, and Email**. When the user clicks the **Login** button, the information is transferred to the second Activity using `putExtra()`.

The second Activity receives the data using `getStringExtra()` and displays the user's details. A **Back** button is also provided to return to the Login Page.

---

## 🎯 Aim

To develop an Android application using Kotlin that demonstrates **linking Activities using Explicit Intent** and passing user details such as Name, Age, and Email between two Activities.

---

## ✨ Features

* 🎨 Modern purple and blue aesthetic UI
* 👤 User-friendly Login Page
* 📝 Input fields for Name, Age, and Email
* 🔗 Explicit Intent for Activity linking
* 📤 Passing data using `putExtra()`
* 📥 Receiving data using `getStringExtra()`
* 👀 Displaying user details on the second Activity
* ↩️ Back button to return to the first Activity
* 📱 XML-based Android UI
* 💻 Developed using Kotlin

---

## 🛠️ Technologies Used

| Technology         | Description             |
| ------------------ | ----------------------- |
| Kotlin             | Programming Language    |
| Android Studio     | Development Environment |
| XML                | User Interface Design   |
| Android SDK        | Android Development     |
| Explicit Intent    | Activity Linking        |
| `putExtra()`       | Passing Data            |
| `getStringExtra()` | Receiving Data          |

---

## 📂 Project Structure

```text
MAD-Experiment-4-Linking-Activities-Using-Intents-Kotlin/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── .../
│   │       │           ├── MainActivity.kt
│   │       │           └── SecondActivity.kt
│   │       │
│   │       ├── res/
│   │       │   ├── drawable/
│   │       │   │   ├── bg_gradient.xml
│   │       │   │   ├── input_background.xml
│   │       │   │   └── button_background.xml
│   │       │   │
│   │       │   └── layout/
│   │       │       ├── activity_main.xml
│   │       │       └── activity_second.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle
│
├── gradle/
├── .gitignore
├── build.gradle
├── settings.gradle
└── README.md
```

---

## 🔄 Application Flow

```text
        Login Activity
              │
              ↓
    Enter Name, Age & Email
              │
              ↓
        Click LOGIN
              │
              ↓
       Create Explicit Intent
              │
              ↓
         putExtra()
              │
              ↓
       Second Activity
              │
              ↓
        getStringExtra()
              │
              ↓
      Display User Details
              │
              ↓
          Click BACK
              │
              ↓
        Login Activity
```

---

## 🖥️ User Interface

### Login Page

The first Activity contains:

* User icon
* Welcome message
* Username/Name input
* Age input
* Email input
* Login button
* Aesthetic purple gradient background
* Rounded input fields and card design

### User Details Page

The second Activity contains:

* User icon
* User Details heading
* Displayed Name
* Displayed Age
* Displayed Email
* Back button

---

# 📸 Screenshots

## 1. Login Page

The Login Page provides a modern interface for entering user information.

Add your screenshot here:

```text
screenshots/login-page.png
```

<img width="1080" height="2400" alt="Screenshot_20260814_123249" src="https://github.com/user-attachments/assets/20f8249f-d5fe-4612-ba28-e6ed28d64968" />


---

## 2. User Details Page

After clicking the Login button, the second Activity displays the entered user details.

Add your screenshot here:

```text
screenshots/user-details-page.png
```

<img width="1080" height="2400" alt="Screenshot_20260814_123227" src="https://github.com/user-attachments/assets/09cc88f7-c37d-4367-87ef-b72965251d9f" />

---

## 3. Back Button

The second Activity contains a Back button that returns the user to the first Activity.

Add your screenshot here:

```text
screenshots/back-button.png
```

![Back Button](screenshots/back-button.png)

---

# 🧑‍💻 MainActivity

`MainActivity` contains the Login Page and collects the Name, Age, and Email entered by the user.

The Explicit Intent is created using:

```kotlin
val intent = Intent(this, SecondActivity::class.java)
```

The user data is passed using:

```kotlin
intent.putExtra("name", name.text.toString())
intent.putExtra("age", age.text.toString())
intent.putExtra("email", email.text.toString())
```

The second Activity is opened using:

```kotlin
startActivity(intent)
```

---

# 📤 Passing Data Between Activities

The application uses `putExtra()` to send data from `MainActivity` to `SecondActivity`.

```kotlin
intent.putExtra("name", name.text.toString())
intent.putExtra("age", age.text.toString())
intent.putExtra("email", email.text.toString())
```

The data is stored with keys:

```text
name
age
email
```

---

# 📥 Receiving Data

`SecondActivity` receives the data using `getStringExtra()`.

```kotlin
val name = intent.getStringExtra("name")
val age = intent.getStringExtra("age")
val email = intent.getStringExtra("email")
```

The received information is displayed using a `TextView`.

```kotlin
result.text = "Name: $name\n\nAge: $age\n\nEmail: $email"
```

---

# ↩️ Back Button

A Back button is provided on the second Activity.

The button uses:

```kotlin
btnBack.setOnClickListener {
    finish()
}
```

The `finish()` method closes the current Activity and returns to the previous Activity.

---

# ▶️ How to Run

### Step 1

Clone the repository:

```bash
git clone https://github.com/Vishwajeetsingh22/MAD-Experiment-4-Linking-Activities-Using-Intents-Kotlin.git
```

### Step 2

Open the project in **Android Studio**.

### Step 3

Wait for Gradle synchronization to complete.

### Step 4

Connect an Android phone or start an Android Emulator.

### Step 5

Click:

```text
Run ▶
```

### Step 6

Enter sample details:

```text
Name: Vishwa
Age: 22
Email: vishwa@gmail.com
```

### Step 7

Click **LOGIN**.

The second Activity will display the entered details.

### Step 8

Click **BACK** to return to the Login Page.

---

# 🧪 Sample Input

```text
Name  : Vishwajeet Singh
Age   : 24
Email : vickeysingh596.25@gmail.com
```

# 📱 Sample Output

```text
User Details

Name: Vishwajeet Singh

Age: 24

Email: vickeysingh596.25@gmail.com

[ BACK ]
```

---

# 📚 Concepts Demonstrated

This experiment demonstrates the following Android concepts:

1. Activities
2. Explicit Intent
3. Activity Navigation
4. `putExtra()`
5. `getStringExtra()`
6. `startActivity()`
7. `finish()`
8. XML Layout Design
9. EditText
10. TextView
11. Button
12. Event Handling using `setOnClickListener()`

---

# 🎓 Learning Outcome

After completing this experiment, we understand how to:

* Create multiple Activities in Android.
* Design Android interfaces using XML.
* Navigate from one Activity to another.
* Create and use Explicit Intents.
* Pass data between Activities.
* Receive and display transferred data.
* Return to the previous Activity using `finish()`.

---

# ✅ Result

The Android application was successfully developed using **Kotlin**. Two Activities were linked using an **Explicit Intent**, and the Name, Age, and Email entered in the first Activity were successfully transferred to and displayed in the second Activity. A Back button was also implemented to return to the first Activity.

---

# 👨‍💻 Author

**Vishwajeet Singh**
**USN-25MCAR0219
JAIN(DEEMED-TO-BE-UNIVERSITY)

### Repository

**MAD Experiment 4 – Linking Activities Using Intents in Android Kotlin**

---

## 📌 Experiment Information

**Experiment No.:** 4
**Subject:** Mobile Application Development (MAD)
**Platform:** Android Studio
**Language:** Kotlin
**Topic:** Linking Activities Using Intents
