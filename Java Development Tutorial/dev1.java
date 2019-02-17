A.javac command
	We can use javac command to compile a   single or group of Java source file 
	1.	Javac  	[ options] Test.java
	2.   	Javac [ options]  A.Java B.Java C. Java
	3. 	Javac  [ options]  *.Java


B.java Command:
	We can compile any number of source  file at a time but we can run only one .class file at a time 
		Java   [ options]     Test 
			 - version
		  	-D 		(To set system property)
			-cp/-classpath
			-ep/-esa/-dsa/-da  (This things are related to assertion concept) 
B.Classpath:
	Classpath describe the location where required .class file are available, Java compiler and JVM will use classpath to locate
	required .class file.

	2. by default jvm will always searched in current working directory for the required .class file, if we set classpath explicitly
		then jvm will search in our specified classpath location. and jvm wont search in current working directory.

	3. How many way to set ClassPath.?
		1.Environment Veriables.  (permanent).
		2.set classpath = "C:\Program Files\Java\jdk-10.0.2" (...temp).
		3.java -cp "C:\Program Files\Java\jdk-10.0.2"  (... temp).

C.r File: (nothing but Zip file)
	
	CretaeJar File:
		1. jar -cvf nSense.jar Sense.class
		2. jar -cvf nSense.jar Sense.class, A.class, B.class ...
		3. jar -cvf nSense.jar *.class
		4. jar -cvf nSense.jar Sense.class *.*

	Extract Jar File (Unzip Jar File)
		1. jar -xvf nSense.jar

	Display Table contents present in Jar File
		1. jar -tvf nSense.jar

	Service Provider develop Jar File (create jar file)
	client using jar file.

	client:> javac -cp D:\nSense.jar MyClass.java
			java -cp .; D:\nSense.jar MyClass

D. System Properties
		
		public static void main(String[] args) {
			Properties p = System.getProperties();
			p.list(System.out);
		}

		For every System some persistent information will be mentain in the form of System Properties.
		this include name of the OS, java version, JVM vendor, User Country,

E. Java -D option:
	we can set System property explicitly from the command-prompt by using -D option.
	e.g java -DnSense=Nonsense nSense  	(note: space is not allowed -D with propertName);
	NEED: customized our behaviour of java program 

 

	
