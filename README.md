# **2025-OBJPROG-LAB007**
Week 03-04 - Conditional and Looping Statements

Laboratory # 07 - Guided Coding Exercise 1: Boolean Expressions and Relational/Logical Operators Demo

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 07 - Guided Coding Exercise 1: Boolean Expressions and Relational/Logical Operators Demo**

   **Objective:**
   - Understand boolean literals, variables, and expressions.
   - Use relational operators (==, !=, >, <, >=, <=) and logical operators (&&, ||, !, ^).

   **File Naming Convention:**
   - `BooleanExpressionsDemo.java`

   **Desired Output**
   ```txt
   Is Java fun? true
   Is homework tiring? false
   Is 'a' greater than 'b'? false
   Are 'a' and 'b' equal? false
   Both conditions (isJavaFun && a<b): true
   Either condition (isJavaFun || isHomeworkTiring): true
   Logical NOT of isHomeworkTiring: true
   Exclusive OR (isJavaFun ^ isHomeworkTiring): true
   ```

   **Notable Observations (to be discussed after completing the exercise):**
   - Pay attention to how the relational and logical operators work. Experiment with different values to see how the results change.
   - The use of parentheses in complex expressions helps to avoid ambiguity and ensures the expressions are evaluated in the intended order.

   **Java Programming Best Practices:**
   - Use descriptive variable names.
   - Comment your code to explain the logic of the boolean expressions.
   - Use consistent indentation to make your code easier to read.
      
   **Step-by-Step Instructions:**

   1. Setup Class and Main Method
      - Create a file named `BooleanExpressionsDemo.java`.
      - Define the class `BooleanExpressionsDemo` and its `main` method.
      ```Java
      public class BooleanExpressionsDemo {
          public static void main(String[] args) {
      
          }
      }
      ```
            
   2. Declare Boolean Variables
      - Inside the main method, declare a boolean variable named isJavaFun and initialize it to true.
      - Declare another boolean variable named isHomeworkTiring and initialize it to false.
      ```Java
      boolean isJavaFun = true;
      boolean isHomeworkTiring = false;
      ```

   3. Declare Integer Variables
      - Declare an integer variable named a and initialize it to 15.
      - Declare another integer variable named b and initialize it to 20.
      ```Java
      int a = 15;
      int b = 20;
      ```

   4. Relational Expression (Greater Than)
      - Declare a boolean variable named isAGreater.
      - Create a relational expression that checks if a is greater than b. Assign the result to isAGreater.
      ```Java
      boolean isAGreater = a > b;
      ```

   5. Relational Expression (Equal To)
      - Declare a boolean variable named areEqual.
      - Create a relational expression that checks if a is equal to b. Assign the result to areEqual.
      ```Java
      boolean areEqual = a == b;
      ```

   6. Logical AND
      - Declare a boolean variable named bothTrue.
      - Create a logical expression using the && operator. It should check if isJavaFun AND a < b. Assign the result to bothTrue.
      ```Java
      boolean bothTrue = isJavaFun && (a < b);
      ```

   7. Logical OR
      - Declare a boolean variable named eitherTrue.
      - Create a logical expression using the || operator. It should check if isJavaFun OR isHomeworkTiring. Assign the result to eitherTrue.
      ```Java
      boolean eitherTrue = isJavaFun || isHomeworkTiring;
      ```
      
   8. Logical NOT
      - Declare a boolean variable named notTrue.
      - Create a logical expression using the ! (NOT) operator. It should apply NOT to isHomeworkTiring. Assign the result to notTrue.
      ```Java
      boolean notTrue =!isHomeworkTiring;
      ```
      
   9. Logical XOR
      - Declare a boolean variable named exclusiveOr.
      - Create a logical expression using the ^ (XOR) operator. It should check if isJavaFun XOR isHomeworkTiring. Assign the result to exclusiveOr.
      ```Java
      boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;
      ```

   10. Output Results (Formatted)
      - Use `System.out.println()` to print the values of all the boolean variables with descriptive labels.  Match the labels in the "Desired Output" section.
   ```Java
   System.out.println("Is Java fun? " + isJavaFun);
   System.out.println("Is homework tiring? " + isHomeworkTiring);
   System.out.println("Is 'a' greater than 'b'? " + isAGreater);
   System.out.println("Are 'a' and 'b' equal? " + areEqual);
   System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
   System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
   System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
   System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
   ```

   12. Compile and Run
       - Save the file as `BooleanExpressionsDemo.java`.
       - Compile the code using `javac BooleanExpressionsDemo.java` in your terminal or command prompt.
       - Run the compiled code using `java BooleanExpressionsDemo`.

   **Conclusion**
   This exercise reinforces the use of boolean variables, relational operators, and logical operators in Java.  These are fundamental building blocks for creating programs that can make decisions based on different conditions.  By combining these elements, you can create complex logic that controls the flow of your program.  Remember to focus on readability, clarity, and proper use of operators to ensure your code is correct and maintainable.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 04 - Session 01 - Exercise 01"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
