/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Calendar f1 = GregorianCalendar.getInstance();
        f1.set(1992, 11, 11);
        Person p1 = new Person("Joel", "Delgado", f1);
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
    }
}
