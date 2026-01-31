package methodrefrenceInvoiceobjectcreation;

public class Invoice {

	int transctionId;
	
	public Invoice(int transctionId) {
		this.transctionId = transctionId;
	}
	
	public int gettransctionId() {
		return transctionId;
	}
	
	@Override
	public String toString () {
		return " The TransctionId id " + transctionId;
	}
}
