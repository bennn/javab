package com.sun.tools.javap.resources;

public final class javap extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.bad.constant.pool", "error while reading constant pool for {0}: {1}" },
            { "err.bad.innerclasses.attribute", "bad InnerClasses attribute for {0}" },
            { "err.class.not.found", "class not found: {0}" },
            { "err.crash", "A serious internal error has occurred: {0}\nPlease file a bug report, and include the following information:\n{1}" },
            { "err.end.of.file", "unexpected end of file while reading {0}" },
            { "err.file.not.found", "file not found: {0}" },
            { "err.h.not.supported", "-h is no longer available - use the 'javah' program" },
            { "err.incompatible.options", "bad combination of options: {0}" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "invalid argument for option: {0}" },
            { "err.ioerror", "IO error reading {0}: {1}" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.no.SourceFile.attribute", "no SourceFile attribute" },
            { "err.no.classes.specified", "no classes specified" },
            { "err.not.standard.file.manager", "can only specify class files when using a standard file manager" },
            { "err.prefix", "Error:" },
            { "err.source.file.not.found", "source file not found" },
            { "err.unknown.option", "unknown option: {0}" },
            { "err.verify.not.supported", "-verify not supported" },
            { "main.opt.bootclasspath", "  -bootclasspath <path>    Override location of bootstrap class files" },
            { "main.opt.c", "  -c                       Disassemble the code" },
            { "main.opt.classpath", "  -classpath <path>        Specify where to find user class files" },
            { "main.opt.constants", "  -constants               Show static final constants" },
            { "main.opt.cp", "  -cp <path>               Specify where to find user class files" },
            { "main.opt.help", "  -help  --help  -?        Print this usage message" },
            { "main.opt.l", "  -l                       Print line number and local variable tables" },
            { "main.opt.p", "  -p  -private             Show all classes and members" },
            { "main.opt.package", "  -package                 Show package/protected/public classes\n                           and members (default)" },
            { "main.opt.protected", "  -protected               Show protected/public classes and members" },
            { "main.opt.public", "  -public                  Show only public classes and members" },
            { "main.opt.s", "  -s                       Print internal type signatures" },
            { "main.opt.sysinfo", "  -sysinfo                 Show system info (path, size, date, MD5 hash)\n                           of class being processed" },
            { "main.opt.v", "  -v  -verbose             Print additional information" },
            { "main.opt.version", "  -version                 Version information" },
            { "main.usage", "Usage: {0} <options> <classes>\nwhere possible options include:" },
            { "main.usage.summary", "Usage: {0} <options> <classes>\nuse -help for a list of possible options" },
            { "note.prefix", "Note:" },
            { "warn.Xold.not.supported", "-Xold is no longer available" },
            { "warn.prefix", "Warning:" },
            { "warn.unexpected.class", "Binary file {0} contains {1}" },
        };
    }
}
