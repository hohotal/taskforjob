import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = UserMapper.mapStringToUser(DocumentParser.parser("./src/users.txt"));
        task(users, true);
    }

    //toDO Получить коллекцию юзеров(вывести на экран столбиком)
    //toDo Сделать возраст опциональным
    //toDo Отсортировать пользователей по возрасту DESC у которых нет возраста в начало списка


    /**
     * Print a list of Users
     *
     * @param users List of Users
     * @param sort flag for sorting
     */
    private static void task(List<User> users, boolean sort) {
        if (sort) {
            Collections.sort(users);
        }
        users.forEach(System.out::println);

    }

}
