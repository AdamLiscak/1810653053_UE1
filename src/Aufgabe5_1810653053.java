public class Aufgabe5_1810653053 {
    public static void main ( String[] args)
    {
        int zahl1=1;
        int zahl2= 3;

        System.out.println("zahl1: "+zahl1+" zahl2: "+zahl2);

        System.out.println("zahl1++: "+(zahl1++)+" zahl2++: "+(zahl2++));

        System.out.println("zahl1: "+zahl1+" zahl2: "+zahl2);

        System.out.println("++zahl1: "+(++zahl1)+" ++zahl2: "+(++zahl2));

        System.out.println("zahl1: "+zahl1+" zahl2: "+zahl2);
        /* i++ erhoht den Wert von einer beliebigen Zahl i nachdem sie evaluiert wurde,
         das heisst, das sämtliche algorithmen, die i++ direkt als Variable verwenden, eigentlich mit i rechnen
         f(i++)=f(i)
         ++i erhöht den Wert einer beliebigen Zahl i vor der Evaluierung...
         das heisst, das sämtliche algorithmen, die ++i direkt als Variable verwenden,  genau mit i+1 rechnen
         f(++i)=f(i+1)
         Dies sah man auch auf der Ausgabe:  die ersten zwei Werte sind gleich. Die letzten zwei werte steigen, und
           die vorletzten Wertigkeiten sind gleich den letzten Wertigkeiten */
    }
}
