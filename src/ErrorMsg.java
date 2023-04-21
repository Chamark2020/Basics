// Возврат объекта типа String
public class ErrorMsg {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапозона"
    };

    String getErrorMsg (int i){
        if (i >= 0 & i < msgs.length) return msgs[i];
        else return "Несуществующий код ошибки";
    }
}
