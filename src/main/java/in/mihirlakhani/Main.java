package in.mihirlakhani;

import in.mihirlakhani.model.Vessel;
import in.mihirlakhani.util.VesselUtil;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VesselUtil myVessels = new VesselUtil();


        System.out.println("Enter the number of vessels to be added");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after the number

        System.out.println("Enter vessel details\n(eg:- vesselId:vesselName:averageSpeed:vesselType)");

//        for (int i = 0; i < n; i++) {
//            String[] details = sc.nextLine().split(":");
//
//            String id = details[0];
//            String name = details[1];
//            double value = Double.parseDouble(details[2]);
//            String type = details[3];
//
//            Vessel vessel = new Vessel(id, name, value, type);
//            myVessels.addVesselPerformance(vessel);
//        }

        String vesselId = "V002";
        Optional<Vessel> vesselById = myVessels.getVesselById(vesselId);
        if (vesselById.isPresent()){
            System.out.println(vesselById.get().getVesselId()+"|"+
                    vesselById.get().getVesselName()+"|"+
                    vesselById.get().getVesselType()+"|"+
                    vesselById.get().getAverageSpeed());
        }else{
            System.out.printf("Vessel Id %s not found.", vesselId);
        }

        sc.close();
    }
}