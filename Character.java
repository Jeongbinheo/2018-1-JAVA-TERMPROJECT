import java.util.Scanner;

class Character{
	int workInput;//노동 수입
	int investInput;//투자 수입
	
	int gameInput;//게임 지출
	int investCost; //투자 지출
	int GameMoney; //게임 지출
	
	public static int charnum;//선택한 캐릭터 번호
	public static int total=0;//현재 잔액
		
	Character(){}//default 생성자
	public static void choiceChar(){
		while(true){ //캐릭터 1~3 아니면 다시 선택, 1~3이면 while 종료
			
			Scanner s = new Scanner(System.in);
			
			System.out.print("\t<< 캐릭터를 골라주세요.(숫자로 입력) >>\n\n");
			System.out.print("\t\t1.프로노동자\n");
			System.out.print("\t\t2.워렌버핏\n");
			System.out.print("\t\t3.프로게이머\n");
			System.out.print("\t\t\t\t 선택 : ");
			
			try{
				charnum =s.nextInt();
				
				if((charnum==1)||(charnum==2)||(charnum==3)){
					System.out.println();
					Character C1 = new Character(charnum); //캐릭터 생성
					break;
				}
				else System.out.println(">>Error : 1,2,3 중에 선택해 주세요.\n");
			}catch(NumberFormatException nfe){
				System.out.println(">>Error : 1,2,3 중에 선택해 주세요.\n");
				continue;
			}catch(Exception e){
				System.out.println(">>Error : 1,2,3 중에 선택해 주세요.\n");
				continue;
			}
		}
	}
	Character(int a){//캐릭터 생성자 (1~3 중에 선택)
		if (a==1){//프로노동자 선택
			System.out.print(">>프로노동자를 선택하였습니다.\n>>노동으로 2배의 수익을 얻을 수 있습니다.\n>>제일 먼저 노동으로 돈을 벌어야 합니다.");
			System.out.print("\n>>최초 실행시 노동은 랜덤으로 선택되어 자동으로 시작됩니다.\n"); 
		}
		else if(a==2){//투자가 선택
			System.out.print(">>워렌버핏를 선택하였습니다.\n>>투자로 2배의 수익을 얻을 수 있습니다.\n>>제일 먼저 노동으로 돈을 벌어야 합니다.");
			System.out.print("\n>>최초 실행시 노동은 랜덤으로 선택되어 자동으로 시작됩니다.\n"); 
		}
		else if(a==3){//프로게이머 선택
			System.out.print(">>프로게이머를 선택하였습니다.\n>>게임으로 2배의 수익을 얻을 수 있습니다.\n>>제일 먼저 노동으로 돈을 벌어야 합니다.");
			System.out.print("\n>>최초 실행시 노동은 랜덤으로 선택되어 자동으로 시작됩니다.\n"); 
		}	
	}
	
	static void totalUp(int input){//잔액+수입, 출력
		total = total + input;
		if(total >=10000){
			int quo = total/10000;
			int remain = total%10000;			
			System.out.println(">>"+input+"만원을 벌었습니다.\t\t\t"+"잔액 : " + quo +"억 "+ remain +"만원");
		}
		else System.out.println(">>"+input+"만원을 벌었습니다.\t\t\t"+"잔액 : " + total +"만원");
		
	}
	static void totalDown(int output){//잔액+지출, 출력
		total = total - output;
		System.out.println(">>"+output+"만원을 사용했습니다.\t\t\t"+ "잔액 : " + total +"만원");
		
	}
	public String toString(){//잔액
		return String.format("\n\n\n\t\t\t>>현재 소지금은 %d만원입니다.\n\n",total);
	}
	
	
	public static void printCount(int cntLabor, int cntStock, int cntGame){
		System.out.printf(">>노동 횟수 : %d, 투자 횟수 : %d, 게임 횟수 : %d\n", cntLabor, cntStock, cntGame);
	}
	
}