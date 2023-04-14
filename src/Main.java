import homeWork3.ArraysMethod;
import homeWork3.user.USER;

public class Main {
    public static void main(String[] args) {
//        VowelConstantIf VoCoIf = new VowelConstantIf();
//        VoCoIf.VowelConstantIf();

//        VowelConstantSwitch VoCoSw = new VowelConstantSwitch();
//        VoCoSw.VowelConstantSwitch();

//        SeasonMonth SeMo = new SeasonMonth();
//        SeMo.SeasonMonth();

//        Exit Ex = new Exit();
//        Ex.Exit();

//        SumNumbers SuNum = new SumNumbers();
//        SuNum.SumNumbers();

/////////////////////////////////////////////////////

//        FibonacciArray fibonacciArray = new FibonacciArray();
//        fibonacciArray.fib(7);

//        MinMaxSum minMaxSum = new MinMaxSum();
//        minMaxSum.MinMaxSum();

//        SumEvenOddDiff SuEvOdDiff = new SumEvenOddDiff();
//        SuEvOdDiff.SumEvenOddDiff();

////////////////////////////////////////////////////////

//        CheckSeason checkSeason = new CheckSeason();
//        checkSeason.checkSeason(MONTH.SEPTEMBER);

//        SameClass sameClass1 = new homeWork3.twoClassesOne.SameClass();
//        sameClass1.say();
//        SameClass sameClass2 = new homeWork3.twoClassesTwo.SameClass();
//        sameClass2.say();

//        MyClassDeprecated myClassDeprecated = new MyClassDeprecated();
//        myClassDeprecated.oldMethod();

//        OverloadExample example = new OverloadExample();
//        System.out.println(example.sum(1, 2));
//        System.out.println(example.sum(1.5, 2.5));
//        System.out.println(example.sum("Hello, ", "world!"));

//        MyClassDeprecated example = new MyClassDeprecated();
//        System.out.println(example.sum(1, 2));
//        System.out.println(example.sum(1.5, 2.5));
//        System.out.println(example.sum("Hello, ", "world!"));

//        int[]arr = {2,3,34,-132,31,54};
//        ArraysMethod arraysMethod = new ArraysMethod();
//        arraysMethod.printSortArray(arr);
//        arraysMethod.printMaxValue(arr);
//        arraysMethod.printElement(arr,4);

        USER user = USER.USER3;
        user.printNameLastName();
        user.printUserInfo();
        user.upAge(2);
        user.printUserInfo();
        user.setLastName("IVANOVA");
        user.printUserInfo();


    }
}

