class Labor extends Character{
	
	Labor(){
	} //default 생성자
	
	void randomLabor(){//노동종류 랜덤으로 선택 후 workInput 값으로 반환
		int r = (int)(Math.random()*10);
		System.out.print("\n=========================================================\n");
		if(r < 3){//막노동 250만원 수입
			System.out.print("\n\t이번 달은 막노동이네... 하 힘들다...\n\n");
			for(int i=0; i<3; i++){
				try {Thread.sleep(2000);}
				catch(Exception e) {System.out.print(e);}
				System.out.println("\t개미는..뚠뚠..언제나..뚠뚠..열심히일을하네..뚠뚠..");
			}
			System.out.println();
			workInput = 250;
		}	
		else if(r>=3 && r<6){//인형탈알바 150만원 수입
			System.out.println("\n\t이번 달은 인형탈알바네... 힘들지만 재밋게 하자!!!!\n");
			for(int i=0; i<3; i++){
				try {Thread.sleep(1000);}
				catch(Exception e) {System.out.print(e);}
				System.out.println("\t ...뒤뚱 뒤뚱...");
			}
			System.out.println();
			workInput = 150;
		}
		else if(r>=6){//꿀알바 70만원 수입
			System.out.print("\n\t이번 달은 꿀알바다!!! ㅎㅎㅎ\n");
			for(int i=0; i<3; i++){
				try {Thread.sleep(500);}
				catch(Exception e) {System.out.print(e);}
				System.out.println("\t ...후다닥 후다닥...");
			}
			System.out.println();
			workInput = 70;
		}
		if (charnum==1) workInput *= 2; //캐릭터가 프로 노동자일 경우 금액 2배
		super.totalUp(workInput); //노동 수입 반환
	}
}