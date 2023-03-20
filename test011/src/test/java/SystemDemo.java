import java.lang.reflect.Array;
import java.util.ArrayList;

public class SystemDemo {
    public static void main(String[] args) {
        //0表示虚拟机正常停止 非0表示虚拟机异常停止
//        System.exit(0);
        //返回当前系统时间毫秒值形式
        long l = System.currentTimeMillis();

        //数组拷贝
        int arr1[] = {1,2,3};
        int arr2[] = new int[3];
        System.arraycopy(arr1,0,arr2,0,3);
        ArrayList list  = new ArrayList();

        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
