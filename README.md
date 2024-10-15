# Financial Dashboard

## Running the Program
To run the program you can either use the provided script:
```
./mvnw spring-boot:run
```

Or your own Maven binary:
```
mvn spring-boot:run
```
You should then be able to access the website at http://localhost:8080

## Design Limitations
The website was designed on a standard 1920x1080 monitor in the Google Chrome web browser.
As reactivity was not a part of the design specifications it may look odd on other displays.
The program currently reads from the provided `balances.json` file located in the `resources` folder.
The provided `balances.json` was modified to include a user identifier, allowing us to test functionality on the front-end.
Later implementations should modify `FinancialController.java` to read from an actual database.

## Technologies Used
We used Maven as a build-tool and dependency manager, as sharing Java projects without one can be very difficult and frusturating.
Spring Boot was used for the back-end, and provides a basic RESTful API to send account balances to the client.
The front-end was coded in vanilla Javascript with CSS, we felt that anything more would be unnecssarily complicated for such a project.
When future developers wish to build on the site they may want to use their own front-end technologies, so we felt it best not to lock them into anything.