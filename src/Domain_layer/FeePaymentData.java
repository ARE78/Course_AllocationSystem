package Domain_layer;

import java.time.LocalDate;

public class FeePaymentData {
	 private int fee_Id;
	    private boolean paymentStatus;
	    private LocalDate fee_dueDate;
	    private LocalDate fee_submDate;
	    private int s_Id;
	    private int prg_Id;

	    public FeePaymentData(int fee_Id, boolean paymentStatus, LocalDate fee_dueDate, LocalDate fee_submDate, int s_Id, int prg_Id) {
	        this.fee_Id = fee_Id;
	        this.paymentStatus = paymentStatus;
	        this.fee_dueDate = fee_dueDate;
	        this.fee_submDate = fee_submDate;
	        this.s_Id = s_Id;
	        this.prg_Id = prg_Id;
	    }

	    // ... (other methods)


}
