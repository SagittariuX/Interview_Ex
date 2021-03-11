
class StarRating{

    static String starRating(String rating){
        String ans = "";

        int fullStar = Integer.parseInt(rating.substring(0, 1));
        float halfStar = Float.parseFloat(rating.substring(1));

        for(int i = 0 ; i < fullStar; i++){
            ans += "full ";
        }

        if (fullStar == 5) return ans;



        if(halfStar > 0.74){
            ans += "full ";
            fullStar++;
        }else if(halfStar > .24 && halfStar < .75){
            ans += "half ";
            fullStar++;
        }

        for(int i = fullStar; i < 5; i++){
            ans += "empty ";
        }

        return ans;
    }

}