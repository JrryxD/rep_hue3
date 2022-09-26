import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    List<String> list = new ArrayList<>();

    public HalloJavamitForEach() {
        list.add("Hallo");
        list.add("Welt!");
        list.add(":D");
    }

    public void printList()
    {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("");
    }

    public void printList2()
    {
        list.forEach((String s) -> System.out.println(s));
        System.out.println("");
    }

    public void printList3()
    {
        Consumer<String> consumer = (String s) -> System.out.println(s);
    }

    public void printList4()
    {
        list.forEach(System.out::println);
    }

}
