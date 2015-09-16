/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Person p1 = new Person("Joel", "Delgado", new Date(92, 11, 11));
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
        System.out.println(p1.getAge());
    }
}
