import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Person[] persons = new Person[N];

        for (int i = 0 ; i < N ; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            persons[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());

        }

        Arrays.sort(persons,new Comparator<Person>() {
            @Override
            public int compare(Person s1, Person s2) {
                return s1.age - s2.age;
            }
        });

        for(int i = 0 ; i < persons.length ; i++) {
            System.out.println(persons[i].age + " " + persons[i].name);
        }


        br.close();
    }


    public static class Person {
        int age;
        String name;

        public Person(int a, String n) {
            this.age = a;
            this.name = n;
        }
        
    }


}
