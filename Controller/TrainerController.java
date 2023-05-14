package Controller;

import DTO.Mappers.EGender;
import Model.Client;
import java.time.LocalDate;
import java.util.List;

import Model.Trainer;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author auxlu
 */
public class TrainerController {

        // This line of code is declaring a private instance variable named `trainers`
        // of type
        // `ArrayList<Trainer>`. It is also initializing the `trainers` variable with a
        // new `ArrayList`
        // object that can hold elements of type `Trainer`. This variable is used to
        // store a list of
        // `Trainer` objects in the `TrainerController` class.
        private ArrayList<Trainer> trainers = new ArrayList<>();
        // `private BinaryFileController fileController;` is declaring a private
        // instance variable
        // `fileController` of type `BinaryFileController`. This variable is used to
        // create an object
        // of the `BinaryFileController` class, which is used to read and write binary
        // files.
        private BinaryFileController fileController;

        // This is a constructor for the TrainerController class. It initializes the
        // fileController
        // instance variable with a new BinaryFileController object and the trainers
        // instance variable
        // with a new ArrayList object.
        public TrainerController() {
                fileController = new BinaryFileController();
                trainers = new ArrayList<>();
        }

        /**
         * The function adds a new trainer to a list of trainers with various personal
         * and professional
         * information.
         * 
         * @param CPF               The Brazilian individual taxpayer registry
         *                          identification number. It is a unique
         *                          identifier for each Brazilian citizen or resident.
         * @param username          The username of the trainer being added.
         * @param firstName         The first name of the trainer being added to the
         *                          system.
         * @param lastName          The last name of the trainer being added to the
         *                          system.
         * @param email             The email of the trainer being added to the system.
         * @param password          A String representing the password of the trainer
         *                          being added to the system.
         * @param phoneNumber       A string representing the phone number of the
         *                          trainer.
         * @param birthDate         A LocalDate object representing the birth date of
         *                          the trainer.
         * @param gender            EGender is an enum that represents the gender of the
         *                          trainer. It can have
         *                          values of MALE, FEMALE, or OTHER.
         * @param city              The city where the trainer is located.
         * @param state             The state where the trainer is located or operates
         *                          in. For example, if the
         *                          trainer is in the United States, the state could be
         *                          California or New York.
         * @param country           The country where the trainer is located or operates
         *                          in.
         * @param certification     The certification parameter refers to the
         *                          certification(s) that the
         *                          trainer has obtained in their field of expertise,
         *                          such as a personal training certification
         *                          or a nutrition certification.
         * @param speciality        The speciality parameter refers to the specific area
         *                          of expertise or focus
         *                          of the trainer, such as weightlifting, yoga, or
         *                          cardio.
         * @param gym               The gym parameter refers to the name of the gym
         *                          where the trainer works or is
         *                          affiliated with.
         * @param hourlyRate        The hourly rate is the amount of money that the
         *                          trainer charges per hour
         *                          for their services.
         * @param yearsOfExperience The number of years of experience the trainer has in
         *                          the fitness
         *                          industry.
         */
        public void addTrainer(String CPF, String username, String firstName, String lastName, String email,
                        String password,
                        String phoneNumber,
                        LocalDate birthDate, EGender gender, String city, String state,
                        String country, String certification, String speciality, String gym, double hourlyRate,
                        int yearsOfExperience) {

                Trainer trainer = new Trainer();

                trainer.setCPF(CPF);
                trainer.setUsername(username);
                trainer.setFirstName(firstName);
                trainer.setLastName(lastName);
                trainer.setEmail(email);
                trainer.setPassword(password);
                trainer.setPhoneNumber(phoneNumber);
                trainer.setBirthDate(birthDate);
                trainer.setGender(gender);
                trainer.setCity(city);
                trainer.setState(state);
                trainer.setCountry(country);
                trainer.setCertification(certification);
                trainer.setSpeciality(speciality);
                trainer.setGym(gym);
                trainer.setHourlyRate(hourlyRate);
                trainer.setYearsOfExperience(yearsOfExperience);

                trainers.add(trainer);
        }

        /**
         * This Java function saves a list of Trainer objects to a file.
         * 
         * @param trainers An ArrayList of Trainer objects that needs to be saved to a
         *                 file.
         * @param fileName The name of the file where the objects will be saved.
         * @param append   A boolean value indicating whether to append the objects to
         *                 the end of the
         *                 file or overwrite the file with the new objects. If append is
         *                 true, the objects will be
         *                 added to the end of the file. If append is false, the file
         *                 will be overwritten with the new
         *                 objects.
         * @return A boolean value is being returned based on the result of
         *         writeToFile() function.
         */
        public boolean saveObjectsToFile(ArrayList<Trainer> trainers, String fileName, boolean append) {
                ArrayList<Object> objects = new ArrayList<Object>(trainers);
                fileController.setArchive(new File(fileName));
                return  fileController.writeToFile(objects, fileName, append);
        }

        /**
         * This function updates a file with an ArrayList of Trainer objects and returns
         * a boolean
         * value indicating success.
         * 
         * @param trainers An ArrayList of Trainer objects that contains the data to be
         *                 written to the
         *                 file.
         * @param fileName The name of the file to which the ArrayList of Trainer
         *                 objects will be
         *                 written.
         * @return A boolean value of true is being returned.
         */
        public boolean updateObjectsToFile(ArrayList<Trainer> trainers, String fileName) {
                ArrayList<Object> objects = new ArrayList<Object>(trainers);
                return  fileController.update(fileName, objects);
        }

        /**
         * The function attempts to open a binary file, read its contents, and populate
         * an ArrayList
         * with Trainer objects if successful.
         * 
         * @param filePath a String representing the file path of the binary file to be
         *                 opened and
         *                 read.
         * @return The method returns a boolean value. If the file is successfully read
         *         and the objects
         *         in the file are of type Trainer, the method returns true. If the file
         *         cannot be read, the
         *         method returns false and displays an error message. If the objects in
         *         the file are not of
         *         type Trainer, the method also returns false.
         */
        public boolean open(String filePath) {
                fileController = new BinaryFileController(filePath);
                if (fileController.read()) {
                        ArrayList<?> list = fileController.getObjects();
                        if (list.get(0) instanceof Trainer) {
                                trainers = new ArrayList<>();
                                for (Object obj : list) {
                                        Trainer trainer = (Trainer) obj;
                                        trainers.add(trainer);
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
         * This function returns an ArrayList of Trainer objects.
         * 
         * @return An ArrayList of Trainer objects is being returned.
         */
        public ArrayList<Trainer> getTrainers() {
                return trainers;
        }

        /**
         * This Java function sets the list of trainers for a particular object.
         * 
         * @param trainers an ArrayList of Trainer objects that will be set as the value
         *                 of the
         *                 "trainers" instance variable in the current object.
         */
        public void setTrainers(ArrayList<Trainer> trainers) {
                this.trainers = trainers;
        }

        /**
         * The function adds a list of trainers to an existing list of trainers.
         * 
         * @param newTrainers An ArrayList of Trainer objects that contains the new
         *                    trainers to be
         *                    added to the existing list of trainers. The method adds
         *                    all the elements of the newTrainers
         *                    list to the end of the existing trainers list.
         */
        public void addTrainers(ArrayList<Trainer> newTrainers) {
                trainers.addAll(newTrainers);
        }

}
