package Project.GuesserGamePreoject;

import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser Kindly guess a number : ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}

class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumGuesser(){
        Guesser g = new Guesser();
        Guessernum = g.GuesserNumb();
    }

    public void CollectNumPlayer(){
        System.out.println("Player1 Kindly guess a number : ");
        Player P1 = new Player();
        Playernum1 = P1.PlayerNumb();

        System.out.println("Player2 Kindly guess a number : ");
        Player P2 = new Player();
        Playernum2 = P2.PlayerNumb();

        System.out.println("Player3 Kindly guess a number : ");
        Player P3 = new Player();
        Playernum3 = P3.PlayerNumb();



    }

    public void Compare(){
        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2 && Guessernum==Playernum3){
                System.out.println("All Players won the game");
            }
            else if(Guessernum==Playernum2){
                System.out.println("Player 1 and Player 2 won the game");
            }
            else if (Guessernum==Playernum3) {
                System.out.println("Player 1 and Player 3 won the game");
            }
            else{
                System.out.println("Player 1 won the game");
            }
        }
        else if (Guessernum==Playernum2) {
            if(Guessernum==Playernum3){
                System.out.println("Player 2 and Player 3 won the game");
            }
            else{
                System.out.println("Player 2 won the game");
            }
        }
        else if (Guessernum==Playernum3) {
            System.out.println("Player 3 won the game");
        }
        else {
            System.out.println("All player  lost the game");
        }
    }
}
public class guesserGame {
    public static void main(String[] args) {
        System.out.println("=====================Game Started=====================");
        Umpire um = new Umpire();
        um.CollectNumGuesser();
        um.CollectNumPlayer();
        um.Compare();
        System.out.println("=====================Game Over=====================");
    }
}
