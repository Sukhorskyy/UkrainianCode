package Main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    DataBase db;
    Authorization authorization;

    @BeforeEach
    void setUp() {
        db = new DataBase();
        authorization = new Authorization();
    }

    @Test
    void MainTest() {
        assertTrue(authorization.authorize(db));
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
