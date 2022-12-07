import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotFoundExceptionTest {
    Book book=new Book(
            1213,
            "Benifis",
            19999,
            "Monte"
    );
    Book book1=new Book(
            1214,
            "Macht",
            19999,
            "Monte-Carlo"
    );
    Smartphone smartphone=new Smartphone(
            1444,
            "panasonic",
            1999,
            "OLIVKI");
    Smartphone smartphone1=new Smartphone(
            1445,
            "panasonic",
            1998,
            "OLIVKI");
    @Test
    public void exceptioTest(){
        Repo repo=new Repo();
        Manager manager=new Manager(repo);
        repo.add(book);
        repo.add(book1);
        repo.add(smartphone);
        
        Assertions.assertThrows(NotFoundException.class,()->repo.remove(1445));

    }

}