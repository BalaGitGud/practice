package com.Te.Assignments;

public class TypeCastingMain {

	public static void main(String[] args) {

		TypeCastingA ref = new TypeCastingB();// Upcasting

//      ref.pull() (we cannot do this, upcasting's reference variable cannot access Sub-class properties
		ref.disp();// only implementation occurs
		ref.push();
		
		TypeCastingB obj=(TypeCastingB) ref;//casting statement, note that upcasting is neccessary (line no : 7)
		obj.disp();
		obj.pull();
		obj.push();
		

	}

}
