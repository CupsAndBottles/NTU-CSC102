
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
public class PlaneSeat implements Comparable {

    private int seatId, customerId;
    private boolean assigned;

    public PlaneSeat(int seat_id) {
        seatId = seat_id;
    }

    public int getSeatID() {
        return seatId;
    }

    public int getCustomerID() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        customerId = cust_id;
        assigned = true;
    }

    public void unAssign() {
        assigned = false;
    }

    public int compareTo(Object o) {
        if (o instanceof PlaneSeat) {

            PlaneSeat seat = (PlaneSeat) o;
            if (this.getSeatID() > seat.getSeatID()) {
                return 1;
            } else if (this.getSeatID() < seat.getSeatID()) {
                return -1;
            }
        }
        return 0;
    }
}
