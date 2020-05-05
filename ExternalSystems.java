class ExternalSystems {


    private double currentRpm;
    private double angularSpeed = 150;
    private Lights lights = new Lights();

    ExternalSystems() {

    }


    public double getCurrentRpm() {
        //sciagnij RPM z dostepnego miejsca
        return currentRpm;
    }



    public void setCurrentRpm(double currentRpm) {
        this.currentRpm = currentRpm;
    }

    public double getAngularSpeed() {
        return angularSpeed;
    }

    public void setAngularSpeed(double angularSpeed) {
        this.angularSpeed = angularSpeed;
    }

    public Lights getLights() {
        return lights;
    }
}
