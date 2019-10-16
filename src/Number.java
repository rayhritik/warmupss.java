public class Number {
    public static void main (String[] args)
    {
       for (int i=1; i<=26; i++)
        {
            System.out.printf("%d", i);
            if (i<26)
                System.out.printf(",");

        }
       System.out.printf("two line method ");
       twolinemethod();
    }
    public static void twolinemethod()
    {
      for (int i =1; i<=26; i++)
          System.out.printf("%d%s",i, (i<26)?",":"");
    }
}