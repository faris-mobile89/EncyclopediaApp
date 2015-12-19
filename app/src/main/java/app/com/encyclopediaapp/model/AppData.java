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

        imageDirectory = "assets://alphabets/image/";
        thumbDirectory = "assets://alphabets/image/";
        soundDirectory = "alphabets/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        for (int number = 1; number <= 28 ; number++) {

            itemList.add(new Item(null,
                    soundDirectory+"s"+ number +".mp3",
                    imageDirectory+"let"+ number +".jpg",imageDirectory+"let"+ number +".jpg"));
        }

        return itemList;
    }

    /**
     *
     * @return Arabic Numbers
     */
    public static ArrayList<Item> getArabicNumbersData(){

        imageDirectory = "assets://numbers/image/";
        thumbDirectory = "assets://numbers/image/";
        soundDirectory = "numbers/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(null, soundDirectory+"n0.mp3", imageDirectory+"num0_.jpg",thumbDirectory+"num0_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n1.mp3", imageDirectory+"num1_.jpg",thumbDirectory+"num1_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n2.mp3", imageDirectory+"num2_.jpg",thumbDirectory+"num2_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n3.mp3", imageDirectory+"num3_.jpg",thumbDirectory+"num3_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n4.mp3", imageDirectory+"num4_.jpg",thumbDirectory+"num4_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n5.mp3", imageDirectory+"num5_.jpg",thumbDirectory+"num5_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n6.mp3", imageDirectory+"num6_.jpg",thumbDirectory+"num6_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n7.mp3", imageDirectory+"num7_.jpg",thumbDirectory+"num7_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n8.mp3", imageDirectory+"num8_.jpg",thumbDirectory+"num8_.jpg"));
        itemList.add(new Item(null, soundDirectory+"n9.mp3", imageDirectory+"num9_.jpg",thumbDirectory+"num9_.jpg"));

        return itemList;
    }

    /**
     *
     * @return Colors
     */
    public static ArrayList<Item> getColorsData(){

        imageDirectory = "assets://colors/image/";
        thumbDirectory = "assets://colors/image/";
        soundDirectory = "colors/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        for (int number = 1; number <= 12 ; number++) {

            itemList.add(new Item(null,
                    soundDirectory+"ss"+ number +".mp3",
                    imageDirectory+"col"+ number +".jpg",imageDirectory+"col"+ number +".jpg"));

        }

        return itemList;
    }

    /**
     *
     * @return  Animals
     */
    public static ArrayList<Item> getAnimalsData(){

        imageDirectory = "assets://animals/image/";
        thumbDirectory = "assets://animals/thumb/";
        soundDirectory = "animals/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(null, soundDirectory+"1.mp3",   imageDirectory+"cat1.jpg",thumbDirectory+"cat.png"));
        itemList.add(new Item(null, soundDirectory+"039.mp3", imageDirectory+"donkey.jpg",thumbDirectory+"donkey_thumb.png"));
        itemList.add(new Item(null, soundDirectory+"033.mp3", imageDirectory+"dog3.jpg",thumbDirectory+"dog.png"));
        itemList.add(new Item(null, soundDirectory+"043.mp3", imageDirectory+"chicken.jpg",thumbDirectory+"chicken.jpg"));
        itemList.add(new Item(null, soundDirectory+"049.mp3", imageDirectory+"deer.jpg",thumbDirectory+"deer_thumb.jpg"));
        itemList.add(new Item(null, soundDirectory+"038.mp3", imageDirectory+"lion3.jpg",thumbDirectory+"lion.png"));
        itemList.add(new Item(null, soundDirectory+"034.mp3", imageDirectory+"mouse1.jpg",thumbDirectory+"mouse.png"));
        itemList.add(new Item(null, soundDirectory+"032.mp3", imageDirectory+"sheep3.jpg",thumbDirectory+"sheep.png"));
        itemList.add(new Item(null, soundDirectory+"050.mp3", imageDirectory+"rabbit.jpg",thumbDirectory+"rabbit_thumb.png"));

        return itemList;
    }

    /**
     *
     * @return Fruits & Vegetables
     */
    public static ArrayList<Item> getFruitsData(){

        imageDirectory = "assets://fruits/image/";
        thumbDirectory = "assets://fruits/image/";
        soundDirectory = "fruits/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        for (int number = 2; number <= 12 ; number++) {

            itemList.add(new Item(null,
                    soundDirectory+"p"+ number +".wav",
                    imageDirectory+"p"+ number +".png",imageDirectory+"p"+ number +".png"));
        }
        return itemList;
    }

    /**
     *
     * @return Shapes // note replace islamic audio
     */
    public static ArrayList<Item> getQuraanData(){

        imageDirectory = "assets://islam/image/";
        thumbDirectory = "assets://islam/thumb/";
        soundDirectory = "islam/sound/";

        ArrayList<Item> itemList = new ArrayList<>();

        for (int number = 1; number <= 19 ; number++) {

            itemList.add(new Item(null,
                    soundDirectory+"b1"+ number +".mp3",
                    imageDirectory+"zx"+ number +".jpg",imageDirectory+"zx"+ number +".jpg"));
        }

        return itemList;
    }


}
