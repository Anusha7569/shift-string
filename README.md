# shift-string
The first input is a string, and the second input is a number. The resulting string will be the first input with the characters position shifted by the amount entered on the second input.

# Prerequsites for this program : 
-> Install Eclipse in your system.
-> Create a Java Project and Enter the Project Name
-> Create a class with extension as .java
-> Place the java file attached here in the class file which you created and then Run the code.

# About the Program :
-> Input1 : must be string and it should not contain any numbers, so Read the string input to inputString variable.
-> Input2: must be number and it should not contain any characters, so Read the shift amount(integer) to shiftAmount variable.
-> Used "promptForString()" method to verify whether given input is valid or not.
-> Call the "shiftString()" method to perform the shifting.
  - checking if the entered Input2 is within the length of the string.
  - using substring() performing the shift.
  - the shift is performed as , given input2 as 2 and input1 as "abcdef" then as input2 is 2 shift last 2 characters to position 0 followed by remaining characters. So, output will be "efabcd"
    
