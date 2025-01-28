package dz.manyTasks.aston;

public class StringProcessor {
    private LengthChecker lengthChecker;

    public void setLengthChecker(LengthChecker lengthChecker) {
        this.lengthChecker = lengthChecker;
    }


    public String process(String input) {
        // Выполняем проверку длины
        if (lengthChecker != null) {
            lengthChecker.checkLength(input);
        } else {
            System.out.println("LengthChecker is not set!");
        }
        return input;
    }

    public static void main(String[] args) {
        String testString = "hello world";

        StringProcessor processor = new StringProcessor();

        // Внедряем проверку длины через анонимный класс
        processor.setLengthChecker(new LengthChecker() {
            private int threshold = 5;

            @Override
            public void checkLength(String input) {
                if (input.length() > threshold) {
                    System.out.println("String is too long!");
                } else {
                    System.out.println("String length is fine.");
                }
            }
        });
        String result = processor.process(testString);
        System.out.println("Result: " + result);
    }
}
