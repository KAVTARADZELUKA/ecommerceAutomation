The primary focus is on E2E testing to validate the entire user journey through the application. This includes critical user flows such as login, product search, adding items to the cart, and checkout.
The goal is to ensure the application functions correctly from the user's perspective and that all integrated components work together seamlessly.

Tools Chosen

Selenide:

Description: Selenide is a powerful framework for browser automation built on top of Selenium WebDriver. It provides a concise API for web testing and automatically handles browser setup, screenshots, and timeouts.
Rationale: Selenide was chosen for its simplicity and ease of use, allowing for quick test script development. Its fluent API improves readability and maintainability of the test code.

TestNG:

Description: TestNG is a testing framework inspired by JUnit and NUnit but designed to cover a broader range of testing needs, including unit, functional, and integration testing.
Rationale: TestNG's flexibility and powerful features such as data providers, parallel test execution, and advanced reporting make it an ideal choice for managing test cases and test suites.

Allure:

Description: Allure is a flexible reporting tool that provides clear and concise test reports. It integrates seamlessly with TestNG and supports detailed reporting, including test steps, screenshots, and logs.
Rationale: Allure's comprehensive and visually appealing reports help in quickly identifying test failures and understanding test execution flow. This aids in efficient debugging and improves overall test transparency.

Key Decisions and Rationale
Choice of Selenide Over Selenium:

Selenide was selected for its added features that simplify browser automation, such as automatic waits, error handling, and concise syntax. These features reduce boilerplate code and make tests more stable and readable compared to plain Selenium.

Conclusion

The selected testing approach and tools aim to ensure thorough validation of the application's functionality, usability, and stability. By leveraging Selenide, TestNG, and Allure, the project achieves efficient test development, execution, and reporting, ultimately contributing to a higher quality product.