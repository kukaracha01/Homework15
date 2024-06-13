public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 101, 101),
                new Hogwarts("Гермиона Грейнджер", 95, 90),
                new Hogwarts("Рон Уизли", 85, 75),
                new Hogwarts("Драко Малфой", 90, 70),
                new Hogwarts("Грэхэм Монтегю", 60, 15),
                new Hogwarts("Грегори Гойл", 40, 50),
                new Hogwarts("Захария Смит", 25, 60),
                new Hogwarts("Седрик Диггори", 75, 85),
                new Hogwarts("Джастин Финч-Флетчли", 45, 30),
                new Hogwarts("Чжоу Чанг", 65, 60),
                new Hogwarts("Падма Патил", 70, 80),
                new Hogwarts("Маркус Белби", 60, 45)
        };

        Grifindor[] grifindor = {
                new Grifindor("Гарри Поттер", 101, 101, 100, 100, 99),
                new Grifindor("Гермиона Грейнджер", 95, 90, 100, 95, 90),
                new Grifindor("Рон Уизли", 85, 75, 80, 90, 50)
        };

        Slizerine[] slizerine = {
                new Slizerine("Драко Малфой", 90, 70, 90, 60, 95, 30, 100),
                new Slizerine("Грэхэм Монтегю", 60, 15, 55, 40, 65, 30, 20),
                new Slizerine("Грегори Гойл", 40, 50, 40, 45, 55, 35, 30)
        };

        Puffenduy[] puffenduy = {
                new Puffenduy("Захария Смит", 25, 60, 60, 65, 70),
                new Puffenduy("Седрик Диггори", 75, 85, 75, 65, 80),
                new Puffenduy("Джастин Финч-Флетчли", 45, 30, 60, 55, 60)
        };
        Cogtevran[] cogtevran = {
                new Cogtevran("Чжоу Чанг", 65, 60, 70, 75, 50, 65),
                new Cogtevran("Падма Патил", 70, 80, 80, 85, 75, 90),
                new Cogtevran("Маркус Белби", 60, 45, 65, 55, 60, 70)
        };

        System.out.println(hogwarts[0]);

        hogwarts[0].equalToHogwarts(hogwarts[1]);
        grifindor[0].equalToGrifindor(grifindor[1]);
        slizerine[0].equalToSlizerine(slizerine[1]);
        puffenduy[0].equalToPuffenduy(puffenduy[1]);
        cogtevran[0].equalToCogtevran(cogtevran[1]);
    }
}
