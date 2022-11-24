# designpatterns
In this series, we will show demos for different design patterns used in Java. Initial introductory post about design pattern is available 
https://betterjavacode.com/2017/05/29/design-patterns-in-java-introduction/


  sequenceDiagram
    participant A as User
    participant B as Application
    participant C as Spring-Security
    User->>Application: accesses the application
    Application->>User: responds with login screen
    User->>Spring-Security: registers for first time
    Spring-Security->>User: want to enable MFA?
    User->>Spring-Security: Yes
    Spring-Security->>User: display QR Code
    User->>User: scans QR Code on Google Authenticator
    User->>Spring-Security: sends one-time code
    Spring-Security->>Spring-Security: stores user info with QR code assigned
