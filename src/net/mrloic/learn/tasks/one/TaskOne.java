package net.mrloic.learn.tasks.one;

/*На заводской ВЦ из цехов поступает информация: фамилии рабочих и выработка каждого из них.
Написать программу, определяющую фамилию рабочего с наибольшей (кандидат на увеличение зарплаты)
и наименьшей (кандидат на увольнение) выработкой.
*/

public class TaskOne {

    public static void StartOne()
    {
        String[] worker = {"Соболев","Титов","Ларионов","Комаров","Гордеев"};
        int[] output = {40,320,54,87,12};
        int maxOut = 0;
        int maxOutIndex = 0;


        for (int i=0; i<output.length; i++)
        {
            if (maxOut < output[i])
            {
                maxOut = output[i];
                maxOutIndex = i;
            }
        }

        int minOut = maxOut;
        int minOutIndex = 0;
        for (int i=0; i<output.length; i++)
        {
            if (minOut > output[i])
            {
                minOut = output[i];
                minOutIndex = i;
            }
        }

        System.out.println("Кандидат на увеличение зарплаты: " + worker[maxOutIndex]);
        System.out.println("Кандидат на увольнение: " + worker[minOutIndex]);

    }

}
