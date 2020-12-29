package kevin.io.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConwaySuite {

    private final String SPACE = " ";

    public String draw(String line) {
        String resultSuite;

        if (isMoreThanOneLineStart(line)) {
            resultSuite = getTheNextSuiteChunks(line);
        } else resultSuite = getFirstSuiteLine(line) + getNextSuiteLine(line);

        return resultSuite;
    }

    private String getTheNextSuiteChunks(String line) {
        String resultSuite;
        List<String> chunks = new ArrayList<>();
        final String[] linesChunks = line.split(SPACE);
        final List<String> transformedChunks = Arrays.stream(linesChunks)
                .map(l -> l.length() + SPACE + l)
                .collect(Collectors.toList());


        resultSuite = getFirstSuiteLine(line) + String.join(SPACE, transformedChunks);
        return resultSuite;
    }

    private String getNextSuiteLine(String line) {
        return line.length() + SPACE + line;
    }

    private String getFirstSuiteLine(String line) {
        final String LINE_JUMP = "\n";
        return line + LINE_JUMP;
    }

    private boolean isMoreThanOneLineStart(String line) {
        return line.length() > 1;
    }
}
