package safescanner.language;

public class CharacterControl {

    public static boolean isLetter(char character) {
        if (IsLanguageCharacter(Languages.TurkishAlp, character) || IsLanguageCharacter(Languages.EnglishAlp, character)
                || IsLanguageCharacter(Languages.SpaceBar, character)) {

          //  System.out.println("sorun olmayan harf :" + character);
            return true;
        }
      //  System.out.println("TAKILAN HARF : " + character);
        return false;
    }

    public static boolean IsLanguageCharacter(String language, char character) {
        for (int i = 0; i < language.length(); i++) {
            if (language.charAt(i) == character) {
                return true;

            }
        //    System.out.println("Aranan karakter : "+character+"  eslesmeyen harfler : "+language.charAt(i));
        }
        return false;
    }
}
