package in.mihirlakhani.util;

import in.mihirlakhani.model.Vessel;

import java.util.*;


public class VesselUtil {

    private List<Vessel> vesselList;

    public VesselUtil(){
        vesselList = new ArrayList<>();
    }

//    public Vessel getVesselById(String vesselId){
//        if (vesselList.isEmpty()){
//            return null;
//        }
//        for (int i = 0; i < vesselList.size(); i++){
//            if (vesselList.get(i).getVesselId().equals(vesselId)){
//                return vesselList.get(i);
//            }
//        }
//        return null;
//    }

    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }
}