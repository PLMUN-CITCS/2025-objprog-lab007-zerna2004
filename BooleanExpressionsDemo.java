public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;
        int a = 15;
int b = 20;
boolean isAGreater = a > b;
boolean areEqual = a == b;
boolean bothTrue = isJavaFun && (a < b);
boolean eitherTrue = isJavaFun || isHomeworkTiring;
boolean notTrue =!isHomeworkTiring;
boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;
System.out.println("Is Java fun? " + isJavaFun);
System.out.println("Is homework tiring? " + isHomeworkTiring);
System.out.println("Is 'a' greater than 'b'? " + isAGreater);
System.out.println("Are 'a' and 'b' equal? " + areEqual);
System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);

    }
}
