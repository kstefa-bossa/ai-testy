/*
 *  Prawa autorskie: Dom Maklerski Banku Ochrony �rodowiska S.A.
 *  Wszelkie prawa zastrze�one.
 */

/**
 * @author kstefa
 * @since 29.02.2024
 */
public class Closure {
    public String foo = "";
    public static Closure process(final Closure t) {
        System.out.println(t.toString() + " = " + t.foo);
        t.foo = "bar";
        new Runnable() {
            public void run() {
                System.out.println(t.toString() + " = " + t.foo);
                t.foo = "baz";
            }
        }.run();
        System.out.println(t.toString() + " = " + t.foo);
        return t;
    }
    public static void main(String[] args) {
        process(new Closure());
    }
}
