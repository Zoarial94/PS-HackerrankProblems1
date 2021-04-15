public class Inheritance {
    //https://www.hackerrank.com/challenges/java-inheritance-1/problem
    class Bird extends Animal
    {
        void fly()
        {
            System.out.println("I am flying");
        }
        void sing() {
            System.out.println("I am singing");
        }
    }
    //https://www.hackerrank.com/challenges/java-inheritance-2/problem
    class Arithmetic {
        int add(int a, int b) {
            return a+b;
        }
    }

    class Adder extends Arithmetic {

    }

    //https://www.hackerrank.com/challenges/java-abstract-class/problem
    class MyBook extends Book {
        void setTitle(String s) {
            title=s;
        }
    }

    //https://www.hackerrank.com/challenges/java-interface/problem
    class MyCalculator implements AdvancedArithmetic {
        int ret = 0;
        public int divisor_sum(int n) {
            for(int i = 1; i <= n; i++) {
                if(n%i == 0) {
                    ret+=i;
                }
            }
            return ret;
        }
    }

    //https://www.hackerrank.com/challenges/java-method-overriding/problem
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

    //https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem
    String temp=super.define_me(); //Fix this line

    //https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
    public class InstanceOFTutorial{

        static String count(ArrayList mylist){
            int a = 0,b = 0,c = 0;
            for(int i = 0; i < mylist.size(); i++){
                Object element=mylist.get(i);
                if(element instanceof Student)
                    a++;
                if(element instanceof Rockstar)
                    b++;
                if(element instanceof Hacker)
                    c++;
            }
            String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
            return ret;
        }

        public static void main(String []args){
            ArrayList mylist = new ArrayList();
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0; i<t; i++){
                String s=sc.next();
                if(s.equals("Student"))mylist.add(new Student());
                if(s.equals("Rockstar"))mylist.add(new Rockstar());
                if(s.equals("Hacker"))mylist.add(new Hacker());
            }
            System.out.println(count(mylist));
        }
    }

    //https://www.hackerrank.com/challenges/java-iterator/problem
    Object element = it.next();
         if(element instanceof String)//Hints: use instanceof operator
             ;
}
