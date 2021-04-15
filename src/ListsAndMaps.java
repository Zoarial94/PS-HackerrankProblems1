public class ListsAndMaps {
    //https://www.hackerrank.com/challenges/java-list/problem
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            ArrayList<Integer> list = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            String str;
            input.nextLine();

            for(int i = 0; i < num; i++) {
                list.add(input.nextInt());
            }
            input.nextLine();

            num = input.nextInt();
            for(int i = 0; i < num; i++) {
                input.nextLine();
                str = input.nextLine();
                if(str.equals("Insert")) {
                    list.add(input.nextInt(), input.nextInt());
                } else if(str.equals("Delete")) {
                    list.remove(input.nextInt());
                }
            }
            //Collections.sort(list);
            for(Integer i : list) {
                System.out.print(i + " ");
            }

        }
    }

    //https://www.hackerrank.com/challenges/phone-book/problem
    class Solution{
        public static void main(String []argh)
        {
            Scanner in = new Scanner(System.in);
            HashMap<String, Integer> map = new HashMap<>();
            int n=in.nextInt();
            in.nextLine();
            for(int i=0;i<n;i++)
            {
                String name=in.nextLine();
                int phone=in.nextInt();
                in.nextLine();
                map.put(name, phone);
            }
            while(in.hasNext())
            {
                String s=in.nextLine();
                Integer i = map.get(s);
                if(i != null) {
                    System.out.println(s + "=" + i);
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }

    //https://www.hackerrank.com/challenges/java-hashset/problem
    HashSet<String> set = new HashSet<>();
        for(int i = 0; i < t; i++) {
        set.add(pair_left[i] + " " + pair_right[i]);
        System.out.println(set.size());
    }


    //https://www.hackerrank.com/challenges/java-generics/problem
    class Printer
    {
        //Write your code here
        <T> void printArray(T[] var) {
            for(T e : var) {
                System.out.println(e);
            }
        }

    }

    //https://www.hackerrank.com/challenges/java-sort/problem
    public class Solution
    {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }

            studentList.sort((s1, s2)->{
                int cmp = Double.compare(s2.getCgpa(), s1.getCgpa());
                if(cmp == 0) {
                    cmp = s1.getFname().compareTo(s2.getFname());
                    if(cmp == 0) {
                        return Integer.compare(s1.getId(), s2.getId());
                    }
                }
                return cmp;
            });

            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }
    }

    //https://www.hackerrank.com/challenges/java-bitset/problem
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int len = input.nextInt();
            BitSet original1 = new BitSet(num);
            BitSet original2 = new BitSet(num);

            String token;
            BitSet b1, b2;
            for(int i = 0; i < len; i++) {
                input.nextLine();
                token = input.next();
                if(input.nextInt() == 1) {
                    b1 = original1;
                } else {
                    b1 = original2;
                }

                if(token.equals("AND")) {
                    if(input.nextInt() == 1) {
                        b2 = original1;
                    } else {
                        b2 = original2;
                    }
                    b1.and(b2);
                } else if(token.equals("OR")) {
                    if(input.nextInt() == 1) {
                        b2 = original1;
                    } else {
                        b2 = original2;
                    }
                    b1.or(b2);
                } else if(token.equals("XOR")) {
                    if(input.nextInt() == 1) {
                        b2 = original1;
                    } else {
                        b2 = original2;
                    }
                    b1.xor(b2);
                } else if(token.equals("FLIP")) {
                    b1.flip(input.nextInt());
                } else if(token.equals("SET")) {
                    b1.set(input.nextInt());
                }
                System.out.println(original1.cardinality() + " " + original2.cardinality());

            }

        }
    }
}
