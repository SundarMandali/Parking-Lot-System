package parking_lot;
import java.util.Date;
public class ParkingTicket {
    int ticketId;
    int floorNo;
    int spaceId;
    Date vehicleEntryDateTime;
    Date vehicleExitDateTime;
    ParkingSpaceType parkingSpaceType;
    double totalCost;
    ParkingTicketStatus parkingTicketStatus;

    public void updateTotalCost() {

    }

    public void updateVehicleExitTime(Date vehicleExitDateTime) {

    }
}
