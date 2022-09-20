package day25_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer("Toronto", "Google", "Java Developer", 100000, true, true, true, true);
        Offer offer2 = new Offer("New York", "Apple", "Manager", 140000, true, true, true, true);
        Offer offer3 = new Offer("San Francisco", "Oracle", "CEO", 200000, true, true, true, false);
        Offer offer4 = new Offer("Tokyo", "Toyota", "Engineer", 90000, true, false, false, true);
        Offer offer5 = new Offer("Vancouver", "Microsoft", "SDET", 95000, true, true, false, true);
        Offer offer6 = new Offer("Seattle", "IKEA", "Java Developer", 110000, true, true, true, false);
        Offer offer7 = new Offer("Philadelphia", "Walmart", "Cashier", 50000, false, false, false, true);

        ArrayList<Offer> myOffers = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(myOffers);
        fullTimeOffers.removeIf(p -> !p.isFullTime);

        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(myOffers);
        localOffers.removeIf(p -> !p.location.equals("Toronto"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>();
        offersWithBenefits.addAll(myOffers);
        offersWithBenefits.removeIf(p -> !p.hasBenefit && !p.hasPTO);

        ArrayList<Offer> devOffers = new ArrayList<>();
        devOffers.addAll(myOffers);
        devOffers.removeIf(p -> !p.jobTitle.toLowerCase().contains("developer"));

        ArrayList<Offer> With100K = new ArrayList<>();
        With100K.addAll(myOffers);
        With100K.removeIf(p -> p.salary < 100000);

    }
}
