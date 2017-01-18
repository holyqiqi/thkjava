package c2;

public class CalculatorTest {
    private int nbError = 0;
    public void testAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(1,3);
        if (result != 4){
            throw new IllegalStateException("Bad result: " + result);
        }
    }
    public void testMulti(){
        Calculator calculator = new Calculator();
        double result = calculator.multi(1,3);
        if (result != 3){
            throw new IllegalStateException("Bad result: " + result);
        }
    }

    public static void main(String[] args){
        CalculatorTest test = new CalculatorTest();
        try{
            test.testAdd();
        }catch(Throwable e){
            test.nbError++;
            e.printStackTrace();
        }

        try{
            test.testMulti();
        }catch(Throwable e){
            test.nbError++;
            e.printStackTrace();
        }
        if (test.nbError > 0){
            throw new IllegalStateException("\nThere were " + test.nbError + " error(s)");
        }
    }
}
