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
}