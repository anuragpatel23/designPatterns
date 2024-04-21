<h1>Builder Design Pattern</h1>

<p>In Factory patter there are some problems 
	<br/>1- if we have to pass many parameters to create object then it will be huge work for constructor. i.e suppose there are 50-60 parameters then we need to pass al of them in the same order just to create an object, if there is some optional parameter then we might need to overload a constructor without that parameter, etc…
	<br/>2- Some parameters might be optional
	<br/>3- Factory class takes the responsibility of creating object, if the object is heavy then all the complexity lies with the FActory class.

<br/>So in Builder pattern we create object step by step and finally return final object with desired values of attribute.
<br/>Builder is also very useful if you want to make immutable object.
</p>