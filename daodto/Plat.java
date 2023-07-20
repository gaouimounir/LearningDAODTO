package daodto;


class Plat {
    private String Article;
    private int quantite;
    private double prixUnitaire;

    public Plat(String Article, int quantite, double prixUnitaire) {
        this.Article = Article;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }
    
    public double getTotal() {
        return quantite * prixUnitaire;
    }

    public String getArticle() {
        return Article;
    }

    public int getQuantity() {
        return quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }
    	
    }