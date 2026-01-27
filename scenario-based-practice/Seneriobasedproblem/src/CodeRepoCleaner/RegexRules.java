package CodeRepoCleaner;

import java.util.regex.Pattern;

public class RegexRules {

    // Method names should start with lowercase (camelCase)
    public static final Pattern INVALID_METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)\\s+\\w+\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

    // Import statements
    public static final Pattern IMPORT_PATTERN =
            Pattern.compile("^import\\s+([\\w\\.]+);", Pattern.MULTILINE);
}