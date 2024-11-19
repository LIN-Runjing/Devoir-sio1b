import java.util.Random;
import java.util.Scanner;

public class Menu
{
    // Exercice n°1
    // NE PAS EFFACER
    static int[] tabFrequence = new int[11];
    static String[] tabEntetes = new String[]{"2","3","4","5","6","7","8","9","10","11","12"};

    // Exercice n°2
    // NE PAS EFFACER
    static int[][] tableau1Exo2 = new int[][]{{1,2,4},{5,6,7},{2,1,3}};
    static int[][] tableau2Exo2 = new int[][]{{2,2,4},{1,3,5},{1,4,8}};
    static int[][] tableauProduitExo2 = new int[3][3];
    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("1 - Exercice 1");
                System.out.println("2 - Exercice 2");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    int nombreFois=0;
                    int nb1;
                    int nb2;
                    int somme=0;
                    int frequence=0;
                    Random rand = new Random();


                    //Generer 2 chiffres puis faire l'addition
                    while(nombreFois <  20)
                    {
                        nb1 = rand.nextInt(1,6);
                        nb2 = rand.nextInt(1,6);
                        somme=nb1+nb2;

                        for (int i=0; i<tabEntetes.length; i++)
                        {
                            if (somme==Integer.parseInt(tabEntetes[i]))
                            {
                               tabFrequence[i] =tabFrequence[i] + 1;
                               nombreFois++;
                               break;
                            }
                        }

                    }

                    //imprimer l'entete
                    for (int j=0; j<tabEntetes.length; j++)
                    {
                        System.out.print(tabEntetes[j]+"\t");
                    }

                    System.out.println();


                    // Chercher le plus grand frequence
                    int max=tabFrequence[0];

                    for (int g=0; g<tabFrequence.length; g++)
                    {
                        if (tabFrequence[g] > max)
                        {
                            max = tabFrequence[g];
                        }
                    }


//                    Ici je vais commencer de creer un table pour les etoile
//                     ligne=lignetotale-prequenc   colonne=colonne de prefequence

                    String tabEtoile[][]=new String[max+1][11];


                    for (int q=0; q<tabFrequence.length; q++)
                    {
                            for (int h = max+1-tabFrequence[q]; h < 11; h++)
                            {
                                for (int l = 0; l < tabEtoile.length; l++)
                                {

                                    tabEtoile[h][tabFrequence[q]] = "*";
                                    System.out.print(tabEtoile[h][tabFrequence[q]]);
                                }
                             }
                        System.out.println();
                    }



                    //imprimer tabFrequence
                    for (int k=0; k<tabFrequence.length; k++)
                    {
                        System.out.print(tabFrequence[k]+"\t");
                    }

                    System.out.println();



                    break;
                case 2:

                    int sommeProduit=0;

                    for (int i=0; i<3; i++)
                    {
                        sommeProduit=0;
                        for (int j = 0; j < 3; j++)
                        {
                            sommeProduit=sommeProduit+tableau1Exo2[i][j]*tableau2Exo2[i][j];
                            tableauProduitExo2[i][j]=sommeProduit;
                        }
                        System.out.println();

                    }


                    for (int k=0; k<tableauProduitExo2.length; k++)
                    {
                        for (int g = 0; g < tableauProduitExo2.length; g++) {
                            System.out.print(tableauProduitExo2[k][g] + "\t");
                        }
                        System.out.println();
                    }

                    break;
            }
        }while (choix != 0);
    }
}
