package se.lexicon;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        SystemDeveloper developer1 = new SystemDeveloper();
        developer1.setName("Dev1");
        developer1.addCertificateToArray("OCA"); //1000
        developer1.addCertificateToArray("OCP"); //1000

        developer1.addLanguageToArray("Java"); //1500
        developer1.addLanguageToArray("Python"); //1500

        developer1.setHireDate(LocalDate.parse("2021-02-02"));
        developer1.calculateSalary();
        System.out.println(developer1);
    }
}
