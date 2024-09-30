package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person("Eduardo", LocalDate.of(2004, 07, 26)).toString());
    }
}
