import java.util.*;

class Game extends Character{

 static int Game1Answer,randomNum,GameSelect,GameMoney,cnt=0;
 static String Game2Answer,ComGame2Answer,First="★★미니게임에 오신걸 환영합니다!!★★  ";

 Game(){

 }
 
  void GameS(){
	 cnt=0;
	 System.out.print("\n=========================================================\n");
		for(int i=0;i<First.length();i++){

			System.out.printf("%c",First.charAt(i));

			try{

				Thread.sleep(100);

			}catch(Exception e){

				System.out.print(e);

			}
		}
		 Scanner Input = new Scanner(System.in);
		 
		while(true){
			
		 System.out.printf("\n미니게임을 선택해주세요. 1)숫자 맞추기, 2)가위바위보\n(숫자로 입력해주세요)>>");

			try{
				 GameSelect=Integer.parseInt(Input.nextLine());
				 if(GameSelect==1 || GameSelect==2) break;
				 System.out.println("잘못입력하셨습니다. 1 , 2 를 입력해주세요!");
			}catch(NumberFormatException nfe){
				Input.nextLine();
				System.out.println("잘못입력하셨습니다. 1 , 2 를 입력해주세요!");
			}catch(Exception e){
				Input.nextLine();
				System.out.println("잘못입력하셨습니다. 1 , 2 를 입력해주세요!");
			}
		
		}
		
	 System.out.printf("%d번 게임을 선택하셨습니다.",GameSelect);


	 while(true){
		System.out.printf("얼마를 배팅하시겠습니까?(만원)>>");
		try{
			
			GameMoney= Input.nextInt();
			if(GameMoney>super.total) System.out.printf("\n배팅금액만큼의 돈을 보유하고 있지 않습니다.보유 금액:%d만원\n", super.total);
		else if(GameMoney<=super.total) break;
		}catch(InputMismatchException ime){
			System.out.println(" 숫자로 입력해주세요 ");
			Input.nextLine();
		}
		
	}
	if(GameSelect==1) Game1(GameMoney);
	 else if(GameSelect==2) Game2(GameMoney);
 
 }

 
  void Game1(int GameMoney){

	System.out.printf("숫자 맞추기 게임을 진행하겠습니다. 0~100사이의 숫자를 추측해보세요!\n☆☆☆☆상금☆☆☆☆\n");


		for(int i=0;i<7;i++){
			System.out.printf("%d번만에 맞출경우 : 배팅금액 * %d 지급\n",i+1,7-i);
		}


	randomNum=(int)(Math.random()*100+1);

 
	while(true){

		Scanner Input = new Scanner(System.in);
		
		if(cnt==6) {
			System.out.printf("마지막 기회입니다!! 신중하세요!!\n");
		}
		else if(cnt==7){

			
			System.out.printf("-------------------------------------------------\n아쉽습니다. 배팅 기회를 모두 잃으셨습니다. 정답은 %d입니다.\n",randomNum); 
			super.totalDown(GameMoney);

			break;
		}

		

		while(true){
			System.out.print("\n추측 숫자>>");
			
			try{
				Game1Answer=Input.nextInt();
				if(Game1Answer>=0 && Game1Answer<=100) break;
				System.out.printf(" ※ 입력 오류 ※  0~100사이의 숫자로 추측해주세요!!\n\n");	
			}catch(InputMismatchException ime){
				System.out.println(" 숫자로 입력해주세요 ");
				Input.nextLine();
			}
			
		

		}
	    cnt++;

		
	    if(Game1Answer==randomNum){
			if(charnum == 3) {
				System.out.printf("정답입니다. %d번 만에 맞추셨습니다.\n %d*%d*2 = %d 만원이 지급됩니다. \n프로게이머 캐릭터 선택효과로 2배의 금액이 지급되었습니다.\n",cnt,GameMoney,7-cnt+1,GameMoney*(7-cnt+1)*2);
				GameMoney=2*GameMoney*((7-cnt+1));
			}
			else {
				System.out.printf("정답입니다. %d번 만에 맞추셨습니다.\n %d*%d = %d 만원이 지급됩니다.\n",cnt,GameMoney,7-cnt+1,GameMoney*(7-cnt+1));
				GameMoney= GameMoney*((7-cnt+1));
		
			}

			super.totalUp(GameMoney);
			break;
	    }

		else if(Game1Answer>randomNum) System.out.println("추측 숫자가 답보다 큽니다");

		else System.out.println("추측 숫자가 답보다 작습니다");
		}
	}


	 void Game2(int GameMoney){

 
		System.out.printf("가위바위보 게임을 진행하겠습니다.\n☆☆☆☆상금☆☆☆☆\n이길경우 2배 제공, 패배할경우 배팅금액 손실,비길경우 손실없음\n\n");
		Scanner Input = new Scanner(System.in);

		
		while(true){
			System.out.printf("무엇을 내시겠습니까? 바위,가위,보>>");
			Game2Answer=Input.nextLine();


			if(Game2Answer.equals("바위") || Game2Answer.equals("가위") || Game2Answer.equals("보")) break;

			System.out.printf("※ 입력 오류 ※  바위, 가위, 보 중에 입력해주세요!!\n\n");
		}

		if(Game2Answer.equals("바위")) Game1Answer=0;
		else if(Game2Answer.equals("가위")) Game1Answer=1;
		else Game1Answer=2;

		randomNum=(int)(Math.random()*3);

		if(randomNum==0) {
			ComGame2Answer="바위";
			System.out.printf("상대방 : 바위\n");
		}

 
		else if(randomNum==1) {
			ComGame2Answer="가위";
			System.out.printf("상대방 : 가위\n");
		}

 
		else {
			ComGame2Answer="보";
			System.out.printf("상대방 : 보\n");
		}

		System.out.printf(" %s vs %s 이므로 ",Game2Answer,ComGame2Answer);


		switch(Game1Answer){
			case 0:
			if(randomNum==0) {
				System.out.printf("비겼습니다.\n");
				totalUp(0);
			}
			
			else if(randomNum==1) {
				System.out.printf("당신이 이겼습니다.\n");
				
				if(charnum == 3) {
					super.totalUp(GameMoney*4);
					System.out.printf("프로게이머 캐릭터 선택효과로 2배의 금액이 지급됩니다.\n");
				}
				else super.totalUp(GameMoney*2);
			}

			else {
				System.out.printf("당신이 졌습니다.");
				super.totalDown(GameMoney);
			}

			break;

			case 1:
			if(randomNum==0) {	
				System.out.printf("당신이 졌습니다.\n");
				super.totalDown(GameMoney);
			}

			else if(randomNum==1) {
				System.out.printf("비겼습니다.\n");
			totalUp(0);}

			else {
				System.out.printf("당신이 이겼습니다.");
				if(charnum == 3) {
					super.totalUp(GameMoney*4);
					System.out.printf("프로게이머 캐릭터 선택효과로 2배의 금액이 지급됩니다.\n");
				}
				else super.totalUp(GameMoney*2);
			}

			break;

			case 2:
			if(randomNum==0) {
				System.out.printf("당신이 이겼습니다.\n");
				if(charnum == 3) {
					super.totalUp(GameMoney*4);
					System.out.printf("프로게이머 캐릭터 선택효과로 2배의 금액이 지급됩니다.\n");
				}
				else super.totalUp(GameMoney*2);
			}

			else if(randomNum==1) {
				System.out.printf("당신이 졌습니다.\n");
				super.totalDown(GameMoney);
				}
				
			else {
				System.out.printf("비겼습니다.");
				totalUp(0);
			}

			break;


			default :

 			break;
		}

		

	}

}