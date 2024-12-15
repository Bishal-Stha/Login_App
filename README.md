# LoginApp 🚀

Welcome to **LoginApp**! This Kotlin-based Android application demonstrates an intuitive and elegant login screen using **Jetpack Compose**. 🌟

---

## ✨ Features

- **Modern UI** with Material 3 design.
- **Login Validation** with user-friendly error handling.
- **Dynamic Navigation** using Jetpack Navigation.
- **Social Media Integration** with easy sign-in options. 🎉
- **Edge-to-Edge** immersive experience.

---

## 🛠️ Technologies Used

- **Language**: Kotlin
- **UI Toolkit**: Jetpack Compose
- **Navigation**: Jetpack Navigation
- **Material Design**: Material3 Components

---

## 🧑‍💻 Code Overview

### **MainActivity.kt**

Handles navigation between `LoginScreen` and `FinalScreen`.

```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "LoginScreen") {
                composable("LoginScreen") {
                    LoginScreen(Modifier.padding(10.dp), navController)
                }
                composable("FinalScreen") {
                    FinalScreen(email = finalEmail, password = finalPassword)
                }
            }
        }
    }
}
```

### **LoginScreen.kt**

Captures user input and validates login details.

```kotlin
@Composable
fun LoginScreen(modifier: Modifier, navController: NavController) {
    // UI components for login functionality
}
```

### **FinalScreen.kt**

Displays user details upon successful login.

```kotlin
@Composable
fun FinalScreen(email: String, password: String) {
    // UI to show login details
}
```

---

## 📂 Folder Structure

```
.
├── ui.theme          # Theme configurations
├── MainActivity.kt   # Entry point of the app
├── LoginScreen.kt    # Handles login screen logic and UI
├── FinalScreen.kt    # Displays final output after login
└── resources         # Images and other assets
```

---

## 🔧 Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/login-app.git
   ```
2. Open the project in **Android Studio**.
3. Sync Gradle files and run the app on your emulator/device. 📱

---

## 🌟 Contribution

Contributions are welcome! Feel free to open issues or submit pull requests. Let's make this project better together. 🤝

---

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🙌 Acknowledgements

- **Icons**: Material Design Icons
- **Libraries**: Jetpack Compose, Material3, Navigation

---

Made with ❤️ by [Bishal Shrestha](https://github.com/Bishal-Stha).


