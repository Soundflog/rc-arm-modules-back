# Модули информационной системы реабилитации пациентов

## Модуль [arm](arm)
Backend-часть автоматизированного рабочего места врача. [Frontend часть](https://github.com/giezz/rc_doc_arm_front).
## Модуль [med-cart](med-cart)
Электронная медицинская карта (ЭМК), SOAP-сервис. Данный модуль предоставляет API для получения информации о пациентах в 
ЕМИАС: информация о пациенте, эпикризис, история госпитализаций.
## Модуль [icf](icf)
Справочник МКФ (Международная классификация функционирования, ограничений жизнедеятельности и здоровья).
### Cборка сервисов ARM ([arm](arm), [med-cart](med-cart), [icf](icf))
#### Сборка с помощью Spring Boot Maven Plugin и Cloud Native Buildpacks
```
mvn -pl arm,icf,med-cart clean spring-boot:build-image
docker compose -f docker-compose-arm.yml up
```
#### Сборка с помощью Spring Boot Maven Plugin и Dockerfile
```
docker compose -f docker-compose-arm-dockerfile.yml up
```
## Модуль [Пациента](patient)
Серверная часть клиентского приложения. Клиент-пациент.
* Получение информации о авторизованном пациенте.
* Получение истории реабилитации пациента.
* Просмотр и прохождение программы реабилитации пациента.
  
[Пользовательский интерфейс для пациента](https://github.com/Soundflog/rc-questionnaire-desktop-frontend)
## Модуль [Конструктора анкет](questionnaire)
Серверная часть конструктора анкет для автоматизированного рабочего места врача.
* Просмотр и редактирование одной или нескольких анкет.
* Просмотр и редактирование одной или нескольких шкал оценивания анкет.
  
[Frontend-часть](https://github.com/Soundflog/rc-constructor-forms)

![image](https://github.com/user-attachments/assets/2f12d5f2-6b2a-4584-8e30-dcf00d6a3c23)

![doc-modules](https://github.com/user-attachments/assets/95c26eac-20a7-4864-8d00-26e7203e6d61)
