import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> celebrities = new ArrayList<>();
        celebrities.add(new Person("Леонардо", "Вильгельм Ди Каприо", 47));
        celebrities.add(new Person("Бен", "Аффлек-Болдт", 50));
        celebrities.add(new Person("Джулия", "Робертс", 54));
        celebrities.add(new Person("Джеки", "Чан", 68));
        celebrities.add(new Person("Деметрия", "Джин Гайнс", 59));
        celebrities.add(new Person("Антонио", "Хосе Домингес Бандерас", 62));
        celebrities.add(new Person("Пенелопа", "Крус Санчес", 48));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int p1 = o1.getSurname().split("[\\s-]+").length;
            int p2 = o2.getSurname().split("[\\s-]+").length;
            if (p1 > p2) {
                return -1;
            } else if (p1 < p2) {
                return 1;
            }
            return Integer.compare(o2.getAge(), o1.getAge());
        };

        Set<Person> treeSet = new TreeSet<Person>(comparator);
        treeSet.addAll(celebrities);

        System.out.println("Список VIP гостей по уровню значимости/знатности: ");
        int i = 0;
        for (Person person : treeSet) {
            i++;
            System.out.println(i + ". " + person.toString());
        }
    }
}