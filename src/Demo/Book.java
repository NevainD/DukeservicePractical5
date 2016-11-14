package Demo;


import com.google.gson.Gson;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class Book {

    String Title;
    String Description;
    String Author;
    int Year;


    public Book() {
        this.Title = "Java Made Easy";
        this.Description = "A book about how to learn Java in a painless manner";
        this.Author = "Java Duke";
        this.Year = 2016;


    }

    @Produces(MediaType.APPLICATION_JSON)
    public String getResource() {

        Book book = new Book();

        Gson gson = new Gson();
        String json =gson.toJson(book);

        return json;

    }
}