package GeekBrainsLesson1;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object object) {
        //это поясним для сравнения объектов
        if (this == object) {
            //если ссылка на тот объект у которого вызвали equals и прилетевший сюда указывают
            //в одно и тоже место значит эти 2 коробки равны
            return true;
        }
        if (!(object instanceof Box)) {
            //а это вообще коробка?
            return false;
        }
        Box another = (Box)object;
        //another   - это ссылка на вторую коробку, которую сюда подали

        //теперь пишем КАК ИХ СРАВНИВАТЬ
        return this.color.equals(another.color) && this.size == another.size;
    }

    @Override
    public int hashCode(){
        // метод преобразует объект в какой то инт, и мы решаем как это будет делаться
        // у одинаковых по иквалсу объектов хэш код должен совпадать, поэтому их переопределяют вдвоем обычно
        //поля которые в иквался, те же и в хеш коде!!!!!!
        return color.length() * 13 + size * 71;
    }

}
