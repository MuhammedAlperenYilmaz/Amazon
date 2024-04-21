# Amazon Selenium Test Automation

Welcome to the Amazon automation project! This project demonstrates how to automate interactions with the Amazon website using Selenium WebDriver and Java. The code performs a series of actions such as searching for products, adding items to the cart, updating quantities, and emptying the cart.

## Table of Contents

- [Project Description](#project-description)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Scenario](#scenario)
    - [Test Scenario](#test-scenario)


## Project Description

This code automates various actions on the Amazon website, including product search, adding items to the cart, updating quantities, and emptying the cart. It utilizes Selenium WebDriver and Chrome WebDriver to interact with the Amazon website.

## Usage

To use this code:

1. Compile and run the `amazon` class.

2. The code initializes the WebDriver, navigates to the Amazon website, and performs a series of predefined actions such as searching for products, adding items to the cart, updating quantities, and emptying the cart.

## Dependencies

This project relies on the following dependencies:

- **Selenium WebDriver**: A library that allows you to automate web browser actions.
- **WebDriverManager**: A library that manages the installation and setup of WebDriver binaries.
- **Chrome WebDriver**: The Chrome browser driver, which you can install using WebDriverManager.

To install the dependencies, you can use a build tool such as Maven or Gradle to manage them, or you can install them manually.

## Scenario

### Test Scenario

## Test Scenario: Amazon Product Purchase Workflow

### Objective:
To verify that the Amazon Selenium Test Automation script successfully automates the purchase workflow on the Amazon website, including searching for a product, adding it to the cart, updating quantities, and completing the purchase.

### Preconditions:
- Ensure that the Selenium WebDriver and Chrome WebDriver are properly installed and configured.
- Provide valid credentials if required for accessing the Amazon website.

### Test Steps:
1. **Launch the Automation Script:**
    - Execute the `amazon` class to start the automation script.

2. **Navigate to the Amazon Website:**
    - Verify that the script successfully navigates to the Amazon website (https://www.amazon.com/tr/).

3. **Maximize the Browser Window:**
    - Confirm that the browser window is maximized to ensure proper visibility.

4. **Search for a Product:**
    - Check if the script enters the search term "samsung buds 2 fe" in the search box.
    - Verify that the script presses the Enter key to initiate the search.

5. **Select the Desired Product:**
    - Ensure that the script selects the desired product from the search results.
    - Verify that the script clicks on the product image or link.

6. **Add the Product to the Cart:**
    - Check if the script adds the selected product to the shopping cart.
    - Verify that the script clicks on the "Add to Cart" button.

7. **Update the Quantity:**
    - Confirm that the script updates the quantity of the product in the cart to 15.
    - Verify that the script clicks on the quantity input field, enters "15", and applies the changes.

8. **Proceed to Checkout:**
    - Ensure that the script proceeds to the checkout process.
    - Verify that the script clicks on the appropriate buttons to proceed with the checkout.

9. **Verify Order Summary:**
    - Check if the script displays the order summary.
    - Verify that the script captures relevant information such as product details, quantity, and total price.

10. **Complete the Purchase:**
    - Confirm that the script completes the purchase process.
    - Verify that the script clicks on the "Place your order" button to finalize the purchase.

11. **Verify Order Confirmation:**
    - Ensure that the script displays the order confirmation page.
    - Verify that the script captures the order confirmation details such as order number and delivery estimate.

12. **Cleanup:**
    - Confirm that the script empties the cart after the purchase is completed.
    - Verify that the cart is empty and no products remain.

### Expected Results:
- The automation script should successfully execute each step of the purchase workflow without errors.
- The script should accurately interact with the Amazon website, perform actions as expected, and complete the purchase process.
- At the end of the test, the order should be successfully placed, and the cart should be empty.
