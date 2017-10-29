
package com.realtime._a2;

import java.util.Map;

public class Matrik {
    private String name;
        private long loc;
        private long blank;
        private long comment;
        private long actual;
        private Map<String, Integer> wordCount;
        private long total;

        Matrik(String name, long loc, long blank, long comment, long actual, Map<String, Integer> wordCount, long total) {
            this.name = name;
            this.loc = loc;
            this.blank = blank;
            this.comment = comment;
            this.actual = actual;
            this.wordCount = wordCount;
            this.total = total;
        }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the loc
     */
    public long getLoc() {
        return loc;
    }

    /**
     * @param loc the loc to set
     */
    public void setLoc(long loc) {
        this.loc = loc;
    }

    /**
     * @return the blank
     */
    public long getBlank() {
        return blank;
    }

    /**
     * @param blank the blank to set
     */
    public void setBlank(long blank) {
        this.blank = blank;
    }

    /**
     * @return the comment
     */
    public long getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(long comment) {
        this.comment = comment;
    }

    /**
     * @return the actual
     */
    public long getActual() {
        return actual;
    }

    /**
     * @param actual the actual to set
     */
    public void setActual(long actual) {
        this.actual = actual;
    }

    /**
     * @return the wordCount
     */
    public Map<String, Integer> getWordCount() {
        return wordCount;
    }

    /**
     * @param wordCount the wordCount to set
     */
    public void setWordCount(Map<String, Integer> wordCount) {
        this.wordCount = wordCount;
    }

    /**
     * @return the total
     */
    public long getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(long total) {
        this.total = total;
    }
        
        
}
