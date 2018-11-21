import java.io.*;

import java.util.Scanner;

class Billion{
	public static void main(String [] args){
		//게임 시작
		char [] title = {'1','억','만','들','기','게','임'};
		System.out.println();
		for(int j=0; j<2; j++){
			System.out.print("\t\t");
			for(int i=0; i<20; i++){
				try{
					Thread.sleep(20);
				}catch(Exception e){
					System.out.print(e);
				}
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.print("\t\t");
		for(int i=0; i<7; i++){
			
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				System.out.print(e);
			}
			System.out.printf("%c ",title[i]);
		}
		System.out.println();
		for(int j=0; j<2; j++){
			System.out.print("\t\t");
			for(int i=0; i<20; i++){
				try{
					Thread.sleep(20);
				}catch(Exception e){
					System.out.print(e);
				}
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println();
		//게임 소개
		File file = new File("자바 소개 input.txt");
		if(file.exists()==false){
			System.out.println("파일이 존재하지 않습니다.");
			System.exit(0);
		}
		try{
			Scanner Scan = new Scanner(file);
			while(Scan.hasNext()){
				System.out.println(Scan.nextLine());
			}
			Scan.close();
		}catch(FileNotFoundException e){
			System.out.print("파일 열기 실패");
		}
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		
		int cntLabor=1; //노동 횟수
		int cntStock=0; //투자 횟수
		int cntGame=0; //게임 횟수
		String type; //노동,투자,게임 선택
		
		Character.choiceChar(); //캐릭터 선택 - 게임 시작시 최초 1회
		
		Labor q = new Labor();
		q.randomLabor(); //처음은 노동 실행
		Character.printCount(cntLabor,cntStock,cntGame);
		System.out.print("\n=========================================================\n");
		while(true){
			if((cntLabor > 0) && (Character.total <= 0)){
				System.out.printf("@@@@@당신은 파산하였습니다@@@@@.\n 폴더에 도착한 게임 내역을 확인해주세요.");
				try{
					File f1 = new File("게임결과[실패].txt");
					PrintWriter pw = new PrintWriter(f1);
					pw.printf("1억모으기 게임에 실패하였습니다.");
					pw.printf("[게임 분석] \n노동 횟수:%d 번, 투자 횟수:%d 번, 게임 횟수:%d 번\n",cntLabor,cntStock,cntGame);
					pw.println("");
					if(cntStock>(cntLabor+cntStock+cntGame)/3) pw.printf("투자를 즐겨하시는군요! 실생활에서 투자에 많은 돈을 투자하면 망할 수 있습니다.");
					else if(cntGame>(cntLabor+cntStock+cntGame)/3) pw.printf("게임을 즐겨하시는군요! 실생활에서 게임에 많은 돈을 투자하면 망할 수 있습니다.");
					else  pw.printf("노동만 하면.. 돈을 모으는데 시간이 오래걸립니다. 가끔은 투자와 게임을 즐겨주세요.");
					pw.println("");
					pw.close();
				}catch(FileNotFoundException fnfe){
					System.out.println("파일 이미 존재");
				}
				break;
			}
			else if(Character.total >= 10000){
				System.out.printf("당신은 1억 만들기에 성공 하셨습니다!!!!\n 폴더에 도착한 게임 내역을 확인해주세요.");
				try{
					File f1 = new File("게임결과[성공].txt");
					PrintWriter pw = new PrintWriter(f1);
					pw.printf("1억모으기 게임에 성공하였습니다.");
					pw.printf("\n[게임 분석]\n 노동 횟수:%d 번, 투자 횟수:%d 번, 게임 횟수:%d 번\n",cntLabor,cntStock,cntGame);
					pw.println("");
					if(cntStock>(cntLabor+cntStock+cntGame)/3) pw.printf("투자를 즐겨하시는군요! 게임에서는 1억 모으기에 성공했으나, 실생활에서 투자에 많은 돈을 투자하면 망할 수 있습니다.");
					else if(cntGame>(cntLabor+cntStock+cntGame)/3) pw.printf("게임을 즐겨하시는군요! 게임에서는 1억 모으기에 성공했으나, 실생활에서 게임에 많은 돈을 투자하면 망할 수 있습니다.");
					else pw.printf("게임에서는 1억 모으기에 성공했으나, 노동만 하면.. 돈을 모으는데 시간이 오래걸립니다. 가끔은 투자와 게임을 즐겨주세요.");
					pw.close();
				}catch(FileNotFoundException fnfe){
					System.out.println("파일 존재");
				}
				break;
			}
			else{			
				while(true){	
					System.out.print("\n\t<< 무슨 일을 하시겠습니까? (문자로 입력) >>\n\n");
					System.out.print("\t\t1. 노동 (자동으로 시작)\n");
					System.out.print("\t\t2. 투자\n");
					System.out.print("\t\t3. 미니게임\n");
					System.out.print("\t\t\t\t 선택 : ");
					type = s.next();
			
					if(type.equals("노동")) {
						cntLabor++;
						break;
					}
					else if((type.equals("투자")) && (Character.total != 0)){
						cntStock++;
						break;
					}
					else if((type.equals("미니게임")) && (Character.total != 0)){
						cntGame++;
						break;
					}
					/* else if(((type.equals("투자")) || (type.equals("미니게임")))  && (Character.total == 0)){
						System.out.println(">>0 원일때는 무조건 노동하셔야죠 ㅎㅎ");
						System.out.println(">>자동으로 노동이 실행됩니다.");
						Labor w = new Labor();
						w.randomLabor();//노동하고 '땡땡만원을 벌었습니다. 잔액 땡땡만원' 출력
						cntLabor++;
						Character.printCount(cntLabor,cntStock,cntGame); //횟수 출력
						break;
					} */
					else System.out.println(">>잘못 입력하셨네요. 다시 선택해주세요");
				}
				switch (type){
				case "노동" :  	Labor l = new Labor();
								l.randomLabor();//노동하고 '땡땡만원을 벌었습니다. 잔액 땡땡만원' 출력
								Character.printCount(cntLabor,cntStock,cntGame); //횟수 출력
								System.out.print("\n=========================================================\n");
								break;
							
				case "투자" :		Stock sto = new Stock();
																
								int [] getinfo = sto.choice();//투자처 선택
								
								sto.goStock(getinfo[0],getinfo[1]);//주식 투자 실행 
									
								Character.printCount(cntLabor,cntStock,cntGame); //횟수 출력
								System.out.print("\n=========================================================\n");
								break;
								
				case "미니게임": 	Game G1 = new Game(); 
								G1.GameS();
								Character.printCount(cntLabor,cntStock,cntGame); //횟수 출력
								System.out.print("\n=========================================================\n");
								break;
				}
			}
		}
	}			
}
	
	
		

	
	
	
	
