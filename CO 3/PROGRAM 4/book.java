//4. Write a program has class Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category, using inheritance. 


class book{

    public static void main(String[] args) {
       Literature litObj = new Literature("Lit","ADVANCED LANGUAGE","LANCE BALLA");
       Fiction FicObj = new Fiction("Fic","THE BOOK OF THIEF","MARKUS ZUSAK");
       litObj.display();
       FicObj.display();
       
    }
}

class Publisher {
    String publisherName;
    Publisher(String P){
        this.publisherName = P;
    }
    void display(){
        System.out.println("Publisher Name : " + this.publisherName);
    }
}

class Books extends Publisher{  
    String bookName;
    Books(String B,String P){
        super(P);
        this.bookName =B;
    }
    void display(){
        super.display();
        System.out.println("Bookname Name : " + this.bookName);
    }
}

class Literature extends Books{  
    String LiteratureName;
    Literature(String L,String B,String P){
        super(B,P);
        this.LiteratureName = L;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Literature Name : " + this.LiteratureName);
        System.out.println("..........................................");
    }
 
}

class Fiction extends Books{  
    String FictionName;
    Fiction(String F,String B,String P){
        super(B,P);
        this.FictionName = F;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Fiction Name : " + this.FictionName);
        System.out.println("..........................................");
    }
}