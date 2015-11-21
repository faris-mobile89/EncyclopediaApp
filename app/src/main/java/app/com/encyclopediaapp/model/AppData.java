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

        itemList.add(new Item(null, soundDirectory+"cat.mp3", imageDirectory+"cat1.jpg",thumbDirectory+"cat.png"));
        itemList.add(new Item(null, soundDirectory+"cow.mp3", imageDirectory+"cow2.jpg",thumbDirectory+"cow.png"));
        itemList.add(new Item(null, soundDirectory+"dog.mp3", imageDirectory+"dog3.jpg",thumbDirectory+"dog.png"));
        itemList.add(new Item(null, soundDirectory+"elephant.mp3", imageDirectory+"elephant5.jpg",thumbDirectory+"elephant.png"));
        itemList.add(new Item(null, soundDirectory+"horse.mp3", imageDirectory+"horse1.jpg",thumbDirectory+"horse.png"));
        itemList.add(new Item(null, soundDirectory+"lion.mp3", imageDirectory+"lion3.jpg",thumbDirectory+"lion.png"));
        itemList.add(new Item(null, soundDirectory+"mouse.mp3", imageDirectory+"mouse1.png",thumbDirectory+"cat.png"));
        itemList.add(new Item(null, soundDirectory+"sheep.mp3", imageDirectory+"sheep3.jpg",thumbDirectory+"sheep.png"));
        itemList.add(new Item(null, soundDirectory+"wolf.mp3", imageDirectory+"wolf3.jpg",thumbDirectory+"wolf.png"));

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
