package dz.manyTasks.aston.lambda;

public class StringProcessor {
    private LengthChecker lengthChecker;
    private UpperCaseConverter upperCaseConverter;
    private CharacterReplacer characterReplacer;

    public void setLengthChecker(LengthChecker lengthChecker) {
        this.lengthChecker = lengthChecker;
    }

    public void setUpperCaseConverter(UpperCaseConverter upperCaseConverter) {
        this.upperCaseConverter = upperCaseConverter;
    }

    public void setCharacterReplacer(CharacterReplacer characterReplacer) {
        this.characterReplacer = characterReplacer;
    }


    public String process(String input) {
        if (lengthChecker != null) {
            lengthChecker.checkLenght(input);
        } else {
            System.out.println("LengthChecker is not set!");
        }

        if (upperCaseConverter != null) {
            input = upperCaseConverter.toUpperCase(input);
        }
        if (characterReplacer != null) {
            input = characterReplacer.replaceCharacters(input, 'O', '0');
        }
        return input;
    }

    public static void main(String[] args) {

        String testString = "hello world";
        StringProcessor processor = new StringProcessor();

        processor.setLengthChecker(input -> {
            int threshold = 5;
            if (input.length() > threshold) {
                System.out.println("String is too long");
            } else {
                System.out.println("String lenght  is fine");

            }

        }
        );

//                new LengthChecker() {
//            private int threshold = 5;
//            @Override
//            public void checkLenght(String input) {
//              if(input.length()>threshold){
//                  System.out.println("String is too long");
//              }  else{
//                  System.out.println("String lenght  is fine");
//                }


        processor.setUpperCaseConverter(input -> input.toUpperCase());

//
//                                              new  UpperCaseConverter() {
//                                                    @Override
//                                                    public String toUpperCase(String input) {
//                                                        return input.toUpperCase();
//                                                    }
//                                                });


        processor.setCharacterReplacer((input, oldChar, newChar) -> input.replace(oldChar, newChar));
//                new CharacterReplacer() {
//                                                   @Override
//                                                   public String replaceCharacters(String input, char oldChar, char newChar) {
//                                                       return input.replace(oldChar, newChar);
//                                                   }
//                                               });

        String result = processor.process(testString);
        System.out.println(result);
    }

}


//    private StringOperation stringOperation;
//
//    public void setStringOperation(StringOperation stringOperation) {
//        this.stringOperation = stringOperation;
//    }
//
//    public String process(String input) {
////        if (input.length() > 10) {
////            System.out.println("String is too long");
////        } else {
////            System.out.println("String length is fine");
////        }
////        return input.toUpperCase().replace('O', '0');
//
//        stringOperation.checkLength(input);
//        input = stringOperation.toUpperCase(input);
//        return stringOperation.replaceCharacters(input, 'O', '0');
//    }
//
//    public static void main(String[] args) {
//        StringProcessor processor = new StringProcessor();
////        DefaultStringOperation operation = new DefaultStringOperation();
////
//        String testString = "hello world";
//
//        StringOperation so = new StringOperation() {
//            private int theshold = 7;
//
//            @Override
//            public void checkLength(String input) {
//                if (input.length() > theshold){
//                    System.out.println("String is too long!");
//                }else{
//                    System.out.println("String lenght is fine");
//                }
//
//            }
//
//            @Override
//            public String toUpperCase(String input) {
//                return input.toUpperCase();
//            }
//
//            @Override
//            public String replaceCharacters(String input, char oldChar, char newChar) {
//                return input.replace(oldChar, newChar);
//            }
//        };
//
//        processor.setStringOperation(so);
//        System.out.println(processor.process(testString));
//
//    }
//}
