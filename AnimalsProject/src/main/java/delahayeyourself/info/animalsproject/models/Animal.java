package delahayeyourself.info.animalsproject.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sam
 */
public class Animal {

    private int id;
    private String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ArrayList<Animal> findAll() throws ClassNotFoundException, SQLException {

        ArrayList<Animal> animals = new ArrayList();
        
        //1er étape: charger le driver
        Class.forName("org.sqlite.JDBC");

        //2em étape: connexion à la database
        Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/sam/projects/vacation/animals.sqlite");

        //3em étape: requête de la base
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id, name FROM animals ORDER BY name;");

        //4em étape: affichage du retour de la base
        while (resultSet.next()) {
            int id;
            String name;

            id = resultSet.getInt("id");
            name = resultSet.getString("name");

            animals.add(new Animal(id, name));
        }

        //5em étape: fermeture des descripteurs
        resultSet.close();
        statement.close();
        connection.close();
        
        return animals;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + '}';
    }

}
