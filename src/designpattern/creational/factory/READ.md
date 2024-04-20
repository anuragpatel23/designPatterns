<h1>Factory Design Pattern</h1><br/>
<p>
When there is superclass and multiple subclasses and we want to get the object of subclass based on the input and requirement.
Then we create a factory class which takes the responsibility of creating object of class based on inputs.

Advantages of factory pattern:
1- Focus on creating object for interface rather than implementation
2- Loose coupling and more robust code

So super class is mostly the interface or abstract class.
</p>

Here we have the interface created and while creating the 2 new classes we have implements respective type of employees.

Now to create object using factory pattern. We will create a Factory class which will take input and based on that it will return the class
