package ch.martinelli.intellijtracestreambug;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class IntellijTraceStreamBugApplicationTests {

    private Map<String, List<String>> map = Map.of("abc", List.of("123", "456"));

    @Test
    void test() {
        map.get("abc").stream().filter(s -> s.equalsIgnoreCase("123")).collect(Collectors.toList());
    }

}
