# Annotation Config

В рамках лекции мы посмотрели, как использовать Spring для связывания зависимостей.

Возникает вопрос, почему бы не использовать его в вашем приложении с сервлетами и не заменить указанный ниже код на DI
со Spring:

      @Override
      public void init() {
        final var repository = new PostRepository();
        final var service = new PostService(repository);
        controller = new PostController(service);
      }

## Задача

Замените код в методе init на DI со Spring с использованием методов конфигурирования бинов:


Java Config 

