// javab
package com.sun.tools.javac.util;

/**
 *  <p><b>This is NOT part of any supported API.
 *  If you write code that depends on this, you do so at your own risk.
 *  This code and its internal interfaces are subject to change or
 *  deletion without notice.</b>
 */
public class Shapes {
	
	public enum SHAPE {
		OK,
		NOTOK,
		// 2013-08-08 handled later, in recursive calls to the visitor
		//TOPLEVEL, // Meaning it can't appear anywhere but the toplevel in type args
	};
	
	// Keep this updated with all known shapes
	public static final String[] allShapes = {
	    "de.nava.informa.core.WithChildrenMIF", 
	    "edu.rice.cs.drjava.model.Finalizable",
	    "edu.umd.cs.findbugs.ba.AnnotationEnumeration", 
	    "edu.umd.cs.findbugs.graph.AbstractEdge", 
	    "edu.umd.cs.findbugs.graph.AbstractVertex", 
	    "edu.umd.cs.findbugs.graph.GraphEdge", 
	    "edu.umd.cs.findbugs.graph.GraphVertex", 
	    "net.sourceforge.pmd.dcd.graph.MemberNode", 
	    "org.apache.hadoop.io.WritableComparable", 
	    "org.junit.runners.model.FrameworkMember", 
	    "org.drools.core.factmodel.traits.TraitableBean",
	    "org.drools.core.util.AbstractBaseLinkedListNode",
	    "org.drools.core.util.Entry",
	    "org.drools.core.util.LinkedList",
	    "org.drools.core.util.LinkedListNode",
	    "java.lang.Enum", 
	    "java.lang.Comparable",
	    };
	
	public static boolean isShape(com.sun.tools.javac.code.Type t) {
		// blg59: Can I do better? Unfortunately the shapes themselves are strings 
		return isShape(t.toString());
	}
	
	public static boolean isShape(String s) {
		for (String shapeName : allShapes) {
			if (s.equals(shapeName)) {
				return true;
			}
		}
		return false;
	}
}

