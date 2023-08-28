package week02.collection;

import java.util.*;

public class ColHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String collectionName = sc.next();
        String title = sc.nextLine();

        switch (collectionName) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true){
                    String text = sc.nextLine();
                    if(Objects.equals(text,"끝")){
                        break;
                    }
                    strList.add(text);
                }

                title = "[ List로 저장된 "+ title + " ]";
                System.out.println(title);
                for(int i=0; i< strList.size(); i++){
                    int number = i + 1;
                    System.out.println(number + ". " + strList.get(i));
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while (true){
                    String text = sc.nextLine();
                    if(Objects.equals(text,"끝")){
                        break;
                    }
                    strSet.add(text);
                }

                title = "[ Set 으로 저장된 " + title + " ]";
                System.out.println(title);

                Iterator iterator = strSet.iterator();
                // 하나하나씩 순회할 수 있도록 많든 구조
                // Set이 가지고 있는 데이터를 iterator에 줘서 한줄씩 담긴다.
                for(int i = 0; i < strSet.size(); i++){
                    int number = i +1;
                    System.out.println(number + ". "+iterator.next());
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")){
                        break;
                    }
                    strMap.put(lineNumber++, text);
                }

                title = "[ Map 으로 저장된 " + title + " ]";
                System.out.println(title);

                for(int i=0; i < strMap.size(); i++){
                    int number = i + 1;
                    System.out.println(number + ". "+ strMap.get(i+1));
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}
