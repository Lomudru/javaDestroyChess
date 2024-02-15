package fonctionnalite;

public class Regles {
    /** Affiche les règles du jeu */
    public static void regles()
    {
        System.out.println("╭──────────────────────────────────────────────────────────────────────────────────────────────╮");
        System.out.println("│  Règles                                                                                      │");
        System.out.println("├──────────────────────────────────────────────────────────────────────────────────────────────┤");
        System.out.println("│ Un joueur ne peut pas se déplacé en diagonale.                                               │");
        System.out.println("│ Si le joueur n'a plus la possibilité de se déplacé autour de lui, il a perdu.                │");
        System.out.println("│ Le joueur peut détruire une case lorsqu'il s'est déplacé.                                    │");
        System.out.println("│ La partie se termine lorsqu'il reste un seul survivant                                       │");
        System.out.println("│ Un joueur gagne 5 point lorsqu'il est le dernier survivant et perd 2 point lorsqu'il meurt   │");
        System.out.println("╰──────────────────────────────────────────────────────────────────────────────────────────────╯");
    }
}