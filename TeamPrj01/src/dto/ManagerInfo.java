package dto;

public class ManagerInfo {
   private String mname;   
   private int incomeMoney;   
   private int spendMoney;
   private String date;
   
   public String getMname() {
      return mname;
   }
   public void setMname(String mname) {
      this.mname = mname;
   }
   public int getIncomeMoney() {
      return incomeMoney;
   }
   public void setIncomeMoney(int incomeMoney) {
      this.incomeMoney = incomeMoney;
   }
   public int getSpendMoney() {
      return spendMoney;
   }
   public void setSpendMoney(int spendMoney) {
      this.spendMoney = spendMoney;
   }
   public String getDate() {
      return date;
   }
   public void setDate(String date) {
      this.date = date;
   }
   public int getIncomeMoney(int i) {
      // TODO Auto-generated method stub
      return incomeMoney;
   }
   public int getSpendMoney(int i) {
      // TODO Auto-generated method stub
      return spendMoney;
   }
   public void show() {
   System.out.println("=======================");
   System.out.println("내역: " + mname);
   System.out.println("날짜: " + date);
   System.out.println("수입: " + incomeMoney);
   System.out.println("지출: " + spendMoney);
   }

   
}