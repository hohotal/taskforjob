import java.io.FileReader;
import java.io.IOException;
/**
 * Class for Parsing some documents
 * Contains static methods to use
 */
public class DocumentParser {
    private static final char DELIMITER = '\n';

    /**
     * Returns a list of Users
     *
     * @param path path to file
     * @return Array of Strings devided commas
     */
    public static String[] parser(String path) {
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            while (reader.ready()) {
                char temp = (char) reader.read();
                if (!Character.isWhitespace(temp))
                    builder.append(temp);
                if (temp == DELIMITER) {
                    builder.append(',');
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return String.valueOf(builder).split(",");
    }
}
