package com.inkubiks.eventservice.models

import com.inkubiks.eventservice.R
import java.util.UUID

data class ScheduleEventModel(
    val id: String,
    val profileId: List<Int> = listOf(),
    val title: String,
    val description: String,
    val image: Int? = null,
    val isImportant: Boolean = false,
    val isNews: Boolean = false,
    val time: String = "",
)

val scheduledEvents: List<ScheduleEventModel> = listOf(
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Meetup Android Team",
        description = "Обсуждение статусов текущих задач, планирование следующего спринта и созвонов.",
        image = R.drawable.def_picture_11,
        isImportant = true,
        time = "10:30-12"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Созвон с Андреем",
        description = "Нужно выбрать способ хранения данных для задачи.",
        image = R.drawable.def_picture_12,
        isImportant = false,
        time = "14:30-15"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Общая конференция",
        description = "Для обучения нужным навыкам проводят бизнес тренинги для руководителей в компании. Это мероприятия, где есть две стороны – тренер и участники (обучающиеся). Руководители для повышения своего профессионализма могут участвовать в открытых мероприятиях – для этого существуют открытые тренинги для руководителей, на которых они могут знакомиться с руководителями других компаний, налаживать деловые связи. Существуют также тренинги по развитию руководителей, однако для полноценного развития руководителей и ведущих специалистов компании этого недостаточно – нужен еще обмен опытом. Для этого в основном и существуют бизнес-конференции. Это мероприятия, в которых участвуют две стороны – спикеры и участники (слушатели).",
        image = R.drawable.def_picture_2,
        isImportant = true
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Кофе-брейк с командой",
        description = "Во время официальных мероприятий необходимость обрабатывать большое количество информации и сидячее положение быстро истощают организм. Поэтому организаторы устраивают кофе-брейк, целью которого является восстановление сил за чашкой ароматного напитка. Это время можно использовать для осознания полученных знаний, общения с другими участниками, отдыха.",
        image = R.drawable.def_picture_14,
        isImportant = false
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Груминг задач",
        description = "Бэклог продуктовых задач является одним из основных и обязательных артефактов Agile. Фактически, это набор требований, полученных от бизнеса и сформулированных в виде задач для разработки. Что нужно делать для того, чтобы эти задачи всегда были в порядке? И как это связано с концепцией backlog grooming?",
        image = R.drawable.def_picture_15,
        isImportant = false
    )
)

val recommendedEventsAndNews = listOf(
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        profileId = listOf(),
        title = "День рождения генерального директора",
        description = "День рождения — годовщина рождения, соответствует дате рождения человека. Обычно день рождения празднуется как домашний праздник, с семьёй и друзьями. Практикуется также и отмечание этой даты с коллегами.",
        image = R.drawable.def_picture_9,
        isNews = true,
        isImportant = true,
        time = "Сегодня"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        profileId = listOf(),
        title = "Podlodka Java Crew",
        description = "Ребята из Podlodka Crew проводят Java Crew всего лишь второй раз, но пилотный выпуск уже успел всем запомниться, особенно интересными гостями. Тогда организаторам удалось пригласить легенду JVM-мира Отавио Сантану, который рассказал, чем можно заменить Spring Data JPA и как эффективно выстраивать слой взаимодействия с БД. А тема этого сезона — микросервисная архитектура.",
        image = R.drawable.def_picture_10,
        isNews = false,
        time = "20–24 марта, онлайн."
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        profileId = listOf(),
        title = "Mobius 2023 Spring",
        description = "Конференция для всех, кто так или иначе связан с мобильной разработкой: iOS- и Android-разработчиков, архитекторов мобильных приложений, DevOps-инженеров, тестировщиков, тимлидов и руководителей проектов.",
        image = R.drawable.def_picture_5,
        isNews = false,
        time = "17.05.23"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        profileId = listOf(),
        title = "JPoint 2023",
        description = "JPoint — одно из первых русскоязычных мероприятий для Java-программистов, JUG Ru Group проводит его с 2013 года. Предупреждаем: конфа — для опытных разработчиков, а не для джунов. Там вам расскажут о неочевидных фишках Spring Boot, разложат по винтикам JVM и покажут, как приручить потоки.\n" +
                "\n" +
                "Как и другие конференции «джагов», JPoint будет проходить в разрешении 4К — чтобы вы смогли увидеть каждую букву в IDE во время лайв-кодинга.",
        image = R.drawable.def_picture_7,
        isNews = false,
        time = "12–13 апреля онлайн"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        profileId = listOf(),
        title = "TeamLead Conf 2023",
        description = "Самая крупная мультиформатная конференция для тимлидов и руководителей, которая соберёт более 1300 зрителей и более 50 спикеров. Среди основных тем — борьба с кадровой текучкой, накопление и передача экспертности, поиск лидеров и разработка карьерных треков сотрудников.",
        image = R.drawable.def_picture_8,
        isNews = false,
        time = "27 и 28 февраля"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        profileId = listOf(),
        title = "DevOps Conf 2023",
        description = "DevOps Conf — это крупнейшая площадка для обсуждения практических вопросов DevOps, SRE и других инженерных практик. Здесь собираются инженеры, техлиды, тимлиды, СТО и СІО, которые делятся своими кейсами и решениями, а не пересказывают документацию. Участники обсудят новые тренды, serverless, service mesh, импортозамещение в DevOps, проверки библиотек и релизов на уязвимости, вредоносные закладки, новые подходы к безопасности и много другое.",
        image = R.drawable.def_picture_6,
        isNews = false,
        time = "13 и 14 марта"
    ),
)
