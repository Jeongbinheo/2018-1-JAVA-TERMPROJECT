import java.util.*;

class Stock extends Character{
	int investCost =0;
	int numofstock =0;
	
	Stock(){
		
	}

	int prob = (int)(Math.random() * 100); //�� Ȯ�� 
	int p1 = (int)(50 + Math.random()*30); // ���� Ȯ�� 
	int p2 = (int)(20 + Math.random()*10);
	int p3 = (int)(10 + Math.random()*10);
	int m1 = (int)(Math.random()*10+2); //���� ����?  
	int m2 = (int)(Math.random()*10+2);
	int m3 = (int)(Math.random()*10+2);
		
	public int [] choice(){
		int [] stockinfo = new int [2];
		Scanner s = new Scanner(System.in);
		// Ȯ���̶� ���� �����ϴ°Ŵ� �� �󸶾� �ϴ°� ������ ���� �׳� �Ȱ��̵�.
		System.out.print("\n\t<< ������ ���� ��Ȳ>>\n\n");
		System.out.printf("\t\t- �Ｚ���� �ֽ� %d �ۼ�Ʈ Ȯ���� ���� %d�� . \n",p1,m1);
		System.out.printf("\t\t- �ε��� ���� %d �ۼ�Ʈ Ȯ���� ���ͱ� %d�� . \n",p2,m2);
		System.out.printf("\t\t- ��Ʈ���� ���� %d �ۼ�Ʈ Ȯ���� ���� %d�� . \n",p3,m3);
		
		
		while(true){
			System.out.print("\n\t<< ����ó�� �Է��ϼ���. (���ڷ� �Է�) >>\n\n");
			System.out.print("\t\t1.�Ｚ�����ֽ�\n");
			System.out.print("\t\t2.�ε�������\n");
			System.out.print("\t\t3.��Ʈ����\n");
			System.out.print("\t\t\t\t ���� : ");
			
			try{
				 numofstock= s.nextInt();
				 
				 if((numofstock==1)||(numofstock==2)||(numofstock==3)) break;
				 System.out.println(">>Error : 1,2,3 �߿� ������ �ּ���.");
				 System.out.println(">>�ùٸ� ����ó�� �Է��ϼ���.");
			}catch(NumberFormatException nfe){
				s.nextLine();
				System.out.println(">>Error : 1,2,3 �߿� ������ �ּ���.\n");
				System.out.println(">>�ùٸ� ����ó�� �Է��ϼ���.");
			}catch(Exception e){
				s.nextLine();
				System.out.println(">>Error : 1,2,3 �߿� ������ �ּ���.\n");
				System.out.println(">>�ùٸ� ����ó�� �Է��ϼ���.");
			}
		}		
		System.out.println();
		
		while(true){	
			System.out.print("\t<< �󸶸� �����Ͻðڽ��ϱ�?(���ڷ� �Է�) >>\n");
			
			System.out.print("\n\t\t\t\t ���ڱݾ� : ");
			try{
				investCost = s.nextInt();
				if(investCost <= total) {
					System.out.println();
					break;
				}
				else System.out.println(">>�ܾ׺��� �� ���� ���� �Ͻ� �� �����ϴ�.\n");
			}catch(NumberFormatException nfe){
				s.nextLine();
				System.out.println(">>�߸��Է��Ͽ����ϴ�.\n");
				continue;
			}catch(Exception e){
				s.nextLine();
				System.out.println(">>�߸��Է��Ͽ����ϴ�.\n");
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
							System.out.println("\t\t..�εյε�..");
					}
					System.out.println();
				System.out.print(">>���ڿ� �����Ͽ����ϴ�!\n");
				
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
							System.out.println("\t\t..�εյε�..");
					}
					System.out.println();
				System.out.print(">>���ڿ� �����Ͽ����ϴ�. \n");
				
				
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
							System.out.println("\t\t..�εյε�..");
					}System.out.println();
				
				System.out.print(">>���ڿ� �����Ͽ����ϴ�! \n"); 
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
							System.out.println("\t\t..�εյε�..");
					}System.out.println();
				System.out.print(">>���ڿ� �����Ͽ����ϴ�. \n");
				
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
							System.out.println("\t\t..�εյε�..");
					}System.out.println();
				
				System.out.print(">>���ڿ� �����Ͽ����ϴ�! \n"); 
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
							System.out.println("\t\t..�εյε�..");
					}System.out.println();
				System.out.print(">>���ڿ� �����Ͽ����ϴ�. \n"); 
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
	


		
		
		
	
	
	
	
	
	
	

	
	
