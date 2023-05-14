/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author auxlu
 */
public class TextFileController extends FileController {
    private String text = null;
    private File openedFile;

    private BufferedReader reader = null;
    private BufferedWriter writer = null;

    /**
     * @return the texto
     */
    public String getText() {
        return text;
    }

    /**
     * @param texto the texto to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return true caso a operação de leitura seja bem sucedida ou false
     *         caso contrário.
     */
    @Override
    public boolean read() {
        StringBuilder line = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(archive));
            while (reader.ready()) {
                line.append(reader.readLine()).append("\n");
            }
            reader.close();
            setText(line.toString());
            return true;
        } catch (FileNotFoundException erro) {
            // erro.printStackTrace(); //usado para debug
            System.err.println(erro.getMessage() + "Arquivo não encontrado.");
            return false;
        } catch (IOException erro) {
            System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
            return false;
        }
    }

    /**
     * @param append se o texto será continuado a partir do seu
     *               final (append = false) ou se o arquivo será sobrescrito (append
     *               = false)
     * @return true caso a operação de escrita seja bem sucedida ou false
     *         caso contrário.
     */
    @Override
    public boolean write(boolean append) {
        if (archive != null) {
            try {
                writer = new BufferedWriter(new FileWriter(archive, append));
                writer.write(getText());
                writer.close();
                modified = false;
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean save(boolean append) {
        if (openedFile != null) {
            try {
                writer = new BufferedWriter(new FileWriter(openedFile, false)); // set append to false
                writer.write(getText());
                writer.close();
                modified = false;
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
                return false;
            }
        } else {
            return false;
        }
    }

   
    public boolean delete(String filePath) {
    File file = new File(filePath);
    if (file.exists()) {
        try {
            Files.deleteIfExists(file.toPath());
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage() + "Erro ao deletar arquivo.");
            return false;
        }
    } else {
        return false;
    }
}



    
    
public boolean update(String filePath, String newContent) {
    File file = new File(filePath);
    if (file.exists()) {
        try {
            // Modify the file content as needed
            String fileContent = new String(Files.readAllBytes(file.toPath()));
            fileContent = newContent;

            // Write the modified file content back to the file
            Files.write(file.toPath(), fileContent.getBytes());

            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage() + "Erro ao ler arquivo.");
            return false;
        }
    } else {
        return false;
    }
}


}