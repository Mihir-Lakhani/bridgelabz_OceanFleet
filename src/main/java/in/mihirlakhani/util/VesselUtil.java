package in.mihirlakhani.util;

import in.mihirlakhani.model.Vessel;

import java.util.*;


public class VesselUtil {

    private List<Vessel> vesselList;

    public VesselUtil(){
        vesselList = new ArrayList<>();
    }

    public Optional<Vessel> getVesselById(String vesselId){
        if (vesselList.isEmpty()){
            return Optional.empty();
        }
        for (int i = 0; i < vesselList.size(); i++){
            if (vesselList.get(i).getVesselId().equals(vesselId)){
                return Optional.of(vesselList.get(i));
            }
        }
        return Optional.empty();
    }

    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }

    private Double scanAllForMaxSpeed(){
        Double maxSpeed = Double.MIN_VALUE;

        if (vesselList.isEmpty()){
            return 0.0;
        }

        for (int i = 0; i < vesselList.size(); i++){
            maxSpeed = Math.max(maxSpeed, vesselList.get(i).getAverageSpeed());
        }
        return maxSpeed;
    }

    public List<Vessel> getHighestAvgSpeedVessels(){
        Double maxSpeed = scanAllForMaxSpeed();

        if (maxSpeed == 0){
            return null;
        }

        List<Vessel> topSpeedVessels = new ArrayList<>();

        for (int i = 0; i < vesselList.size(); i++){
            if (vesselList.get(i).getAverageSpeed() == maxSpeed){
                topSpeedVessels.add(vesselList.get(i));
            }
        }

        return topSpeedVessels;
    }

    public void printVesselData(Vessel vessel){
        System.out.println(vessel.getVesselId()+"|"+
                vessel.getVesselName()+"|"+
                vessel.getVesselType()+"|"+
                vessel.getAverageSpeed());
    }

    public void printVesselListData(List<Vessel> listOfVessels){

        if (listOfVessels == null || listOfVessels.isEmpty()){
            System.out.println("No vessels found in the vessel list provided");
            return;
        }

        for (int i = 0; i < listOfVessels.size(); i++){
            printVesselData(listOfVessels.get(i));
            System.out.println();
        }
    }
}