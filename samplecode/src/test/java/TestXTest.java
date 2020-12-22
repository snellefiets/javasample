import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestXTest {

    final CopyService copyService = new CopyService();
    public static final String TEST_OBJECT_NAME = "TestObject";

    @Test
    void should_be_avoided() {
        final XObject givenObject = new XObject("TestObject");
        final XObject returnObject = copyService.copyOf(givenObject);
        assertThat(returnObject.getName()).isEqualTo(givenObject.getName());
    }

    @Test
    void should_be_preferred() {
        final XObject returnObject = copyService.copyOf(new XObject(TEST_OBJECT_NAME));
        assertThat(returnObject.getName()).isEqualTo(TEST_OBJECT_NAME);
    }

}
