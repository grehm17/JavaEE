package servlets;

public final class ServletList {
    public static String getServList(){
        String list = "<ul>" +
                "<li><a href = 'main'>Главная</a></li>" +
                "<li><a href = 'catalog'>Каталог</a></li>" +
                "<li><a href = 'product'>Товар</a></li>" +
                "<li><a href = 'order'>Заказ</a></li>" +
                "<li><a href = 'cart'>Корзина</a></li>" +
                "</ul>";
        return list;
    }
}
