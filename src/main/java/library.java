
/*
 Вариант 21 -- библиотека
 Хранит информацию о книгах и позволяет их искать. Для каждой книги хранится название, автор и жанр, а также код полки,
  на которой она лежит (например, А3 или Г4. Вы можете сами придумать реалистичную систему кодирования полок).
 Операции: конструктор, добавить/удалить книгу, изменить существующую книгу, переместить книгу на другую полку,
  поиск книг по разным признакам (по автору, по названию, по словам из названия,
  по жанру, по коду полки, по комбинации этих признаков).
*/

import java.util.ArrayList;



public class library {


    public ArrayList<Book> Library = new ArrayList<>();

    public void add(Book book) {

        Library.add(book);

    }

    public boolean exist(Book book) {

        return  Library.contains(book);

    }


    public void del(Book book) {
        if (Library.contains(book)) {

            Library.remove(book);


        } else  throw new NullPointerException("Книга не найдена");
    }

    public void change(Book book, String rename, String newauthor, String newgenre){

        if (!Library.contains(book))  throw new NullPointerException("Книга не найдена");;

        if (book.name != rename || book.author != newauthor || book.genre != newgenre ) {

            Book newbook = new Book(rename, newauthor, newgenre, book.code);

            Library.set(Library.indexOf(book), newbook);

        } else throw new NullPointerException("Такие параметры уже присвоены данной книге");

    }

    public void relocate(Book book, String recode) {

        if (!Library.contains(book)) throw new NullPointerException("Книга не найдена");

        if (book.code != recode) {

            Book newbook = new Book(book.name, book.author, book.genre, recode);

            Library.set(Library.indexOf(book), newbook);

        } else throw new NullPointerException("Такой номер уже присвоен данной книге");

    }

    public Book search(String name, String author, String genre, String code) {

        if(name == null && author == null && genre == null && code == null ){

            throw new NullPointerException("Параметры отсутствуют");

        }

        for (Book book : Library) {

            if ((book.name == name || name == null) && (book.author == author || author == null) &&

                    (book.genre == genre || genre == null) && (book.code == code || code == null)) {

                return book;
            }

        }

        throw new NullPointerException("Книга не найдена");
    }




}
