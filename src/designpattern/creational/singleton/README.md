<h1>Singleton Design Pattern</h1>
<p>When the objective is to allow only single time creation of the object and use it from other places then we prefer Singleton Pattern.
<br/>
<br/>
Example: Creating a database connection. We create it once but use it multiple time for our CRUD operations.
</p>

<p>How to create a Singleton Object?
<br/>
We know that once the Object of class is created then constructor is invoked. Here if we make the constructor as private.
<br/>

Steps for Making Car class singleton. <br/>
- Make Car class constructor Private
- But as soon as you make it private, then it's object cant be created
- That makes sure that we can't call the constructor of the class, so if we can't call the constructor then obviously we can't make the new object.
- But this will block the object creation even for the first time.
- Create a new static constructor method in which just put a check if the object already exist or not, if not then only create a new object
- Now the object will be created with the help of calling a getObject method
- This is LAZY way of object creation because object is not created till it is not called.
- We can also have a EAGER way to create a object.
</p>
<br/>

EAGER
- Pros: This gives easy implementation of Singleton
- Cons: Just because it will always create the object even if it's not required there could be a lot of memory
- wastage 
<br/>
LAZY
<br/>
- Pros: Object is not created unnecessarily, only if its needed its created.
- Cons: it will not perform as expected with threads. Suppose 2 threads call the same get method for the first
- time and both will get object as null and both will create that object.
- We can overcome with this problem by using threads in a Synchronized way.- 
- 1- Make the method as synchronized    - Method synchronization
- 2- Make that block where object is created as synchronized    - Block synchronization

--- 
<h3>How to break Singleton pattern?</h3>
<br/>
<h5>Using Reflection API</h5>

<br/>Solution to avoid breaking via Reflection
- if object is present then throw exception from inside Constructor
- use enum
<br/>

<h5>Using Serialization and deserialization</h5>
<br/>Solution to avoid breaking via Serialization
- Implement readResolve() method
  <br/>

<h5>Using Cloning</h5>
<br/>Solution to avoid breaking via Cloning
- return the same object while overriding the clone() method
  <br/>