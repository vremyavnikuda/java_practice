package ООП_Абстрактные_классы_и_интерфейсы;

//Library
public class Library extends Building {
    //int numBooks-> кол-во книг в Library
    private int numBooks;
    public Library(
            String titleBuildeing,
            String addressBuildeing,
            int year_of_constructionBuildeing,
            String name_architectBuildeing,
            boolean cultural_monumentBuildeing
    ) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing
        );
        this.numBooks = numBooks;
    }

    //get/set numBooks
    public int getNumBooks() {
        return numBooks;
    }
    public void setNumBooks(int numBooks) {
        this.numBooks = numBooks;
    }
}

