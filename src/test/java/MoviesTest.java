import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesTest {

    @Test
    public void add0Films() {
        MoviesManager manager = new MoviesManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add3Films() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast5Films() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3Films() {
        MoviesManager manager = new MoviesManager(3);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        String[] expected = {"Film 10", "Film 9", "Film 8"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast6Films() {
        MoviesManager manager = new MoviesManager(6);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

