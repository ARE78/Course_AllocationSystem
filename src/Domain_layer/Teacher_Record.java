package Domain_layer;

import java.time.LocalDate;

public class Teacher_Record {
	private int t_Id;
    private String t_fName;
    private String t_lName;
    private String t_qualification;
    private LocalDate t_joiningDate;

    public void TeacherRecord(int userId, String userName, String password, int t_Id, String t_fName, String t_lName,
                         String t_qualification, LocalDate t_joiningDate) {
        super(userId, userName, password);
        this.t_Id = t_Id;
        this.t_fName = t_fName;
        this.t_lName = t_lName;
        this.t_qualification = t_qualification;
        this.t_joiningDate = t_joiningDate;
    }

    // ... (other methods)


	

}
