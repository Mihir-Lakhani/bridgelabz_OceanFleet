
package in.mihirlakhani;

import in.mihirlakhani.model.Vessel;
import in.mihirlakhani.util.VesselUtil;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil myVessels = new VesselUtil();

        int choice;

        do {
            System.out.println("\n----- VESSEL MANAGEMENT -----");
            System.out.println("1. Add Vessels");
            System.out.println("2. Search Vessel by ID");
            System.out.println("3. Display Highest Speed Vessels");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter number of vessels:");
                    int n = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter vessel details");
                    System.out.println("Format: id:name:speed:type");

                    for (int i = 0; i < n; i++) {

                        String[] details = sc.nextLine().split(":");

                        String id = details[0];
                        String name = details[1];
                        double speed = Double.parseDouble(details[2]);
                        String type = details[3];

                        Vessel vessel = new Vessel(id, name, speed, type);

                        myVessels.addVesselPerformance(vessel);
                    }

                    System.out.println("Vessels added successfully!");
                    break;

                case 2:
                    System.out.println("Enter Vessel ID:");
                    String vesselId = sc.nextLine();

                    Optional<Vessel> vesselById =
                            myVessels.getVesselById(vesselId);

                    if (vesselById.isPresent()) {
                        myVessels.printVesselData(vesselById.get());
                    } else {
                        System.out.println("Vessel Id " + vesselId + " not found.");
                    }
                    break;

                case 3:
                    List<Vessel> topSpeedVessel =
                            myVessels.getHighestAvgSpeedVessels();

                    System.out.println("Highest Speed Vessels:");
                    myVessels.printVesselListData(topSpeedVessel);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
