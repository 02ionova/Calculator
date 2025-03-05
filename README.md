# **Lab01 - Calculator**  

## **Description**  
This program implements a simple calculator supporting four operations:  
- **Addition (1)**
- **Subtraction (2)**
- **Multiplication (3)**
- **Division (4)**  

The program prompts the user for an operation, then asks for two operands with appropriate labels based on the selected operation. Finally, the user specifies the number of decimal places for formatting the result.  

## **Input & Output Format**  
The user inputs:  
1. **Operation choice** (integer 1–4)  
2. **Two operands** (floating-point numbers)  
3. **Number of decimal places** (non-negative integer)  

The program outputs the calculated result with the specified precision.  

## **Error Handling**  
- If an **invalid operation** is selected, the program prints:  
  ```
  Chybna volba!  (Invalid choice!)
  ```
- If the **denominator is zero** in division, the program prints:  
  ```
  Pokus o deleni nulou!  (Attempt to divide by zero!)
  ```
- If the **number of decimal places is negative**, the program prints:  
  ```
  Chyba - musi byt zadane kladne cislo!  (Error - must be a positive number!)
  ```

## **Example Runs**  

### **Example 1 (Addition)**  
```
Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):
1
Zadej scitanec:
10.1234
Zadej scitanec:
42
Zadej pocet desetinnych mist:
2
10.12 + 42.00 = 52.12
```

### **Example 2 (Division by Zero)**  
```
Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):
4
Zadej delenec:
10
Zadej delitel:
0
Pokus o deleni nulou!
```

### **Example 3 (Invalid Decimal Places)**  
```
Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):
1
Zadej scitanec:
10
Zadej scitanec:
20
Zadej pocet desetinnych mist:
-1
Chyba - musi byt zadane kladne cislo!
```

## **Technical Notes**  
- The program reads input using `Scanner`, ensuring compatibility with decimal points (`.`) instead of commas (`,`) by setting `scanner.useLocale(Locale.US)`.  
- The input stream should be properly closed using `scanner.close()`.  
- The program follows the required formatting rules to match automatic evaluation criteria.  

## **Submission Guidelines**  
- Submit a **zipped** file containing **Lab01Impl.java**.  
- The file must be within the package:  
  ```
  cz.cvut.fel.pjv.impl
  ```
- Only **Lab01Impl.java** will be considered; additional files will be ignored.  
