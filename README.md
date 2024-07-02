# Раннер для запуска 2х проектов на одной JVM

## Структура
- Frontend(telegram-bot на Kotlin)
- Middle-слой (Java-сервис)

## Стек
- Kotlin
- Spring Boot
- Gradle

## Запуск
Возможна работа Telegram бота в тестовом режиме.

1. **Получите токен и имя бота:**
    - Создайте нового бота и получите токен и имя у [BotFather](https://t.me/BotFather).

2. **Добавьте токен и имя в конфигурационный файл:**
    - Откройте файл [application.yml](./src/main/resources/application.yml) и добавьте следующие строки:
```yaml
     telegram:
       bot:
         token: "YOUR_TELEGRAM_BOT_TOKEN"
         username: "YOUR_TELEGRAM_BOT_USERNAME"
 ```

3. **Соберите проект:**
   - В корневой директории проекта выполните команду:
   ```shell
    ./gradlew build
   ```
   - Выполните запуск приложения:
    ```shell
     java -jar build/libs/payhub-0.0.1-SNAPSHOT.jar
    ```

Протестировать можно по ссылке https://t.me/kim_test_01_bot

## Для запуска в разных контейнерах

1. **Получите токен и имя бота:**
    - Создайте нового бота и получите токен и имя у [BotFather](https://t.me/BotFather).

2. **Добавьте токен и имя в конфигурационный файл:**
    - Откройте файл [application.yml](./bogdanov-telegram-bot/src/main/resources/application.yml) и добавьте следующие строки:
   ```yaml
     telegram:
       bot:
         token: "YOUR_TELEGRAM_BOT_TOKEN"
         username: "YOUR_TELEGRAM_BOT_USERNAME"
   ```
3. **Соберите проект:**
   - В директорию bogdanov-telegram-bot директории проекта выполните команду:
   ```shell
     cd bogdanov-telegram-bot
   ```
   - Выполните сборку:
   ```shell
    ./gradlew clean build
   ```
   - Выполните команду запуска telegram-bot:
    ```shell
     java -jar build/libs/bogdanov-telegram-bot-0.0.1-SNAPSHOT.jar
    ```
   - Далее собираем модуль middle-service. В новой командной строке переходим в директорию bogdanov-middle-service
   ```shell
     cd ../bogdanov-middle-cervice
   ```
   - Выполните сборку:
   ```shell
    ./gradlew clean build
   ```
   - Выполните команду запуска middle-cervice:
   ```shell
   java -jar build/libs/bogdanov-middle-cervice-0.0.1-SNAPSHOT.jar
   ```
