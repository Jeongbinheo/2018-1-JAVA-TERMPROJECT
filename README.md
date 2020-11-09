# Making 1billion Game
**This game is JAVA_TERMPROJECT OF java_programming class in 2018-1 semester.**

**Our team wants to make simple console game operated by inputing message or number character or some item.**

-----
## Class 

One of the mission was we should make 4 classes at least and also use inheritance necessarily. 

So our team made 5 classes named by Billion, Character,Labor, Stock, Game

(If you click the title, you can move to the explanation of each part right away) 

**1.[Billion](README.md#1-billion)**


**2.[Character](README.md#2-character)**


**3.[Labor](README.md#3-labor)**


**4.[Stock](README.md#4-stock)**


**5.[Game](README.md#5-game)**


-----

### 1. **Billion**

 This class is real execution code of this game
 
 
So if you want play the game, you should save all class source file in same directory, and compile this class


And class is composed of intro(syntax of file input/output) and body(syntax of while & switch)


When I wrote this Billion class, I realized the importance of while(true) infinite loop syntax


So I'll introduce loop syntax in Billion class



>> **while(true) CODE**


```java

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
	}else if((type.equals("투자")) && (Character.total != 0)){
		cntStock++;
		break;
	}
	else if((type.equals("미니게임")) && (Character.total != 0)){
		cntGame++;
		break;
	}
	else System.out.println(">>잘못 입력하셨네요. 다시 선택해주세요");
	.
	.
	.
	
```

The point of this code is the way of exit through while loop


I set up 'while(true)' code requesting infinite input message if the player give improper answer to question.


If only the player give proper answer to question, the while(true) loop will break.


-----

### 2. **Character**

This class is very important because of inheritance.
Character class is parent of all other class(except Billion class)

In this class, We made a code about Character Object and method about making money.

we just have thought Character have to make money through doing labor, investing any stock and playing game.

So, we could decide other classes have to be inherited by this Character class.

now i'll show the Character Object Constructor code 

>> - **CODE:**

```java
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

```

when you make a Character object by typing proper number input through game playing, 

we let the code make character and print simple message about creating character and about characteristic about chosen character. 

-----

 ### 3. **Labor**

I think this class is most simple class any other classes.

We used a random function in this class for the first time.

From this class, random function is used very often, because we express the Probability through the java-code.

I'll explain expression about the probability with real class code.

>> **CODE** :

```java
.
.
int r = (int)(Math.random()*10);
.
.

```

  you can see the r variable at start point of the code.

  this variable will have the random number 1 to 10 by using Math.random()*10.

  And from after this code, you can understand how r is available as probability.

>> **CODE**
```java
 .
 . 
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

.
.
.

```

we discrete the case what value is put in r by using syntax of if.

the first case is that r has smaller than 3, and next is r has larger than 3 and smaller than 6 

and the last one is that r has larger than 6.

So we intended each of the case has 33.3% probability.


-----
### 4. **Stock**

   This class is very important class to quit the game fast.

   Now i'll explain with code of probability.

   Each stock have another probability and I made it using random number function also.

>> **CODE**

```java
    <확률 셋팅을 위한 값 설정>		
	int prob = (int)(Math.random() * 100); //비교하는 값
		
	int p1 = (int)(50 + Math.random()*30); // 삼성전자 50~80%확률
	int p2 = (int)(20 + Math.random()*10); // 부동산 20~30% 확률
	int p3 = (int)(10 + Math.random()*10); // 비트코인 10~20% 확률

    //원금에 곱해지는 값들
	int m1 = (int)(Math.random()*10+2); 
	int m2 = (int)(Math.random()*10+2);
	int m3 = (int)(Math.random()*10+2);
```

- Stock process  Example

   numofstock == 3 means you can start bitcoin stock 
   
>> **CODE**

 ``` java
	
	else if(numofstock == 3){
		if(prob < p3){ //비교하는 값이 10~20보다 작으면 투자 성공
			for(int i=0; i<3; i++){
		try {
			Thread.sleep(300);
		}catch(Exception e) {	
			System.out.print(e);
		}
			System.out.println("\t\t..두둥두둥..");
		}
		System.out.println();
		System.out.print(">>투자에 성공하였습니다! \n");

		investInput = investCost*m3; //투자금액*배당
		
		}

		else{//실패케이스
			for(int i=0; i<3; i++){
		try {
			Thread.sleep(300);
		}catch(Exception e) {
			System.out.print(e);
		}
			System.out.println("\t\t..두둥두둥..");
		}
			System.out.println();
		System.out.print(">>투자에 실패하였습니다. \n");

		investInput = 0; //투자에 실패해서 0원 환수
	}

}
	
		if (charnum==2) investInput *= 2;
		//charnum==2인 경우는 캐릭터가 워렌버핏인 경우이고, 
		//투자금액 2배로 회수 가능
```

-----
 ### 5. **Game**
There are two mini games to earn more money.
First, you should bet your money as much as you want. 
Next, you can select kind of game, between **"Up Down game" or "RockScissorsPaper"**

Let me explain the Guessing Number Game with CODES.
<br/>
>> **CODE** 
- **`for문으로 시도 횟수에 따라 배당금이 달라짐을 알려줌`**
``` java 
	void Game1(int GameMoney){
			System.out.printf("숫자 맞추기 게임을 진행하겠습니다. 0~100사이의 숫자를 추측해보세요!\n☆☆☆☆상금☆☆☆☆\n");
 
				for(int i=0;i<7;i++){

				System.out.printf("%d번만에 맞출경우 : 배팅금액 * %d 지급\n",i+1,7-i);
	            // 시도 횟수에 따라 지급금액이 달라짐.
		
		randomNum=(int)(Math.random()*100+1);
		//맞춰야할 숫자 생성.
}

```
<br/>

- **`Up Down Game 의 흐름`**
 >> **CODE**

```java 
  
while(true){

Scanner Input = new Scanner(System.in);

while(true){

	System.out.print("\n추측 숫자>>");
	Game1Answer=Input.nextInt();
	if(Game1Answer==randomNum){//정답인 경우
		if(charnum == 3) {//Charnum==3은 프로게이머를 의미
		System.out.printf("정답입니다. %d번 만에 맞추셨습니다.\n %d*%d*2 = %d 만원이 지급됩니다. \n프로게이머 캐릭터 선택효과로 2배의 금액이 지급되었습니다.\n",cnt,GameMoney,7-cnt+1,GameMoney*(7-cnt+1)*2);

		GameMoney=2*GameMoney*((7-cnt+1));
		//2배로 게임머니획득가능
	} else { //프로게이머가 아니면
		System.out.printf("정답입니다. %d번 만에 맞추셨습니다.\n %d*%d = %d 만원이 지급됩니다.\n",cnt,GameMoney,7-cnt+1,GameMoney*(7-cnt+1));

		GameMoney= GameMoney*((7-cnt+1)); //그냥 정해진 배당 받기

}

	super.totalUp(GameMoney); //총 금액에 더해주기

	break;

}
 else if(Game1Answer>randomNum) System.out.println("추측 숫자가 답보다 큽니다");
 else System.out.println("추측 숫자가 답보다 작습니다");
 // 정답이 아닌 경우 업, 다운을 알려줌.
}

}
```
-----







