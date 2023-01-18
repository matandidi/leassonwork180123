public class Car {
    //create a method isCarOverSpeed that get a code and print the camera number if the car over speed
    public void isCarOverSpeed(String code, SpeedCameraNetwork speedCameraNetwork) {
        for (int i = 0; i < speedCameraNetwork.speedCameras.length; i++) {
            for (int j = 0; j < speedCameraNetwork.speedCameras[i].getOverSpeedCars().length; j++) {
                if (speedCameraNetwork.speedCameras[i].getOverSpeedCars()[j].equals(code)) {
                    System.out.println(speedCameraNetwork.speedCameras[i].getRoadNumber());
                }
            }
        }
    }

    //if same car over speed in more then 1 cameras print the code
    public void isCarOverSpeedInMoreThenOneCamera(String code, SpeedCameraNetwork speedCameraNetwork) {
        int count = 0;
        for (int i = 0; i < speedCameraNetwork.speedCameras.length; i++) {
            for (int j = 0; j < speedCameraNetwork.speedCameras[i].getOverSpeedCars().length; j++) {
                if (speedCameraNetwork.speedCameras[i].getOverSpeedCars()[j].equals(code)) {
                    count++;
                }
            }
        }
        if (count > 1) {
            System.out.println(code);
        }
    }

}
