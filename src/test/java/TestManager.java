import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestManager {
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
    public void addManger(){
        Repo repo=new Repo();
        Manager manager=new Manager(repo);

        manager.add(book);
        manager.add(smartphone);
        manager.add(smartphone1);
        manager.add(book1);


        Product[] actual=manager.searchBy("panasonic");
        Product[] expected={smartphone,smartphone1};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void twoSmartphoneResulr(){
        Repo repo=new Repo();
        Manager manager=new Manager(repo);

        manager.add(book);
        manager.add(smartphone);
        manager.add(book1);

        Product[] actual=manager.searchBy("Macht");
        Product[] expected={book1};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void removeRepoBook(){
        Repo repo=new Repo();

        repo.add(book);
        repo.add(book1);
        repo.add(smartphone);

        repo.remove(1213);

        Product[] actual=repo.findAll();
        Product[] expeced={book1,smartphone};

        Assertions.assertArrayEquals(expeced,actual);
    }
}
