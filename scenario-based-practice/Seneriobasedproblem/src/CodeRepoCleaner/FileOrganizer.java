package CodeRepoCleaner;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileOrganizer {

    public static Map<FileType, List<File>> categorizeFiles(List<Path> paths)
            throws IOException {

        Map<FileType, List<File>> map = new EnumMap<>(FileType.class);

        for (Path path : paths) {
            FileType type = FileAnalyzer.analyze(path);
            map.computeIfAbsent(type, k -> new ArrayList<>())
               .add(path.toFile());
        }
        return map;
    }

    public static void moveFiles(Map<FileType, List<File>> map, Path baseDir)
            throws IOException {

        for (FileType type : map.keySet()) {
            Path targetDir = baseDir.resolve(type.name());
            Files.createDirectories(targetDir);

            for (File file : map.get(type)) {
                Files.move(file.toPath(),
                        targetDir.resolve(file.getName()),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }
}
