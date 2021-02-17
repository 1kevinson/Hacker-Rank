package kevin.io.java.advanced;

abstract sealed class Shape
    permits Circle, Rectangle, Square{

}

final class Circle extends Shape {

}

final class Rectangle extends Shape {

}

final class Square extends Shape {

}

