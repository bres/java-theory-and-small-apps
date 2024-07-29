package smallApps.shopping;

public class Cd implements ShoppingItem{

    //fields
    private String cdId;
    private String cdtitle;
    private String cdProducer;

    //default constructor
    public Cd() {
    }

    //overloaded constructor
    public Cd(String cdId, String cdtitle, String cdProducer) {
        this.cdId = cdId;
        this.cdtitle = cdtitle;
        this.cdProducer = cdProducer;
    }

    public String getCdId() {
        return cdId;
    }

    public void setCdId(String cdId) {
        this.cdId = cdId;
    }

    public String getCdtitle() {
        return cdtitle;
    }

    public void setCdtitle(String cdtitle) {
        this.cdtitle = cdtitle;
    }

    public String getCdProducer() {
        return cdProducer;
    }

    public void setCdProducer(String cdProducer) {
        this.cdProducer = cdProducer;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "cdId='" + cdId + '\'' +
                ", cdtitle='" + cdtitle + '\'' +
                ", cdProducer='" + cdProducer + '\'' +
                '}';
    }
}
