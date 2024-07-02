package ru.itis.summerpractice24

class PlanetRepository {
    val planets = listOf(
        Planet(1, "Меркурий", "https://bogatyr.club/uploads/posts/2024-03/1709749125_bogatyr-club-epdq-p-merkurii-planeta-1.jpg", "Ближайшая к Солнцу планета", "Маленькая каменистая планета", "Меркурий - самая маленькая планета Солнечной системы и ближайшая к Солнцу. Он назван в честь римского бога торговли, так как он быстро движется по небу."),
        Planet(2, "Венера", "https://gas-kvas.com/grafic/uploads/posts/2023-10/1696593958_gas-kvas-com-p-kartinki-venera-3.jpg", "Самая яркая планета", "Каменистая планета с плотной атмосферой", "Венера - вторая от Солнца планета, самая яркая планета на земном небе после Луны. Она названа в честь римской богини любви и красоты."),
        Planet(3, "Земля", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/The_Earth_seen_from_Apollo_17.jpg/1200px-The_Earth_seen_from_Apollo_17.jpg", "Третья от Солнца планета", "Каменистая планета с жизнью", "Земля - единственная известная планета, где есть жизнь. Она имеет атмосферу, воду и подходящую температуру для жизни."),
        Planet(4, "Марс", "https://img.razrisyika.ru/kart/97/1200/384190-mars-planeta-24.jpg", "Красная планета", "Каменистая планета с разреженной атмосферой", "Марс - четвёртая планета от Солнца, известна как красная планета из-за оксида железа на поверхности. Он имеет разреженную атмосферу."),
        Planet(5, "Юпитер", "https://klike.net/uploads/posts/2023-01/1674368178_3-32.jpg", "Самая большая планета", "Газовый гигант", "Юпитер - пятая планета от Солнца, самая большая планета в Солнечной системе. Это газовый гигант, состоящий в основном из водорода и гелия."),
        Planet(6, "Сатурн", "https://psihosamatica.ru/wp-content/uploads/2020/11/33.jpg", "Планета с кольцами", "Газовый гигант", "Сатурн - шестая планета от Солнца, известна своими красивыми кольцами. Это газовый гигант, состоящий в основном из водорода и гелия."),
        Planet(7, "Уран", "https://img.razrisyika.ru/kart/111/1200/442113-planeta-uran-13.jpg", "Лёд-гигант", "Газовый гигант с ледяной мантией", "Уран - седьмая планета от Солнца, это ледяной гигант с атмосферой, состоящей из водорода, гелия и метана."),
        Planet(8, "Нептун", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Neptune_Full.jpg/1200px-Neptune_Full.jpg", "Синяя планета", "Газовый гигант", "Нептун - восьмая и самая дальняя планета от Солнца. Это газовый гигант, известный своим синим цветом из-за метана в атмосфере.")
    )


    fun getPlanetById(id: Int): Planet? {
        return planets.find { it.id == id }
    }
}

data class Planet(val id: Int, val name: String, val imageUrl: String, val description: String, val shortDescription: String, val longDescription: String)
