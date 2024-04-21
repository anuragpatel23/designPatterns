<h1>Prototype Design Pattern</h1>
<br/>
Concept here is to copy an existing object rather than creating a new object from scratch, because creating a new object<br/>
can be costly.
This pattern saves costly resources and time , specially when the created object is complex and heavy.

Shallow Copy Vs Deep Copy
When we create a copy of one object then all the primitive values are copied from the object as it is, but if that<br/>
object is having any object inside it then the reference of that object is copied not the new object. So here the<br/>
problem will be if you change the value of the object inside the cloned object then it will change the values even for<br/>
the main object also, which is not the expected behaviour.
So to overcome this the concept of Deep copy comes.
<br/>
<b>Prototype is by default shallow copy</b>

When we need to implement the Deep copy then, while overriding the clone() method, we need to create a new object and<br/>
put the values respectively so that it creates new object and then assign value to it. Instead of copying the reference of the object.
