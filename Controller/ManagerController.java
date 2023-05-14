package Controller;

import DTO.Mappers.EGender;
import Model.Manager;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author auxlu
 */
public class ManagerController {
    // Initializing an instance variable called "managers" as an empty ArrayList of
    // Manager objects.
    // This variable is used to store a list of Manager objects in the
    // ManagerController class.
    private ArrayList<Manager> managers = new ArrayList<>();
    // `private BinaryFileController fileController;` is declaring a private
    // instance variable of type
    // `BinaryFileController` called `fileController`. This variable is used to
    // create an object of the
    // `BinaryFileController` class, which is used to read and write data to binary
    // files.
    private BinaryFileController fileController;

    public ManagerController() {
        fileController = new BinaryFileController();
        managers = new ArrayList<>();
    }

    /**
     * This function adds a new manager to a list of managers with the given
     * information.
     * 
     * @param CPF         The CPF (Cadastro de Pessoas Físicas) is a unique
     *                    identification number assigned to
     *                    Brazilian citizens and residents for tax and social
     *                    security purposes.
     * @param username    The username of the manager being added to the system.
     * @param firstName   The first name of the manager being added to the system.
     * @param lastName    The last name of the manager being added to the system.
     * @param email       The email address of the manager being added to the
     *                    system.
     * @param password    A string representing the password of the manager being
     *                    added to the system.
     * @param phoneNumber A string representing the phone number of the manager
     *                    being added.
     * @param birthDate   birthDate is a parameter of type LocalDate, which
     *                    represents a date (year,
     *                    month, and day) without a time zone. It is used to set the
     *                    birth date of a Manager object in the
     *                    addManager method.
     * @param gender      EGender is an enumerated type that represents the gender
     *                    of a person. It can have
     *                    three possible values: MALE, FEMALE, or OTHER.
     * @param city        The city where the manager is located.
     * @param state       The state parameter refers to the state where the manager
     *                    is located or where their
     *                    gym is located. It is a string value.
     * @param country     A string representing the country where the manager is
     *                    located.
     * @param gym         The gym parameter is a String that represents the name of
     *                    the gym that the manager is
     *                    associated with.
     */
    public void addManager(String CPF, String username, String firstName, String lastName, String email,
            String password,
            String phoneNumber,
            LocalDate birthDate, EGender gender, String city, String state,
            String country, String gym) {
        Manager manager = new Manager();
        manager.setCPF(CPF);
        manager.setUsername(username);
        manager.setFirstName(firstName);
        manager.setLastName(lastName);
        manager.setEmail(email);
        manager.setPassword(password);
        manager.setPhoneNumber(phoneNumber);
        manager.setBirthDate(birthDate);
        manager.setGender(gender);
        manager.setCity(city);
        manager.setState(state);
        manager.setCountry(country);
        manager.setGym(gym);

        managers.add(manager);

    }

    /**
     * This function saves an ArrayList of Manager objects to a file using a
     * FileController object.
     * 
     * @param managers An ArrayList of Manager objects that needs to be saved to a
     *                 file.
     * @param fileName The name of the file where the objects will be saved.
     * @param append   A boolean value that determines whether the data should be
     *                 appended to an existing
     *                 file or overwrite the existing file. If append is true, the
     *                 data will be added to the end of the
     *                 file. If append is false, the existing file will be
     *                 overwritten with the new data.
     * @return A boolean value of true is being returned.
     */
    public boolean saveObjectsToFile(ArrayList<Manager> managers, String fileName, boolean append) {
        ArrayList<Object> objects = new ArrayList<Object>(managers);
        fileController.setArchive(new File(fileName));
        return fileController.writeToFile(objects, fileName, append);
    }

    /**
     * This function updates a file with an ArrayList of Manager objects and returns
     * a boolean value
     * indicating success.
     * 
     * @param managers An ArrayList of Manager objects that need to be updated in
     *                 the file.
     * @param filepath The filepath parameter is a string that represents the path
     *                 to the file where
     *                 the objects will be updated. It should include the file name
     *                 and extension.
     * @return A boolean value of true is being returned.
     */
    public boolean updateObjectsToFile(ArrayList<Manager> managers, String filepath) {
        ArrayList<Object> objects = new ArrayList<Object>(managers);
     
        return fileController.update(filepath, objects);
    }

    /**
     * The function attempts to open a binary file, read its contents, and return a
     * boolean indicating
     * success or failure.i was using a single binary file to read the contents of
     * the manager objects, so i used this function to read the contents of the
     * binary file and store them in the managers ArrayList.
     * 
     * @param filePath a String representing the file path of the binary file to be
     *                 opened.
     * @return The method returns a boolean value. It returns true if the file was
     *         successfully read
     *         and the data was stored in the managers ArrayList, and false if there
     *         was an error reading the
     *         file.
     */
    public boolean open(String filePath) {
        fileController = new BinaryFileController(filePath);
        if (fileController.read()) {
            ArrayList<?> list = fileController.getObjects();
            if (list.get(0) instanceof Manager) {
                managers = new ArrayList<>();
                for (Object obj : list) {
                    Manager manager = (Manager) obj;
                    managers.add(manager);
                }
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to read file");
            return false;
        }
        return false;
    }

    /**
     * This function returns an ArrayList of Manager objects.
     * 
     * @return An ArrayList of Manager objects is being returned.
     */
    public ArrayList<Manager> getManagers() {
        return managers;
    }

    /**
     * This function sets the list of managers for a given object.
     * 
     * @param managers An ArrayList of Manager objects that will be set as the value
     *                 of the "managers"
     *                 instance variable in the current object. This method is a
     *                 setter method that allows you to
     *                 update the value of the "managers" instance variable with a
     *                 new ArrayList of Manager objects.
     */
    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    /**
     * This Java function adds a list of new managers to an existing ArrayList of
     * managers.
     * 
     * @param newManagers An ArrayList of Manager objects that contains the new
     *                    managers to be added to
     *                    the existing list of managers. The method adds all the
     *                    elements of the newManagers list to the
     *                    end of the existing managers list.
     */
    public void addManagers(ArrayList<Manager> newManagers) {
        managers.addAll(newManagers);
    }
}
