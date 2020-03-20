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
            System.out.println(" 종료합니다");
            break;
         }
         switch(menu) {
         case 1: //데이터등록
            service.inputData();
            break;
         case 2: //데이터출력
            
            service.showData();
            break;
         case 3: //데이터검색
            service.selectData();
            break;
         case 4: //데이터삭제
            service.deleteData();
            break;            
         default:
            System.out.println("잘못입력하셨습니다.");
            break;
         }//스위치끝
      }//루프끝
   }//메인끝

}//클래스끝