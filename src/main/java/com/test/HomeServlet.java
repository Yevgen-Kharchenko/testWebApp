package com.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        out.print("<html>\n" +
                "<head>\n" +
                "\t<title>main page</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center><h1>Информация обо мне</h1></center>\n" +
                "Краткая биография обо мне\n" +
                "Родился в 1985 году в городе Москва. Закончил в 2008 году МАИ.\n" +
                "На данный момент работаю ведущим инженером в крупной авиакомпании.\n" +
                "Моя мечта стать ведущим по машине.\n" +
                "\n" +
                "Поскольку я люблю авиацию, то хотел бы поделиться несколькими интересными \n" +
                "фотографиями на эту тему\n" +
                "<br/><br/>\n" +
                "<center><img alt=\"Два самолета\" \n" +
                "src=\"https://img-fotki.yandex.ru/get/9931/160700675.0/0_110e34_54188f48_-1-orig\">\n" +
                "</center>\n" +
                "<br/><br/>\n" +
                "<font style=\"color:green\">Этот текст зеленый</font>\n" +
                "<br/><br/>\n" +
                "<b>Просто пример жирного текста</b>\n" +
                "<br/><br/>\n" +
                "Низ страницы\n" +
                "<br/><br/>\n" +
                "В данном примере мы рассмотрели кратко основные теги HTML, теперь можно пробовать создавать \n" +
                "несколько связанных страниц через ссылки и выкладывать сайт в интернет.\n" +
                "<hr>\n" +
                "Этот материал был написан благодаря сайту \n" +
                "<a href=http://zarabotat-na-sajte.ru/>\n" +
                "http://zarabotat-na-sajte.ru/</a> - за что я ему благодарен. \n" +
                "<br/><br/>\n" +
                "Спасибо. До новых встреч!\n" +
                "</body>\n" +
                "</html>");
    }
}