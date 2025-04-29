## 🖼️ Images App

A beautiful app that displays random images and allows you to search for images using the power of **Dagger Hilt**, **Room**, **Retrofit**, and **MVI** architecture. The app fetches data from an external API and displays images with smooth UI transitions.

## ✨ Features

- 🎲 Displays random images from the internet
- 🔍 Allows you to search for images based on your query
- 🏙️ Fetches images through Retrofit and stores them in Room for offline persistence
- ⚡ **Dagger Hilt** for dependency injection and better testability
- 🖥️ Implements **MVI** architecture for better separation of concerns

## 🛠️ Technologies Used

- **Dagger Hilt** for Dependency Injection
- **Room** for local data storage
- **Retrofit** for network calls
- **Paging 3** for pagination support
- **MVI** architecture to manage UI-related data lifecycle-consciously
- **Kotlin Coroutines** for asynchronous operations
- **Jetpack Compose** for UI

## 🚀 Features

- **Random Image Display**: Shows random images every time the app is opened or when the user requests a new image.
- **Search Functionality**: Allows users to search for images based on their query and displays the results.

## 🏗️ Architecture

This app follows the **MVI** pattern to separate concerns:

- **Model**: Holds the data structure and repository logic.
- **ViewModel**: Manages the UI-related data lifecycle-consciously, with the help of **StateFlow** and **LiveData**.
- **View**: The UI (built using **Jetpack Compose**) that observes the ViewModel's data and displays it.

## ✨ API Credits

This app uses data from the **[Unsplash API](https://unsplash.com/developers)** to fetch random and searchable images.
