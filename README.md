# Making 1billion Game

This game is JAVA_TERMPROJECT OF java_programming class in 2018SS semester
Our team wants to make simple console game operated by inputing message or number character or some item.
-----
## Class 

One of the mission was we should make 4 classes at least and also use inheritance necessarily. 

So our team made 5 classes named by Billion, Character,Labor, Stock, Game
(If you click the title, you can move to the explanation of each part right away) 

1.[Billion](README.md#billion)

2.[Character](README.md#character)

3.[Labor](README.md#labor)

4.[Stock](README.md#-stock)

5.[Game](README.md#-game)
#
-----

### **Billion**

This class is real execution code of this game
 
So if you want play the game, you should save all class source file in same directory, and compile this class

And class is composed of intro(syntax of file input/output) and body(syntax of while & switch)



When I wrote this Billion class, I realized the importance of while(true) infinite loop syntax

So I'll introduce loop syntax in Billion class



>>-while(true) code:

```c

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

### **Character**

This class is very important because of inheritance.
Character class is parent of all other class(except Billion class)

In this class, We made a code about Character Object and method about making money.

we just have thought Character have to make money through doing labor, investing any stock and playing game.

So, we could decide other classes have to be inherited by this Character class.

now i'll show the Character Object Constructor code 

>> -CODE:
```c
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

From this code below, a method is written for the character.

-----
### **Labor**

I think this class is most simple class any other classes.

We used a random function in this class for the first time.

From this class, random function is used very often, because we express the Probability through the java-code.

I'll explain expression about the probability with real class code.

>> CODE
```c
.
.
int r = (int)(Math.random()*10);
.
.

```

you can see the r variable at the first of code.

this variable will have the random number 1 to 10 by using Math.random().

And from after this code, you can understand how r is available as probability.

>> CODE
```c
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
### **Stock**

This class is very important class to make a money

We set the probability of each stock differently.

Now i'll explain with code of probability.










