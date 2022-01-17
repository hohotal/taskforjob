import java.util.ArrayList;
import java.util.List;

/**
 * Class for mapping Users
 * Contains static methods to use
 */

public class UserMapper {

    /**
     * Returns a list of Users
     *
     * @param value array of strings devided commas
     * @return ArrayList of Users
     */
    public static List<User> mapStringToUser(String[] value) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i <= value.length - 4; i = i + 4) {
            User temp = new User();
            temp.setFirstName(value[i]);
            temp.setLastName(value[i + 1]);
            try{
                if (!(value[i + 2] == null) && !value[i + 2].equals(" ") && !value[i + 2].equals("")) {
                    temp.setAge(Integer.parseInt(value[i + 2]));
                }
            } catch (Exception e){
                System.out.println("Error parsing value in method mapStringToUser: " + e.getMessage());
            }
            temp.setDocument(value[i + 3]);
            list.add(temp);
        }
        return list;
    }
}
