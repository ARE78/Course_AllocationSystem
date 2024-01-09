package Domain_layer;

public class Administrator {
	private int adm_Id;
    private String adm_fName;
    private String adm_lName;

    public Administrator(int userId, String userName, String password, int adm_Id, String adm_fName, String adm_lName) {
        super(userId, userName, password);
        this.adm_Id = adm_Id;
        this.adm_fName = adm_fName;
        this.adm_lName = adm_lName;
    }

    // ... (other methods)


}
