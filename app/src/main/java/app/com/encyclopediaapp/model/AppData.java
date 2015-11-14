package app.com.encyclopediaapp.model;


import java.util.ArrayList;

public class AppData {


    private static String imageDirectory;
    private static String thumbDirectory;
    private static String soundDirectory;

    /**
     *
     * @return  Arabic Alphabets
     */
    public static ArrayList<Item> getAlphabetsData(){

        imageDirectory = "assets://";
        ArrayList<Item> itemList = new ArrayList<>();
        //itemList.add(new Item("A","a7.mp3",""));
        return itemList;
    }

    /**
     *
     * @return Arabic Numbers
     */
    public static ArrayList<Item> getArabicNumbersData(){

        imageDirectory = "assets://numbers/image/";
        thumbDirectory = "assets://numbers/thumb/";
        soundDirectory = "numbers/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(null, soundDirectory+"n0.mp3", imageDirectory+"num0.jpg",thumbDirectory+"num0.jpg"));
        itemList.add(new Item(null, soundDirectory+"n1.mp3", imageDirectory+"num1.jpg",thumbDirectory+"num1.jpg"));
        itemList.add(new Item(null, soundDirectory+"n2.mp3", imageDirectory+"num2.jpg",thumbDirectory+"num2.jpg"));
        itemList.add(new Item(null, soundDirectory+"n3.mp3", imageDirectory+"num3.jpg",thumbDirectory+"num3.jpg"));
        itemList.add(new Item(null, soundDirectory+"n4.mp3", imageDirectory+"num4.jpg",thumbDirectory+"num4.jpg"));
        itemList.add(new Item(null, soundDirectory+"n5.mp3", imageDirectory+"num5.jpg",thumbDirectory+"num5.jpg"));
        itemList.add(new Item(null, soundDirectory+"n6.mp3", imageDirectory+"num6.jpg",thumbDirectory+"num6.jpg"));
        itemList.add(new Item(null, soundDirectory+"n7.mp3", imageDirectory+"num7.jpg",thumbDirectory+"num7.jpg"));
        itemList.add(new Item(null, soundDirectory+"n8.mp3", imageDirectory+"num8.jpg",thumbDirectory+"num8.jpg"));
        itemList.add(new Item(null, soundDirectory+"n9.mp3", imageDirectory+"num9.jpg",thumbDirectory+"num9.jpg"));

        return itemList;
    }

    /**
     *
     * @return Colors
     */
    public static ArrayList<Item> getColorsData(){
        imageDirectory = "assets://colors/image/";
        thumbDirectory = "assets://colors/thumb/";
        soundDirectory = "colors/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(null, soundDirectory+"n0.mp3", imageDirectory+"num0.jpg",thumbDirectory+"num0.jpg"));
        itemList.add(new Item(null, soundDirectory+"n1.mp3", imageDirectory+"num1.jpg",thumbDirectory+"num1.jpg"));
        itemList.add(new Item(null, soundDirectory+"n2.mp3", imageDirectory+"num2.jpg",thumbDirectory+"num2.jpg"));
        itemList.add(new Item(null, soundDirectory+"n3.mp3", imageDirectory+"num3.jpg",thumbDirectory+"num3.jpg"));
        itemList.add(new Item(null, soundDirectory+"n4.mp3", imageDirectory+"num4.jpg",thumbDirectory+"num4.jpg"));
        itemList.add(new Item(null, soundDirectory+"n5.mp3", imageDirectory+"num5.jpg",thumbDirectory+"num5.jpg"));
        itemList.add(new Item(null, soundDirectory+"n6.mp3", imageDirectory+"num6.jpg",thumbDirectory+"num6.jpg"));
        itemList.add(new Item(null, soundDirectory+"n7.mp3", imageDirectory+"num7.jpg",thumbDirectory+"num7.jpg"));
        itemList.add(new Item(null, soundDirectory+"n8.mp3", imageDirectory+"num8.jpg",thumbDirectory+"num8.jpg"));
        itemList.add(new Item(null, soundDirectory+"n9.mp3", imageDirectory+"num9.jpg",thumbDirectory+"num9.jpg"));

        return itemList;
    }

    /**
     *
     * @return  Animals
     */
    public static ArrayList<Item> getAnimalsData(){
        ArrayList<Item> itemList = new ArrayList<>();
        //itemList.add(new Item("A","a7.mp3",""));
        return itemList;
    }

    /**
     *
     * @return Fruits & Vegetables
     */
    public static ArrayList<Item> getFruitsData(){
        ArrayList<Item> itemList = new ArrayList<>();
        //itemList.add(new Item("A","a7.mp3",""));
        return itemList;
    }

    /**
     *
     * @return Shapes // note replace islamic audio
     */
    public static ArrayList<Item> getShapesData(){
        ArrayList<Item> itemList = new ArrayList<>();
        //itemList.add(new Item("A","a7.mp3",""));
        return itemList;
    }


}
