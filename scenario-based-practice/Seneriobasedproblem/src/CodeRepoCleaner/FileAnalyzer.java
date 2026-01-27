package CodeRepoCleaner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;

public class FileAnalyzer {

    public static FileType analyze(Path path) throws IOException {
        String content = Files.readString(path);

        boolean invalidMethod = hasInvalidMethodNames(content);
        boolean unusedImport = hasUnusedImports(content);

        if (invalidMethod) return FileType.ERRORS;
        if (unusedImport) return FileType.WARNINGS;
        return FileType.VALID;
    }

    private static boolean hasInvalidMethodNames(String content) {
        return RegexRules.INVALID_METHOD_PATTERN.matcher(content).find();
    }

    private static boolean hasUnusedImports(String content) {
        Matcher matcher = RegexRules.IMPORT_PATTERN.matcher(content);
        Set<String> imports = new HashSet<>();

        while (matcher.find()) {
            String imp = matcher.group(1);
            imports.add(imp.substring(imp.lastIndexOf('.') + 1));
        }

        for (String imp : imports) {
            if (!content.contains(imp + " ")) {
                return true;
            }
        }
        return false;
    }
}
