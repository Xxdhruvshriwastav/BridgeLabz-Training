package CodeRepoCleaner;

import java.nio.file.*;
import java.util.List;
import java.util.Map;
import java.io.File;

public class CodeRepoCleanerApp {

    public static void main(String[] args) throws Exception {

        Path rootDir = Paths.get("D://Java//practice");

        // Step 1: Scan
        List<Path> javaFiles = FileScanner.scanJavaFiles(rootDir);

        // Step 2: Optional Filtering
        javaFiles = FileFilter.filterBySize(javaFiles, 5_000);

        // Step 3: Categorize
        Map<FileType, List<File>> categorized =
                FileOrganizer.categorizeFiles(javaFiles);

        // Step 4: Organize
        FileOrganizer.moveFiles(categorized, rootDir);

        System.out.println("CodeRepoCleaner completed successfully.");
    }
}
