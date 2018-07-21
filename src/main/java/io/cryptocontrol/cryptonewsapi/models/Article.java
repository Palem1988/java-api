package io.cryptocontrol.cryptonewsapi.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an article coming from the CryptoControl.io API
 *
 * @author enamakel@cryptocontrol.io
 */
public class Article {
    private String _id;
    private String publishedAt;
    private Double hotness;
    private Double activityHotness;
    private String primaryCategory;
    private Integer words;
    private String description;
    private String title;
    private String url;
    private String originalImageUrl;
    private String sourceDomain;
    private String thumbnail;

    private List<Coin> coins = new ArrayList<Coin>();
    private List<SimilarArticle> similarArticles = new ArrayList<SimilarArticle>();


    public String getId() {
        return _id;
    }


    public String getSourceDomain() {
        return sourceDomain;
    }


    public String getPublishedAt() {
        return publishedAt;
    }


    public Double getHotness() {
        return hotness;
    }


    public Double getActivityHotness() {
        return activityHotness;
    }


    public String getPrimaryCategory() {
        return primaryCategory;
    }


    public Integer getWords() {
        return words;
    }


    public String getDescription() {
        return description;
    }


    public String getTitle() {
        return title;
    }


    public String getUrl() {
        return url;
    }


    public String getThumbnail() {
        return thumbnail;
    }


    public String getOriginalImageUrl() {
        return originalImageUrl;
    }


    public List<Coin> getCoins() {
        return coins;
    }


    public List<SimilarArticle> getSimilarArticles() {
        return similarArticles;
    }


    public static class SimilarArticle {
        private String _id;
        private String publishedAt;
        private String title;
        private String url;
        private String sourceDomain;


        public String getId() {
            return _id;
        }


        public String getPublishedAt() {
            return publishedAt;
        }


        public String getTitle() {
            return title;
        }


        public String getUrl() {
            return url;
        }


        public String getSourceDomain() {
            return sourceDomain;
        }
    }


    public static class Coin {
        private String _id;
        private String name;
        private String slug;
        private String tradingSymbol;


        public String getId() {
            return _id;
        }


        public String getName() {
            return name;
        }


        public String getSlug() {
            return slug;
        }


        public String getTradingSymbol() {
            return tradingSymbol;
        }
    }


    public static class ArticleList extends ArrayList<Article> {
    }
}