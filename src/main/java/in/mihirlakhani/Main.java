package in.mihirlakhani;

import in.mihirlakhani.model.Vessel;
import in.mihirlakhani.util.VesselUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VesselUtil myVessels = new VesselUtil();


        System.out.println("Enter the number of vessels to be added");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after the number

        System.out.println("Enter vessel details\neg:- vesselId:vesselName:averageSpeed:vesselType");

        for (int i = 0; i < n; i++) {
            String[] details = sc.nextLine().split(":");

            String id = details[0];
            String name = details[1];
            double value = Double.parseDouble(details[2]);
            String type = details[3];

            Vessel vessel = new Vessel(id, name, value, type);
            myVessels.addVesselPerformance(vessel);
        }

        sc.close();
    }
}