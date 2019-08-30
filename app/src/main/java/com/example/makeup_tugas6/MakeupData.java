package com.example.makeup_tugas6;

import java.util.ArrayList;

public class MakeupData {
    public static String[][] data = new String[][]{
            {"Urban Decay", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Urban_Decay_Naked_Heat/Urban_Decay_Naked_Heat_L_1.jpg"},
            {"Benefit Cosmetics", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Benefit_Cosmetics_Stay_Dont_Stray_Eyeshadow_Primer/Benefit_Cosmetics_Stay_Dont_Stray_Eyeshadow_Primer_L_1.jpg"},
            {"Too Faced",  "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Too_Faced_Chocolate_Bon_Bons_Eye_Shadow_Collection/Too_Faced_Chocolate_Bon_Bons_Eye_Shadow_Collection_L_1.jpg"},
            {"theBalm",  "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/the_Balm_Appetit_Eyeshadow_Palette/the_Balm_Appetit_Eyeshadow_Palette_L_1.jpg"},
            {"Make up for ever",  "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Make_Up_Fore_Ever_Artist_Shadow_Neutral/Make_Up_Fore_Ever_Artist_Shadow_Neutral_L_1.jpg"},
            {"Too Faced - Peach", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Too_Faced_Sweet_Peach_Eye_Shadow_Collection/Too_Faced_Sweet_Peach_Eye_Shadow_Collection_L_1.jpg"},
            {"Bourjois - Smoky Eyes", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Bourjois_Smoky_Eyes/Bourjois_Smoky_Eyes_L_1.jpg"},
            {"Bourjois", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Bourjois_Smoky_Stories/Bourjois_Smoky_Stories_L_1.jpg"},
            {"Make up for ever - Palette", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Make_Up_For_Ever_Artistic_Palette/Make_Up_For_Ever_Artistic_Palette_L_1.jpg"},
            {"Etude House", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Etude_House_Look_At_My_Eyes_Jewel/Etude_House_Look_At_My_Eyes_Jewel_L_1.jpg"},
    };

    public static ArrayList<DataMakeup> getListData() {
        ArrayList<DataMakeup> list = new ArrayList<>();
        for (String[] muData : data){
            DataMakeup data_makeup = new DataMakeup();
            data_makeup.setNama(muData[0]);
            data_makeup.setFoto(muData[1]);
            list.add(data_makeup);
        }
        return list;
    }
}
