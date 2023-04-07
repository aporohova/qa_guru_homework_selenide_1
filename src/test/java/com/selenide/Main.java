package com.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class Main extends TestBase {

    @Test
    void selenideTest (){
        //открытие страницы selenide в github
        open ("/selenide/selenide");
        //переход в раздел wiki проекта
        $("#wiki-tab").click();
        //поиск в списке страниц SoftAssertions
        $(".wiki-more-pages-link").$("button").click();
        $(".wiki-rightbar").shouldHave(Condition.text("SoftAssertions"));
        //открытие страницы SoftAssertions и поиск примера кода для JUnit5
        $("a[href= '/selenide/selenide/wiki/SoftAssertions']").click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5 extend test class"));
    }

    }

