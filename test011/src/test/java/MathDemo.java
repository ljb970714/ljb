public class MathDemo {
    public static void main(String[] args) {
        //向上取整
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.34));

        //向下取整
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.34));

        //四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.34));

        //获取两个整数的最大值
        System.out.println(Math.max(10,20)); //20
        //获取两个整数的最小值
        System.out.println(Math.min(10,20));//10
        //获取a的b次幂 建议第二个参数 一般传递大于1的证整数
        System.out.println(Math.pow(2,3)); //8
        //开平方
        System.out.println(Math.sqrt(4));//2
        //开立方
        System.out.println(Math.cbrt(8));//2

        System.out.println(Math.random());

        System.out.println(isTest(997));

        System.out.println(Math.sqrt(997));
    }

    public static boolean isTest(int number){
        int count = 0;
        for (int i = 2; i <Math.sqrt(number) ; i++) {
            count++;
            if (number % i == 0 ){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
