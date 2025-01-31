package parking_lot;
import java.util.List;
public class ParkingLot {
    //necessary data attributes as per the requirements
    List<ParkingFloor> parkingFloors;
    List<EntranceGate> entranceGateList;
    List<ExitGate> exitGateList;

    //meta data
    String parkingLotName;
    Address address;

    //two methods
    boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle){
        return false;
    }
    boolean updateParkingAttendent(ParkingAttendant parkingAttendant,int gateId){
        return false;
    }


}
