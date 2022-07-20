import java.util.*;

public class Generics {

    private static class BookStore {
        //not using generics
        HashSet<String> BookList = new HashSet<String>();

        public void addMedia(String BookName) {
            BookList.add(BookName);
        }
        public void showList()
        { Iterator itr = BookList.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

    private static class BookStoreGenerics<T> {
        //using generics
        HashSet<T> BookList = new HashSet<T>();
        public void addMediaG(T BookName) {
            BookList.add(BookName);
        }
        public void showList()
        { Iterator itr = BookList.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
    public static void main(String[] args)
    {   //No Generics
        BookStore b = new BookStore();
        b.addMedia("Alice in Wonderland");
        b.addMedia("Cinderella");
        b.showList();
        //Generics
        BookStoreGenerics<Integer> g = new BookStoreGenerics<>();
        g.addMediaG(1);
        g.addMediaG(2);
        g.showList();
        BookStoreGenerics<Float> gf = new BookStoreGenerics<>();
        gf.addMediaG(2.3f);
        gf.addMediaG(521.3f);
        gf.showList();
        BookStoreGenerics<String> gs = new BookStoreGenerics<>();
        gs.addMediaG("Love in paris");
        gs.addMediaG("Dictionary");
        gs.showList();
    }
}
