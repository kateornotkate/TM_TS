import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int p1 = o1.getSurname().split("[\\s-]+").length;
        int p2 = o2.getSurname().split("[\\s-]+").length;
        if (p1 > p2) {
            return -1;
        } else if (p1 < p2) {
            return 1;
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}