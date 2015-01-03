package org.elixir_lang.parser_definition;

/**
 * Created by luke.imhoff on 8/3/14.
 */
public class BinaryWholeNumberParsingTestCase extends ParsingTestCase {
    public void testInvalidAndValidDigits() {
        doTest(true);
    }

    public void testInvalidDigits() {
        doTest(true);
    }

    public void testNoDigits() {
        doTest(true);
    }

    public void testObsoleteNoDigits() {
        doTest(true);
    }

    public void testObsoleteValid() {
        doTest(true);
    }

    public void testValidDigits() {
        doParsingAndQuoting();
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/binary_whole_number_parsing_test_case";
    }
}
