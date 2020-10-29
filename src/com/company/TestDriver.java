package com.company;

public class TestDriver {
    public static void run(){
        testApple();
        testBag();
        testBoard();
        testBook();
        testPencil();
    }

    private static void testApple() {
        Apple a = new Apple("Red");
        System.out.println(a.toString());

    }

    private static void testBag() {
        Bag b = new Bag("Purple");
        System.out.println(b.toString());
    }

    private static void testBoard() {
        Board bd = new Board("Green");
        System.out.println(bd.toString());
    }

    private static void testBook() {
        Book bk = new Book("Brown");
        System.out.println(bk.toString());
    }

    private static void testPencil() {
        Pencil p = new Pencil("Yellow");
        System.out.println(p.toString());
    }


}
