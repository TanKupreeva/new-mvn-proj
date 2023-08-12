package dz.manyTasks.interfaces.task9;

public interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}

class WebPage implements Searchable {
    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public boolean search(String keyword) {
        return url.contains(keyword);
    }
}
class Test{
    public static void main(String[] args) {
        Document d1 = new Document("Java documents");
        System.out.println("Document contains keyword 'Java': "+d1.search("Java"));
        WebPage wp = new WebPage("https://github.com/TanKupreeva/new-mvn-proj/tree/dev","This is a sample webpage.");
        System.out.println("Webpage contains keyword 'new': "+wp.search("new"));
    }
}