package workshop.tekla_gogua_1;


/**
 * Find two packages inside this package.
 * Create classes A and B inside first and the second package accordingly
 * 1 point
*/
import workshop.tekla_gogua_1.pen.A;
import workshop.tekla_gogua_1.phone.B;

public class Assignment02 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.display();
        objB.display();
    }
}
