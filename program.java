public class program {
    public static void main(String[] args) {

        List ls = new List();

        for (int i = 0; i < 10; i++)
            ls.add(i);

        ls.print();
        ls.reverse();
        ls.print();
    }
}
