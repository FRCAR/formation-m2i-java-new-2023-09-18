package com.bigcorp.project.main.record;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.RecordComponent;

public class RecordMain {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MonRecord mr = new MonRecord(3, "toto");
		
		for(RecordComponent rc : MonRecord.class.getRecordComponents()) {
			System.out.println("avec réflexion : " +  rc.getAccessor().invoke(mr, new Object[0]));
		};
		
		System.out.println(mr.nom());
		System.out.println(mr);
		
		System.out.println("Hashcode");
		System.out.println(mr.hashCode());
		System.out.println(new MonRecord(3, "toto").hashCode());
		System.out.println("Equals");
		System.out.println(new MonRecord(3, "toto").equals(mr));
		System.out.println("==");
		System.out.println(new MonRecord(3, "toto") == mr);
	}

}
