package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok transñation for that word
 * */
public class Word {
    //STATE
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    //CONSTRUCTOR
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //METHODS
    /** Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
