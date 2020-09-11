public class StringPool {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");

        System.out.println(a == b);
        System.out.println(c == d);

        // string pool
        // key: address, value: "abc"

        // new -> Heap Memory
        // c, "abc"
        // d, "abc"

        System.out.println(a + b + c + d);
        // [                                                ]
        new StringBuilder().append(a).append(b).append(c).append(d);

    }
}
