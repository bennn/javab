/*
 * Copyright (c) 1999, 2005, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.tools.javac.util;

/** Throwing an instance of
 *  this class causes (silent) termination of the main compiler method.
 *
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

