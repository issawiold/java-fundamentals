the basics of java:

java is an object oriented language where you need to compile the code before you can execute it  .

java is a strong type language which means that you need to declare the type of the variable before you could initiate it amd you can't change it's type after that .

the class name of the code must always match the name of the file 

**data in java **

**=============**

there are two types of data in java

*primitive* or  *non-primitive* ,

primitive data types are declared with small letters taken word in java , such as int , char , etc,,,,

there is a limited number of the primitive data types , this data type refers to it's own value 

non-primitive data types declaration begins with a capital letter in java such as **S**tring , there is infinite number of them since you can create your very own data type . this data type refers to a certain address inside the memory 

**variables in java**

**==============**

there is multiple types of variables in java 

***non-static ******variables* **are the variables which can change from time to time or depending on which part of the code they are executed at

***static variable* **the opposite of the previous type they remain unchanged for the entire code 

***local variables* **variables which are declared inside a function which simply means that they are only accessible within that function

***parameters* **variables declared as input to a certain function , we only give them a value when calling that function , which is what differentiate them from the local variables mentioned before.

-----------

***variable names (and naming)*** in java are case sensitive , also you can begin your variable's name with a letter .$ or . _ , but you should always begin your variable name with a letter for some reason .

you can use a mix of letters , numbers , dollar sign , and underscore , but always recommended to stick with the letters and numbers .

**operators in java**

**====================**

there is two types of operators in java 

***mathematical operators* , **any operator that changes the value of the variable from a number to another number which includes * / + - % ++ -- etc.

***logical/rational operators* , **any operators which would result in either true or false , like  == ,>= ,<= ,||,&& etc...

**coding with java**

**================**

every single line of code in java must end with ;

**comparison**

1\. you can only use the == to compare two values only while using primitive data types

2\. use .equals()  when comparing non primitive types as == would always result in false since each one points to a different address in the memory

**type casting **

used to change a variable from one type and onto another . be careful  as the size/ the max/min limit of the new type must not be exceeded by the value of that variable otherwise you'll get an error.

to find it out use the name of the datatype.MAX_VALUE/.MIN_VALUE .

**if statement**

if(condition1){code1}else if(condition2){code2},,,,,,,else{codeN}

**switch statement**

vartype varname1 =switch(varname2){

case sametypeasvarname2->sametypeasvarname1

.

.

.

default->sametypeasvarname1};

**arrays**

values in array type array-name [ ]={  }

all the values within the array must follow that one type

you can access or edit any value by using the array-name[index]

**loops**

for(int i=0;i<arr.length;i++){code};

while(condition){code ; increment ;}

for-each(int num :nums){code}

**functions**

to create a function inside a class you begin by declaring it's type static or non-static after that you declar the type of data that function will return and the function can't return any other type , if the function doesn't return anything we use the word void following that between two parentheses you place the type and name of the parameters after that between two curly braces you can your code 

static return-data-type (parametertype parametername ....){code} 

**compilation of code **

to compile your java code use the terminal to navigate to the folder containing your java file

then use the commands

***javac filename.java***

javac is the name of the compiler of java

***then java filename ***

THE END