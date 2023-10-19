import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tree {
    private File tree;
    String record;

    public Tree() throws IOException {
        File file = new File("Tree");
        if (!file.exists())
            file.createNewFile();

    }

    public void add(String fileName) throws IOException {
        File fileToAdd = new File(fileName);
        if (!fileToAdd.exists()) {
            String isTree = fileName.substring(0, 6);
            if (!isTree.equals("tree: ")) {
                throw new FileNotFoundException("Invalid file to add");
            }
        }
        if (fileToAdd.exists()) {
            String fileContents = Blob.readFile(fileToAdd);
            String hashOfFile = sha1(fileContents);

            String newEntryForTree = "blob: " + hashOfFile + " : " + fileName;

            // write the entry to the tree
            Blob.writeToFile(fileName, fileContents); // write to file and a read to file method- call to it **

        }

        else {
            String newFolderEntryForTree = fileName;

            // String fileContents;
            Blob.writeToFile(fileName, fileContents);
        }
    }

    public void remove(String target) throws IOException {
        Arraylist<String>
    }

}
