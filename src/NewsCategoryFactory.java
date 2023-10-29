public class NewsCategoryFactory {

    public String createArticle(String category) {
        if (category == null) {
            return null;
        }
        if (category.equalsIgnoreCase("SPORTS")) {
            return "New sports article about the Olympics!";
        } else if (category.equalsIgnoreCase("POLITICS")) {
            return "New political analysis about the upcoming elections!";
        } else if (category.equalsIgnoreCase("ENTERTAINMENT")) {
            return "Latest celebrity gossip revealed!";
        }
        return null;
    }
}
