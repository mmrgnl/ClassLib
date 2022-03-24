import static org.junit.jupiter.api.Assertions.*;



class libraryTest {


    Book Physics = new Book("Задачи по общей физике", "Иродов", "учебник", "A66");
    Book Odissey = new Book("Одиссея", "Гомер", "античная литература", "S30");
    Book Anithype = new Book("Логика Антихайпа", "Замай", "классика", "Z77");
    Book Gamer = new Book("Игрок", "Достоевский", "классика", "В40");
    Book Don = new Book("Тихий Дон", "Шолохов", "классика", "G50");
    Book Chapaev = new Book("Тихий Дон", "Шолохов", "классика", "G50");
    Book Master = new Book("Мастер и Маргарита", "Булгаков", "классика", "D57");
    Book Arch = new Book("Тримумфальная арка", "Ремарк", "проза", "A66");
    Book Nausea = new Book("Тошнота", "Сартр", "проза", "A66");

    @org.junit.jupiter.api.Test

    void add() {

        library Library = new library();
        Library.add(Physics);
        Library.add(Odissey);
        Library.add(Anithype);
        Library.add(Gamer);
        Library.add(Don);
        Library.add(Chapaev);
        Library.add(Master);
        assertTrue(Library. exist(Physics));
        assertFalse(Library. exist(Arch));
    }

    @org.junit.jupiter.api.Test
    void del() {

        library Library = new library();
        Library.add(Physics);
        Library.add(Arch);
        Library.del(Physics);
        assertFalse(Library. exist(Physics));
    }

    @org.junit.jupiter.api.Test
    void change() {

        library Library = new library();
        Library.add(Physics);
        Library.add(Odissey);
        Library.add(Anithype);
        Library.add(Gamer);
        Library.change(Physics, "Тошнота", "Сартр", "проза");
        assertTrue(Library. exist(Nausea));
    }


    @org.junit.jupiter.api.Test
    void relocate() {library Library = new library();

        Library.add(Physics);
        Library.add(Odissey);
        Library.relocate(Physics, "A2");
        assertTrue(Library. exist(new Book("Задачи по общей физике", "Иродов", "учебник", "A2")));
        Library.relocate(Odissey, "C60");
        assertTrue(Library. exist(new Book("Одиссея", "Гомер", "античная литература", "C60")));
    }

    @org.junit.jupiter.api.Test
    void search() {

        library Library = new library();
        Library.add(Physics);
        Library.add(Odissey);
        Library.add(Anithype);
        Library.add(Gamer);
        Library.add(Don);
        Library.add(Chapaev);
        Library.add(Master);
        assertTrue(Library.exist( Library.search("Задачи по общей физике", null, null, null)));
        assertTrue(Library.exist( Library.search(null, "Замай", null, "Z77")));
    }
}