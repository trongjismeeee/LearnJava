import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ListSortable<E> {
    private List<E> list;

    public ListSortable() {
        this.list = new ArrayList<>();
    }

    public void add(E element) {
        this.list.add(element);
    }

    // Phương thức sắp xếp danh sách
    // Cần truyền vào một Comparator để xác định cách sắp xếp.
    public void sort(Comparator<E> comparator) {
        Collections.sort(list, comparator);
    }

    // Phương thức in ra danh sách
    public void print() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("--- Sorted Thesis List ---");
        for (E element : list) {
            System.out.println(element);
        }
        System.out.println("--------------------------");
    }
}