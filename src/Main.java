import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProgrammingBook s1 = new ProgrammingBook("java", "hay", "P1", "Naruto",50,"TG1");
        ProgrammingBook s2 = new ProgrammingBook("python", "kem", "P2", "OnePiece",10,"TG2");
        ProgrammingBook s3 = new ProgrammingBook("java", "ngon", "P3", "life",50,"TG3");
        ProgrammingBook s4 = new ProgrammingBook("php", "duoc", "P4", "DoraEMon",40,"TG4");
        ProgrammingBook s5 = new ProgrammingBook("java", "oke", "P5", "time",50,"TG5");


        FictionBook s6 = new FictionBook("F1", "AOT", 15, "TG6","Vien Tuong");
        FictionBook s7 = new FictionBook("F2", "BoruTo", 25, "TG7","Vien Tuong1");
        FictionBook s8 = new FictionBook("F3", "Hanoi", 75, "TG8","Vien Tuong1");
        FictionBook s9 = new FictionBook("F4", "City", 115, "TG9","life");
        FictionBook s10 = new FictionBook("F5", "Cloud", 125, "TG10","Vien Tuong1");


        Book[] books = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        int total = 0;
        for (Book b:books
        ){
            total += b.getPrice();
        }


        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (Book b:books
        ){
            if (b instanceof ProgrammingBook){
                String language = ((ProgrammingBook)b).getLanguage();
                if (language.equals("java")){
                    count1++;
                }
            }
            else if (b instanceof FictionBook){
                String category = ((FictionBook)b).getCategory();
                if (category.equals("Vien Tuong1")){
                    count2++;
                }
                if (((FictionBook)b).getPrice()<100){
                    count3++;
                }
            }
        }

        System.out.println("Total 10 books: " + total);
        System.out.println("java language books: " + count1);
        System.out.println("Category Vien Tuong1: " + count2);
        System.out.println("Fiction books price less than 100: " + count3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book: ");
        String name = scanner.nextLine();
        for (int i = 0; i < books.length ; i++) {
            if(books[i].getName().equals(name)){
                System.out.println(name + " - Price= " + books[i].getPrice());
            }
        }
    }


}
