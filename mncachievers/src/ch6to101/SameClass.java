package ch6to101;

public class SameClass {
private int pri;
int nomod;
protected int pro;
public int pub;
public void met() {
	System.out.println(pri);
	System.out.println(nomod);
	System.out.println(pro);
	System.out.println(pub);
}
}

class SamePackNonSub{
	public void met() {
		SameClass obj = new SameClass();
		System.out.println();
	}
}

class SamePackSub extends SameClass{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
	}
}