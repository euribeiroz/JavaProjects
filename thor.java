import java.util.*;
import java.io.*;
import java.math.*;
 
class Player
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int raioX = in.nextInt(); // the X position of the light of power
        int raioY = in.nextInt(); // the Y position of the light of power
        int thorX = in.nextInt(); // Thor's starting X position
        int thorY = in.nextInt(); // Thor's starting Y position
 
        //o looping fica rodando enquanto for verdadeiro
        while (true)
        {
            int remainingTurns = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
           // string vazia indicando a direção
            String direcao = "";
           
            //início das condições até que a posição do thor esteja igual a do raio
       
            //se thorY < raioY então a direcao é S
            if (thorY < raioY) {
                //incremento do thorY
                thorY++;
                // informando a direção igual a "S" = South
                direcao = "S";
 
            //então se thorY > raioY então a direcao é N
            } else if (thorY > raioY)  {
 //decrecremento do thorY
                thorY--;
                 // informando a direção igual a "N" = North
                direcao = "N";
            }
 
             //se thorX < raiX então a direcao é E            
            if (thorX < raioX) {
                 //incremento do thorX
                thorX++;
                  // informando a direção igual a "E" = East
                direcao += "E";
               
            //então se thorX > raioX então a direcao é N
            } else if (thorX > raioX) {
                      //decrecremento do thorY
                thorX--;
                // informando a direção igual a "W" = West
                direcao += "W";
            }
           
            //imprime no console a direcao do thor
            System.out.println(direcao);
        }
    }
}
 
