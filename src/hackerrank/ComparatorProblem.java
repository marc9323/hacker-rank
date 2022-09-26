package hackerrank;

import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b)
    {
        int scoreCompare = b.score - a.score;
        int nameCompare = a.name.compareTo(
                b.name);

        return (scoreCompare == 0) ? nameCompare : scoreCompare;
    }
}

class Sortbyname implements Comparator<Player> {

    // Method
    // Sorting in ascending order of name
    public int compare(Player a, Player b)
    {

        return a.name.compareTo(b.name);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class ComparatorProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
