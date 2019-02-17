1. Whta is JPMS (Java Platform Module System). ?

A.Definition:
	Jpms is an Module Programming insted of Jar File.
	We are uysing Traditional Jar file Aproach before Java9, but with Jar File Aproach
	there are some problems are there those problems are called Jar Hell
	to over come this proble this JPMS concept comes in Java9.

Advantages:
	1.In the moduler programming JVM is going to check at the begining only
	all the dependentabl thing are available are not. 
	(there for there no chance of NoClassDefFoundError)

	2. if i want to export only 1-package so then other package will never touch by other.

	3. JRE, rt.jar are divided into Module, which module are required only that module 
		my Jre will use now the size of JRE is by default become decresed

Problems with before Java-9
	
	fig: Jar Hell or Class Path Hell
	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	|(ClassFile, Interface, Enum) --into--> Packages ---into--> Jar Filers		|
	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		Problems
		1. ClassNotFoundException
		2. Version Conflict
		3. Security Problems
		4. Jdk|Jre having Monolithic Structure and Bigger in size.

B.Histry



