public class pyramid {
    public class Main {
        public static void main(String[] args) {
          int rows = 10;
          for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print("0 ");
            }
            System.out.println();
          }
        }
      }
}
