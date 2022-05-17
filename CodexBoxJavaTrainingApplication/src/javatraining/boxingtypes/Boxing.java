package javatraining.boxingtypes;

public class Boxing implements boxingInterface{

        Integer n = 10;
        int num1 = 8;
        short s = 4839;
        long l = 374632233;
        boolean aBoolean = true;
        char c = 'C';
        byte by = 22;
        float f = 20.5f;
        double d;
        int num2;
        Boxing(){

        }
         Boxing(int num2){
            this.num2 = num2;
         }


    @Override
    public int box(int d) {
            //this.d= d;

        return d;
    }

    @Override
    public String toString() {
        return "Boxing{" +
                "num2=" + num2 +
                '}';
    }
}
