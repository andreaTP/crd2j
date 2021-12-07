package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

public class WritableCRCompilationUnit {

    private CompilationUnit cu;
    private List<String> classNames;

    WritableCRCompilationUnit(CompilationUnit cu, List<String> classNames) {
        this.cu = cu;
        this.classNames = classNames;
    }

    public void writeAllJavaClasses(File basePath) {
        try {
            for (var cn : this.classNames) writeJavaClass(basePath, cn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void writeJavaClass(File basePath, String name) throws IOException {
        var clazz = cu.getClassByName(name);
        assert(clazz.isPresent());

        var content = new StringBuilder();
        cu.getPackageDeclaration().ifPresent((p) -> content.append(p));
        content.append(clazz.get().toString());

        writeToFile(
                basePath.toPath().resolve(name + ".java").toFile(),
                content.toString());
    }

    private void writeToFile(File file, String str) throws IOException {
        var fileWriter = new FileWriter(file);
        var printWriter = new PrintWriter(fileWriter);
        try {
            printWriter.println(str);
        } finally {
            printWriter.flush();
            printWriter.close();
        }
    }

    private static File createFolders(Optional<String> pkg, File folder) {
        var destFolder = folder.toPath();
        if (pkg.isPresent()) {
            for (var p: pkg.get().split("\\.")) {
                System.out.println(p);
                destFolder = destFolder.resolve(p);
            }
        }
        destFolder.toFile().mkdirs();
        return destFolder.toFile();
    }

}