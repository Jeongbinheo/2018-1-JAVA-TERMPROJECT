import java.util.Scanner;

class Character{
	int workInput;//�뵿 ����
	int investInput;//���� ����
	
	int gameInput;//���� ����
	int investCost; //���� ����
	int GameMoney; //���� ����
	
	public static int charnum;//������ ĳ���� ��ȣ
	public static int total=0;//���� �ܾ�
		
	Character(){}//default ������
	public static void choiceChar(){
		while(true){ //ĳ���� 1~3 �ƴϸ� �ٽ� ����, 1~3�̸� while ����
			
			Scanner s = new Scanner(System.in);
			
			System.out.print("\t<< ĳ���͸� ����ּ���.(���ڷ� �Է�) >>\n\n");
			System.out.print("\t\t1.���γ뵿��\n");
			System.out.print("\t\t2.��������\n");
			System.out.print("\t\t3.���ΰ��̸�\n");
			System.out.print("\t\t\t\t ���� : ");
			
			try{
				charnum =s.nextInt();
				
				if((charnum==1)||(charnum==2)||(charnum==3)){
					System.out.println();
					Character C1 = new Character(charnum); //ĳ���� ����
					break;
				}
				else System.out.println(">>Error : 1,2,3 �߿� ������ �ּ���.\n");
			}catch(NumberFormatException nfe){
				System.out.println(">>Error : 1,2,3 �߿� ������ �ּ���.\n");
				continue;
			}catch(Exception e){
				System.out.println(">>Error : 1,2,3 �߿� ������ �ּ���.\n");
				continue;
			}
		}
	}
	Character(int a){//ĳ���� ������ (1~3 �߿� ����)
		if (a==1){//���γ뵿�� ����
			System.out.print(">>���γ뵿�ڸ� �����Ͽ����ϴ�.\n>>�뵿���� 2���� ������ ���� �� �ֽ��ϴ�.\n>>���� ���� �뵿���� ���� ����� �մϴ�.");
			System.out.print("\n>>���� ����� �뵿�� �������� ���õǾ� �ڵ����� ���۵˴ϴ�.\n"); 
		}
		else if(a==2){//���ڰ� ����
			System.out.print(">>�������͸� �����Ͽ����ϴ�.\n>>���ڷ� 2���� ������ ���� �� �ֽ��ϴ�.\n>>���� ���� �뵿���� ���� ����� �մϴ�.");
			System.out.print("\n>>���� ����� �뵿�� �������� ���õǾ� �ڵ����� ���۵˴ϴ�.\n"); 
		}
		else if(a==3){//���ΰ��̸� ����
			System.out.print(">>���ΰ��̸Ӹ� �����Ͽ����ϴ�.\n>>�������� 2���� ������ ���� �� �ֽ��ϴ�.\n>>���� ���� �뵿���� ���� ����� �մϴ�.");
			System.out.print("\n>>���� ����� �뵿�� �������� ���õǾ� �ڵ����� ���۵˴ϴ�.\n"); 
		}	
	}
	
	static void totalUp(int input){//�ܾ�+����, ���
		total = total + input;
		if(total >=10000){
			int quo = total/10000;
			int remain = total%10000;			
			System.out.println(">>"+input+"������ �������ϴ�.\t\t\t"+"�ܾ� : " + quo +"�� "+ remain +"����");
		}
		else System.out.println(">>"+input+"������ �������ϴ�.\t\t\t"+"�ܾ� : " + total +"����");
		
	}
	static void totalDown(int output){//�ܾ�+����, ���
		total = total - output;
		System.out.println(">>"+output+"������ ����߽��ϴ�.\t\t\t"+ "�ܾ� : " + total +"����");
		
	}
	public String toString(){//�ܾ�
		return String.format("\n\n\n\t\t\t>>���� �������� %d�����Դϴ�.\n\n",total);
	}
	
	
	public static void printCount(int cntLabor, int cntStock, int cntGame){
		System.out.printf(">>�뵿 Ƚ�� : %d, ���� Ƚ�� : %d, ���� Ƚ�� : %d\n", cntLabor, cntStock, cntGame);
	}
	
}