/*Создайте 5–7 кошек, вызовите у них различные методы:
1.	Выведите в консоль вес созданных кошек.
2.	Покормите двух кошек, после этого распечатайте их вес (убедитесь, что вес изменился).
3.	Перекормите кошку, чтобы ее статус стал Exploded.
4.	«Замяукайте» кошку до статуса Dead.
*/
public class Loader
{
    public static void main(String[] args)
    {
        Cat[] cats=new Cat[7];
        for(int i=0;i<7;i++)
        {
            cats[i]=new Cat();
            System.out.format("%d: %.2f\n",i+1,cats[i].getWeight());
        }
        cats[3].feed(200.0);
        cats[5].feed(1000.5015);
        System.out.println("Вес после кормления 4 и 6 кошки:");
        for(int i=0;i<7;i++)
            System.out.format("%d: %.2f\n",i+1,cats[i].getWeight());
        while (cats[5].getStatus()!="Exploded")
            cats[5].feed(100.0);
        System.out.println("Кошка №6: "+cats[5].getStatus());
        while (cats[0].getStatus()!="Dead")
        {
            System.out.print("Кошка №1: ");cats[0].meow();
        }
        System.out.println("Кошка №1: "+cats[0].getStatus());
    }
}