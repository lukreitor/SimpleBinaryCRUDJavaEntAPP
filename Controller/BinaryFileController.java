/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Client;
import Model.Manager;
import Model.Trainer;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author auxlu
 */
/**
 * The BinaryFileController class extends the FileController class and contains
 * variables and methods
 * for reading and writing objects to a binary file.
 */
public class BinaryFileController extends FileController {

    /**
     * 
     * The file path where data is stored
     */
    private String filePath;
    /**
     * 
     * The list of clients
     */
    private ArrayList<Client> clients = new ArrayList<>();
    /**
     * 
     * The list of trainers
     */
    private ArrayList<Trainer> trainers = new ArrayList<>();
    /**
     * 
     * The list of managers
     */
    private ArrayList<Manager> managers = new ArrayList<>();
    /**
     * 
     * The input stream reader for reading objects from a file
     */
    private ObjectInputStream reader = null;
    /**
     * 
     * The output stream writer for writing objects to a file
     */
    private ObjectOutputStream writer = null;

    // The above code is a constructor for a Java class called
    // "BinaryFileController". It does not
    // contain any code within its body.
    public BinaryFileController() {

    }

    // The above code is a constructor for a Java class called
    // `BinaryFileController`. It takes a
    // `String` parameter `filePath` and creates a new `File` object with the given
    // file path. It also
    // sets the `filePath` instance variable to the given file path.
    public BinaryFileController(String filePath) {
        archive = new File(filePath);
        this.filePath = filePath;
    }

    /**
     * This function closes a reader object if it is not null.
     */
    private void closeReader() {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This function closes a writer object if it is not null.
     */
    private void closeWriter() {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This function reads data from a file and stores it in the appropriate
     * ArrayList based on the
     * type of object read.
     * 
     * This code shows an implementation of the read() method which is part of a
     * class that reads objects from a file. The @Override annotation indicates that
     * this method overrides a method of the same signature from a parent class or
     * interface.
     * 
     * The method first checks if a file has been selected, and if not, displays a
     * message dialog indicating that no file has been selected and returns false.
     * If a file has been selected, the method attempts to read an object from the
     * file using an ObjectInputStream. If the object read from the file is an
     * instance of an ArrayList, the method checks the type of objects in the list
     * to determine which list to set (clients, trainers, or managers). If the
     * object read from the file is not an ArrayList, the method simply returns
     * false.
     * 
     * If there are any exceptions during the reading process, the method prints the
     * stack trace and returns false. Finally, the method closes the
     * ObjectInputStream in a finally block to ensure that it is closed even if an
     * exception occurs.
     * 
     * @return The method is returning a boolean value.
     */
    @Override
    public boolean read() {
        if (archive == null) {
            JOptionPane.showMessageDialog(null, "No file selected");
            return false;
        }

        try {
            reader = new ObjectInputStream(new FileInputStream(archive));
            Object obj = reader.readObject();
            if (obj instanceof ArrayList<?>) {
                ArrayList<?> list = (ArrayList<?>) obj;
                if (list.get(0) instanceof Client) {
                    clients = (ArrayList<Client>) list;
                } else if (list.get(0) instanceof Trainer) {
                    trainers = (ArrayList<Trainer>) list;
                } else if (list.get(0) instanceof Manager) {
                    managers = (ArrayList<Manager>) list;
                }
                closeReader();
                return true;
            } else {
                closeReader();
                return false;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            closeReader();
            return false;
        } finally {
            closeReader();
        }
    }

    /**
     * This function writes an ArrayList of objects to a file using
     * ObjectOutputStream in Java.
     * 
     * @param objects  An ArrayList of objects that will be written to the file.
     * @param fileName The name/filepath of the file to write the objects to.
     * @param append   A boolean value indicating whether the data should be
     *                 appended to an existing file
     *                 or overwrite the file if it already exists. If set to true,
     *                 the data will be appended to the end
     *                 of the file. If set to false, the file will be overwritten
     *                 with the new data.
     * @return The method is returning a boolean value indicating whether the write
     *         operation was
     *         successful or not. It returns true if the write operation was
     *         successful and false if it was
     *         not.
     */
    @Override
    public boolean write(ArrayList<Object> objects, String fileName, boolean append) {
        try {
            if (!append && new File(fileName).exists()) {
                return false;
            }

            writer = new ObjectOutputStream(new FileOutputStream(fileName, append));
            writer.writeObject(objects);
            closeWriter();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            closeWriter();
            return false;
        } finally {
            closeReader();
        }
    }

    /**
     * This function writes an ArrayList of objects to a file with the specified
     * file name and append
     * mode.
     * 
     * @param objects  An ArrayList of objects that will be written to the file.
     * @param fileName The name of the file to which the ArrayList of objects will
     *                 be written.
     * @param append   A boolean value indicating whether to append the data to the
     *                 end of the file or
     *                 overwrite the existing file. If append is true, the data will
     *                 be added to the end of the file.
     *                 If append is false, the existing file will be overwritten
     *                 with the new data.
     * @return A boolean value is being returned.
     */
    public boolean writeToFile(ArrayList<Object> objects, String fileName, boolean append) {
        return write(objects, fileName, append);
    }

    /**
     * This function reads objects from a file using an ObjectInputStream and
     * returns them as an
     * ArrayList.
     * 
     * @return An ArrayList of Objects.
     */
    public ArrayList<Object> getObjects() {
        ArrayList<Object> objects = new ArrayList<>();
        try {
            reader = new ObjectInputStream(new FileInputStream(archive));
            Object obj;
            while ((obj = reader.readObject()) != null) {
                objects.add(obj);
            }
            closeReader();
        } catch (EOFException e) {
            // end of file reached
            closeReader();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            closeReader();
        }
        return objects;
    }

    /**
     * This Java function deletes a file if it exists and returns true, otherwise it
     * returns false.
     * 
     * @param filePath A string representing the path of the file to be deleted.
     * @return The method returns a boolean value indicating whether the file was
     *         successfully deleted
     *         or not. If the file exists and is deleted successfully, the method
     *         returns true. If the file does
     *         not exist or there is an error deleting the file, the method returns
     *         false.
     */
    public boolean delete(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            try {
                Files.deleteIfExists(file.toPath());
                return true;
            } catch (IOException e) {
                System.err.println(e.getMessage() + "Error Deleting File.");
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * This function updates the content of a file with a serialized ArrayList of
     * objects.
     * 
     * @param filePath A string representing the file path of the file to be
     *                 updated.
     * @param objects  An ArrayList of objects that needs to be serialized and
     *                 written to the file
     *                 specified by the filePath parameter.
     * @return The method returns a boolean value indicating whether the update was
     *         successful or not.
     *         It returns true if the file exists and the ArrayList was successfully
     *         serialized and written
     *         back to the file, and false if the file does not exist or if there
     *         was an error during the
     *         serialization or writing process.
     */
    public boolean update(String filePath, ArrayList<Object> objects) {
        File file = new File(filePath);
        if (file.exists()) {
            try {
                // Serialize the ArrayList
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(objects);
                byte[] bytes = baos.toByteArray();
                oos.close();

                // Write the modified file content back to the file
                Files.write(file.toPath(), bytes);

                return true;
            } catch (IOException e) {
                System.err.println(e.getMessage() + "Error Reading File.");
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * The function opens a file, reads an ArrayList of objects from it using
     * ObjectInputStream, and
     * returns the ArrayList or null if the file does not exist.
     * 
     * @param filePath A string representing the file path of the file to be opened
     *                 and read.
     * @return The method is returning an ArrayList of Objects that were read from
     *         the file specified
     *         by the filePath parameter. If the file does not exist or there is an
     *         error reading the file, the
     *         method returns null.
     */
    public ArrayList<Object> open(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                ArrayList<Object> objects = (ArrayList<Object>) ois.readObject();
                return objects;
            } catch (IOException | ClassNotFoundException e) {
                System.err.println(e.getMessage() + "Error Reding File.");
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * The function checks if a file with a given file name exists and returns a
     * boolean value.
     * 
     * @param fileName The path of the file that you want to check if it exists.
     * @return The method `fileExists` returns a boolean value indicating whether a
     *         file with the given
     *         `fileName` exists or not. If the file exists, the method returns
     *         `true`, otherwise it returns
     *         `false`.
     */
    public boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

}
