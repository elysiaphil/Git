import java.io.File;

public class Tree {
    private String fileName;

    // can create a blob
    public Tree(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {

        }
    }
}