public class Student {
        String studentName;
        //Static variables
        int studentAge;

        public Student(String name, int age) {
            this.studentName = name;
            this.studentAge = age;
        }
        //Static method
        static void sayHello() {
            System.out.println("Hello i am java");
        }

        @Override
        public String toString() {
            return "StaticExercise{"+
                    "studentName=" + studentName + ", studentAge=" + studentAge +
                    "}";
        }

    public static void main(String[] args) {
        System.out.println();
    }

    }
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"
//public String makeOutWord(String out, String word) {
//
//  return out.substring(0,2) + word + out.substring(2);
//
//
//}