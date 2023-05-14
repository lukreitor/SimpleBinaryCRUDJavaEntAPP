package Controller;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author auxlu
 */
public abstract class FileController {
    // Declaring a protected instance variable called "archive" of type "File" and
    // initializing it to
    // null. The "protected" keyword means that the variable can only be accessed
    // within the class and
    // its subclasses.
    protected File archive = null;
    // The line `protected boolean modified;` is declaring a protected instance
    // variable called
    // "modified" of type boolean. It is not initializing it to any value. This
    // variable is likely used
    // to keep track of whether the file has been modified or not. However, since it
    // is not used or
    // initialized anywhere in the code provided, its purpose is unclear.
    protected boolean modified;

    public abstract boolean read();

    /**
     * This is an abstract method that writes an ArrayList of objects to a file with
     * the given filename
     * and append mode.
     * 
     * @param objects  An ArrayList of objects that will be written to the file.
     * @param fileName The name or path of the file to which the ArrayList of
     *                 objects will be written.
     * @param append   The "append" parameter is a boolean value that determines
     *                 whether the data should
     *                 be appended to an existing file or overwrite the existing
     *                 file. If "append" is true, the data
     *                 will be added to the end of the file. If "append" is false,
     *                 the existing file will be
     *                 overwritten with
     * @return A boolean value is being returned.
     */
    public abstract boolean write(ArrayList<Object> objects, String fileName, boolean append);

    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return archive;
    }

    /**
     * This Java function sets the value of a file object called "archive".
     * 
     * @param file The parameter "file" is of type "File", which represents a file
     *             or directory path in
     *             the file system. It is used to set the value of the instance
     *             variable "archive" to the specified
     *             file.
     */
    public void setArchive(File file) {
        archive = file;
    }

}
