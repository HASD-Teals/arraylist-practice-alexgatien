import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        List<String> myList = new ArrayList<String>();

        System.out.println(myList);

        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");
        myList.add("Emus");

        System.out.println(myList);

        myList.add(2, "Cat");

        System.out.println(myList);

        myList.remove(1);

        System.out.println(myList);

        System.out.println(myList.size());

        System.out.println(myList.get(2));

        int lengthAnimalname = (myList.get(1)).toString().length();
        System.out.println(lengthAnimalname);
        myList.add("Cat");
        myList.add("Ant");
        removeEvenLength(myList);
        System.out.println(myList);
        System.out.println(averageVowels(myList));

        removeDuplicates(myList);
        System.out.println(myList);
        myList.add("Walrus");
        myList.add("Parrot");
        myList.add("Lizard");
        myList.add("Swordfish");
        doubleList(myList);
        System.out.println(myList);
        removeDuplicates(myList);
        System.out.println(myList);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(654);
        numbers.add(14);
        numbers.add(789);
        System.out.println(numbers);
        minToFront(numbers);
        System.out.println(numbers);
    }

    public static void removeEvenLength(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() % 2 == 0) {
                myList.remove(i);
            }
        }
    }

    public static double averageVowels(List<String> myList) {
        double average = 0;
        double[] collection = new double[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            int numberInWord = 0;
            for (int j = 0; j < myList.get(i).length(); j++) {
                if (myList.get(i).charAt(j) == 'a' || myList.get(i).charAt(j) == 'e' || myList.get(i).charAt(j) == 'i'
                        || myList.get(i).charAt(j) == 'o' || myList.get(i).charAt(j) == 'u'
                        || myList.get(i).charAt(j) == 'A'
                        || myList.get(i).charAt(j) == 'E' || myList.get(i).charAt(j) == 'I'
                        || myList.get(i).charAt(j) == 'O'
                        || myList.get(i).charAt(j) == 'U') {
                    numberInWord++;

                }
            }
            collection[i] = numberInWord;
        }
        for (int k = 0; k < collection.length; k++) {
            average = average + collection[k];
        }
        average = average / collection.length;
        return average;
    }

    public static void removeDuplicates(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                if (j != i) {
                    if (myList.get(i) == myList.get(j)) {
                        myList.remove(j);
                    }
                }
            }
        }

    }

    public static void doubleList(List<String> myList) {
        int temp = myList.size() * 2;
        for (int i = 0; i < temp; i++) {
            myList.add(i, myList.get(i));
            i++;
        }
    }

    public static void minToFront(List<Integer> myList) {
        int temp = myList.get(0);
        int location = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (temp > myList.get(i)) {
                temp = myList.get(i);
                location = i;
            }
        }
        myList.remove(location);
        myList.add(0, temp);
    }
}
