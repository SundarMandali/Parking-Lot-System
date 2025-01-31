package parking_lot;

public class ParkingAttendant extends Account{
    PaymentService paymentService;
    boolean processVehicleEntry(Vehicle vehicle){
        return false;
    }
    PaymentInfo processPayment(ParkingTicket parkingTicket,PaymentType paymentType){
        return new PaymentInfo();
    }
}
