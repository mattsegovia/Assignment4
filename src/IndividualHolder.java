public class IndividualHolder extends AccountHolder{
    private String name;
    private String SNN;

    public IndividualHolder(int ID, String address, String name, String SNN) {
        super(ID, address);
        this.name = name;
        this.SNN = SNN;
    }

    public String getName() {
        return this.name;
    }

    public String getSNN() {
        return this.SNN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSNN(String SNN) {
        this.SNN = SNN;
    }
}
