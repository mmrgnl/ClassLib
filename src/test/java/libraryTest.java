import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

class libraryTest {

    @org.junit.jupiter.api.Test
   public void add() {

        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        assertTrue(Library.exist(new Book("Задачи по общей физике", "Иродов", "учебник", "A66")));
    }

    @org.junit.jupiter.api.Test
    void del() {

        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        Library.del(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        assertFalse(Library.exist(new Book("Задачи по общей физике", "Иродов", "учебник", "A66")));
    }

    @org.junit.jupiter.api.Test
    void relocate() {


    }

    @org.junit.jupiter.api.Test
    void search() {
    }
}