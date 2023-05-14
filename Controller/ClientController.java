package Controller;

import DTO.Mappers.EGender;
import Model.Client;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientController {
    // Declaring and initializing an instance variable `clients` of type
    // `ArrayList<Client>` as an empty
    // ArrayList. This variable is used to store a list of `Client` objects in the
    // `ClientController`
    // class.
    private ArrayList<Client> clients = new ArrayList<>();

    // Declaring a private instance variable `fileController` of type
    // `BinaryFileController`.
    private BinaryFileController fileController;

    // This is a constructor for the `ClientController` class. It initializes the
    // `fileController`
    // instance variable with a new instance of the `BinaryFileController` class and
    // initializes the
    // `clients` instance variable with a new empty `ArrayList<Client>`.
    public ClientController() {
        fileController = new BinaryFileController();
        clients = new ArrayList<>();
    }

    // The above code is declaring private instance variables for a file path, and
    // three ArrayLists of
    // objects for clients, trainers, and managers. It also declares
    // ObjectInputStream and
    // ObjectOutputStream variables for reading and writing objects to a file.
    /**
     * The function adds a new client to a list of clients with various personal and
     * financial
     * information.
     * 
     * @param CPF            The Brazilian individual taxpayer registry
     *                       identification number. It is a unique
     *                       identifier for each Brazilian citizen.
     * @param username       The username of the client being added to the system.
     * @param firstName      The first name of the client being added to the system.
     * @param lastName       The last name of the client being added to the system.
     * @param email          The email of the client being added to the system.
     * @param password       The password of the client being added to the system.
     * @param phoneNumber    A string representing the phone number of the client.
     * @param birthDate      A LocalDate object representing the client's birth
     *                       date.
     * @param gender         EGender is an enumerated type that represents the
     *                       gender of the client. It can
     *                       have three possible values: MALE, FEMALE, or OTHER.
     * @param city           The city where the client resides.
     * @param state          The state where the client resides. For example, if the
     *                       client lives in California,
     *                       the state parameter would be "CA".
     * @param country        The country where the client resides or is from.
     * @param occupation     The occupation of the client, i.e., their profession or
     *                       job.
     * @param income         The income of the client, represented as a double.
     * @param cardHolderName The name of the person who owns the credit/debit card
     *                       being used for
     *                       payment.
     * @param cardNumber     The credit/debit card number of the client.
     * @param expirationDate The expiration date of the client's credit card in the
     *                       format "MM/YY".
     * @param securityCode   The security code is a three or four-digit code printed
     *                       on the back or front
     *                       of a credit or debit card. It is used as an additional
     *                       security measure to verify that the
     *                       person making the purchase is the actual cardholder.
     * @param billingAddress The billing address of the client, which is the address
     *                       where the client
     *                       receives their bills or invoices.
     * @param hobbies        A list of strings representing the hobbies of the
     *                       client.
     */
    public void addClient(String CPF, String username, String firstName, String lastName, String email,
            String password, String phoneNumber, LocalDate birthDate, EGender gender, String city,
            String state, String country, String occupation, double income, String cardHolderName,
            String cardNumber, String expirationDate, String securityCode, String billingAddress,
            List<String> hobbies) {
        Client client = new Client();
        client.setCPF(CPF);
        client.setUsername(username);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setPassword(password);
        client.setPhoneNumber(phoneNumber);
        client.setBirthDate(birthDate);
        client.setGender(gender);
        client.setCity(city);
        client.setState(state);
        client.setCountry(country);
        client.setOccupation(occupation);
        client.setIncome(income);
        client.setCardholderName(cardHolderName);
        client.setCardNumber(cardNumber);
        client.setExpirationDate(expirationDate);
        client.setSecurityCode(securityCode);
        client.setBillingAddress(billingAddress);
        client.setHobbies(hobbies);

        clients.add(client);
    }

    /**
     * This function saves an ArrayList of Client objects to a file using a
     * FileController object.
     * 
     * @param clients  An ArrayList of objects of type Client that contains the data
     *                 to be saved to a
     *                 file.
     * @param fileName The name of the file where the objects will be saved.
     * @param append   A boolean value indicating whether to append the objects to
     *                 the end of the file or
     *                 overwrite the file with the new objects. If append is true,
     *                 the objects will be added to the end
     *                 of the file. If append is false, the file will be overwritten
     *                 with the new objects.
     * @return A boolean value of true is being returned.
     */
    public boolean saveObjectsToFile(ArrayList<Client> clients, String fileName, boolean append) {
        ArrayList<Object> objects = new ArrayList<Object>(clients);
        fileController.setArchive(new File(fileName));
        return  fileController.writeToFile(objects, fileName, append);
    }

    /**
     * This function updates an ArrayList of Client objects to a file using a file
     * controller.
     * 
     * @param clients  An ArrayList of objects of type Client.
     * @param fileName The name, path of the file to which the ArrayList of Client
     *                 objects
     *                 will be written.
     * @return A boolean value of true or false depending on what the update method of the file controller retunrs
     */
    public boolean updateObjectsToFile(ArrayList<Client> clients, String fileName) {
        ArrayList<Object> objects = new ArrayList<Object>(clients);
        return  fileController.update(fileName, objects);
    }

    /**
     * This function opens a binary file, reads its contents, and returns a boolean
     * value indicating
     * whether the operation was successful or not. it was being used to get a
     * single client from a binary file with alot of objects in it. but it was not
     * working properly so i commented it out.
     * 
     * @param filePath A string representing the file path of the binary file to be
     *                 opened.
     * @return The method returns a boolean value. It returns true if the file was
     *         successfully read
     *         and the list of clients was populated, and false if there was an
     *         error reading the file or if
     *         the list of clients could not be populated.
     */
    public boolean open(String filePath) {
        fileController = new BinaryFileController(filePath);
        if (fileController.read()) {
            ArrayList<?> list = fileController.getObjects();
            if (list.get(0) instanceof Client) {
                clients = new ArrayList<>();
                for (Object obj : list) {
                    Client client = (Client) obj;
                    clients.add(client);
                }
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to read file");
            return false;
        }
        return false;
    }

    // not using this function anymore
    public Client getClientByCPF(String filePath, String cpf) {
        BinaryFileController fileController = new BinaryFileController(filePath);
        if (fileController.read()) {
            ArrayList<?> list = fileController.getObjects();
            if (list.get(0) instanceof Client) {
                ArrayList<Client> clients = new ArrayList<>();
                for (Object obj : list) {
                    Client client = (Client) obj;
                    clients.add(client);
                }
                for (Client client : clients) {
                    if (client.getCPF().equals(cpf)) {
                        return client;
                    }
                }
                JOptionPane.showMessageDialog(null, "No client found with the given CPF");
                return null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to read file");
            return null;
        }
        return null;
    }

    /**
     * The function returns an ArrayList of Client objects.
     * 
     * @return An ArrayList of Client objects is being returned.
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * This function sets the list of clients for a given object.
     * 
     * @param clients an ArrayList of objects of type Client. This method sets the
     *                value of the
     *                instance variable "clients" to the ArrayList passed as a
     *                parameter.
     */
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    /**
     * The function adds a list of new clients to an existing list of clients.
     * 
     * @param newClients An ArrayList of objects of type Client that contains the
     *                   new clients to be
     *                   added to the existing list of clients. The method adds all
     *                   the elements of this ArrayList to the
     *                   end of the existing list of clients.
     */
    public void addClients(ArrayList<Client> newClients) {
        clients.addAll(newClients);
    }
}
