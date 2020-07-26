package assignment6.com;

public class Customer {
	   private String CustNo ;
	   private String CustName;
	   private String CustCategory;
	    
	   void CustomerInfo(String  Dt1, String akku, String gold)
	   {
	       
	       CustNo = Dt1;
	       CustName = akku;
	       CustCategory = gold;
	   }
	  
	   public String getCustNo() {
	       return CustNo;
	   }
	   public void setCustNo(String Custno) {
	       this.CustNo = Custno;
	   }
	   public String getCustName() {
	       return CustName;
	   }
	   public void setCustName(String CustName) {
	       this.CustName = CustName;
	   }
	   public String getCustCategory() {
	       return CustCategory;
	   }
	   public void setCustCategory(String CustCategory) {
	       this.CustCategory = CustCategory;
	   }
 

}
