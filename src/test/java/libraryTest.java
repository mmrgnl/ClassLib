import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;



class libraryTest {

    @org.junit.jupiter.api.Test
   public void add() {

        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        Library.add(new Book("Одиссея", "Гомер", "античная литература", "S30"));
        Library.add(new Book("Логика Антихайпа", "Замай", "классика", "Z77"));
        Library.add(new Book("Игрок", "Достоевский", "классика", "В40"));
        Library.add (new Book("Тихий Дон", "Шолохов", "классика", "G50"));
        Library.add (new Book("Чапаев и пустота", "Пелевин", "проза", "Z77"));
        Library.add (new Book("Мастер и Маргарита", "Булгаков", "классика", "D57"));
        assertTrue(Library. exist(new Book("Задачи по общей физике", "Иродов", "учебник", "A66")));
        assertFalse(Library. exist(new Book("Тримумфальная арка", "Ремарк", "проза", "A66")));
    }

    @org.junit.jupiter.api.Test
    void del() {
        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        Library.add(new Book("Тримумфальная арка", "Ремарк", "проза", "A66"));
        Library.del(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        assertFalse(Library. exist(new Book("Задачи по общей физике", "Иродов", "учебник", "A66")));
    }

    @org.junit.jupiter.api.Test
    void change() {
        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        Library.add(new Book("Одиссея", "Гомер", "античная литература", "S30"));
        Library.add(new Book("Логика Антихайпа", "Замай", "классика", "Z77"));
        Library.add(new Book("Игрок", "Достоевский", "классика", "В40"));
        Library.change(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"), "Тошнота", "Сартр", "проза");
        assertTrue(Library. exist(new Book("Тошнота", "Сартр", "проза", "A66")));
    }


    @org.junit.jupiter.api.Test
    void relocate() {
        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        Library.add(new Book("Одиссея", "Гомер", "античная литература", "S30"));
        Library.relocate(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"), "A2");
        assertTrue(Library. exist(new Book("Задачи по общей физике", "Иродов", "учебник", "A2")));
        Library.relocate(new Book("Одиссея", "Гомер", "античная литература", "S30"), "C60");
        assertTrue(Library. exist(new Book("Одиссея", "Гомер", "античная литература", "C60")));
    }

    @org.junit.jupiter.api.Test
    void search() {

        library Library = new library();
        Library.add(new Book("Задачи по общей физике", "Иродов", "учебник", "A66"));
        Library.add(new Book("Одиссея", "Гомер", "античная литература", "S30"));
        Library.add(new Book("Логика Антихайпа", "Замай", "классика", "Z77"));
        Library.add(new Book("Игрок", "Достоевский", "классика", "В40"));
        Library.add (new Book("Тихий Дон", "Шолохов", "классика", "G50"));
        Library.add (new Book("Чапаев и пустота", "Пелевин", "проза", "Z77"));
        Library.add (new Book("Мастер и Маргарита", "Булгаков", "классика", "D57"));
        assertTrue(Library.exist( Library.search("Задачи по общей физике", null, null, null)));
        assertTrue(Library.exist( Library.search(null, "Замай", null, "Z77")));
    }
}