# Amazon README
**This test case includes the steps to search, select, add to cart, change quantity and delete a product on amazon.com.**

## Requirements
*   Java SDK must be installed.
*   WebDriver and the corresponding driver (Chrome WebDriver for example) must be  installed.
*   Maven must be installed.
*   The web page to be tested must be accessible.
## Scenario Steps
*   Open the web page to be tested with WebDriver.
*   Step 1 - Launch browser
*   Step 2 - Navigate to url 'http://amazon.com'
*   Step 3 - Maximize the search window.	
*   Step 4 - Accept All Cookies	
*   Step 5 - Click on Search button.
*   Step 6 - Enter the "Book" on Search Bar
*   Step 7 - Submit
*   Step 8 - Choose a book.
*   Step 9 - Click to "Add to Card" button.
*   Step 10 - Click to 'Complate the Shopping' button.
*   Step 11 - Click to dropdown for increase Amount.
*   Step 12 - Choose a "10+"
*   Step 13 - Enter the new Amount.
*   Step 14 - Click to "Update" button.
*   Step 15 - Click to "Delete" button.
*   Step 16 - Close the browser.

## End of Test Expectations
*   After clicking on the "Update" button, verify that the new amount has been successfully updated.
*   After clicking on the "Delete" button, verify that the relevant item has been successfully deleted.
*   After closing the browser, a printout can be taken to confirm that the operations have been completed.
