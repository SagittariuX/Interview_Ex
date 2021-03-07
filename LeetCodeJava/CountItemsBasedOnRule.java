import java.util.List;

public class CountItemsBasedOnRule {
    public static void main(String[] args) {
        
        List<List<String>> items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.print(countMatches(items, ruleKey, ruleValue));

    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){

        int temp = 0;
        if(ruleKey.equals("color")){
            temp = 1;
        }else if(ruleKey.equals("name")){
            temp = 2;
        }
        final int attr = temp;

        var count = new Object(){int value = 0;};
        items.forEach(i -> {
            if(i.get(attr).equals(ruleValue)) count.value++;
        });


        return count.value;
    }
}
