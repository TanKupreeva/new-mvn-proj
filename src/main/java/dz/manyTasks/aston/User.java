package dz.manyTasks.aston;

public class User {
    private static String login;
    private static String password;


    public static void initialize(String login, String password){
        User.login=login;
        User.password=password;
    }
   public static class Query {
        public void printToLog() {
            System.out.printf("login %s password %s \n", login, password);
        }
    }


    public static void main(String[] args) {
      initialize("hu", "gug");
      Query query = new Query();
      query.printToLog();



    }
}
