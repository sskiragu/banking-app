# Banking System Project Overview
## Introduction
The Banking System Project is a web-based application that will allow customers to access their account information, perform transactions, and manage their finances online. The system will be built using Spring Boot, React/Vue, and MySQL.

## Requirements
The Banking System Project will include the following functional and non-functional requirements:

### Functional Requirements
    1. User registration and login
    2. Account management (view account details, transfer funds, request statements)
    3. Loan management (apply for a loan, view loan status, make payments)
    4. Credit card management (apply for a credit card, view credit card status, make payments)
### Non-functional Requirements
    1. Security (data encryption, authentication, and authorization)
    2. Performance (fast response times, scalable architecture)
    3. Reliability (high availability, data backups)
    4. Accessibility (support for multiple devices and browsers)
## Technical Details
The Banking System Project will be developed using the following technologies:

    1. Spring Boot for the backend
    2. React/Vue for the frontend
    3. MySQL for the database
    4. Maven for build and dependency management
## API Definition
The API for the Banking System Project will include the following endpoints:

- `/register` (POST) - Register a new user
- `/login` (POST) - Login a user
- `/accounts` (GET) - Get all accounts for a user
- `/accounts/{id}` (GET) - Get account details for a specific account
- `/accounts/{id}/transactions` (GET) - Get transaction history for an account
- `/accounts/{id}/transfer` (POST) - Transfer funds between accounts
- `/loans` (POST) - Apply for a loan
- `/loans/{id}` (GET) - Get loan details for a specific loan
- `/loans/{id}/payments` (POST) - Make a loan payment
- `/credit-cards` (POST) - Apply for a credit card
- `/credit-cards/{id}` (GET) - Get credit card details for a specific card
- `/credit-cards/{id}/payments` (POST) - Make a credit card payment

Authentication and authorization will be handled using JSON Web Tokens (JWT).


## Testing Plan
The following types of tests will be performed:

    1. Unit tests for backend code
    2. Integration tests for API endpoints
    3. End-to-end tests for frontend functionality
    4. Testing will be performed using JUnit, Mockito, and Protractor.

## Documentation Plan
The documentation for the Banking System Project will include the following:

    1. API documentation (generated using Spring REST Docs)
    2. User documentation (including instructions on how to use the system)
    3. Technical documentation (including architecture diagrams and code documentation)
    4. Documentation will be generated using Swagger, AsciiDoc, and Confluence.

## Collaboration Guidelines
The following guidelines will be followed for collaboration among developers:

Code reviews will be conducted using GitHub pull requests
Issues will be tracked using GitHub issues
Communication will be handled using Slack and email
## Timeline
The Banking System Project will be completed in six months, with the following milestones:

Prototype release - 2 months
Alpha release - 3 months
Beta release - 5 months
Production release - 6 months
This timeline is subject to change based on the complexity of the project and any unforeseen challenges that may arise.

## Folder structure
- `com.sampa.app.sampaapp`: root package for the application
- `controller`: contains all REST controller classes
- `exception`: contains exception handler classes
- `model`: contains all domain classes (POJOs)
- `repository`: contains repository interfaces
- `security`: contains JWT security classes
- `service`: contains all service classes
- `resources`: contains application properties and configurations
- `test`: contains all the test classes
- `config`: contains configuration files, classes or modules that configure the application, such as Spring configurations, database configurations, etc.
- `util`: contains utility classes or modules that provide common functionality across the application, such as date/time utilities, string utilities, or general-purpose functions.
- `dto`: contains Data Transfer Objects, which are used to transfer data between layers of the application. DTOs are typically used to encapsulate data and provide a simplified view of the data for the client or the consumer of the API.

## Controllers
- AccountController.java: A controller class that handles account-related requests, such as creating, updating, and deleting accounts, and returning account details.
- TransactionController.java: A controller class that handles transaction-related requests, such as retrieving transaction history, transferring funds between accounts, and making loan payments.
- CreditCardController.java: A controller class that handles credit card-related requests, such as applying for a credit card, making credit card payments, and returning credit card details.
- LoanController.java: A controller class that handles loan-related requests, such as applying for a loan, retrieving loan details, and making loan payments.
## Dto
- `AccountDTO`: A class that represents the data for an account, including the account number, balance, and owner information.
- `TransactionDTO`: A class that represents the data for a transaction, including the transaction amount, date, and description.
- `CreditCardDTO`: A class that represents the data for a credit card, including the card number, expiration date, and credit limit.
- `LoanDTO`: A class that represents the data for a loan, including the loan amount, interest rate, and payment terms.
## Exception
- GlobalExceptionHandler.java: A class that handles any unhandled exceptions that occur within the application.
- ApiError.java: A class that represents an error response to be returned to clients, including a status code, message, and details.
- AccountNotFoundException.java: A custom exception class that is thrown when an account is not found in the system.
- TransactionNotFoundException.java: A custom exception class that is thrown when a transaction is not found in the system.
- CreditCardNotFoundException.java: A custom exception class that is thrown when a credit card is not found in the system.
- LoanNotFoundException.java: A custom exception class that is thrown when a loan is not found in the system.
## Models
- Account.java: Represents a bank account, including the account number, balance, and owner information.

- CreditCard.java: Represents a credit card, including the card number, expiration date, and credit limit.

- Loan.java: Represents a loan, including the loan amount, interest rate, and payment terms.

- Transaction.java: Represents a transaction, including the transaction amount, date, and description.

- User.java: Represents a user of the banking system, including their personal information and account details.

- AccountType.java: An enum that represents the different types of bank accounts, such as checking or savings.

- TransactionType.java: An enum that represents the type of a transaction, such as deposit or withdrawal.

- UserType.java: An enum that represents the type of user, such as a regular customer or an admin.
## Security
- JwtAuthenticationEntryPoint: A class that implements AuthenticationEntryPoint interface and handles authentication failure by sending an unauthorized error response to the client.
- JwtTokenFilter: A class that extends OncePerRequestFilter and intercepts incoming requests to extract the JWT token from the Authorization header, validate it, and set the Authentication object in the SecurityContextHolder.
- JwtTokenProvider: A class that provides utility methods to generate, validate, and parse JWT tokens.
- SecurityConfig: A class that extends WebSecurityConfigurerAdapter and configures the security settings for the application, including authentication and authorization rules.
- UserDetailsServiceImpl: A class that implements UserDetailsService interface and provides user details from the database to the Spring Security framework.
## Service
- AccountService: A service class that provides methods for managing bank accounts, such as creating a new account, getting account details, and updating account information.

- AuthService: A service class that provides authentication and authorization functionality, such as verifying user credentials and checking user roles and permissions.

- CreditCardService: A service class that provides methods for managing credit cards, such as creating a new credit card, getting credit card details, and updating credit card information.

- LoanService: A service class that provides methods for managing loans, such as creating a new loan, getting loan details, and calculating loan payments.

- TransactionService: A service class that provides methods for managing transactions, such as making a deposit, making a withdrawal, and transferring funds between accounts.

- UserService: A service class that provides methods for managing users, such as creating a new user, getting user details, and updating user information. This can include both customers and employees of the bank.
## Utils
- DateUtil: A utility class that provides methods to format dates and times in a standard format across the application.
- StringUtil: A utility class that provides methods for common string operations such as trimming, replacing, and splitting strings.
- EncryptionUtil: A utility class that provides methods for encrypting and decrypting sensitive information such as passwords or credit card numbers.
- NumberUtil: A utility class that provides methods for common numerical operations such as rounding and formatting numbers.
- EmailUtil: A utility class that provides methods for sending emails to users such as email verification or password reset emails.
## src/test/java
- ApplicationTests.java: A JUnit test class that loads the application context and runs some basic tests to verify that the application is configured correctly.
- controllers: A directory containing test classes for your controller classes.
- services: A directory containing test classes for your service classes.
repositories: A directory containing test classes for your repository classes.
- utils: A directory containing test classes for your utility classes.
- resources: A directory containing test-specific configuration files, such as application-test.yml or application-test.properties.
