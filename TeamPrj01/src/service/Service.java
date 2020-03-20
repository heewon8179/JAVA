package service;

import java.util.ArrayList;
import java.util.Scanner;
import dto.*;

public class Service {
   private static ArrayList<ManagerInfo> pList = new ArrayList<ManagerInfo>();
   Scanner scan = new Scanner(System.in);

   public void title() {
      System.out.println(" ======================");
      System.out.println("������������������Ρ�������������");
      System.out.println(" ======================");
      System.out.println("�������������� �޴���������������\n");
      System.out.println(" -->> 1.���");
      System.out.println(" -->> 2.���");
      System.out.println(" -->> 3.�˻�");
      System.out.println(" -->> 4.����");
      System.out.println(" -->> 0.����");
      System.out.println(" ======================");
      System.out.println(" "+pList.size()+"���� ����� ������ �ֽ��ϴ�.");
      System.out.print(" ����>>");

   }


   public void inputData() {
      ManagerInfo managerinfo = new ManagerInfo();
      int menu;
      System.out.print(" ��¥: ");
      managerinfo.setDate(scan.nextLine());
      System.out.print(" ����: ");
      managerinfo.setMname(scan.nextLine());
      System.out.println("1.���� 2.����");
      menu = Integer.parseInt(scan.nextLine());
      switch(menu){
      case 1:      
         System.out.print(" ���Աݾ�: ");
         managerinfo.setIncomeMoney(Integer.parseInt(scan.nextLine()));
         break;      
      case 2:
         System.out.print(" ����ݾ�: ");
         managerinfo.setSpendMoney(Integer.parseInt(scan.nextLine()));
         break;
      default:
         System.out.println(" �߸��Է��ϼ̽��ϴ�.");   
         break;
      }
      pList.add(managerinfo);
   }

   public void showData() {
      int incomeSum=0;
      int spendSum=0;
      System.out.println(" ��"+pList.size()+"���� ����� ������ �ֽ��ϴ�.");

      for(int i = 0; i < pList.size(); i++) {
         ManagerInfo managerinfo = pList.get(i);
         managerinfo.show();
         
         incomeSum += managerinfo.getIncomeMoney(i);
         spendSum += managerinfo.getSpendMoney(i);
      }
      System.out.println("=======================");
      System.out.println("�� ����: "+incomeSum);
      System.out.println("�� ����: "+spendSum);
   }


   public void selectData() {
         //�˻�(ã���� �ϴ�) �̸��� �Է¹޴´�.
         System.out.print("�˻���¥ : ");
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
            System.out.println("�˻� ��� ����.");
         }
      }
      
      
      
      

   public void deleteData() {
         System.out.print("�˻��̸� : ");
         String sdate = scan.nextLine();
            
         int i;
         
         for(i = 0; i < pList.size(); i++) {
            ManagerInfo p = pList.get(i);
            if(sdate.equals(p.getDate())) {
               pList.remove(pList.get(i));
               break;
            }
            
         }
         System.out.println("���� �Ϸ�");
      }

}