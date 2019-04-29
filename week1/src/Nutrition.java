public class Nutrition {
    int protein;
    int carbohydrate;
    int fat;

    @Override
    public String toString(){
        return String.valueOf(protein) + "#" + String.valueOf(carbohydrate)+"#"+ String.valueOf(fat);
    }

    public String myString(){
        return String.valueOf(protein) + "#" + String.valueOf(carbohydrate)+"#"+ String.valueOf(fat);
    }

}
