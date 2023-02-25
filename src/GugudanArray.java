public class GugudanArray {
    public static void main(String[] args) {
        /*int[] result = new int[9];
        for(int i = 0; i <  result.length; i++) {
            result[i] = 2 * (i + 1);
        }

        for(int i = 0; i <   result.length; i++) {

            System.out.println(result[i]);
        }

        result = new int[9];
        for(int i = 0; i <  result.length; i++) {
            result[i] = 3 * (i + 1);
        }

        for(int i = 0; i <   result.length; i++) {

            System.out.println(result[i]);
        }*/

       /* for(int i=1;i<10;i++) {  되지만 배열구조가 아니다.
            for(int j=2;j<10;j++) {
                System.out.print(j+"x"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }*/

        int[] result=new int[9]; //result를 9까지로 정의한다
        for(int j=2;j<10;j++) { //j는 단수 2~9단까지를 뜻하기에 2와 같고 10보다 작다
            for (int i = 0; i < result.length; i++) { //int j를 반복한 함수 안에 i를 반복하게 해야 정상출력된다

                result[i] = j * (i + 1); //위에 구문에서는 2를 지정했지만 이번에는 j를 2~9까지로 정의하였다
                System.out.println(result[i]);
            }
        }
    }

}
