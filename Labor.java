class Labor extends Character{
	
	Labor(){
	} //default ������
	
	void randomLabor(){//�뵿���� �������� ���� �� workInput ������ ��ȯ
		int r = (int)(Math.random()*10);
		System.out.print("\n=========================================================\n");
		if(r < 3){//���뵿 250���� ����
			System.out.print("\n\t�̹� ���� ���뵿�̳�... �� �����...\n\n");
			for(int i=0; i<3; i++){
				try {Thread.sleep(2000);}
				catch(Exception e) {System.out.print(e);}
				System.out.println("\t���̴�..�Ӷ�..������..�Ӷ�..�����������ϳ�..�Ӷ�..");
			}
			System.out.println();
			workInput = 250;
		}	
		else if(r>=3 && r<6){//����Ż�˹� 150���� ����
			System.out.println("\n\t�̹� ���� ����Ż�˹ٳ�... �������� ��԰� ����!!!!\n");
			for(int i=0; i<3; i++){
				try {Thread.sleep(1000);}
				catch(Exception e) {System.out.print(e);}
				System.out.println("\t ...�ڶ� �ڶ�...");
			}
			System.out.println();
			workInput = 150;
		}
		else if(r>=6){//�ܾ˹� 70���� ����
			System.out.print("\n\t�̹� ���� �ܾ˹ٴ�!!! ������\n");
			for(int i=0; i<3; i++){
				try {Thread.sleep(500);}
				catch(Exception e) {System.out.print(e);}
				System.out.println("\t ...�Ĵٴ� �Ĵٴ�...");
			}
			System.out.println();
			workInput = 70;
		}
		if (charnum==1) workInput *= 2; //ĳ���Ͱ� ���� �뵿���� ��� �ݾ� 2��
		super.totalUp(workInput); //�뵿 ���� ��ȯ
	}
}