package se.lexicon;

import java.util.Arrays;

public class SystemDeveloper extends Employee {

    private final int extraPriceCertificate = 1000;
    private final int extraPerLanguage = 1500;

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(){
        certificates = new String[0];
        languages = new String[0];
    }


    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                super.toString() +
                '}';
    }

    @Override
    public void calculateSalary() {

        double result = baseSalary +
                (extraPriceCertificate * certificates.length) +
                (extraPerLanguage * languages.length);
        this.setSalary(result);
    }

    public void addCertificateToArray(String certificate){
        String [] newArray = Arrays.copyOf(certificates, certificates.length + 1);
        newArray[newArray.length -1] = certificate;
        setCertificates(newArray);
    }

    public void addLanguageToArray(String language){
        String [] newArray = Arrays.copyOf(languages, languages.length + 1);
        newArray[newArray.length -1] = language;
        setLanguages(newArray);
    }
}
