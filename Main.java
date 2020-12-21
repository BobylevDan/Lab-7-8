import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<String> veg = new ArrayList();
        veg.add("Огурец");
        veg.add("Помидор");
        veg.add("Капуста");
        veg.add("Редиска");
        veg.add("Морковь");
        veg.add(1, "Перец");
        Iterator var2 = veg.iterator();

        String u;
        while(var2.hasNext()) {
            u = (String)var2.next();
            System.out.println(u);
        }

        System.out.println("\n");
        System.out.println("Размер списка\n");
        System.out.printf("В списке %d элементов \n", veg.size());
        System.out.println((String)veg.get(1));
        var2 = veg.iterator();

        while(var2.hasNext()) {
            u = (String)var2.next();
            System.out.println(u);
        }

        System.out.println("\n");
        System.out.println("Проверка на наличие элемента в списке \n");
        if (veg.contains("Капуста")) {
            System.out.println("Список содержит овощ Капуста");
        }

        System.out.println("\n");
        System.out.println("Удаление элемента из списка \n");
        veg.remove("Капуста");
        var2 = veg.iterator();

        while(var2.hasNext()) {
            u = (String)var2.next();
            System.out.println(u);
        }

        System.out.println("\n\n\n");
        LinkedList<Data> state = new LinkedList();
        state.add(new Data("France"));
        state.addFirst(new Data("Germany"));
        state.addLast(new Data("Spain"));
        state.remove(2);
        Iterator var6 = state.iterator();

        while(var6.hasNext()) {

            Data p = (Data)var6.next();
            System.out.println(p);
        }

    }
}