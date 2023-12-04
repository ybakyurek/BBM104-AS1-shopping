# **Overview:**

This project is a Java program that compares a shopping list with a price list, calculates the total cost of each shopping transaction, and prints the results. The program reads input from two text files: `shoppingList.txt` and `priceList.txt`. The shopping list includes customer information, membership details, transaction date, and a list of purchased items with quantities. The price list contains information about available products, membership discounts, and pricing.

## **Java Files:**

1. **Main.java:**
   - The main class that orchestrates the program.
   - Creates instances of the `FileIO` class to read input from files.
   - Creates an instance of the `Print` class to compare prices and print the results.

2. **FileIO.java:**
   - Handles input/output operations, specifically reading data from text files.
   - Contains the `inputFiletoArraylist` method, which reads a file and returns its contents as an `ArrayList`.

3. **Print.java:**
   - Compares the shopping list with the price list and calculates the total cost of each transaction.
   - Outputs the results to the console.

## **Downloading and Running the Project:**

**Step 1: Clone the Repository**

Open a terminal and run the following command to clone the repository from GitHub:

```bash
git clone https://github.com/ybakyurek/BBM104-AS1-shopping.git
```

**Step 2: Navigate to the Project Directory**

Navigate to the directory containing the cloned project:

```
cd BBM104-AS1-shopping
```

## **Usage:**

To compile and run the program, follow these steps:

1. Open a terminal.

2. Navigate to the directory containing the Java files.

3. Compile the Java files using the following command:
   ```bash
   javac *.java
   ```

4. Run the compiled program with the shopping list file (`shoppingList.txt`) and the price list file (`priceList.txt`) as command-line arguments:
   ```bash
   java Main shoppingList.txt priceList.txt
   ```

## **Input Files:**

1. **shoppingList.txt:**
   
   - Format: Each line represents a shopping transaction with tab-separated values.
     ```
     CustomerName  MembershipType  TransactionDate  Product1  Quantity1  Product2  Quantity2  ...  ProductN  QuantityN
     ```
   
2. **priceList.txt:**
   - Format: Each line represents a product with tab-separated values.
     ```
     ProductName  MembershipType  StartDate  EndDate  Price
     ```

**Output:**

- The program will output the details of each shopping transaction, including product names, prices, quantities, and the total cost.

```
---Hasan Uzun---
Sweater	55.5 	1	55.5
Jeans	83.0	2	166.0
Total	221.5
---Ali Can---
Sweater	58.5	2	117.0
Jeans	68.5 	1	68.5
Total	185.5
---Mehmet Karadeniz---
Jeans	103.0	2	206.0
Sweater	61.6	3	184.8
Total	390.8

```

**Note:**

- The program assumes that the input files (`shoppingList.txt` and `priceList.txt`) are correctly formatted according to the specified structure.

- If a file is not found or there is an issue with the file format, appropriate error messages will be displayed.
