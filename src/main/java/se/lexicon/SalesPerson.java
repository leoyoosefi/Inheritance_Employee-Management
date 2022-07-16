package se.lexicon;

import java.util.Arrays;

public class SalesPerson {

    private String[] clients;
    private int acquiredClients;


    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    public void calculateSalary() {

    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }
}
