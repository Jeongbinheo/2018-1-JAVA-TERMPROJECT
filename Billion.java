import java.io.*;

import java.util.Scanner;

class Billion{
	public static void main(String [] args){
		//���� ����
		char [] title = {'1','��','��','��','��','��','��'};
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
		//���� �Ұ�
		File file = new File("�ڹ� �Ұ� input.txt");
		if(file.exists()==false){
			System.out.println("������ �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		try{
			Scanner Scan = new Scanner(file);
			while(Scan.hasNext()){
				System.out.println(Scan.nextLine());
			}
			Scan.close();
		}catch(FileNotFoundException e){
			System.out.print("���� ���� ����");
		}
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		
		int cntLabor=1; //�뵿 Ƚ��
		int cntStock=0; //���� Ƚ��
		int cntGame=0; //���� Ƚ��
		String type; //�뵿,����,���� ����
		
		Character.choiceChar(); //ĳ���� ���� - ���� ���۽� ���� 1ȸ
		
		Labor q = new Labor();
		q.randomLabor(); //ó���� �뵿 ����
		Character.printCount(cntLabor,cntStock,cntGame);
		System.out.print("\n=========================================================\n");
		while(true){
			if((cntLabor > 0) && (Character.total <= 0)){
				System.out.printf("@@@@@����� �Ļ��Ͽ����ϴ�@@@@@.\n ������ ������ ���� ������ Ȯ�����ּ���.");
				try{
					File f1 = new File("���Ӱ��[����].txt");
					PrintWriter pw = new PrintWriter(f1);
					pw.printf("1������� ���ӿ� �����Ͽ����ϴ�.");
					pw.printf("[���� �м�] \n�뵿 Ƚ��:%d ��, ���� Ƚ��:%d ��, ���� Ƚ��:%d ��\n",cntLabor,cntStock,cntGame);
					pw.println("");
					if(cntStock>(cntLabor+cntStock+cntGame)/3) pw.printf("���ڸ� ����Ͻô±���! �ǻ�Ȱ���� ���ڿ� ���� ���� �����ϸ� ���� �� �ֽ��ϴ�.");
					else if(cntGame>(cntLabor+cntStock+cntGame)/3) pw.printf("������ ����Ͻô±���! �ǻ�Ȱ���� ���ӿ� ���� ���� �����ϸ� ���� �� �ֽ��ϴ�.");
					else  pw.printf("�뵿�� �ϸ�.. ���� �����µ� �ð��� �����ɸ��ϴ�. ������ ���ڿ� ������ ����ּ���.");
					pw.println("");
					pw.close();
				}catch(FileNotFoundException fnfe){
					System.out.println("���� �̹� ����");
				}
				break;
			}
			else if(Character.total >= 10000){
				System.out.printf("����� 1�� ����⿡ ���� �ϼ̽��ϴ�!!!!\n ������ ������ ���� ������ Ȯ�����ּ���.");
				try{
					File f1 = new File("���Ӱ��[����].txt");
					PrintWriter pw = new PrintWriter(f1);
					pw.printf("1������� ���ӿ� �����Ͽ����ϴ�.");
					pw.printf("\n[���� �м�]\n �뵿 Ƚ��:%d ��, ���� Ƚ��:%d ��, ���� Ƚ��:%d ��\n",cntLabor,cntStock,cntGame);
					pw.println("");
					if(cntStock>(cntLabor+cntStock+cntGame)/3) pw.printf("���ڸ� ����Ͻô±���! ���ӿ����� 1�� �����⿡ ����������, �ǻ�Ȱ���� ���ڿ� ���� ���� �����ϸ� ���� �� �ֽ��ϴ�.");
					else if(cntGame>(cntLabor+cntStock+cntGame)/3) pw.printf("������ ����Ͻô±���! ���ӿ����� 1�� �����⿡ ����������, �ǻ�Ȱ���� ���ӿ� ���� ���� �����ϸ� ���� �� �ֽ��ϴ�.");
					else pw.printf("���ӿ����� 1�� �����⿡ ����������, �뵿�� �ϸ�.. ���� �����µ� �ð��� �����ɸ��ϴ�. ������ ���ڿ� ������ ����ּ���.");
					pw.close();
				}catch(FileNotFoundException fnfe){
					System.out.println("���� ����");
				}
				break;
			}
			else{			
				while(true){	
					System.out.print("\n\t<< ���� ���� �Ͻðڽ��ϱ�? (���ڷ� �Է�) >>\n\n");
					System.out.print("\t\t1. �뵿 (�ڵ����� ����)\n");
					System.out.print("\t\t2. ����\n");
					System.out.print("\t\t3. �̴ϰ���\n");
					System.out.print("\t\t\t\t ���� : ");
					type = s.next();
			
					if(type.equals("�뵿")) {
						cntLabor++;
						break;
					}
					else if((type.equals("����")) && (Character.total != 0)){
						cntStock++;
						break;
					}
					else if((type.equals("�̴ϰ���")) && (Character.total != 0)){
						cntGame++;
						break;
					}
					/* else if(((type.equals("����")) || (type.equals("�̴ϰ���")))  && (Character.total == 0)){
						System.out.println(">>0 ���϶��� ������ �뵿�ϼž��� ����");
						System.out.println(">>�ڵ����� �뵿�� ����˴ϴ�.");
						Labor w = new Labor();
						w.randomLabor();//�뵿�ϰ� '���������� �������ϴ�. �ܾ� ��������' ���
						cntLabor++;
						Character.printCount(cntLabor,cntStock,cntGame); //Ƚ�� ���
						break;
					} */
					else System.out.println(">>�߸� �Է��ϼ̳׿�. �ٽ� �������ּ���");
				}
				switch (type){
				case "�뵿" :  	Labor l = new Labor();
								l.randomLabor();//�뵿�ϰ� '���������� �������ϴ�. �ܾ� ��������' ���
								Character.printCount(cntLabor,cntStock,cntGame); //Ƚ�� ���
								System.out.print("\n=========================================================\n");
								break;
							
				case "����" :		Stock sto = new Stock();
																
								int [] getinfo = sto.choice();//����ó ����
								
								sto.goStock(getinfo[0],getinfo[1]);//�ֽ� ���� ���� 
									
								Character.printCount(cntLabor,cntStock,cntGame); //Ƚ�� ���
								System.out.print("\n=========================================================\n");
								break;
								
				case "�̴ϰ���": 	Game G1 = new Game(); 
								G1.GameS();
								Character.printCount(cntLabor,cntStock,cntGame); //Ƚ�� ���
								System.out.print("\n=========================================================\n");
								break;
				}
			}
		}
	}			
}
	
	
		

	
	
	
	
