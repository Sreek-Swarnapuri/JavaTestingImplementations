**`This project is to Demonstrate how to Test our application code in Java using Several Testing frameworks`**

Following are the Components of a Test:
1. Preconditions // Given
2. The Behaviour // When
3. The Post-conditions // Then 

Preconditions - What state should your system be in when the behaviour happens?
The behaviour - What is being tested?
Post-conditions - What are the changes that happened

Naming Guidelines for Test methods:
1. Use Domain Knowledge
2. Use Natural Language
3. Be descriptive

JUnit 5 has been used here. Tips:
1. Assertions can be used: `Assertions.assertEquals(7,4+3);`
2. Assertions with messages: `Assertions.assertEquals(4,1+2,"Values are not equal");`
3. We can use following annotations on methods to process common code:
    1. @BeforeAll - Executes common static code before all tests in a Test class.
    2. @BeforeEach - Executes common code before executing each test.
    3. @AfterEach - Executes common code after executing each test even if there is a failure.
    4. @AfterAll - Executes common static code After all tests in a Test class.