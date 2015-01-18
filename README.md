javab
=====

Slightly modified Java 7 compiler. Tracks shape use. It's really not much.

Building
--------
Set your `JAVA_HOME` variable, then run:
`cd langtools/make; sh blg-build.sh`

Running
-------
Building generates an executable in `dist/bootstrap/lib/javac.jar`.
Easiest way to call this is through the script `dist/bootstrap/bin/javab`.
Edit this script with the right paths, then symlink it to `/usr/bin`.

Editing
-------
Everything interesting is in `langtools/src/share/classes/com/sun/tools/javac/`.

* `util/Shapes.java` lists the known shapes
* `comp/Check.java` checks for shapes
* `resources/compiler.properties` defines notes, errors, and warnings, including the ones for SHAPE ABUSE

Remember
--------
99% of this code belongs to Java, not me. Thanks Java.

Bye
---
Ok Future Ben, that's all I've got for you. Enjoy
