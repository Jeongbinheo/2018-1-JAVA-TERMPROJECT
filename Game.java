import java.util.*;

class Game extends Character{

 static int Game1Answer,randomNum,GameSelect,GameMoney,cnt=0;
 static String Game2Answer,ComGame2Answer,First="�ڡڹ̴ϰ��ӿ� ���Ű� ȯ���մϴ�!!�ڡ�  ";

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
			
		 System.out.printf("\n�̴ϰ����� �������ּ���. 1)���� ���߱�, 2)����������\n(���ڷ� �Է����ּ���)>>");

			try{
				 GameSelect=Integer.parseInt(Input.nextLine());
				 if(GameSelect==1 || GameSelect==2) break;
				 System.out.println("�߸��Է��ϼ̽��ϴ�. 1 , 2 �� �Է����ּ���!");
			}catch(NumberFormatException nfe){
				Input.nextLine();
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1 , 2 �� �Է����ּ���!");
			}catch(Exception e){
				Input.nextLine();
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1 , 2 �� �Է����ּ���!");
			}
		
		}
		
	 System.out.printf("%d�� ������ �����ϼ̽��ϴ�.",GameSelect);


	 while(true){
		System.out.printf("�󸶸� �����Ͻðڽ��ϱ�?(����)>>");
		try{
			
			GameMoney= Input.nextInt();
			if(GameMoney>super.total) System.out.printf("\n���ñݾ׸�ŭ�� ���� �����ϰ� ���� �ʽ��ϴ�.���� �ݾ�:%d����\n", super.total);
		else if(GameMoney<=super.total) break;
		}catch(InputMismatchException ime){
			System.out.println(" ���ڷ� �Է����ּ��� ");
			Input.nextLine();
		}
		
	}
	if(GameSelect==1) Game1(GameMoney);
	 else if(GameSelect==2) Game2(GameMoney);
 
 }

 
  void Game1(int GameMoney){

	System.out.printf("���� ���߱� ������ �����ϰڽ��ϴ�. 0~100������ ���ڸ� �����غ�����!\n�١١١ٻ�ݡ١١١�\n");


		for(int i=0;i<7;i++){
			System.out.printf("%d������ ������ : ���ñݾ� * %d ����\n",i+1,7-i);
		}


	randomNum=(int)(Math.random()*100+1);

 
	while(true){

		Scanner Input = new Scanner(System.in);
		
		if(cnt==6) {
			System.out.printf("������ ��ȸ�Դϴ�!! �����ϼ���!!\n");
		}
		else if(cnt==7){

			
			System.out.printf("-------------------------------------------------\n�ƽ����ϴ�. ���� ��ȸ�� ��� �����̽��ϴ�. ������ %d�Դϴ�.\n",randomNum); 
			super.totalDown(GameMoney);

			break;
		}

		

		while(true){
			System.out.print("\n���� ����>>");
			
			try{
				Game1Answer=Input.nextInt();
				if(Game1Answer>=0 && Game1Answer<=100) break;
				System.out.printf(" �� �Է� ���� ��  0~100������ ���ڷ� �������ּ���!!\n\n");	
			}catch(InputMismatchException ime){
				System.out.println(" ���ڷ� �Է����ּ��� ");
				Input.nextLine();
			}
			
		

		}
	    cnt++;

		
	    if(Game1Answer==randomNum){
			if(charnum == 3) {
				System.out.printf("�����Դϴ�. %d�� ���� ���߼̽��ϴ�.\n %d*%d*2 = %d ������ ���޵˴ϴ�. \n���ΰ��̸� ĳ���� ����ȿ���� 2���� �ݾ��� ���޵Ǿ����ϴ�.\n",cnt,GameMoney,7-cnt+1,GameMoney*(7-cnt+1)*2);
				GameMoney=2*GameMoney*((7-cnt+1));
			}
			else {
				System.out.printf("�����Դϴ�. %d�� ���� ���߼̽��ϴ�.\n %d*%d = %d ������ ���޵˴ϴ�.\n",cnt,GameMoney,7-cnt+1,GameMoney*(7-cnt+1));
				GameMoney= GameMoney*((7-cnt+1));
		
			}

			super.totalUp(GameMoney);
			break;
	    }

		else if(Game1Answer>randomNum) System.out.println("���� ���ڰ� �亸�� Ů�ϴ�");

		else System.out.println("���� ���ڰ� �亸�� �۽��ϴ�");
		}
	}


	 void Game2(int GameMoney){

 
		System.out.printf("���������� ������ �����ϰڽ��ϴ�.\n�١١١ٻ�ݡ١١١�\n�̱��� 2�� ����, �й��Ұ�� ���ñݾ� �ս�,����� �սǾ���\n\n");
		Scanner Input = new Scanner(System.in);

		
		while(true){
			System.out.printf("������ ���ðڽ��ϱ�? ����,����,��>>");
			Game2Answer=Input.nextLine();


			if(Game2Answer.equals("����") || Game2Answer.equals("����") || Game2Answer.equals("��")) break;

			System.out.printf("�� �Է� ���� ��  ����, ����, �� �߿� �Է����ּ���!!\n\n");
		}

		if(Game2Answer.equals("����")) Game1Answer=0;
		else if(Game2Answer.equals("����")) Game1Answer=1;
		else Game1Answer=2;

		randomNum=(int)(Math.random()*3);

		if(randomNum==0) {
			ComGame2Answer="����";
			System.out.printf("���� : ����\n");
		}

 
		else if(randomNum==1) {
			ComGame2Answer="����";
			System.out.printf("���� : ����\n");
		}

 
		else {
			ComGame2Answer="��";
			System.out.printf("���� : ��\n");
		}

		System.out.printf(" %s vs %s �̹Ƿ� ",Game2Answer,ComGame2Answer);


		switch(Game1Answer){
			case 0:
			if(randomNum==0) {
				System.out.printf("�����ϴ�.\n");
				totalUp(0);
			}
			
			else if(randomNum==1) {
				System.out.printf("����� �̰���ϴ�.\n");
				
				if(charnum == 3) {
					super.totalUp(GameMoney*4);
					System.out.printf("���ΰ��̸� ĳ���� ����ȿ���� 2���� �ݾ��� ���޵˴ϴ�.\n");
				}
				else super.totalUp(GameMoney*2);
			}

			else {
				System.out.printf("����� �����ϴ�.");
				super.totalDown(GameMoney);
			}

			break;

			case 1:
			if(randomNum==0) {	
				System.out.printf("����� �����ϴ�.\n");
				super.totalDown(GameMoney);
			}

			else if(randomNum==1) {
				System.out.printf("�����ϴ�.\n");
			totalUp(0);}

			else {
				System.out.printf("����� �̰���ϴ�.");
				if(charnum == 3) {
					super.totalUp(GameMoney*4);
					System.out.printf("���ΰ��̸� ĳ���� ����ȿ���� 2���� �ݾ��� ���޵˴ϴ�.\n");
				}
				else super.totalUp(GameMoney*2);
			}

			break;

			case 2:
			if(randomNum==0) {
				System.out.printf("����� �̰���ϴ�.\n");
				if(charnum == 3) {
					super.totalUp(GameMoney*4);
					System.out.printf("���ΰ��̸� ĳ���� ����ȿ���� 2���� �ݾ��� ���޵˴ϴ�.\n");
				}
				else super.totalUp(GameMoney*2);
			}

			else if(randomNum==1) {
				System.out.printf("����� �����ϴ�.\n");
				super.totalDown(GameMoney);
				}
				
			else {
				System.out.printf("�����ϴ�.");
				totalUp(0);
			}

			break;


			default :

 			break;
		}

		

	}

}