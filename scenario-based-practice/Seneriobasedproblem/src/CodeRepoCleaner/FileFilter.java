package CodeRepoCleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileFilter {

    public static List<Path> filterBySize(List<Path> files, long minSize) {
        return files.stream()
                .filter(p -> {
                    try {
                        return Files.size(p) > minSize;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Path> filterByModifiedDate(List<Path> files, long durationMillis) {
        long now = System.currentTimeMillis();

        return files.stream()
                .filter(p -> {
                    try {
                        return Files.getLastModifiedTime(p).toMillis()
                                > now - durationMillis;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}
