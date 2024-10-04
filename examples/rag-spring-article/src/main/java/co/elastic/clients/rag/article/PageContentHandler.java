package co.elastic.clients.rag.article;

import org.apache.tika.sax.ToTextContentHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// taken from:
// https://github.com/mkalus/tika-page-extractor/blob/master/src/main/java/de/auxnet/PageContentHandler.java
public class PageContentHandler extends ToTextContentHandler {
    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(PageContentHandler.class);

    final static private String pageTag = "div";
    final static private String pageClass = "page";

    /**
     * StringBuilder of current page
     */
    private StringBuilder builder;

    /**
     * page counter
     */
    private int pageNumber = 0;

    /**
     * page map - setting the initial capacity to 500 will enhance speed by a tiny bit up to 500 bits, but will require
     * more RAM
     */
    private Map<Integer, String> pages = new HashMap<>(500);

    /**
     * flag telling to compress text information by stripping whitespace?
     */
    private final boolean compress;

    /**
     * Default constructor
     */
    public PageContentHandler() {
        this.compress = true;
    }

    /**
     * Constructor
     *
     * @param compress text information by stripping whitespace?
     */
    public PageContentHandler(boolean compress) {
        this.compress = compress;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (pageTag.endsWith(qName) && pageClass.equals(atts.getValue("class")))
            startPage();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (pageTag.endsWith(qName))
            endPage();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // append data
        if (length > 0 && builder != null) {
            builder.append(ch);
        }
    }

    protected void startPage() throws SAXException {
        builder = new StringBuilder();
        pageNumber++;
        if (logger.isDebugEnabled())
            logger.debug("Page: " + pageNumber);
    }

    protected void endPage() throws SAXException {
        String page = builder.toString();
        builder = new StringBuilder();

        // if compression has been turned on, compact whitespace and trim string
        if (compress)
            page = page.replaceAll("\\s+", " ").trim();

        // page number already exists?
        if (pages.containsKey(pageNumber)) {
            if (page.isEmpty()) return; // do not add empty pages to map

            page = pages.get(pageNumber) + " " + page; // concatenate pages
            page = page.trim();
        }

        // add to page list
        pages.put(pageNumber, page);
    }

    /**
     * @return all extracted pages
     */
    public List<String> getPages() {
        List<String> pagesReal = new ArrayList<>(pageNumber);

        // convert to list
        for (int i = 1; i <= pageNumber; i++) {
            String page = pages.get(i);
            if (page == null) page = "";

            pagesReal.add(page);
        }

        if (logger.isDebugEnabled())
            logger.debug("Returning " + pageNumber + " page(s).");

        return pagesReal;
    }
}
