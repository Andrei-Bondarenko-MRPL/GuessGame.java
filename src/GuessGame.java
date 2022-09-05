public class GuessGame {

    public void startGame(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I think of a number from 0 to 9 ...");

        while (true){
            System.out.println("Number to be guessed, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("the first player thinks is it " + guessp1);
            guessp2 = p2.number;
            System.out.println("the second player thinks is it " + guessp2);
            guessp3 = p3.number;
            System.out.println("the third player thinks is it " + guessp3);

            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("we have a winner");
                System.out.println("the first player guessed?" + p1isRight);
                System.out.println("thr second player guessed?" + p2isRight);
                System.out.println("the third player guessed?" + p3isRight);
                System.out.println("Game over.");
                break;
            } else {
                System.out.println("players should try again.");
            }
        }
    }
}
