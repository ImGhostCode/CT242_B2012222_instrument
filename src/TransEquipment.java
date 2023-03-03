public interface TransEquipment {
    public String getTime();

    public String readSensor();

    public void saveData();

    public int sendData(String serverID, String account, String password, String strData, String strTime);

    public void send();

}
