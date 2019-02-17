++++++++++++++++++
Var Args Argument*
++++++++++++++++++

public void (int... a)
this already release in 1.7

but if we use varargs with Generic, there may be chance of HeapPollution problem, it will show warning at Compile time
e.g public void method1(List<String>... x)

Note: To resolve this problem and dont show any Warning then go to this new Enhacement