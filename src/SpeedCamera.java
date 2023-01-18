public class SpeedCamera {

    String code;
    int roadNumber;
    int maxSpeed;
    String[] overSpeedCars;

    public SpeedCamera(String code, int roadNumber, int maxSpeed, String[] overSpeedCars) {
        this.code = code;
        this.roadNumber = roadNumber;
        this.maxSpeed = maxSpeed;
        this.overSpeedCars = overSpeedCars;
    }

    public String getCode() {
        return code;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String[] getOverSpeedCars() {
        return overSpeedCars;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setOverSpeedCars(String[] overSpeedCars) {
        this.overSpeedCars = overSpeedCars;
    }

    //create a method that get a code and the driving max speed if the speed higher than the  max speed add the car to a list and return true or false
    public boolean addCar(String code, int speed) {
        if (speed > maxSpeed) {
            overSpeedCars[overSpeedCars.length] = code;
            return true;
        } else {
            return false;
        }
    }





}
