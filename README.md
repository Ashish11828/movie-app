
**Movie App**

**Overview** : 
Movie App is an Android application built using Kotlin. It allows users to browse and search for movies, view detailed information about each movie, and manage their favorite movies. The app leverages the MVVM architecture pattern and integrates with The Movie Database (TMDB) API to fetch movie data.

**Features** : 
- Browse popular movies
- Search for movies by title
- View detailed information about each movie
- Add movies to favorites
- Responsive UI with support for different screen sizes
**Screenshots**: 

!Screenshot 1 !Screenshot 2

**Architecture** : 
The app follows the MVVM (Model-View-ViewModel) architecture pattern:

- Model: Handles the data layer, including network requests and database operations.
- View: Displays the data and interacts with the user.
- ViewModel: Acts as a bridge between the Model and the View, managing UI-related data in a lifecycle-conscious way.
  
**Libraries and Tools** :
- Kotlin: Programming language used for development

- Retrofit: For network requests

- Room Database : 

- Work Manager : 

- Glide: For image loading

- LiveData: For data observation

- ViewModel: For managing UI-related data

- DataBinding: For binding UI components to data sources

- Navigation Component: For handling navigation


**Setup and Installation** : 
- Clone the repository:
- git clone https://github.com/yourusername/movie-app.git

- Open the project in Android Studio.
- Add your TMDB API key in the local.properties file:
 TMDB_API_KEY=your_api_key

- Build and run the project on an emulator or physical device.

 **Usage** : 
- Launch the app and browse the list of popular movies.

- Use the search feature to find specific movies.
- Tap on a movie to view detailed information.
- Add movies to your favorites for quick access.
  
**Contributing**
- Contributions are welcome! Please fork the repository and submit a pull request with your changes.

**License**
- This project is licensed under the MIT License - see the LICENSE file for details.

**Acknowledgements**
TMDB API for providing movie data








  
