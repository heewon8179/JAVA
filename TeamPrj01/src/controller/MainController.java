package controller;

import java.util.Scanner;

import dto.*;
import service.Service;

public class MainController {

   public static void main(String[] args) {
      Service service = new Service();
      Scanner scan = new Scanner(System.in);
      int menu=0;

      while(true){
         service.title();
         menu = Integer.parseInt(scan.nextLine());
         if(menu==0) {
            System.out.println(" �����մϴ�");
            break;
         }
         switch(menu) {
         case 1: //�����͵��
            service.inputData();
            break;
         case 2: //���������
            
            service.showData();
            break;
         case 3: //�����Ͱ˻�
            service.selectData();
            break;
         case 4: //�����ͻ���
            service.deleteData();
            break;            
         default:
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
            break;
         }//����ġ��
      }//������
   }//���γ�

}//Ŭ������