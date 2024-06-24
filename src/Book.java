public class Book {
    private String fullName;
    Author author;
    private int year ;
    public Book (String fullName, Author author, int year){
        this.fullName = fullName;
        this.year = year;
        this.author = author;
    }
    public String getFullName(){
        return this.fullName;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAuthor (Author author){
        this.author = author;
    }
    public void setYear ( int year) {
        this.year = year;
    }
    public String toString(){
        return "имя " + this.fullName + " автор " + this.author + " год издания " + this.year;
    }
        @Override
        public boolean equals (Object other){
            if (this.getClass() != other.getClass()) {
                return false;
            }

            return this.fullName.equals(((Book) other).fullName);

    }

}

