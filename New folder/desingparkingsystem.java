public class ParkingSystem {
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        // Map carType (1, 2, 3) to array index (0, 1, 2)
        if (slots[carType - 1] > 0) {
            slots[carType - 1]--;
            return true;
        }
        return false;
    }
}