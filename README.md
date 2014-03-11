javab
=====

Slightly modified Java compiler. Tracks shape use. It's really not much.

Building
--------
`cd langtools/make; sh blg-build.sh`

You may need to edit the location of `JAVA_HOME` in the `blg-build.sh` script.

Running
-------
Building generates an executable in `dist/bootstrap/lib/javac.jar`.
Easiest way to call this is through a script in `dist/bootstrap/bin/`.
Both `javab` and `myjavac` are good choices, just edit the paths for your java installation.

Editing
-------
Everything interesting is in `langtools/src/share/classes/com/sun/tools/javac/`.

* `util/Shapes.java` lists the known shapes
* `comp/Check.java` checks for shapes
* `resources/compiler.properties` defines notes, errors, and warnings, including the ones for SHAPE ABUSE

Bye
---
Ok Future Ben, that's all I've got for you. Enjoy
