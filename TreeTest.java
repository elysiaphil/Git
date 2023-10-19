import java.beans.Transient;
import java.io.File;
import java.io.IOException;

public class TreeTest {

    private static final String TEST_FILE = null;

    // good unit test, makes sure that my constructor works properly
    // generate a tree file
    // @Test
    @DisplayName("Testing the tree constructor to make a tree file")
    public void testTreeConstructor() throws IOException {
        Tree tree = new Tree(); // should create a Tree file

        File treeFile = new File("Tree");
        // assertTrue(treeFile.exists());
    }

    // @Test
    @DisplayName("Testing if I can write to the tree")
    public void testWriteToTree() {
        // Tree tree = new Tree();

        File treeFile = new File("Tree");
        // assertTrue(treeFile.exists());

        File testFile = new File(TEST_FILE);
        Object fileContents;
        // String fileSha = Blob.sha1(fileContents);

        // tree.add("blob: " + fileSha + " : " + TEST_FILE);
    }

}
