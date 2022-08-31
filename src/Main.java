import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        celebrities.add(new Person("Шайло Нувель", "Джоли-Питт", 13));
        celebrities.add(new Person("Лурдес Мария", "Чикконе-Леон", 16));

        Set<Person> treeSet = new TreeSet<Person>(new PersonSurnameComparator());
        treeSet.addAll(celebrities);

        System.out.println("Список VIP гостей по уровню значимости/знатности: ");
        treeSet.forEach(System.out::println); // новый вариант вывода гостей в консоль через лямбду;

        treeSet.removeIf(person -> person.getAge() <= 18); // удалит из списка людей младше 18 лет;
        System.out.println("\nСписок VIP гостей старше 18: ");
        treeSet.forEach(System.out::println);
    }
}