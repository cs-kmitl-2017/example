package receiver;

public class Receiver {
    
    private String receiverName;
    private int receiverID;
    private int Postcode;
    private String VillageNo;
    private String SubDistrictName;
    private String DistrictName;
    private String ProvinceName;
    
    //จังหวัด
    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    //อำเภอ
    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    //ตำบล
    public String getSubDistrictName() {
        return SubDistrictName;
    }

    public void setSubDistrictName(String SubDistrictName) {
        this.SubDistrictName = SubDistrictName;
    }

    //บ้านเลขที่
    public String getVillageNo() {
        return VillageNo;
    }

    public void setVillageNo(String VillageNo) {
        this.VillageNo = VillageNo;
    }

    //รหัสไปรษณีย์
    public int getPostcode() {
        return Postcode;
    }

    public void setPostcode(int Postcode) {
        this.Postcode = Postcode;
    }

    //รหัสผู้รับ
    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    //ชื่อผู้รับ
    public String getReceiverName() {
        return receiverName;
    }
   
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    
}