public class SpeedCameraNetwork {

        SpeedCamera[] speedCameras;

        public void addSpeedCamera(SpeedCamera speedCamera) {
            speedCameras[speedCameras.length] = speedCamera;
        }

        //create a method getIncreasedEnforcement  that print the road number if more then 200 cars over speed
          public void getIncreasedEnforcement() {
                for (int i = 0; i < speedCameras.length; i++) {
                 if (speedCameras[i].getOverSpeedCars().length > 200) {
                      System.out.println(speedCameras[i].getRoadNumber());
                 }
                }
          }




}
