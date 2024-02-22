package net.mrloic.learn;

/*На заводской ВЦ из цехов поступает информация: фамилии рабочих и выработка каждого из них.
Написать программу, определяющую фамилию рабочего с наибольшей (кандидат на увеличение зарплаты)
и наименьшей (кандидат на увольнение) выработкой.
*/
public class TaskOne {

    public static void StartOne()
    {
        String[] worker = {"Соболев","Титов","Ларионов","Комаров","Гордеев"};
        int[] output = {40,32,54,87,12};
        int max_out = 0;
        int max_out_index = 0;


        for (int i=0; i<output.length; i++)
        {
            if (max_out<output[i])
            {
                max_out=output[i];
                max_out_index=i;
            }
        }

        int min_out = max_out;
        int min_out_index = 0;
        for (int i=0; i<output.length; i++)
        {
            if (min_out>output[i])
            {
                min_out=output[i];
                min_out_index=i;
            }
        }

        System.out.println("Кандидат на увеличение зарплаты: " + worker[max_out_index]);
        System.out.println("Кандидат на увольнение: " + worker[min_out_index]);

    }

}
