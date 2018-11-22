# Making 1billion Game

This game is JAVA_TERMPROJECT OF java_programming class in 2018SS semester
Our team wants to make simple console game operated by inputing message or number character or some item.
-----
## Class 

One of the mission was we should make 4 classes at least and also use inheritance necessarily. 

So our team made 5 classes named by Billion, Character,Labor, Stock, Game 

1.[Billion](README.md#-billion)

2.[Character](README.md###2.Character)

3.[Labor](README.md###3.Labor)

4.[Stock](README.md###4.Stock)

5.[Game](README.md###5.Game)
#
-----

### -Billion

This class is real execution code of this game

So if you want play the game, you should save all class source file in same directory, and compile this class

When I write this class, I realized the importance of while(true) infinite loop syntax
So I'll introduce loop syntax in Billion class

> while(true) code:

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
