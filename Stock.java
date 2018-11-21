import java.util.*;

class Stock extends Character{
	int investCost =0;
	int numofstock =0;
	
	Stock(){
		
	}

	int prob = (int)(Math.random() * 100); //비교 확률 
	int p1 = (int)(50 + Math.random()*30); // 삼전 확률 
	int p2 = (int)(20 + Math.random()*10);
	int p3 = (int)(10 + Math.random()*10);
	int m1 = (int)(Math.random()*10+2); //삼전 배당금?  
	int m2 = (int)(Math.random()*10+2);
	int m3 = (int)(Math.random()*10+2);
		
	public int [] choice(){
		int [] stockinfo = new int [2];
		Scanner s = new Scanner(System.in);
		// 확률이랑 배당금 조정하는거는 음 얼마씩 하는게 좋을지 몰라서 그냥 똑같이둠.
		System.out.print("\n\t<< 오늘의 투자 현황>>\n\n");
		System.out.printf("\t\t- 삼성전자 주식 %d 퍼센트 확률로 배당금 %d배 . \n",p1,m1);
		System.out.printf("\t\t- 부동산 투자 %d 퍼센트 확률로 수익금 %d배 . \n",p2,m2);
		System.out.printf("\t\t- 비트코인 투자 %d 퍼센트 확률로 배당금 %d배 . \n",p3,m3);
		
		
		while(true){
			System.out.print("\n\t<< 투자처를 입력하세요. (숫자로 입력) >>\n\n");
			System.out.print("\t\t1.삼성전자주식\n");
			System.out.print("\t\t2.부동산투자\n");
			System.out.print("\t\t3.비트코인\n");
			System.out.print("\t\t\t\t 선택 : ");
			
			try{
				 numofstock= s.nextInt();
				 
				 if((numofstock==1)||(numofstock==2)||(numofstock==3)) break;
				 System.out.println(">>Error : 1,2,3 중에 선택해 주세요.");
				 System.out.println(">>올바른 투자처를 입력하세요.");
			}catch(NumberFormatException nfe){
				s.nextLine();
				System.out.println(">>Error : 1,2,3 중에 선택해 주세요.\n");
				System.out.println(">>올바른 투자처를 입력하세요.");
			}catch(Exception e){
				s.nextLine();
				System.out.println(">>Error : 1,2,3 중에 선택해 주세요.\n");
				System.out.println(">>올바른 투자처를 입력하세요.");
			}
		}		
		System.out.println();
		
		while(true){	
			System.out.print("\t<< 얼마를 투자하시겠습니까?(숫자로 입력) >>\n");
			
			System.out.print("\n\t\t\t\t 투자금액 : ");
			try{
				investCost = s.nextInt();
				if(investCost <= total) {
					System.out.println();
					break;
				}
				else System.out.println(">>잔액보다 더 많이 투자 하실 수 없습니다.\n");
			}catch(NumberFormatException nfe){
				s.nextLine();
				System.out.println(">>잘못입력하였습니다.\n");
				continue;
			}catch(Exception e){
				s.nextLine();
				System.out.println(">>잘못입력하였습니다.\n");
				continue;
			}
		}
		stockinfo[0] = numofstock;
		stockinfo[1] = investCost;
	
		return stockinfo;
	}
	
	public void goStock(int numofstock, int investCost){
		
		if(numofstock == 1){
			
			if(prob < p1){
				for(int i=0; i<3; i++){
					try {
						Thread.sleep(300);
						}		
					catch(Exception e) {
						System.out.print(e);
						}
							System.out.println("\t\t..두둥두둥..");
					}
					System.out.println();
				System.out.print(">>투자에 성공하였습니다!\n");
				
				investInput = investCost*m1;
			}
			else {
				for(int i=0; i<3; i++){
					try {
						Thread.sleep(300);
					}		
					catch(Exception e) {
						System.out.print(e);
					}
							System.out.println("\t\t..두둥두둥..");
					}
					System.out.println();
				System.out.print(">>투자에 실패하였습니다. \n");
				
				
				investInput = 0;
		}
		}
		else if(numofstock == 2){
			
			if(prob < p2){
				for(int i=0; i<3; i++){
					try {
						Thread.sleep(300);
						}		
					catch(Exception e) {
						System.out.print(e);
						}
							System.out.println("\t\t..두둥두둥..");
					}System.out.println();
				
				System.out.print(">>투자에 성공하였습니다! \n"); 
				investInput = investCost*m2;
			}
			else{
				for(int i=0; i<3; i++){
					try {
						Thread.sleep(300);
					}		
					catch(Exception e) {
						System.out.print(e);
					}
							System.out.println("\t\t..두둥두둥..");
					}System.out.println();
				System.out.print(">>투자에 실패하였습니다. \n");
				
				investInput = 0;
			}
		}
		else if(numofstock == 3){
			
			if(prob < p3){
				for(int i=0; i<3; i++){
					try {
						Thread.sleep(300);
						}		
					catch(Exception e) {
						System.out.print(e);
						}
							System.out.println("\t\t..두둥두둥..");
					}System.out.println();
				
				System.out.print(">>투자에 성공하였습니다! \n"); 
				investInput = investCost*m3;
			}
			else{
				for(int i=0; i<3; i++){
					try {
						Thread.sleep(300);
					}		
					catch(Exception e) {
						System.out.print(e);
					}
							System.out.println("\t\t..두둥두둥..");
					}System.out.println();
				System.out.print(">>투자에 실패하였습니다. \n"); 
				investInput = 0;	
			}
		}
			if (charnum==2) investInput *= 2;
		
		if(investInput != 0) super.totalUp(investInput);
		else if(investInput == 0)
			{ 
				super.totalDown(investCost);
			}
	}
}
	


		
		
		
	
	
	
	
	
	
	

	
	
