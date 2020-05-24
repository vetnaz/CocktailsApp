package com.example.cocktailsapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Drinks {


        private String idDrink;

        private String strDrink;

        private Object strDrinkAlternate;

        private Object strDrinkES;

        private Object strDrinkDE;

        private Object strDrinkFR;

        private Object strDrinkZHHANS;

        private Object strDrinkZHHANT;

        private Object strTags;

        private Object strVideo;

        private String strCategory;

        private Object strIBA;

        private String strAlcoholic;

        private String strGlass;

        private String strInstructions;

        private Object strInstructionsES;

        private String strInstructionsDE;

        private Object strInstructionsFR;

        private Object strInstructionsZHHANS;

        private Object strInstructionsZHHANT;

        private String strDrinkThumb;

        private String strIngredient1;

        private String strIngredient2;

        private String strIngredient3;

        private String strIngredient4;

        private String strIngredient5;

        private String strIngredient6;

        private Object strIngredient7;

        private Object strIngredient8;

        private Object strIngredient9;

        private Object strIngredient10;

        private Object strIngredient11;

        private Object strIngredient12;

        private Object strIngredient13;

        private Object strIngredient14;

        private Object strIngredient15;

        private String strMeasure1;

        private String strMeasure2;

        private String strMeasure3;

        private String strMeasure4;

        private String strMeasure5;

        private Object strMeasure6;

        private Object strMeasure7;

        private Object strMeasure8;

        private Object strMeasure9;
        private Object strMeasure10;

        private Object strMeasure11;

        private Object strMeasure12;

        private Object strMeasure13;

        private Object strMeasure14;

        private Object strMeasure15;

        private String strCreativeCommonsConfirmed;
        @SerializedName("dateModified")
        @Expose
        private String dateModified;


    public Drinks(String idDrink, String strDrink, String strAlcoholic, String strGlass, String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strInstructions,String strDrinkThumb) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
        this.strDrinkThumb = strDrinkThumb;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
    }

    public String getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public Object getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    public void setStrDrinkAlternate(Object strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    public Object getStrDrinkES() {
        return strDrinkES;
    }

    public void setStrDrinkES(Object strDrinkES) {
        this.strDrinkES = strDrinkES;
    }

    public Object getStrDrinkDE() {
        return strDrinkDE;
    }

    public void setStrDrinkDE(Object strDrinkDE) {
        this.strDrinkDE = strDrinkDE;
    }

    public Object getStrDrinkFR() {
        return strDrinkFR;
    }

    public void setStrDrinkFR(Object strDrinkFR) {
        this.strDrinkFR = strDrinkFR;
    }

    public Object getStrDrinkZHHANS() {
        return strDrinkZHHANS;
    }

    public void setStrDrinkZHHANS(Object strDrinkZHHANS) {
        this.strDrinkZHHANS = strDrinkZHHANS;
    }

    public Object getStrDrinkZHHANT() {
        return strDrinkZHHANT;
    }

    public void setStrDrinkZHHANT(Object strDrinkZHHANT) {
        this.strDrinkZHHANT = strDrinkZHHANT;
    }

    public Object getStrTags() {
        return strTags;
    }

    public void setStrTags(Object strTags) {
        this.strTags = strTags;
    }

    public Object getStrVideo() {
        return strVideo;
    }

    public void setStrVideo(Object strVideo) {
        this.strVideo = strVideo;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public Object getStrIBA() {
        return strIBA;
    }

    public void setStrIBA(Object strIBA) {
        this.strIBA = strIBA;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public Object getStrInstructionsES() {
        return strInstructionsES;
    }

    public void setStrInstructionsES(Object strInstructionsES) {
        this.strInstructionsES = strInstructionsES;
    }

    public String getStrInstructionsDE() {
        return strInstructionsDE;
    }

    public void setStrInstructionsDE(String strInstructionsDE) {
        this.strInstructionsDE = strInstructionsDE;
    }

    public Object getStrInstructionsFR() {
        return strInstructionsFR;
    }

    public void setStrInstructionsFR(Object strInstructionsFR) {
        this.strInstructionsFR = strInstructionsFR;
    }

    public Object getStrInstructionsZHHANS() {
        return strInstructionsZHHANS;
    }

    public void setStrInstructionsZHHANS(Object strInstructionsZHHANS) {
        this.strInstructionsZHHANS = strInstructionsZHHANS;
    }

    public Object getStrInstructionsZHHANT() {
        return strInstructionsZHHANT;
    }

    public void setStrInstructionsZHHANT(Object strInstructionsZHHANT) {
        this.strInstructionsZHHANT = strInstructionsZHHANT;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public Object getStrIngredient7() {
        return strIngredient7;
    }

    public void setStrIngredient7(Object strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public Object getStrIngredient8() {
        return strIngredient8;
    }

    public void setStrIngredient8(Object strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public Object getStrIngredient9() {
        return strIngredient9;
    }

    public void setStrIngredient9(Object strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public Object getStrIngredient10() {
        return strIngredient10;
    }

    public void setStrIngredient10(Object strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public Object getStrIngredient11() {
        return strIngredient11;
    }

    public void setStrIngredient11(Object strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public Object getStrIngredient12() {
        return strIngredient12;
    }

    public void setStrIngredient12(Object strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public Object getStrIngredient13() {
        return strIngredient13;
    }

    public void setStrIngredient13(Object strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public Object getStrIngredient14() {
        return strIngredient14;
    }

    public void setStrIngredient14(Object strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public Object getStrIngredient15() {
        return strIngredient15;
    }

    public void setStrIngredient15(Object strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    public Object getStrMeasure6() {
        return strMeasure6;
    }

    public void setStrMeasure6(Object strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    public Object getStrMeasure7() {
        return strMeasure7;
    }

    public void setStrMeasure7(Object strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    public Object getStrMeasure8() {
        return strMeasure8;
    }

    public void setStrMeasure8(Object strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    public Object getStrMeasure9() {
        return strMeasure9;
    }

    public void setStrMeasure9(Object strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    public Object getStrMeasure10() {
        return strMeasure10;
    }

    public void setStrMeasure10(Object strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    public Object getStrMeasure11() {
        return strMeasure11;
    }

    public void setStrMeasure11(Object strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    public Object getStrMeasure12() {
        return strMeasure12;
    }

    public void setStrMeasure12(Object strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    public Object getStrMeasure13() {
        return strMeasure13;
    }

    public void setStrMeasure13(Object strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    public Object getStrMeasure14() {
        return strMeasure14;
    }

    public void setStrMeasure14(Object strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    public Object getStrMeasure15() {
        return strMeasure15;
    }

    public void setStrMeasure15(Object strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }
}
