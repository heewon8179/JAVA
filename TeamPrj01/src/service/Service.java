package service;

import java.util.ArrayList;
import java.util.Scanner;
import dto.*;

public class Service {
   private static ArrayList<ManagerInfo> pList = new ArrayList<ManagerInfo>();
   Scanner scan = new Scanner(System.in);

   public void title() {
      System.out.println(" ======================");
      System.out.println("　　　　　　　가계부　　　　　　　");
      System.out.println(" ======================");
      System.out.println("　　　　　　　 메뉴　　　　　　　\n");
      System.out.println(" -->> 1.등록");
      System.out.println(" -->> 2.출력");
      System.out.println(" -->> 3.검색");
      System.out.println(" -->> 4.삭제");
      System.out.println(" -->> 0.종료");
      System.out.println(" ======================");
      System.out.println(" "+pList.size()+"개의 입출금 내역이 있습니다.");
      System.out.print(" 선택>>");

   }


   public void inputData() {
      ManagerInfo managerinfo = new ManagerInfo();
      int menu;
      System.out.print(" 날짜: ");
      managerinfo.setDate(scan.nextLine());
      System.out.print(" 내역: ");
      managerinfo.setMname(scan.nextLine());
      System.out.println("1.수입 2.지출");
      menu = Integer.parseInt(scan.nextLine());
      switch(menu){
      case 1:      
         System.out.print(" 수입금액: ");
         managerinfo.setIncomeMoney(Integer.parseInt(scan.nextLine()));
         break;      
      case 2:
         System.out.print(" 지출금액: ");
         managerinfo.setSpendMoney(Integer.parseInt(scan.nextLine()));
         break;
      default:
         System.out.println(" 잘못입력하셨습니다.");   
         break;
      }
      pList.add(managerinfo);
   }

   public void showData() {
      int incomeSum=0;
      int spendSum=0;
      System.out.println(" 총"+pList.size()+"개의 입출금 내역이 있습니다.");

      for(int i = 0; i < pList.size(); i++) {
         ManagerInfo managerinfo = pList.get(i);
         managerinfo.show();
         
         incomeSum += managerinfo.getIncomeMoney(i);
         spendSum += managerinfo.getSpendMoney(i);
      }
      System.out.println("=======================");
      System.out.println("총 수입: "+incomeSum);
      System.out.println("총 지출: "+spendSum);
   }


   public void selectData() {
         //검색(찾고자 하는) 이름을 입력받는다.
         System.out.print("검색날짜 : ");
         String sname = scan.nextLine();
         
         
         int i;
         
         for(i = 0; i < pList.size(); i++) {
            ManagerInfo p = pList.get(i);
            if(sname.equals(p.getDate())) {
              p.show();
               break;
            }
         }
         
         if(i == pList.size()) {
            System.out.println("검색 결과 없음.");
         }
      }
      
      
      
      

   public void deleteData() {
         System.out.print("검색이름 : ");
         String sdate = scan.nextLine();
            
         int i;
         
         for(i = 0; i < pList.size(); i++) {
            ManagerInfo p = pList.get(i);
            if(sdate.equals(p.getDate())) {
               pList.remove(pList.get(i));
               break;
            }
            
         }
         System.out.println("삭제 완료");
      }

}