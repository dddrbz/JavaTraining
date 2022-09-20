package JavaKata.ConvertStringToCamelCase;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("[^a-zA-Z]");
        String result = words[0];
        for (int i = 1; i < words.length; ++i) {
            result += String.valueOf((char)((words[i].charAt(0) < 'a') ?
                    words[i].charAt(0) : words[i].charAt(0) - 32))
                    + words[i].substring(1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }
}
