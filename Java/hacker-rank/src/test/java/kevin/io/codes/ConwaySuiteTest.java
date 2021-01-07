package kevin.io.codes;

import org.junit.jupiter.api.Test;

class ConwaySuiteTest {

    @Test
    void shouldDrawNextLineOfConwaySuite() {
        expectedConwayLines("1", "1", "1 1");
        expectedConwayLines("2", "2", "1 2");
        expectedConwayLines("2 2", "2 2", "2 2");
        expectedConwayLines("3 3", "3 3", "2 3");
        expectedConwayLines("2 1", "2 1", "1 2 1 1");
        expectedConwayLines("2 1 3 3", "2 1 3 3", "1 2 1 1 2 3");
        expectedConwayLines("2 1 3 1", "2 1 3 1", "1 2 1 1 1 3 1 1");
    }

    public void expectedConwayLines(String line, String... expectedLines) {
       // assertEquals(String.join("\n", expectedLines), new ConwaySuite().draw(line));
    }

}